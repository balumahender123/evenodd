package java.util.scanner;

import java.util.Scanner;

public class EvenOdd {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
    

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int num = s.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}


