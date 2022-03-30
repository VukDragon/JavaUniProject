/**
 * A class keeps all information about members such as name, surname, phone number
 * and an unique ID number that will allow identify members in other classes.
 * 
 * @author Nikola Dragon 2009277
 * @version 05-07-2021
 */

package libraryOptimalizer;

import java.util.ArrayList;

public class Member{

	private int memberIDNumber;
	private String memberName;
	private String memberSurname;
	private String memberPhoneNumber;

    /**
     * create members object
     * Name
     * Surname
     * PhoneNumber
     * IDNumber
     * ID number has to be uniqe
     * ID has to be greater than 0, if input will not meet that parameter the error will be display. 
     * Unique number will be 0 and displayed an appropriate message.
     */
	
	private ArrayList<Member>memberRecords = new ArrayList<>();
	
    public Member(int memberIDNumber, String memberName, String memberSurname, String memberPhoneNumber) {
        this.memberName = memberName;
        this.memberSurname = memberSurname;
        this.memberPhoneNumber = memberPhoneNumber;
        if(memberIDNumber > 0) {
        	this.memberIDNumber = memberIDNumber;
        } else {
        	System.out.println("Wrong ID number for member." + "\n Please, correct the ID.");
        	
        }
    }
        
//set
    
    //set memberIDNumber
    
    public void setMemberIDNumber(int memberIDNumber) {
    	if(memberIDNumber > 1) {
    		this.memberIDNumber = memberIDNumber;
    	} else {
    		System.out.println("Wrong ID number. Pleace try again.");
    	}
    }
    
    //Set the name
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
            
    //set members surname
    
    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname;
    }
        
    //set the phone number
     
    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }
    
//return    
    
    //return members ID
    
    public int getMemberIDNumber() {
        return memberIDNumber;
    }
    
    //return members name
     
    public String getMemberName() {
        return memberName;
    }
    
    //return members surname
    
    public String getMemberSurname() {
        return memberSurname;
    }
    
    //return members phone number
    
    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }
        
    //return members details. It will be used in main class of that program
     
    public String MemberDetails(){
        return "| Member number : " + this.memberIDNumber + "| \n | Name : " + this.memberName + " | Surname : " + this.memberSurname + " | Phone number : "
                + this.memberPhoneNumber + " | \n******************************************************************";
    }

}
