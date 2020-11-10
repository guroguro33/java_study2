package jp.learning.javastudy2;

import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;

  public int hashCode(){
    int result = 37; // 適当な初期値
    result = result * 31 + title.hashCode();
    result = result * 31 + publishDate.hashCode();
    return result;
  }

  public boolean equals(Object o) {
    // 等値だったらtrue
    if(this == o){
      return true;
    }
    // nullだったらfalse
    if(o == null){
      return false;
    }
    // Bookのインスタンスじゃないならfalse
    if(!(o instanceof Book)){
      return false;
    }
    //発行日が等しくないならfalse
    Book b = (Book) o;
    if(!publishDate.equals(b.publishDate)){
      return false;
    }
    // 書名が等しくないならfalse
    if(!title.equals(b.title)){
      return false;
    }
    return true;
  }
  // 練習４−１②
  public int compareTo(Book b){
    return this.publishDate.compareTo(b.publishDate);
  }

  // 練習４−１③
  public Book clone(){
    Book result = new Book();
    result.title = this.title;
    result.publishDate = (Date) this.publishDate.clone(); // なぜキャストしてclone?
    result.comment = this.comment;
    return result;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
