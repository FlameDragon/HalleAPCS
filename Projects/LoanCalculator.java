import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else if (mode == 2) { compoundinginterestnopayment ();
                       
        }
        else if (mode == 3) { compoundinginterestwithpayment ();
        }
    }

    public static void flatInterest() { Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter a loan amount ");
            if(scan.hasNextDouble()) { 
                loanAmt = scan.nextDouble();
                if(loanAmt > 0) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter a loan term ");
            if(scan.hasNextInt()) { 
                loanTerm = scan.nextInt();
                if(loanTerm > 0) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }

        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter an interest rate ");
            if(scan.hasNextDouble()) { 
                interestRate = scan.nextDouble();
                if( 0 < interestRate && interestRate < 100) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
       double interest = loanAmt * interestRate * loanTerm * .01 + loanAmt;
   
   System.out.println("loan amount " + loanAmt);
   System.out.println("loan term " + loanTerm);
   System.out.println("interest rate " + interestRate);
    System.out.println("You pay $ " + interest);
    
    }

public static void compoundinginterestnopayment() { Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter a loan amount ");
            if(scan.hasNextDouble()) { 
                loanAmt = scan.nextDouble();
                if(loanAmt > 0) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter a loan term ");
            if(scan.hasNextInt()) { 
                loanTerm = scan.nextInt();
                if(loanTerm > 0) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }

        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter an interest rate ");
            if(scan.hasNextDouble()) { 
                interestRate = scan.nextDouble();
                if( 0 < interestRate && interestRate < 100) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
int months = loanTerm * 12;
 double interest =  (1 + interestRate * 0.01 / 12) ;
double finalpay = Math.pow(interest,months);
      double interestpayment = finalpay * loanAmt;
   System.out.println("loan amount " + loanAmt);
   System.out.println("loan term " + loanTerm);
   System.out.println("interest rate " + interestRate);
    System.out.println("You pay $ " + interestpayment);
    
    }


public static void compoundinginterestwithpayment() { Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter a loan amount ");
            if(scan.hasNextDouble()) { 
                loanAmt = scan.nextDouble();
                if(loanAmt > 0) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter a loan term ");
            if(scan.hasNextInt()) { 
                loanTerm = scan.nextInt();
                if(loanTerm > 0) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }

        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
          System.out.println("Enter an interest rate ");
            if(scan.hasNextDouble()) { 
                interestRate = scan.nextDouble();
                if( 0 < interestRate && interestRate < 100) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        int months = loanTerm * 12;
        double rate1 = interestRate * .01;
double rate = rate1 /12;
double monthlyPayment = 1 + loanAmt * (rate / (1 - Math.pow((1 + rate), (loanTerm * -12))));
double needTopay = monthlyPayment * loanTerm * 12 - months;  
double lastPayment = needTopay - monthlyPayment * (months);
double pureinterest = needTopay - loanAmt;
   System.out.println("loan amount " + loanAmt);
   System.out.println("loan term " + loanTerm);
   System.out.println("interest rate " + interestRate);
    System.out.println("You pay a month $ " + monthlyPayment);
     System.out.println("You pay a total of $ " + needTopay);
System.out.println("You pay a interest of $ " + pureinterest);
    }
    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );



        
    }
}