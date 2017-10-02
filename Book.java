/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; //Exercise 2.85 Add field: "pages"
    private String refNumber; // Exercise 2.88 Add field: "refNumber"
    private int borrowed; // Exercise 2.91 Add field: "borrowed"
    private boolean courseText; //Exercise 2.92 Add field: "courseText"

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; // Exercise 2.85 Add field: "pages"
        refNumber = ""; // Exercise 2.88 Add field: "refNumber"
        borrowed = 0; //Exercise 2.91 Add field: "borrowed"
        courseText = bookCourseText; //Exercise 2.92 add field "courseText"
    }

    // Add the methods here ...
    
    // Exercise 2.83 Create two accessor methods: "getAuthor" and "getTitle"
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    // Exercise 2.85 Add a field: "pages"
    public int getPages()
    {
        return pages;
    }
    
    // Exercise 2.88 Add accessor: "getRefNumber"
    public String getRefNumber()
    {
        return refNumber;
    }
    
    // Exercise 2.91 Add accessor: "getBorrowed"
    public int getBorrowed()
    {
        return borrowed;
    }
    
    //Exercise 2.92 Add accessor: "isCourseText"
    public boolean isCourseText()
    {
        return courseText;
    }
    
    // Exercise 2.88 Mutator: "setRefNumber"
    // Exercise 2.90 Modify "setRefNumber" w/ conditional statement
    public void setRefNumber(String ref)
    {
        refNumber = ref;
        
        if(ref.length() >= 3)
          refNumber = ref;
        else
          System.out.println("Error: ref number must be 3 characters or more");
    }
    
    // Exercise 2.91 Mutator: "borrow"
    public void borrow()
    {
        borrowed+=1;
    }
    
    // Exercise 2.84 Add two print methods: "printAuthor" and "printTitle
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    // Exercise 2.87 Add method: "printDetails"
    // Exercise 2.89 Modify "printDetails" to add "refNumber"
    // Exercise 2.89 Conditional Statement 
    // Exercise 2.91 Modify "printDetails" to add "borrow"
    public void printDetails()
    {
        //System.out.println("Title: " + title + "\nAuthor: " + author + "\nPages: " + pages);
        //System.out.println("Title: " + title + "\nAuthor: " + author + "\nPages: " + pages + "\nRef Number: " + refNumber);
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPages: " + pages + "\nRef Number: " + refNumber + "\nBorrowed: " + borrowed);
        
        if (refNumber.length() > 0)
            System.out.println("Ref Number: " + refNumber);
        else
            System.out.println("Ref Number: ZZZ");
    }
}
