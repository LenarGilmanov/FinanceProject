import java.io.Serializable;

public class Operation implements Serializable {
    private final String category;
    private final double amount;
    private final OperationCategory type;

    public Operation(String category, double amount, OperationCategory type) {
        this.category = category;
        this.amount = amount;
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public OperationCategory getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
