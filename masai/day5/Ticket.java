package com.masai.day5;

import java.util.Scanner;

public class Ticket {
	
	private int ticketid;
	private int price;
	private static int availableTickets;
	

	
	
	
	
	/**
	 * @return the ticketid
	 */
	public int getTicketid() {
		return ticketid;
	}






	/**
	 * @param ticketid the ticketid to set
	 */
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}






	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}






	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}






	/**
	 * @return the availableTickets
	 */
	public static int getAvailableTickets() {
		return availableTickets;
		
	}

	



	/**
	 * @param availableTickets the availableTickets to set
	 */
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>=0) {
			Ticket.availableTickets = availableTickets;
		}
		
		
	}

	public int calculateTicketCost(int nooftickets) {
		if(getAvailableTickets()>=nooftickets) {
			Ticket.setAvailableTickets((Ticket.getAvailableTickets()-nooftickets));
			return nooftickets*getPrice();		    
		}
		else return -1;
	}
		public static void main(String[] args) {
			Ticket t1 = new Ticket();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the ticketid: ");
			t1.setTicketid(scan.nextInt());
			
			System.out.println("Enter the price:");
			t1.setPrice(scan.nextInt());
			
			System.out.println("Enter no of tickets: ");
			int tickets = scan.nextInt();
			
			System.out.println("Enter the available tickets: ");
			Ticket.setAvailableTickets(scan.nextInt());
			
			System.out.println("Total Price: "+ t1.calculateTicketCost(tickets));
				
			System.out.println("Available ticket after booking: "+ Ticket.getAvailableTickets());
		
		
	}

}
