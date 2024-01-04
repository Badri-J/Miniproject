package project2;

import java.util.Scanner;

public class cardpay {
	public boolean paymentSuccess;
	public void cardpage() {
        Scanner scanner = new Scanner(System.in);
        String cardNumber;
        System.out.println("------------------------------------------------");
        System.out.println("--------------------PAYMENT---------------------");
        System.out.println("------------------------------------------------");
        do {
        System.out.println("Enter your 16-digit card number:");
        cardNumber = scanner.nextLine();
        }
        while(check(cardNumber,16));

        System.out.println("Enter your 3-digit CVV number:");
        String cvvNumber = scanner.nextLine();
        
        System.out.println("Enter your OTP number:");
        String otpNumber = scanner.nextLine();

        paymentSuccess = processPayment(cardNumber, cvvNumber, otpNumber);

        if (paymentSuccess) {
            System.out.println("Payment successful!");
            System.out.println("------------------------------------------------");
            System.out.println("Mail has been sent successfully");
            String mailFrom = "travelstour40@gmail.com";
            String password = "lxwt wywz uyym pnso";
            String subject = "Booking Confirmed";
            String message = "Your tour package has been booked successfully."
            		+ "HAPPY JOURNEY";
            String mailTo = signinsql.a;
            Mail sendmail = new Mail(mailFrom,password,mailTo,subject,message);
        } else {
            System.out.println("Payment failed. Please check your card details.");
        }
    }

    public boolean processPayment(String cardNumber, String cvvNumber, String otpNumber) {
        return true;
    }
    public boolean check(String str,int n)
    {
        //System.out.println("You entered "+str.length()+" digits only");
        if(str.length()==n)
        {
            
          for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)>='0' && str.charAt(i)<='9')
             {
                 if(i==str.length()-1)
                 {
                     return false;
                 }
              }
              else
               {
                   System.out.println("You entered invalid number\nplease find it");
                   
                   return true;
               
               }
        }
      // return false;
        }
        else
        {
            System.out.println("Incorrect card details ");
            return true;
        }
        return false;
    }
}
