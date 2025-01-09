import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Wallet implements Serializable {
    private String name;
    private double balance;
    private final List<Operation> operations;

    public Wallet(String name) {
        this.name = name;
        this.balance = 0.0;
        this.operations = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
        if (operation.getType() == OperationCategory.INCOME) {
            balance += operation.getAmount();
        } else {
            balance -= operation.getAmount();
        }
    }

    public List<Operation> getOperationsByCategory(String category) {
        List<Operation> filtered = new ArrayList<>();
        for (Operation t : operations) {
            if (t.getCategory().equalsIgnoreCase(category)) {
                filtered.add(t);
            }
        }
        return filtered;
    }

    public double calculateTotalByType(OperationCategory type) {
        return operations.stream()
                .filter(t -> t.getType() == type)
                .mapToDouble(Operation::getAmount)
                .sum();
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", operations=" + operations +
                '}';
    }
}
