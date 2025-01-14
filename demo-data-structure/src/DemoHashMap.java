public class DemoHashMap {
  
  public static class Book {
    private int id;
    private String name;

    public Book(int id, String name){
      this.id = id;
      this.name = name;
    }

    public int getId(){
      return this.id;
    }
    public String getName(){
      return this.name;
    }
@Override
public boolean equals(Object obj){
  if (this == obj)
    return true;
    if (!(obj instanceof Book))
    return false;
    Book book = (Book) obj;
    return Object.equals(this.id, book.getId())
      && Object.equals(this.name, book.getName());
}

    }
  }

