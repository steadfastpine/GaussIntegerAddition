/*
# Author: Scott Forsberg
# Contact: contact.scottforsberg@gmail.com
# Release Date: 2019-07-19
# Version: .1
 */

package gia;

public class ExampleGaussIntegerAddition {

	public static void main(String[] args) {
		
		GaussIntegerAddition gia = new GaussIntegerAddition();
		
		System.out.println("Add all integers from 1 to 100 and show the results:");		
		System.out.println(gia.add(1,100));
	}
}
