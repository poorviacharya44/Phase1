package filehandling;

	import java.io.FileReader;
	import java.io.FileWriter;
	
	public class FileHandling {

		public static void main(String[] args) throws Exception{
			//read
			FileReader fr = new FileReader("C://Users//poorv//Desktop//Repository-Java//EmpId_2500928_Poorvi_R//Phase1Projects//PraticeProject-FileHandling//file//readme.txt"); //path here is your folder path where your text file is saved.e(c://foldername//filename.txt)
			int i;    
	        while((i=fr.read())!=-1) //EOF
	        System.out.print((char)i); 
	       
	        //write
	        String text = "Hello Welcome To Java";  
			FileWriter fw = new FileWriter("C://Users//poorv//Desktop//Repository-Java//EmpId_2500928_Poorvi_R//Phase1Projects//PraticeProject-FileHandling//file//writehere.txt"); //path here is your folder path i.e(c://foldername//filename.txt)
			fw.write(text); 
            System.out.println("\n"+text); 
            System.out.println("File is created");
            
            
           //append
            String text1 = "Happy Learning";
            FileWriter fw1 = new FileWriter("C://Users//poorv//Desktop//Repository-Java//EmpId_2500928_Poorvi_R//Phase1Projects//PraticeProject-FileHandling//file//writehere.txt", true);
            fw1.write(text1);
            
            System.out.println("Done"); 
         
            fr.close();
            fw.close();
            fw1.close();
		
	}
}




