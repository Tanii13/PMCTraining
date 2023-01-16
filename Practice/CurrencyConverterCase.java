import java. util.Scanner;

public class CurrencyConverterCase {

    public static void main(String[] args) {
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("4 Pound");
        // take input
        Scanner sc = new Scanner(System.in);
        System. out.println("choose the current currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
            	RupeeToOtherCurrencies(amount);
                break;
            case 2:
            	DollarToOtherCurrencies(amount);
                break;
            case 3:
            	EuroToOtherCurrencies(amount);
                break;
            case 4:
            	PoundToOtherCurrencies(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void RupeeToOtherCurrencies(double amt) {
	
	System.out.println("1 Dollar");
    System.out.println("2 Euro");
    System.out.println("3 Pound");
    // take input
    Scanner sc = new Scanner(System.in);
    System. out.println("Choose the convert currency");
    int choice = sc.nextInt();
    System.out.println("Enter the amount");
    double amount = sc.nextDouble();
    // convert the amount
    switch (choice) {
        case 1:
        	RupeeToDollar(amount);
            break;
        case 2:
        	RupeeToEuro(amount);
            break;
        case 3:
        	RupeeToPound(amount);
            break;
        default:
            System.out.println("Invalid choice");
    }
}
    public static void RupeeToDollar(double amt){

    	System.out.println(amt+" Ruppe = " + (amt*0.012) + " Dollar");
    	System.out.println();
    }
    public static void RupeeToEuro(double amt){
    	System.out.println(amt+" Rupee = " + (amt*0.011) + " Euro");
    	System.out.println();
    }
    public static void RupeeToPound(double amt){
    
    	System.out.println(amt+" Rupee = " + (amt*0.010) + " Pound");
    	System.out.println();
    }


    

public static void DollarToOtherCurrencies(double amt) {
	
	System.out.println("1 Rupee");
    System.out.println("2 Euro");
    System.out.println("3 Pound");
    // take input
    Scanner sc = new Scanner(System.in);
    System. out.println("Choose the convert currency");
    int choice = sc.nextInt();
    System.out.println("Enter the amount");
    double amount = sc.nextDouble();
    // convert the amount
    switch (choice) {
        case 1:
        	DollarToRupee(amount);
            break;
        case 2:
        	DollarToEuro(amount);
            break;
        case 3:
        	DollarToPound(amount);
            break;
        default:
            System.out.println("Invalid choice");
    }
}
    public static void DollarToRupee(double amt){
    	System.out.println(amt+" Dollar = " + (amt*81.45) + " Rupee");
    	System.out.println();
    }
    public static void DollarToEuro(double amt){
    	System.out.println(amt+" Dollar = " + (amt*0.92) + " Euro");
    	System.out.println();
    }
    public static void DollarToPound(double amt){
    	System.out.println(amt+" Dollar = " + (amt*0.82) + " Pound");
    	System.out.println();
    }


    

public static void EuroToOtherCurrencies(double amt){
	System.out.println("1 Rupee");
    System.out.println("2 Dollar");
    System.out.println("3 Pound");
    // take input
    Scanner sc = new Scanner(System.in);
    System. out.println("Choose the convert currency");
    int choice = sc.nextInt();
    System.out.println("Enter the amount");
    double amount = sc.nextDouble();
    // convert the amount
    switch (choice) {
        case 1:
        	EuroToRupee(amount);
            break;
        case 2:
        	EuroToDollar(amount);
            break;
        case 3:
        	EuroToPound(amount);
            break;
        default:
            System.out.println("Invalid choice");
    }
}
    public static void EuroToRupee(double amt){
    	System.out.println(amt+" Euro = " + (amt*88.28 ) + " Rupee");
    	System.out.println();
    }
    public static void EuroToDollar(double amt){
    	System.out.println(amt+" Euro = " + (amt*1.08) + " Dollar");
    	System.out.println();
    }
    public static void EuroToPound(double amt){
    System.out.println(amt+" Euro = " + (amt*0.89) + " Pound");
    System.out.println();
	}

public static void PoundToOtherCurrencies(double amt) {
	System.out.println("1 Rupee");
    System.out.println("2 Dollar");
    System.out.println("3 Euro");
    // take input
    Scanner sc = new Scanner(System.in);
    System. out.println("Choose the convert currency");
    int choice = sc.nextInt();
    System.out.println("Enter the amount");
    double amount = sc.nextDouble();
    // convert the amount
    switch (choice) {
        case 1:
        	PoundToRupee(amount);
            break;
        case 2:
        	PoundToDollar(amount);
            break;
        case 3:
        	PoundToEuro(amount);
            break;
        default:
            System.out.println("Invalid choice");
    }
}
    public static void PoundToRupee(double amt) {
    System.out.println(amt+" Pound = " + (amt*99.62) + " Rupee");
    System.out.println();
    }
    public static void PoundToDollar(double amt) {
    System.out.println(amt+" Pound = " + (amt*1.22) + " Dollar");
    System.out.println();
    }
    public static void PoundToEuro(double amt) {
    System.out.println(amt+" Pound = " + (amt*1.13) + " Euro");
    System.out.println();
    }
}