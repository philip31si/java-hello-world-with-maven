package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        // Print the current local time using Joda-Time
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        // Create an instance of the Greeter class and print the greeting
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        // Fetch credentials from environment variables (for CI/CD)
        String username = System.getenv("APP_USERNAME");
        String password = System.getenv("APP_PASSWORD");

        if (username == null || password == null) {
            System.out.println("Error: Missing environment variables for authentication.");
            return;
        }

        // Authenticate using LoginManager
        LoginManager loginManager = new LoginManager();
        if (loginManager.authenticate(username, password)) {
            System.out.println("Login successful! Welcome, " + username);
        } else {
            System.out.println("Invalid credentials. Access denied.");
        }
    }
}

