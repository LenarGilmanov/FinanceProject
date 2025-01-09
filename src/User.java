import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private List<Wallet> wallets;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.wallets = new ArrayList<>();
        this.wallets.add(new Wallet("Default Wallet"));
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", wallets=" + wallets +
                '}';
    }
}
