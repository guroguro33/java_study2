package jp.leaning.javastudy2;

import java.util.*;

public class Book {
  private String title;
  private Date publishDate;
  private String comment;

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
