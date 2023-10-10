class Liabrary{
    String[] books ;
    int no_of_books;
    Liabrary() {
        this.books = new String[100]; 


    }


    void addBook(String book ){
    this.books[no_of_books] = book; 
    no_of_books++;
    System.out.println(book + ": book has been added");
}
    void showAvailableBooks(){
    
    System.out.println("Avalaible Books are :");
     for (String book : this.books) {
        if ( book == null){
            continue;
        }
        System.out.println("*" +book);
     }                                                            
    }
     void issueBook(String book ){
            
     for (int i=0; i<this.books.length;i++)  {
        if ( this.books[i].equals(book)){
            System.out.println(book+" : book has been issued....");
            this.books[i]= null;
            return;
        }}
      

     System.out.println("this book does not exist");
         
     }
       void returnBook(String book){
            this.books[no_of_books]= book;
            System.out.println(book+": Book has been returned ");
            showAvailableBooks();

        }

}
public class Lec50 {
public static void main(String[] args) {
    Liabrary sagar = new Liabrary();
    sagar.addBook("Comiler working");
    sagar.addBook("C++");
    sagar.addBook("Automata");
    sagar.showAvailableBooks();    
    sagar.issueBook("C++");
    sagar.returnBook("C++");
    
    
}
}
