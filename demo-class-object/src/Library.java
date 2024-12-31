public class Library {
  // A library has many books
  // A book has attributes, title & author
  // The library has functions: 
  // 1/ add a Book, return void.
  // 2/ removeByTitle, return Book.
  // 3/ searchByTitle, return Book[]

  // Librarian(add/move), Library(search), Book

private Book[] books;

// constuctor
public Library (){
  this.books= new Book[];
}
//getter
public Book[] getBooks(){
return this.books;
}


// method signature

//1)
public void add(Book book) {
  Book[] newBook = new Book[this.books.length + 1];
    for (int i = 0 ; i < this.books.length; i++) {
      newBook[i] = this.books[i];
    }
    newBook[newBook.length - 1] = book;
    this.books = newBook;
}
//2) assume remove the first book with same title
public Book removeByTitle(String title, String author){
  for (int i = 0; i < this.books.length; i++){
    
  }

  return ;
}

//3) search a substring of the title
public Book[] searchByTitle(String title) {
  return null;
} 

public static void main (String[] arg){
    Book b1 = new Book(b1);
    Book b2 = new Book(b2);

}