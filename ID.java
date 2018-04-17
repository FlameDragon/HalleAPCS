import java.util.Scanner;

public class ID {
   
 
    public static void main(String[] args) {
       
       
   
   
        int[] powers = new int[201];

        powers[0] = -100;
        //#1
        for(int i = 1; i < powers.length; i++) {
            powers[i] = powers[i-1] +1 ;
        }
        

        //#2
        for(int i = 0; i < powers.length; i++) {
            
            System.out.println(Math.abs (powers[i]));
        }

        //#3
        int[] fib = new int [40];
        fib[0]=0;
        fib[1]=1;
        System.out.println(fib[0]);
        System.out.println(fib[1]);
        for(int i =2; i <fib.length;i++) 
        { 
            fib[i] = fib[i-1] + fib[i-2] ;
            System.out.println (fib[i]);

        }

        //#4

        int[] numbers = new int[(int) (Math.random() * 500)+1];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 500);
        }
        for(int number : numbers) {
            if(number % 2 == 1) {
                System.out.println(number); 
            }
        }

        String[] messages = new String [&];

        for(String message : messages) {
             if(message.length() >10) {
                System.out.println(message); 
             }
        }

    }

}


