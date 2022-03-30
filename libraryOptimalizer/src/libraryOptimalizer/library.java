package libraryOptimalizer;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * This class stores use ArrayLists to store the information.
 * This one is main part of program to store members and book data and display them.
 * @author Nikola Dragon 2009277
 * @version 05-07-2021
 *
 */

public class library {
	
    private ArrayList<Member> MemberList = new ArrayList<Member>();
    private ArrayList<Book> BookList = new ArrayList<Book>();
    private ArrayList<Loan> LoansList = new ArrayList<Loan>();
    
    public library() {
    }
    
    public ArrayList<Member> getMemberList() {
        return MemberList;
    }
    
    public ArrayList<Book> getBookList() {
        return BookList;
    }
    
    public ArrayList<Loan> getLoansList() {
        return LoansList;
    }

// add 
    
    public void addNewBook(Book newBook){
        this.BookList.add(newBook);
    }

    public void addNewMember(Member newMember){
        this.MemberList.add(newMember);
    }

    public void addNewLoan(Loan newLoan){
        this.LoansList.add(newLoan);
    }

// main tools

    // number of members
    
    public void numberOfMembers()
    {
        System.out.println("There are " + MemberList.size() + " members");
    }
    
    // numbers of loans

    public void numberOfLoans()
    {
        System.out.println("There are " + LoansList.size() + " loans");
    }

    //number of books
    
    public void numberOfBooks()
    {
        System.out.println("There are " + BookList.size() + " books");
    }

//lists    
    
    // list of books
    
    public void printAllBooksList()
    {
        System.out.println("\n");
        int index = 0;
        System.out.println("*********** LIST OF BOOKS ***********");
        for( Book element : BookList) {
            index ++;
            System.out.println(index + " book:\n" + element.BookDetails());
        }
        System.out.println("********** END OF THE LIST **********");
    }

    // list of members
    
    public void printAllMembersList()
    {
        System.out.println("\n");
        
        System.out.println("********** LIST OF MEMBERS **********");
        for(Member element : MemberList)
        {
        	System.out.println(element.MemberDetails());
        }
        System.out.println("********** END OF THE LIST **********");
    }
    
// list of all loans
	
    public void printAllLoansList()
    {
        System.out.println("\n");
        System.out.println("*********** LIST OF LOANS ***********");
        for(Loan loan : LoansList)
        {
        	//call the printLoanDetails method to print the loan details.
			loan.LoanDetails();
			System.out.println("");
			
        }
        System.out.println("********** END OF THE LIST **********");
    }
    
	//Overdue loans
	
	public void printListOfOverdueLoans() {
		// a boolean field to store if something was found in the list that is overdue or not
		boolean nothingFound = true;
		LocalDate currentDate = LocalDate.now();
		System.out.println("");
		System.out.println("***********LIST OF OVERDUE***********");
		System.out.println("");
		for (Loan loan : LoansList) {
			if (loan.DueDate().isBefore(currentDate) == true) {
				System.out.println("*************************************");
				//call the printLoanDetails method to print the loan details.
				loan.LoanDetails();
				nothingFound=false;
			}
					
		}
		
		//if there was something found the method will wrap the text box after the list.
		if (nothingFound == false) {
			System.out.println("");
			System.out.println("*************************************");
			System.out.println("");
			}
		
		// if not it will inform the user that there are no overdue loans.
		else {
			System.out.println("");
			System.out.println("No overdue loans found.");
			System.out.println("*************************************");
			System.out.println("");
		}
	}


    
	    // search book by id
	
    public void searchBookByIDNumber(int bookID)
    {
        if(bookID < 0)
        {
            System.out.println("Invalid book ID.");
        }
        int secondIndex = 0;
        int index =0;
        while( index < BookList.size())
        {
            Book element = BookList.get(index);
            if(element.getBookIDNumber() == bookID)
            {
                System.out.println("\nBook ID " + bookID + " found : \n" + element.BookDetails());
            }
            else
            {
                secondIndex ++;
                if ( secondIndex == MemberList.size())
                {
                    System.out.println("Book ID " + bookID + " not found.");
		    System.out.println("*************************************");
                }
            }
            index ++;
        }
    }
    
