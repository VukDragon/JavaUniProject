/**
 * This class stores information about loans based on member and book ID numbers.
 * It allows to add new loans to ArrayList, also removes them. 
 * It deliver information about overdue loans.
 * 
 * @author Nikola Dragon 2009277
 * @version 05-07-2021
 *
 */

package libraryOptimalizer;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;

public class Loan{
	
	//getting data from Book and Member classes
	 
    private int bookID;
    private int memberID;
    private LocalDate dueDate;
    private String loanDate;
        
    //List to store an information about loans 
     
    private ArrayList<Loan>loanRecords = new ArrayList<>();


    /**
     * create loans object
     * bookID
     * memberID
     */
    
    public Loan(int bookID, int memberID, String loanDate) {
    	if (bookID <0 || memberID <0 ) {
    		System.out.println("Invalid book or member ID. Please try again");
    	}
    	else {
    		this.bookID = bookID;
            this.memberID = memberID;
            this.loanDate = loanDate;
            this.dueDate=LocalDate.parse(loanDate).plus(4, ChronoUnit.WEEKS);    		
    	}
    }
    
//create loans
    
    public Loan() {
    }
    
    //return books ID number
     
    public int getLoanBookID() {
        return this.bookID;
    }
    
    //return members ID number
     
    public int getLoanMemberID() {
        return this.memberID;
    }
    
    //return dueDate of the loan.
	 
	public LocalDate DueDate() {
		return dueDate;
	}
    
    //return an information about a loan date
     
    public String getLoan() {
        return this.loanDate;
    }
        
    //add a new loan to the loanRecords list.
     
    public void addLoan(Loan newLoan)
    {
        loanRecords.add(newLoan);
    }

    //list loan date and a return date.
     
    public void LoanDetails() {
		
		System.out.println("| Member ID: " + memberID + " - Book ID: " + bookID + " | Date Loaned: " + loanDate + " > Due Date: " + dueDate + " |");
		System.out.println("");
		
	}
    

}
