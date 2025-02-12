package hello;

public class LoginManager {
    private final String storedUsername;
    private final String storedPassword;

    public LoginManager() {
        // Fetch credentials from environment variables for secure handling
        storedUsername = System.getenv("APP_USERNAME");
        storedPassword = System.getenv("APP_PASSWORD");

        if (storedUsername == null || storedPassword == null) {
            System.out.println("Error: Missing environment variables for authentication.");
        }
    }

    public boolean authenticate(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }
}
