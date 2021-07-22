package A3;

import java.util.Arrays;
import java.util.Scanner;

public class A3Driver {

    public static final int CAPACITY = 5;
    
    public static void main(String[] args) {    
        Scanner kbd = new Scanner(System.in);
        Ticket[] tickets = new Ticket[CAPACITY];
        
        System.out.print("Input section:\nPress <ENTER> to continue ...");
        kbd.nextLine();
        
        for (int i = 0; i < tickets.length; i++){
            tickets[i] = inputTicket(); // provide this method
        }
        
        System.out.print("Unsorted section:\nPress <ENTER> to continue ...");
        kbd.nextLine();
        
        for (int i = 0; i < tickets.length; i++){
            System.out.println(tickets[i]);
        }
        
        Arrays.sort(tickets);
        System.out.print("\nSorted section:\nPress <ENTER> to continue ...");
        kbd.nextLine();
        
        for (int i = 0; i < tickets.length; i++){
            System.out.println(tickets[i]);
        }
    }

	private static Ticket inputTicket() {
		 String parcelID;
		 String shippingDate; 
		  Scanner kbd = new Scanner(System.in);
		System.out.print("\tPlease enter a parcel ID (format: AAA99): ");
		parcelID=kbd.nextLine();
		System.out.print("\tPlease enter a shipping date (format: DD-MM-YYYY):");
		shippingDate=kbd.nextLine();
		System.out.println();
		return new Ticket(parcelID,  shippingDate);
	}
    
}
