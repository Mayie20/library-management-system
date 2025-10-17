/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(100);
        int choice;
        
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Searc Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.println("Enter title to search: ");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    System.out.println("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    library.deleteBook(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
        sc.close();
    }
}
