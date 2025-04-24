package com.app.library.model;

import java.time.LocalDate;

import org.springframework.web.bind.support.DefaultDataBinderFactory;

public class BorrowingRecord {
    private Long id;
    private Book book;
    private Member member;

    private LocalDate borrowDate;
    private LocalDate returnDate;
    private LocalDate dueDate;

    //default consturctor
    BorrowingRecord(){}

    //consturctor
    BorrowingRecord(Book book, Member member, LocalDate borrowDate, LocalDate returnDate, LocalDate dueDate){

        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.dueDate = dueDate;
    }


    //getters and setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public Book getBook(){return book;}
    public void setBook(Long Book){this.book = book;}

    public Member getMember(){return member;}
    public void setMember(){this.member = member;}

    public LocalDate getBorrowDate(){return borrowDate;}
    public void setBorrowDate(LocalDate borrowDate){this.borrowDate = borrowDate;}

    public LocalDate getReturDate(){return returnDate;}
    public void setReturnDate(LocalDate returnDate){this.returnDate = returnDate;}

    public LocalDate getDueDate(){return dueDate;}
    public void setDueDate(LocalDate dueDate){this.dueDate = dueDate;} 



// toString
@Override

public String toString(){

    return "BorrowingRecord{" +
           "id=" + id +
           ",book=" + book + 
           ",member = " + member +
           ",borrowDate = " + borrowDate +
           ",returnDate = " + returnDate +
           ",dueDate = " + dueDate + 
           "}";
}
}
