import java.util.ArrayList;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		movie movie1 = new movie("Heat","Drama");
		movie movie2 = new movie("The Revenat","Drama");
		movie movie3 = new movie("Joker","Drama");
		movie movie4 = new movie("Bird Box","Thriller");
		movie movie5 = new movie("Get Out","Thriller");
		movie movie6 = new movie("Split","Thriller");
		movie movie7 = new movie("Dirty Rotten Scondrels","Comedy");
		movie movie8 = new movie("Friday","Comedy");
		movie movie9 = new movie("Semi - Pro","Comedy");
		movie movie10 = new movie("SuperBad","Comedy");
		
		
	    ArrayList<movie>movielist = new ArrayList<>();
       movielist.add(movie1);
       movielist.add(movie2);
       movielist.add(movie3);
       movielist.add(movie4);
       movielist.add(movie5);
       movielist.add(movie6);
       movielist.add(movie7);
       movielist.add(movie8);
       movielist.add(movie9);
       movielist.add(movie10);
	    
    //   System.out.print(movielist);
	   
	   
       String ok = "y";
	    while (ok.equalsIgnoreCase("Y")) {
			System.out.println("Select a category thriller,drama,comedy");
			String list = scnr.nextLine();
			switch (list) {
			case "thriller":
				System.out.println(movie4.getTitle()+ " " + movie5.getTitle()+ " " +movie6.getTitle());
				break;
			case "drama":
				System.out.println(movie1.getTitle()+ " "+ movie2.getTitle()+ " " +movie3.getTitle());
				break;
			case "comedy":
				System.out.println(movie7.getTitle()+ " "+ movie8.getTitle()+ " " +movie9.getTitle());
				break;
			}
			System.out.println("would you like to continue yes/no?");
			ok = scnr.next();
		}
	
	
	}

}
