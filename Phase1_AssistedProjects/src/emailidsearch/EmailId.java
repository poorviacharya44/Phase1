package emailidsearch;

import java.util.regex.*; 
import java.util.Scanner;
import java.util.*;

public class EmailId {

	public static void main(String[] args) {
		ArrayList<String> emailID = new ArrayList<>();  
		emailID.add("ram@yahoo.com");
        emailID.add("rajudoc@gmail.com");
        emailID.add("kimpark@micro.com");
        emailID.add("virat.ansh@abcd.com");
        emailID.add("abcdefghiJK@bta.com");
        emailID.add("rkchiveRM93@jin.com");
        emailID.add("taekook@tae.com");
        emailID.add("tae.min95@tae.com");
       while(true) { 
        String searchID;
        System.out.println("Enter E-mail to be searched: ");
        Scanner sc = new Scanner(System.in);
        searchID = sc.nextLine();
        String pattern = "[a-zA-z0-9](.+)+@[a-z]+\\.com";
        Pattern pat = Pattern.compile(pattern);
		Matcher match = pat.matcher(searchID);       
        if (match.matches() && emailID.stream().anyMatch(mails -> mails.equals(searchID))) 
        {
            System.out.println(searchID + "  is present");
        }
        else {
            System.out.println("Not a valid ID or ID is not present");
            break;
        }
}
       
}	
}
	
