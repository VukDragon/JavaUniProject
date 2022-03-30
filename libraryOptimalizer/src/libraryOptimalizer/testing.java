package libraryOptimalizer;

/**
	 * This class is designed, to test the Library,Member,Book and Loan classes. 
	 * @author Nikola Dragon
	 * @version 10/05/2021
	 *  
	 */
	public class testing {
		
		public testing (){
			
		}
		
		// Populating the object with data. myL stores the object.
		 
		public void populateWithData(library myL) {
			
			myL.addNewMember(new Member(1, "Tomas", "Baily", "077123456"));
			myL.addNewMember(new Member(2, "Adam", "Tron", "077167456"));
			myL.addNewMember(new Member(3, "Ash", "Smoke", "077123786"));
			myL.addNewMember(new Member(4, "Qin", "Yumi", "077123454"));
			myL.addNewMember(new Member(1, "Sonia", "Yoyo", "077123123"));
			myL.addNewMember(new Member(5, "Set", "Baily", "072223456"));
			myL.addNewMember(new Member(6, "Tomas", "Roy", "073243456"));
			myL.addNewMember(new Member(7, "Ron", "Bad", "077123336"));
 
			myL.addNewBook(new Book(113, "Harry Potter and Philosofer Stone", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(123, "Harry Potter and Chamber of Secrets", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(133, "Harry Potter and Prisner of Azkaban", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(143, "Harry Potter and Goblet of Fire", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(153, "Harry Potter and Order of Phenix", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(163, "Harry Potter and Half-Blood Prince", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(173, "Harry Potter and Deathly Hallows", "J. K. Rolling", "Fantasy"));
			myL.addNewBook(new Book(213, "Sabriel", "Garth Nix", "Fantasy"));
			myL.addNewBook(new Book(223, "Lirael", "Garth Nix", "Fantasy"));
			myL.addNewBook(new Book(233, "Abhorsen", "Garth Nix", "Fantasy"));
		    myL.addNewLoan(new Loan(111,1,"2021-05-05"));
		    myL.addNewLoan(new Loan(141,2,"2021-05-03"));
		    myL.addNewLoan(new Loan(151,3,"2021-03-17"));
		    myL.addNewLoan(new Loan(131,4,"2021-02-10"));
		    myL.addNewLoan(new Loan(121,5,"2021-05-12"));
		    myL.addNewLoan(new Loan(171,6,"2021-05-17"));
		    myL.addNewLoan(new Loan(211,7,"2021-01-12"));
		   
		}
		
		
		// creating the method to test: addition of new members, searching for a specific memberID and if found to show details, printing of a list of all members.
		 
		public void test_01 () {
			library myLibrary = new library();
			System.out.println("");
			System.out.println("***Start of test_01***");
			myLibrary.addNewMember(new Member(1, "Tomas", "Baily", "077123456"));
			myLibrary.addNewMember(new Member(2, "Adam", "Tron", "077167456"));
			myLibrary.addNewMember(new Member(3, "Ash", "Smoke", "077123786"));
			myLibrary.addNewMember(new Member(4, "Qin", "Yumi", "077123454"));
			myLibrary.addNewMember(new Member(-1, "Sonia", "Yoyo", "077123123"));
			myLibrary.searchMemberByIDNumber(1);
			myLibrary.searchMemberByIDNumber(3);
			myLibrary.printAllMembersList();
			System.out.println("");
			System.out.println("***End of Test_01***");
			System.out.println("");
			
		}
		
		// created the method to test: addition of new books, searching for a specific book ID and show details, printing of a list of all books.
		 
		public void test_02 () {
			library myLibrary = new library();
			System.out.println("");
			System.out.println("***Start of test_02***");
			myLibrary.addNewBook(new Book(111, "Harry Potter and Philosofer Stone", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(121, "Harry Potter and Chamber of Secrets", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(131, "Harry Potter and Prisner of Azkaban", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(141, "Harry Potter and Goblet of Fire", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(151, "Harry Potter and Order of Phenix", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(161, "Harry Potter and Half-Blood Prince", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(171, "Harry Potter and Deathly Hallows", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(211, "Sabriel", "Garth Nix", "Fantasy"));
			myLibrary.addNewBook(new Book(221, "Lirael", "Garth Nix", "Fantasy"));
			myLibrary.addNewBook(new Book(-231, "Abhorsen", "Garth Nix", "Fantasy"));
			myLibrary.searchBookByIDNumber(111);
			myLibrary.searchBookByIDNumber(131);
			myLibrary.printAllBooksList();
			System.out.println("");
			System.out.println("***End of Test_02***");
			System.out.println("");
			
		}
		
		// creating the method to test library with : returning/removing a member with a particular member ID, searching for and printing members where surname contains a particular string.
		 
		 public void test_03 () {
			library myLibrary = new library();
			System.out.println("");
			System.out.println("***Start of test_03***");
			myLibrary.addNewMember(new Member(5, "Set", "Baily", "072223456"));
			myLibrary.addNewMember(new Member(6, "Tomas", "Roy", "073243456"));
			myLibrary.addNewMember(new Member(7, "Ron", "Bad", "077123336"));
			myLibrary.returnMember(5).MemberDetails();
			myLibrary.searchMember("Roy");
			myLibrary.searchMember("Ron");
			myLibrary.removeMember(7);
			myLibrary.removeMember(6);
			myLibrary.printAllMembersList();
			System.out.println("");
			System.out.println("***End of Test_03***");
			System.out.println("");
			
		}
		
		// creating the method test library with : returning/removing a book with a particular book ID, searching for and printing books with particular string
		 
		public void test_04 () {
			library myLibrary = new library();
			System.out.println("");
			System.out.println("***Start of test_04***");
			myLibrary.addNewBook(new Book(112, "Harry Potter and Philosofer Stone", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(122, "Harry Potter and Chamber of Secrets", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(132, "Harry Potter and Prisner of Azkaban", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(142, "Harry Potter and Goblet of Fire", "J. K. Rolling", "Fantasy"));
			myLibrary.printAllBooksList();
			myLibrary.returnBook(112).BookDetails();
			myLibrary.searchBook("Abhorsen");
			myLibrary.removeBook(112);
			myLibrary.removeBook(142);
			myLibrary.printAllBooksList();
			System.out.println("");
			System.out.println("***End of Test_04***");
			System.out.println("");
			
		}
		
		// creating the method that test library with : adding/removing/listing a loan for a given member and book ID,
		 
		public void test_05 () {
		
			System.out.println("");
			System.out.println("***Start of test_05***");
			
			library myLibrary = new library();
			populateWithData(myLibrary);
			myLibrary.addNewBook(new Book(112, "Harry Potter and Philosofer Stone", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(122, "Harry Potter and Chamber of Secrets", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(132, "Harry Potter and Prisner of Azkaban", "J. K. Rolling", "Fantasy"));
			myLibrary.addNewBook(new Book(142, "Harry Potter and Goblet of Fire", "J. K. Rolling", "Fantasy"));
			
			myLibrary.addNewMember(new Member(5, "Set", "Baily", "072223456"));
			myLibrary.addNewMember(new Member(6, "Tomas", "Roy", "073243456"));
			myLibrary.addNewMember(new Member(7, "Ron", "Bad", "077123336"));
			
		    myLibrary.addNewLoan(new Loan(112,5,"2021-03-12"));
		    myLibrary.addNewLoan(new Loan(122,6,"2021-03-13"));
		    myLibrary.addNewLoan(new Loan(132,7,"2021-03-14"));
		    myLibrary.removeLoan(5, 122);
		    myLibrary.removeLoan(6, 112);
		    myLibrary.printAllLoansList();
			System.out.println("");
			System.out.println("***End of Test_05***");
			System.out.println("");
			
		}
		
		//creating the method that is printing the list of overdue loans.
		 
		public void test_06 () {
			
			System.out.println("");
			System.out.println("***Start of test_06***");
			System.out.println("");
			library myLibrary = new library();
			populateWithData(myLibrary);
			myLibrary.printListOfOverdueLoans();
			System.out.println("***End of Test_06***");
			System.out.println("");
		}
		
		
		//A default java class to run the tests.
		 
		public static void main(String args[]){
			testing myLibrary = new testing(); // Creating an objects to test the Library Class.
			

			
			// running test_01
			myLibrary.test_01(); 
			
			// running test_02
			myLibrary.test_02();
			
			// running test_03
			myLibrary.test_03();
			
			// running test_04
			myLibrary.test_04();
			
			// running test_05
			myLibrary.test_05();
			
			// running test_06
			myLibrary.test_06();
		}
	}


