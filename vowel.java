* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char n;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character you want to check:");
		n=(char) bf.read();
		switch(n)
		{
			case 'a':
				System.out.println("the given character "+n+" is vowel");
				break;
				case 'e':
					System.out.println("the given character "+n+" is vowel");
					break;
					case 'i':
						System.out.println("the given character "+n+" is vowel");
						break;
						case 'o':
							System.out.println("the given character "+n+" is vowel");
							break;
							case 'u':
								System.out.println("the given character "+n+" is vowel");
								break;
								default:
								System.out.println("the given character "+n+" is consonant");
		}
	}
}
		
	
