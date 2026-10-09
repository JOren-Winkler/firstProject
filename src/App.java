import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MethodTester.testMethod();
        Scanner input = new Scanner(System.in);
        String userChat = "";
        while (!userChat.equals("quit")){
            System.out.println("Type in a letter to see what an old person would say in this scenario: 'a' for hello, 'b' for goodpye, 'c' for confused, or 'd' for happy.");
            userChat = input.nextLine();
            // had to use .equals instead of ==, Cooper showed me how
            if (userChat.equals("a")){
                seniorCitizen.oldHello();
            }
            else if (userChat.equals("b")){
                seniorCitizen.oldGoodbye();
            }
            else if (userChat.equals( "c")){
                seniorCitizen.oldConfused();
            }
            else if (userChat.equals ("d")){
                seniorCitizen.oldHappy();
            }
            else {
                if (userChat.equals("quit)")){
                    break;
                }
                else {
                    System.out.println("Type something else");
            }
        }    
    }    
}
}