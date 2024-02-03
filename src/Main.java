//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        int ccBalance;
        
        System.out.println("How much is on your credit card?"); //asks user to input for variable ccBalance
        
        ccBalance = 5000; //simulated input
        
        System.out.println("You entered $" + ccBalance); //outputting the balance user 'inputted'
        
        double Interest = ccBalance * .17;//calculations for interest
        
        ccBalance += Interest; //calculations for total balance
        
        System.out.println("After one month your total is $" + ccBalance);
        
        ccBalance += Interest; //more calculations to make month 2
        
        System.out.println("After two months your total is $" + ccBalance);
    }
}
