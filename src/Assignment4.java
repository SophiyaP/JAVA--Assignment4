import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the String ");
	String str=input.next();
		char[] chr=str.toCharArray(); // storing the input string into an array
	
	System.out.println("Enter the character to find its occurence in the input string");
	char inpch=input.next().charAt(0); // for storing given input char into inpch
	int j=0;
	for (int i=0;i<chr.length;i++)
	{
		if(chr[i]==(inpch)){  //  s==o
			j++; //  if 2 chars matches ,increment the counter 
			} // end of if
	
	} // end of for 
	System.out.println("No.of occurences of  " + inpch + " is " + j);
	//input.close();
	/* Write java code to count vowels and consonants in a string */
	
	System.out.println("Enter a 5 character String ");
	String str2=input.next();
	
	//char[] chrarry=str2.toCharArray();
	//char[] vow= {'a','e','i','o','u'};

	int k=0;
	int l=0;
	for(int i=0;i<str2.length();i++)
	{
		char ch = str2.charAt(i);
	if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
		//if(chrarry[i]==vow[i] ) { //compares 2 chars,if both same increment vowel counter
			k++; 
		}
		else // if 2 chars are not matching,increment consonant counter
		{
			l++;
		}
		
	}
	System.out.println("Number of characters in the given string is " +str2.length());
	System.out.println("The vowel count in the input string is " +k);
	System.out.println("The Consonant count in the input string is " +l);
	
	
	}// end of main
}// end of class
