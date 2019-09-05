package com.lks.java;

import java.util.Arrays;
/*Question 7
* Write a java program to read two string and check those string 2 string are anagrams or not.
* 
*/
public class AnagramString {
public static void main(String[] args) {
// Input value
isAnagram("Keep", "Peek");
isAnagram("Mother In Law", "Hitler Woman");
isAnagram("Debit Card", "Bad Credit");
isAnagram("devendra", "kumarRaj");
}

static void isAnagram(String string1, String string2) {
String s1, s2 = null;
boolean status = false;
char[] ch1Array, ch2Array = null;

// Removing all white spaces from s1 and s2
s1 = string1.replaceAll("\\s", "");
s2 = string2.replaceAll("\\s", "");
// initially Status is true
status = true;
// checking equals ya not
if (s1.length() != s2.length()) {
// Status as false if s1 and s2 doesn't have same length
status = false;
} else {
// Changing the case of characters of both s1 and s2 and converting them to char

ch1Array = s1.toLowerCase().toCharArray();
ch2Array = s2.toLowerCase().toCharArray();
// Sorting both ch1Array and ch2Array
Arrays.sort(ch1Array);
Arrays.sort(ch2Array);
// Checking whether ch1Array and ch2Array are equal
status = Arrays.equals(ch1Array, ch2Array);
}
// print output
if (status) {
System.out.println(s1 + " and " + s2 + " : yes this is anagrams");
} else {
System.out.println(s1 + " and " + s2 + " : this is not anagrams");
}
}
}