package filehandling;

	import java.io.FileReader;
	import java.io.FileWriter;
	
	public class FileHandling {

		public static void main(String[] args) throws Exception{
			
			FileReader fr = new FileReader("C://Users//poorv//Desktop//file//readme.txt");
			int i;    
	        while((i=fr.read())!=-1) //EOF
	        System.out.print((char)i); 
	       
	        
	        String text = "Hello Welcome To Java";  
			FileWriter fw = new FileWriter("C://Users//poorv//Desktop//file//writehere.txt");
			fw.write(text); 
            System.out.println("\n"+text); 
            System.out.println("File is created");
            
            
           
            String data = "Happy Learning";
            FileWriter fw1 = new FileWriter("C://Users//poorv//Desktop//file//writehere.txt", true);
            fw1.write(data);
            
            System.out.println("Done"); 
            
            fr.close();
            fw.close();
            fw1.close();
		
	}
	}



