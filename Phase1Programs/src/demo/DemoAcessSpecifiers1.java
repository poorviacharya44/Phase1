//write a program to demonstrate how and when access specifiers are used
package demo;

class DemoAcessSpecifiers1 {
	    void display()      //no access modifier indicates default modifier
	       { 
	           System.out.println("Access class with 'dafault' scope"); 
	       } 
	} 
	 
	class Main
	{ 
	    public static void main(String args[]) 
	       {   
	          //access class with default scope
	    	DemoAcessSpecifiers1 obj = new DemoAcessSpecifiers1(); 
	          obj.display();    //access class method with default scope
	       } 
	
}
