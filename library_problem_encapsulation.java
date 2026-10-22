/* the question is

You are tasked to design a class Book to manage the book details in a library. The class should contain the following specifications :

Attributes :

title (list<string>) : The title of the book (public).
author (list<string>) : The author of the book (public)
isAvailable (list<Boolean>) : The availability status of the book (private).
Methods :

Parameterised constructor to initialize the title, author, isAvaialble list.
borrowBook(string bookName) : If the availability status for book 'bookName' is true then the book can be borrowed, Once borrowed mark its status as false. If availability status for book 'bookname' is false then the book is already borrowed by some user and cannot be borrowed until its returned, so print "Book is not available.".
returnBook (string bookName) : The book with bookName is returned and should be marked as available by setting its available flag to true.
getAvailability (string bookName) : Prints the availability status of the book with name 'bookName' (true for available , false for unavailable).
Refer the sample example to understand the output format.

Refer the commented code on IDE to view the output statements.

The Input is provided as mentioned below :

"1 <book name>" - represents call to borrowBook method along with name of the book to borrow.

"2 <book name>" - represents call to returnBook method along with name of the book to return.

"3 <book name>" - represents call to getAvailability method along with name of book.

Example 1:
Input : title = [ "Sherlock_Holmes", "Frankenstein", "King_Arthur_and_the_Round_Table", "Treasure_Island" ]

author = [ "Arthur_Conan_Doyle", "Mary_Shelley", "Roger_Lancelyn_Green", "Robert_Louis_Stevenson" ]

isAvailable = [ "false", "true", "false", "false" ]

methodCalls = [ ["1", "Frankenstein"] , ["1", "Sherlock_Holmes"] , ["2", "King_Arthur_and_the_Round_Table"], ["3", "Sherlock_Holmes"], ["1", "Frankenstein"] ]

Output :

Book is not available.

false

Book is not available.

Explanation :

Program creates a object with the arguments title, author and isAvailable list.
It then takes the methodCalls array as input.
Iterate over the methodCalls array and gives call to the appropriate methods from the class Book.
The first operation is to borrow the book named "Frankenstein". As the book is available then it can be borrowed.

The second operation is to borrow book named "Sherlock Holmes". As the book is not available so we print "Book Not Available".

The third operation is to return the book named "King_Arthur_and_the_Round_Table".

The fourth operation we need the availability status of book named "Sherlock_Holmes", which is false.

The fifth operation is to borrow the book named "Frankenstein". The book was already borrowed in 1st operation and not returned yet. So the availability status is false and So we print "Book Not Available".

Constraints:
Only one book can be borrowed at a time for a single instance.


 */




//Your code goes here
import java.util.List;
class Book{
    List<String> title;
    List<String> author;
    List<Boolean> isAvailable;
    Book(List<String> title,List<String> author, List<Boolean> isAvailable){
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public void borrowBook(String bookName){
        int index = title.indexOf(bookName);
        if(index == -1){ 
            return;
        }
        if(isAvailable.get(index)){ // here the book is available
            isAvailable.set(index,false); // after borrowing the book set the availability status to false 
        }else{
            System.out.println("Book is not available.");
        }
    }
    
    public void returnBook(String bookName){
        int index = title.indexOf(bookName);
        if(index == -1){
            return;
        }
        isAvailable.set(index,true); // book is returned to setting the availability status to true
    }

    public void getAvailability(String bookName){
        int index = title.indexOf(bookName);
        if(index == -1){
            return;
        }
        System.out.println(isAvailable.get(index));
    }

}




//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `Book` class.

It creates a object of class `Book`, the parameterised constructor sets the values of titles, authors, isAvailable attributes.
It iterates over the methodCalls array and calls methods corresponding the operation type.


// Main class to demonstrate the functionality of the Student class
public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

            
            List<String> titles, authors;
            List<Boolean> isAvailable;
            List<List<String>> methodCalls = new ArrayList<>();
            
            // Create book object using parameterised Constructor to initialize the attributes
            Book book = new Book(titles, authors, isAvailable);
            
            //Iterate over the methodCalls
            for (List<String> methodCall : methodCalls) {
                String operation = methodCall.get(0);
                String bookName = methodCall.get(1);
                
                if (operation.equals("1")) {
                
                    //If the opertion is of type 1 then calling method borrowBook
                    book.borrowBook(bookName);
                } 
                else if (operation.equals("2")) {
                
                    //If the opertion is of type 1 then calling method returnBook
                    book.returnBook(bookName);
                } 
                else if (operation.equals("3")) {
                
                    //If the opertion is of type 1 then calling method getAvailability
                    book.getAvailability(bookName);
                }
            }
        }

        sc.close();
    }
}

*/

/*
//Below are the output statements

System.out.println("false");
System.out.println("true");
System.out.println("Book is not available.");

*/