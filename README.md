# JavaUniProject
project java y1 uni
Assignment
In this assignment you are going to create an application that can be used in a lending library.
Scenario - The Hawkshead Lending Library
The village of Hawkshead has had its own library for 25 years, but it is now under threat of
closure due to spending cuts. The only hope is to improve the library’s efficiency and to do this
they have asked you to create a computer program to keep track of its members and books.
Task 1 of 3 - Object Oriented Design Theory (10 marks)
After reviewing the library’s business processes, you have suggested using the Object-Oriented
paradigm as the basis of your programmed solution.
In no more than 1000 words, summarise the basic principles of object-oriented program design
including a discussion of class hierarchies, inheritance, and programming to interfaces.
The General Assessment Guidelines for Written Assessments Level HE4 are shown on final page. Correct
use of secondary research including in-text citation using the Harvard Referencing techniques and a
Reference list is expected. Your written work will be checked using Turntin for originality.
Task 2 of 3 - Develop a programmed solution for the library (80 marks)
Using your knowledge of object orientation, you have identified several entities that need to be
modelled by your software, they are:
Member
The library keeps basic information about each of its members e.g. first name, last name
and phone number, also each member is given a unique membership number (this is a
positive integer).
Book
The library gives each book a unique identity number (this is a positive integer) which is
used to track loans. The library also records a book’s author, title and whether it is fiction
or non-fiction.
Loan
A loan is a member borrowing a particular book, so if a member comes into the library
and borrows three books then this is considered to be three loans. The library records
the membership ID number, the book ID number, the date loaned and the date due back
(the loan period for all books is 3 weeks)
Library
This entity provides all the functionality required to maintain collections of members,
books and loans. The expected functionality is shown on page 5.
A. Razak Page 4 of 9 28/06/2021
Some guidelines to creating the software
Step 1
You are obviously going to need some classes to model the member and the book, so you
should create these first. For each class:
• identify and define the fields required, these can be found in the scenario.
• create accessor and mutator methods for each field.
• create a parameter constructor to simplify the creation of member and book objects.
• create a method that prints the objects details on one line, this will be useful when you
want to print a list of members or books.
• Use the Violet UML editor software provided to create a class diagram which accurately
describes the implementation.
Step 2
Once you have created these classes you can then create the library class which will be used to
maintain collections of members and books.
• Define two fields of type ArrayList, one for the members and one for the books.
• create a constructor that will create the ArrayLists.
• create methods to implement the functionalities listed in page 5 – each user requirement
would be a separate method in this class.
Step 3
The final part is implementing the loans functionality. Here I suggest you create a loan class that
has at least two attributes which hold member ID and book ID (or member and book object
references). To implement the final part using dates I recommend that you investigate the Java
library class GregorianCalendar.
