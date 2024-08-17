# 1 - Increment Large Integer

## Problem Description

You are given a large integer represented as an array of digits, where each `digits[i]` is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

The task is to increment the large integer by one and return the resulting array of digits.

### Example
- **Input**: `digits = [1, 2, 3]`
- **Output**: `[1, 2, 4]`

**Explanation**: The array represents the integer 123. Incrementing by one gives 124. Thus, the result should be `[1, 2, 4]`.

## Approach

1. **Traverse from the Last Digit**: 
   - Start by checking the last digit. If it's less than 9, increment it by 1 and return the array.
   - If the digit is 9, set it to 0 and move to the previous digit to handle the carry.

2. **Handle Carry for All Digits**:
   - If all digits are 9, resulting in an array of zeros, create a new array with an additional leading 1.

3. **Time Complexity**: 
   - The solution operates in O(n) time, where n is the number of digits, as each digit is processed exactly once.

## Code

```java
package chezubapackage;

import java.util.Arrays;

public class IncrementNumber {
	
	public static void main(String[] args) {
		int[] digits= {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	 static int[] plusOne(int[] digits) {  
		int n = digits.length;  
		for(int i=n-1; i>=0; i--) {  
		if(digits[i] < 9) {  
		digits[i]++;   
		return digits;  
		
		} 
		digits[i]=0;
		}
		int[] newNumber = new int[n+1];
		newNumber[0]=1;
		return newNumber;
	 }
}
```

# 2 - Selenium Automation Test for Flipkart Search Functionality

## Overview

This Selenium script automates the testing of the search functionality on the Flipkart website. The script ensures that when a user searches for a product, such as "iphone", the results area correctly displays the relevant results.

## Prerequisites

- Java Development Kit (JDK) installed.(i used STS)
- Selenium WebDriver library.
- ChromeDriver (or another WebDriver suitable for the browser you are testing with).

## Setup Instructions

1. **Clone the Repository**: 
   Clone or download the source code.

2. **Configure WebDriver**:
   Ensure that the `chromedriver` executable path is correctly set in the script.

3. **Run the Script**:
   Compile and run the Java script using your preferred IDE or command line.

## How to Run the Test

1. Compile the Java code:

2. Run the compiled Java program:

## Test Explanation

1. **Navigate to Flipkart**: 
The script navigates to the Flipkart homepage and handles any login pop-ups.

2. **Search Operation**: 
It locates the search input and button, enters "iphone", and clicks the search button.

3. **Result Verification**: 
The script waits for the results area to update and checks if it contains the expected text "Showing results for 'iphone'".

## Expected Output

- If the test passes, the console will display:

## Example Screenshot

Here’s how the test interacts with the Flipkart search functionality:
![Screenshot 2024-08-17 211516](https://github.com/user-attachments/assets/3a60ab38-7afb-4963-b03d-983fe231a6ed)


The image shows the search term "iphone" entered in the search box and the results area displaying the expected text.

## Conclusion

This Selenium script effectively automates the testing of the search functionality on Flipkart, ensuring that the search results match the expected output.


