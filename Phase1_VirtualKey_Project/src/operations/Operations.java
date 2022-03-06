package operations;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import display.App;

public class Operations {
	
	static Scanner sn = new Scanner(System.in);
	//static String directory = "src/storage";
	static String directory = "C:/Users/poorv/Desktop/Repository-Java/Phase1_VirtualKey_Project/files";

	public static void FileOperations() {
		System.out.println("");
		System.out.println("Press 1 to Add a file");
		System.out.println("Press 2 to Delete a file");
		System.out.println("Press 3 to Search a file");
		System.out.println("Press 4 to go Back to the Main Menu");
		
		String choice = sn.nextLine();
		handle(choice);
	}
	
	public static void handle(String num) {
		switch(num) {
			case "1":
				System.out.println("You selected Add Operation");
				add();
				break;
			case "2":
				System.out.println("You selected Delete Operation");
				delete();
				break;
			case "3":
				System.out.println("You selected Search Operation");
				search();
				break;
			case "4":
				System.out.println("Going Back to Main Menu");
				App.main();
				break;				
			default:
				System.out.println("Invalid input");
		}
		FileOperations();
	}
	
	//to add a file
	public static void add() throws InvalidPathException {
		System.out.println("Please enter file name for your new file: ");
        String input = sn.nextLine();
        String appendedFile = "C:\\Users\\poorv\\Desktop\\Repository-Java\\Phase1_VirtualKey_Project\\files\\"+input;
		File file = new File(appendedFile); //initialize File object and passing path as argument  
		boolean result;  
		try   
		{  
		result = file.createNewFile();  //creates a new file  
		if(result)      // test if successfully created a new file  
		{  
		System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
		}  
		else  
		{  
		System.out.println("File already exist at location: "+file.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();    //prints exception if any  
		}         
		}  

	
	// to delete a file
	
	public static void delete() throws InvalidPathException {
		System.out.println("Enter the file path (ex: c.txt)");
		String input = sn.nextLine();
		String Path = directory + "/" + input;
		Path path;
		
		try {
			path = Paths.get(Path);	
		} catch (Exception e) {
			System.out.println("Invalid input");
			return;
		}
		
		if (!Files.exists(path)) {
			System.out.println("No such file existed,thus cannot be deleted");
			return;
		} else {
			System.out.println("File is present");
		}
		
		File Delete = new File(Path);
		try {
			Delete.delete();
			System.out.println("File is deleted");
		} 
		catch (Exception e) {
	
			System.out.println("Not able to delete file");
			System.out.println(e);
		}
	}
	
	//to search a file
	
	public static void search() throws InvalidPathException{
		System.out.println("Enter the file to search (ex: a.txt)");	
		String input = sn.nextLine();
		String Path = directory + "/" + input;
		Path path;
		
		try {
			path = Paths.get(Path);	
		} catch (Exception e) {
			System.out.println("Invalid input");
			return;
		}
		
		if(!Files.exists(path)) {
			System.out.println("No such file exist");
			return;
		} else {
			System.out.println("File is present");
		}

	}
}
