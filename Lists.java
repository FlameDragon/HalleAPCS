import java.util.Scanner;

import java.util.*;

public class Lists {
    public static final int List_Items = 1;
    public static final int Add_Item = 2;
    public static final int Remove_Item = 3;
    public static int mode = -1;
    public static int index = -1;

    public static void main(String[] args) {
        ArrayList<String> ToDo = new ArrayList<String>();
        Scanner scan;
        while(true) {
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == List_Items) {  
                      
                    for(int i = 0; i < ToDo.size(); i++) {
                        System.out.println("[" + i + "]" + ToDo.get(i));
                    }        
                }
                else if(mode == Add_Item)  { 
                    
                        scan = new Scanner(System.in);
                        System.out.println("Enter an item to do ");
                        String item = scan.nextLine();
                        
                        ToDo.add(item);
                     
                }
                if(mode == Remove_Item) {
                     while(true) { //Loop the mode selection menu until a valid input is provided
                        scan = new Scanner(System.in);
                        System.out.println("Enter the index of the item to remove ");
                        if(scan.hasNextInt()) { 
                            index = scan.nextInt();
                            if(index > -1 && index < ToDo.size()) { 
                                ToDo.remove(index);
                                break;
                             } 
                         }
                    } 
                } 
            }
        }
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) List Items\n"
            + "\t(2) Add Items\n"
            + "\t(3) Remove Items\n"
        );
    }
}