//Write a program in Java to verify the working of access modifiers

//1. Class is having Default access modifier 
package practice;

class DefAccessSpecifier
{ 
void display() 
   { 
       System.out.println("You are using default access specifier"); 
   } 
} 

public class AccessSpecifiers1 {

	public static void main(String[] args) {
		//default
				System.out.println("Default Access Specifier");
				DefAccessSpecifier obj = new DefAccessSpecifier(); 		  
		        obj.display(); 


	}

}