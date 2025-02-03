/*Design an Online Payment System with an abstract class PaymentMethod containing an 
abstract method processPayment(). Create two derived classes: CreditCard and PayPal, 
each implementing the processPayment() method differently (for example, one might charge 
a fee, and the other might not). Create a method processTransaction
(PaymentMethod paymentMethod) that accepts a PaymentMethod object and processes the 
payment by calling processPayment(). Demonstrate polymorphism by using both CreditCard 
and PayPal objects in the transaction processing system.*/

// Abstract class PaymentMethod
abstract class PaymentMethod {
    // Abstract method processPayment()
    public abstract void processPayment(double amount);
}

// Derived class CreditCard
class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    // Constructor
    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    // Implementation of processPayment() for CreditCard
    @Override
    public void processPayment(double amount) {
        double fee = amount * 0.02; // 2% fee for credit card payments
        double totalAmount = amount + fee;
        System.out.println("Processing Credit Card Payment:");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Fee (2%): ₹" + fee);
        System.out.println("Total Amount Charged: ₹" + totalAmount);
    }
}

// Derived class PayPal
class PayPal extends PaymentMethod {
    private String email;

    // Constructor
    public PayPal(String email) {
        this.email = email;
    }

    // Implementation of processPayment() for PayPal
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment:");
        System.out.println("Email: " + email);
        System.out.println("Amount: ₹" + amount);
        System.out.println("No additional fees for PayPal payments.");
    }
}

// Transaction processing system
class PaymentProcessor {
    // Method to process a transaction using any PaymentMethod
    public void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}


public class OnlinePaymentSystem {
    public static void main(String[] args) {
        // Create PaymentProcessor object
        PaymentProcessor processor = new PaymentProcessor();

        // Create CreditCard and PayPal objects with Indian names and details
        PaymentMethod creditCard = new CreditCard("1234-5678-9012-3456", "Rahul Sharma");
        PaymentMethod payPal = new PayPal("rahul.sharma@example.in");

        // Process transactions using polymorphism
        System.out.println("Processing Credit Card Transaction:");
        processor.processTransaction(creditCard, 100.0);

        System.out.println(); // For spacing

        System.out.println("Processing PayPal Transaction:");
        processor.processTransaction(payPal, 100.0);
    }
}
