// Sam Platt
// CS 257 Lab 1B
// Written Jan 11, 2020

import java.util.Scanner;


public class UseTree {

	public static void main(String[] args) {
		// Input user's name of tree.
		String s;
		
		Scanner scan = new Scanner(System.in);
		
		// Have the user name the first tree...
		System.out.print("Enter the name of your first tree: ");
		s = scan.nextLine();
		Tree t0 = new Tree(s);
		
		// Have the user name the second tree...
		System.out.print("Enter the name of your second tree: ");
		s = scan.nextLine();
		Tree t1 = new Tree(s);
		
		// Print the current state of both trees
		System.out.println(t0.toString());
		System.out.println(t1.toString());
		
		System.out.print("How many years would you like the trees to grow for?");
		
		s = scan.nextLine();
		int years = 0;
		years = Integer.parseInt(s);
		
		t0.grow(years);
		t1.grow(years);
		
		System.out.print("\n");
		
		// Output the current state of the two Tree objects.
		System.out.println(t0.toString());
		System.out.println(t1.toString());
		
		// Output whether t0 is alive, if the tree is dead also output the age at which it died.
		if(t0.getIsAlive() == true) {
			System.out.println(t0.getName() + " is alive.");
		} else {
			System.out.println(t0.getName() + " died at age " + t0.getAge() + ".");
		}
		
		// Output whether t1 is alive, if the tree is dead also output the age at which it died.
		if(t1.getIsAlive() == true) {
			System.out.println(t1.getName() + " is alive.");
		} else {
			System.out.println(t1.getName() + " died at age " + t1.getAge() + ".");
		}
		
		// Output whether or not the current height of the two trees is equal; if not the output which tree is taller.
		if(t0.getHeight() == t1.getHeight()) {
			System.out.println(t0.getName() + " and " + t1.getName() + " are the same height.");
		} else if(t0.getHeight() > t1.getHeight()) {
			System.out.println(t0.getName() + " is taller than " + t1.getName() + ".");
		} else {
			System.out.println(t1.getName() + " is taller than " + t0.getName() + ".");
		}
	}
}
