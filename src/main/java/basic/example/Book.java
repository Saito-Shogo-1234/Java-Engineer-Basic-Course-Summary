package basic.example;

public class Book {
  String title;

  String author;

  int numberl;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumberl() {
    return numberl;
  }

  public Book(String title, String author, int numberl) {
    this.title = title;
    this.author = author;
    this.numberl = numberl;


  }
}
