

          _____                    _____                    _____          
         /\    \                  /\    \                  /\    \         
        /::\    \                /::\    \                /::\    \        
       /::::\    \               \:::\    \              /::::\    \       
      /::::::\    \               \:::\    \            /::::::\    \      
     /:::/\:::\    \               \:::\    \          /:::/\:::\    \     
    /:::/  \:::\    \               \:::\    \        /:::/__\:::\    \    
   /:::/    \:::\    \              /::::\    \      /::::\   \:::\    \   
  /:::/    / \:::\    \    ____    /::::::\    \    /::::::\   \:::\    \  
 /:::/    /   \:::\ ___\  /\   \  /:::/\:::\    \  /:::/\:::\   \:::\    \ 
/:::/____/  ___\:::|    |/::\   \/:::/  \:::\____\/:::/  \:::\   \:::\____\
\:::\    \ /\  /:::|____|\:::\  /:::/    \::/    /\::/    \:::\  /:::/    /
 \:::\    /::\ \::/    /  \:::\/:::/    / \/____/  \/____/ \:::\/:::/    / 
  \:::\   \:::\ \/____/    \::::::/    /                    \::::::/    /  
   \:::\   \:::\____\       \::::/____/                      \::::/    /   
    \:::\  /:::/    /        \:::\    \                      /:::/    /    
     \:::\/:::/    /          \:::\    \                    /:::/    /     
      \::::::/    /            \:::\    \                  /:::/    /      
       \::::/    /              \:::\____\                /:::/    /       
        \::/____/                \::/    /                \::/    /        
                                  \/____/                  \/____/         


Gauss Integer Addition



# Contact: https://www.linkedin.com/in/steadfastpine/

# Release Date: 2019-07-19
# Version: .1



Description

	Carl Friedrich Gauss devised a way to add sequences of integers using less computational effort. This is possible due to patterns found within consecutive digits.

	Principles

	- Even digits have whole number amount of total sequential digit pairs
	- Digit pairs have even value
	- A digit pair will have total value equal to the last digit in sequence plus the first



Prerequisites

	Java Virtual Machine



Methods

		add(int numMin,int numMax)

			// Add a sequence of numbers from numMin to numMax using the Gauss integer addition formula



Example Usage
	
		GaussIntegerAddition gia = new GaussIntegerAddition();
		
		System.out.println("Add all integers from 1 to 100 and show the results:");		
		System.out.println(gia.add(1,100));


License 

	This program is licensed under the GPL License, view the LICENSE.md file for more information.














