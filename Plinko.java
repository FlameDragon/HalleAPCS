import java.util.Scanner;

public class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;
    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};
    public static int mode = -1;
    public static int position = 0;
    public static int NumDiscs = 0;

    public static void main(String[] args) {
        int slot = -1;
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) { 
                    while(true) { //Loop the mode selection menu until a valid input is provided
                        scan = new Scanner(System.in);
                        System.out.println("Enter a slot for the disc ");
                        if(scan.hasNextInt()) { 
                            position = scan.nextInt();
                            if(position > -1 && position < 9) { 
                                slot = position * 2;
                                break; //Valid input has been provided. Break out of the while loop
                            }
                        }
                    } 
                
                    printEvenRow(slot);
                    for(int i = 0 ; i<=5; i++) {
                        if(slot==0){slot++;}
                        else if(slot==16){slot--;}
                        else if(Math.random() > .5) { slot++; } 
                        else { slot--; }
                        
                        printOddRow(slot); 
                        
                        if(slot==0){slot++;}
                        else if(slot==16){slot--;}
                        else if(Math.random() > .5) { slot++; } 
                        else { slot--; }
                        
                        printEvenRow(slot);
                        
                    }
                }
                else if(mode == MULTI_DISC)  { 
                    while(true) { //Loop the mode selection menu until a valid input is provided
                        scan = new Scanner(System.in);
                        System.out.println("Enter a slot for the disc ");
                        if(scan.hasNextInt()) { 
                            position = scan.nextInt();
                            if(position > -1 && position < 9) { 
                                slot = position * 2;
                                break; //Valid input has been provided. Break out of the while loop
                            }
                        }
                    } 
                    while(true) { //Loop the mode selection menu until a valid input is provided
                        scan = new Scanner(System.in);
                        System.out.println("Enter an amount of discs ");
                        if(scan.hasNextInt()) { 
                            NumDiscs = scan.nextInt();
                            if(NumDiscs > -1) { 
                                break; //Valid input has been provided. Break out of the while loop
                            }
                        }
                    } 
                    
                    int[] slotArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};

                    for(int x= 0 ; x < NumDiscs; x++){
                       // System.out.println(position);
                        slot = position * 2;
                        for(int i = 0 ; i<=5; i++) { 
                            if(slot==0){slot++;}
                            else if(slot==16){slot--;}
                            else if(Math.random() > .5) { slot++; } 
                            else { slot--; }
                    
                            if(slot==0){slot++;}
                            else if(slot==16){slot--;}
                            else if(Math.random() > .5) { slot++; } 
                            else { slot--; }
                            
                        }
                        slotArray[slot/2]++;
                    } 

                    System.out.println("Number of discs at Position 0:"+ " " + slotArray[0] ); 
                    System.out.println("Number of discs at position 1:"+ " " + slotArray[1] ); 
                    System.out.println("Number of discs at Position 2:"+ " "  + slotArray[2] ); 
                    System.out.println("Number of discs at Position 3:"+ " " + slotArray[3] ); 
                    System.out.println("Number of discs at Position 4:"+ " " + slotArray[4] ); 
                    System.out.println("Number of discs at Position 5:"+  " " + slotArray[5] ); 
                    System.out.println("Number of discs at Position 6:"+  " " + slotArray[6] ); 
                    System.out.println("Number of discs at Position 7:"+  " " + slotArray[7] ); 
                    System.out.println("Number of discs at Position 8:"+  " " + slotArray[8] ); 
                    int totalPoints = 
                    slotArray[0]*VALUES[0]+
                    slotArray[1]*VALUES[1]+
                    slotArray[2]*VALUES[2]+
                    slotArray[3]*VALUES[3]+
                    slotArray[4]*VALUES[4]+
                    slotArray[5]*VALUES[5]+
                    slotArray[6]*VALUES[6]+
                    slotArray[7]*VALUES[7]+
                    slotArray[8]*VALUES[8];
                    System.out.println("Total Points"+ " " + totalPoints);
                }
                if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            } 
        } 
    }

    public static void printOddRow(int slot) {
        for(int i = 0; i <= 16; i++) {
            if(slot == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(".");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    public static void printEvenRow(int slot) {
        for(int i = 0; i <= 16; i++) {
            if(slot == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.print("\n");
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}