/**
 * A class stores all informations about books such as book title , author, genre 
 * and an unique book number that will allow us to identify books in other classes
 * 
 * 
 * @author Nikola Dragon 2009277
 * @version 05-07-2021
 *
 */


package libraryOptimalizer;

import java.util.ArrayList;

public class Book{

	private int bookIDNumber;
	private String bookTitle;
	private String authorName;
	private String bookGenre;

    /**
     * create members object
     * autorName
     * bookTitle
     * bookGenre
     * IDNumber
     * ID number has to be uniqe
     * ID has to be greater than 0, if input will not meet that parameter the error will be display. 
     * Unique book will be 1 and displayed an appropriate message.
     */
	
	private ArrayList<Book>bookRecords = new ArrayList<>();
    
    public Book(int bookIDNumber, String bookTitle, String authorName, String bookGenre) {
    	if(bookIDNumber > 0) {
    		this.bookIDNumber = bookIDNumber;
    	} else {
    		System.out.println("Wrong ID number for book. Unique number has to be 1." + "\n Please, correct the ID.");
    		this.bookIDNumber = 1;
    	}
    	this.bookTitle = bookTitle;
    	this.authorName = authorName;
        this.bookGenre = bookGenre;
        
    }
    
//set
    
    //set book ID
    
    public void setBookIDNumber(int bookIDNumber) {
        if (this.bookIDNumber > 1 ) {
            this.bookIDNumber = bookIDNumber;
        } else {
        	System.out.println("Wrong ID number. Pleace try again.");
        }
    }
    
    //set books title
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
        
    //set books author name
    
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    //set books genre
    
    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }
    
//returns
        
    //return book ID number
         
	public int getBookIDNumber() {
        return bookIDNumber;
    }
	
	//return books title
    
    public String getBookTitle() {
        return bookTitle;
    }
    
    //return books author name
     
    public String getAuthorName() {
        return authorName;
    }
    
    //return books genre
    
    public String getBookGenre() {
        return bookGenre;
    }
           
    //return books details. It will be used in main class of that program
     
    public String BookDetails()
    {
        return " | ID number : " + this.bookIDNumber + "| \n | Title : " + this.bookTitle + "  | Author name : " + this.authorName + "  | Genre : " + this.bookGenre + " | "
                + "\n**************************************";
    }
}
