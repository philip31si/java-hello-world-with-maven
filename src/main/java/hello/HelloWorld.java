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
    }
}
