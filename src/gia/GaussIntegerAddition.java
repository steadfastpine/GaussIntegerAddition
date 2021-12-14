/*
# Author: Scott Forsberg
# Contact: contact.scottforsberg@gmail.com
# Release Date: 2019-07-19
# Version: .1
 */

package gia;

public class GaussIntegerAddition {

	// Add a sequence of numbers from numMin to numMax using the Gauss integer addition formula
	public int add(int numMin,int numMax) {
	
		int pairValue = numMax + numMin;
		int pairCount = numMax/2;
		int totalCount = pairValue*pairCount;
		return totalCount;
	}
}
