package hafta2_Pratik_Ders;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    private String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {

        if (password.length() >= 8 && password.length() <= 11) {
            this.password = password;
        } else {
            System.out.println("şifre en az 8 en fazla 11 haneli olucak");
        }
    }
}
