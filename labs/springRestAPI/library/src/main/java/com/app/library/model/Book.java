package com.app.library.model;

public class Book {

    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private int availableCopies;

    //Default Constructor
    public Book(){}

    //Parameterized Consturctor
    public Book(
        String title, 
        String author, 
        int publicationYear,
        String genre,
        int availableCopies)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availableCopies = availableCopies;
    }

    // Getters and setters
    public Long getId(){ return id;}
    public void setId(Long id){this.id = id;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}


    public String getAuthor(){return author;}
    public void setAuthor(String Author){this.author = author;}

    public int getPublicationYear(){return publicationYear;}
    public void setPublicationYear(int publicationYear){
              this.publicationYear= publicationYear;}

    public String getGenre(){return genre;}
    public void setGenre(String genre){this.genre = genre;}

    public int getAvailableCopies(){return availableCopies;}
    public void setAvailbleCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }

    //toString
    @Override
    public String toString(){
        return "Book{" +
            "id=" + id +
            ",title = " + title + '\'' +
            ",author = " + author + '\'' +
            ",publicationYear =" + publicationYear + '\'' +
            ",genre = " + genre + '\''+
            ", availableCopies = " + availableCopies +
            '}';
    }
    
}
