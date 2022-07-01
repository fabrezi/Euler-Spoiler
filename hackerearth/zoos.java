/*
You are required to enter a word that consists of  and  that denote the number of Zs and Os respectively.
The input word is considered similar to word zoo if  2 * x = y.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.
*/

/* IMPORTANT: Multiple classes and nested static classes are supported */


 

/*

* uncomment this if you want to read input.

//imports for BufferedReader

import java.io.BufferedReader;

import java.io.InputStreamReader;


 

//import for Scanner and other utility classes

import java.util.*;

*/

import java.util.Scanner;


 

class TestClass {

public static void main(String args[] ) throws Exception {

/* Sample code to perform I/O:

* Use either of these methods for input


 

//BufferedReader

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine(); // Reading input from STDIN

System.out.println("Hi, " + name + "."); // Writing output to STDOUT


 

//Scanner

Scanner s = new Scanner(System.in);

String name = s.nextLine(); // Reading input from STDIN

System.out.println("Hi, " + name + "."); // Writing output to STDOUT


 

*/


 

// Write your code here


 

Scanner sc = new Scanner (System.in);

int zcount = 0;

int ocount = 0;

String word = sc.next();

int length = word.length();

String[] arr = word.split("");

for (int i=0; i<length; i++)

{

if (arr[i].equals("z"))

{

zcount++;

}

else if (arr[i].equals("o"))

{

ocount++;

}

}

if (2*zcount == ocount)

{

System.out.print("Yes");

}

else

{

System.out.print("No");

}

}

}

