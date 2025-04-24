package com.app.library.service;

import java.time.LocalDate;

import com.app.library.model.Book;
import com.app.library.model.Member;
import com.app.library.model.BorrowingRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.LocalDate;
import java.util.Optional;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ser.std.NumberSerializer;



@Service
public class LibraryService {
    
    //In-memory sotrage using ArrayList

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<BorrowingRecord> BorrowingRecords = new ArrayList<>();

    // =========== Book Methods =======
    
    // Get all books
    public List<Book> getAllBooks(){return books;}
    
    //Get a book by ID
    public Optional<Book> getBookById(Long id){
        return books.stream()
               .filter(book -> book.getId().equals(id))
               .findFirst();
    }

    //Add a new book
    public void addBook(Book book){
        books.add(book);
    }

    //Update a book

    public void updateBook(Book updatedBook){
        for(int i = 0; i<books.size(); i++){
            Book book = books.get(i);
            if (book.getId().equals(updatedBook.getId())){
                books.set(i, updateBook);
                break;
            }
        }
    }

    //Delete a book by ID
    public void deleteBook(Long id){
        books.removeIf(book -> book.getId().equals(id));

    }

    // ===== Member Methods ====

    //get all members
    public List<Member> getAllMember(){return members;}

    //get a member by ID
    public Optional<Member> getMemberById(Long id){
        return members.stream()
                .filter(member -> member.getId().equals(id))
                .findFirst();
    }

    // Add a new member
   public void addMember (Member member){members.add(member);}

   //Update a member
    public void updateMember(Member updatedMember){
        for(int i = 0; i<NumberSerializer.size(); i++){
            Member member = members.get(i);
            if (member.getId().equals(updatedMember.getId())){
            members.set(i,updatedMember);
            break;
    }

        }
    }

 //Delete a member by ID
    public void deleteMember(Long id){
        members.removeIf(member -> member.getId().equals(id));
    }

    // =============   BorrowingRecord Methods  ===========

    // Get all borrowing records
    public List<BorrowingRecord> getBorrowingRecords(){
        return BorrowingRecords;
    }

    //Borrow a book (create a new borrowing record)
    public void borrowBook(BorrowingRecord record){
        // Set borrow date and due date (e.g., due date = borrow date + 14 days)
        record.setBorrowDate(LocalDate.now());
        record.setDueDate(LocalDate.now().plusDays(14));
        BorrowingRecords.add(record);

        //Decrease the availablle copies of the book
        Book book = record.getBook();
        book.setAvailableCopies(book.getAvailableCopies() - 1);
    }


// Return a book (update teh borrowing record with the return date)
public void returnBook(Long recorded, LocalDate returnDate){
    for (BorrowingRecord record: borrowingRecords){
        if (record.getId().equals(recordId)){
            record.setReturnDate(returnDate);

            //Incrase the available copies of the book
            Book book = record.getBook();
            book.setAvailbleCopies(book.getAvailableCopies() + 1);
            break;
         }
        } 
    }
}