    //search member by id
    public void searchMemberByIDNumber(int memberID)
    {
        if(memberID < 0)
        {
            System.out.println("Invalid member ID.");
        }

        int secondIndex = 0;
        int index =0;
        while( index < MemberList.size())
        {
            Member element = MemberList.get(index);
            if(element.getMemberIDNumber() == memberID)
            {
                System.out.println("\nMember ID " + memberID + " found : \n" + element.MemberDetails());
            }
            else
                {
                    secondIndex ++;
                    if ( secondIndex == MemberList.size())
                    {
                        System.out.println("Member ID " + memberID + " not found.");
			System.out.println("*************************************");
                    }
                }
            index ++;
        }
    }

    //search by title
    
    public void searchBook(String title)
    {

        int index = 0;
        int secondIndex = 0;
        System.out.println("\nResults for book " + title + " title :");
        for(Book element : BookList)
        {
            if(element.getBookTitle().contains(title))
            {
                index ++;
                System.out.println( index + ". " + element.BookDetails() );
            }
            else
                {
                  secondIndex ++;
                  if(secondIndex == BookList.size())
                  {
                      System.out.println("No book has been found.");
                  }
                }
        }
        System.out.println("*************************************");
    }

    //search by name
    
    public void searchMember(String surname)
    {
        int index = 0;
        int secondIndex = 0;
        System.out.println("\nResults for member " + surname + " surname :");
        for(Member element : MemberList)
        {
            if(element.getMemberSurname().contains(surname))
            {
                index ++;
                System.out.println(index + ". " + element.MemberDetails());
            }
            else
                {
                    secondIndex ++;
                    if(secondIndex == MemberList.size())
                    {
                        System.out.println("No member has been found.");
                    }
                }
        }
        System.out.println("*************************************");
    }

   //remove book by id
    
   public void removeBook(int bookID)
   {

       int index = 0;
       int secondIndex = 0;
       while(index < BookList.size())
       {
           Book element = BookList.get(index);
           if(element.getBookIDNumber() == bookID)
           {
               System.out.println("\nThe book ID " + bookID + " has been removed\n" + element.BookDetails());
               BookList.remove(element);
           }
           else{
               secondIndex ++;
               if(secondIndex == BookList.size())
               {
                   System.out.println("The book ID " + bookID + " does not exists");
                   System.out.println("*************************************");
               }
           }
           index ++;
       }
   }

    //remove members
   
    public void removeMember(int memberID)
    {

        int index = 0;
        int secondIndex = 0;
        while(index < MemberList.size())
        {
            Member element = MemberList.get(index);
            if(element.getMemberIDNumber() == memberID)
            {
                System.out.println("\nThe member ID " + memberID+ " has been removed\n" + element.MemberDetails());
                MemberList.remove(element);
            }
            else{
                secondIndex ++;
                if(secondIndex == MemberList.size())
                {
                    System.out.println("The member ID " + memberID + " does not exists");
                    System.out.println("*************************************");
                }
            }
            index ++;
        }
    }

  //search

  	// search books to return by book ID
      
  		public Book returnBook(int searchID) {
  			Book bookToReturn=null;	
  			int index=0;
  			for ( Book book : BookList) {
  				if (book.getBookIDNumber()==searchID) {
  				bookToReturn=BookList.get(index);
  				}
  				
  				else {
  					index++;
  				}	
  				}
  					
  			return  bookToReturn;
  				
  			}
  	
  	// search member to return by ID	
  	
  	public Member returnMember(int searchID) {
  		//a field for the member to be returned defaulted to null.
  		Member memberToReturn=null;	
  		// a counter for the index.
  		int index=0;
  		//for each loop to go through the member list.
  		for (Member member : MemberList) {
  			//if the member id is found in the list, the member is going to be returned.
  			if (member.getMemberIDNumber()==searchID) {
  			memberToReturn=MemberList.get(index);			
  			}
  			// in any other case the the loop will continue till the end.
  			else {
  				index++;
  				}
  			}
  		return  memberToReturn;		
  		}      
      
      //remove loan
      
      public void removeLoan( int memberID, int bookID) {

      int index = 0;
      int secondIndex = 0;
      while (index < LoansList.size()) {
          Loan element = LoansList.get(index);
          if ((element.getLoanBookID() == bookID) && (element.getLoanMemberID() == memberID))
          {
              System.out.println("\nThe loan has been removed." + "\nMember ID : " + memberID + "\nBook ID : " + bookID);
              LoansList.remove(element);
          } else if ((element.getLoanBookID() != bookID) || (element.getLoanMemberID() == memberID))
          {
              secondIndex++;
              if (secondIndex == LoansList.size()) {
                  System.out.println("Loan could not be removed. Check details and try again.");
              }
          }
          index++;
      }
      System.out.println("*************************************");
                            
      }
    
}
