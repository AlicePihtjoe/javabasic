package week6;


import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    // constructor
    public Library() {
        this.books = new ArrayList<Book>();
    }

    //meetod addbook
    public void addBook(Book newBook){
        this.books.add(newBook);
    }

    //meetod printbook
    public void printBooks(){
        for (Book book: this.books) {
            System.out.println(book);
        }


    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book: this.books) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }

        }

        return found;
   }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book: this.books) {
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }

        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book: this.books) {
            if(book.year() == year){
                found.add(book);
            }

        }

        return found;
    }
}
