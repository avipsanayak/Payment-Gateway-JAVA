//Integrate Payment Gateway
import java.util.Scanner;
public class PaymentGateway 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the payment amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter your credit card number: ");
        String creditCardNumber = scanner.next();
        System.out.print("Enter the cardholder's name: ");
        String cardholderName = scanner.next();
        System.out.print("Enter the CVV: ");
        int cvv = scanner.nextInt();
        boolean isMatched = matchCardDetails(creditCardNumber, cardholderName, cvv);
        if (isMatched) 
        {
            System.out.println("Card details matched!");
            boolean paymentSuccess = processPayment(amount);
            if (paymentSuccess) 
            {
                System.out.println("Payment successful!");
            } 
            else 
            {
                System.out.println("Payment failed. Please try again.");
            }
        } 
        else 
        {
            System.out.println("Card details do not match. Payment declined.");
        }
    }

    private static boolean matchCardDetails(String creditCardNumber, String cardholderName, int cvv) 
    {
        String storedCreditCardNumber = "1234567890123456";
        String storedCardholderName = "John Doe";
        int storedCvv = 123;
        return creditCardNumber.equals(storedCreditCardNumber) && cardholderName.equalsIgnoreCase(storedCardholderName) && cvv == storedCvv;
    }

    private static boolean processPayment(double amount) 
    {
        return amount > 0;
    }
}
