/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
public class Library {
    Book[] books;
    int count;
    
    public Library(int size){
        books = new Book[size];
        count = 0;
    }
    public void addBook(Book b){
        if (count < books.length){
            books[count++] = b;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full!");
        }
    }
    public void viewBooks(){
        if (count == 0){
            System.out.println("No books in the library");
        } else {
            System.out.println("\nBook List: ");
            for (int i = 0; i < count; i++){
                System.out.println(books[i]);
            }
        }
    }
    public void searchBook(String title){
        boolean found = false;
        for (int i = 0; i < count; i++){
            if (books[i].title.equalsIgnoreCase(title)){
                System.out.println("Book Found: " + books[i]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Book not found.");
        }
    }
    public void deleteBook(int id){
        boolean found = false;
        for (int i = 0; i < count; i++){
            if (books[i].id == id){
                for(int j = i; j < count - 1; j++){
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count --;
                System.out.println("Book deleted successfully");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Book Id not found.");
        }
    }
}
