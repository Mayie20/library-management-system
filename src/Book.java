/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
public class Book {
    int id;
    String title;
    String author;
    
    public Book(int id, String title, String author){
        this.id = id;
        this.author = author;
        this.title = title;
    }
    @Override
    public String toString(){
        return id + " - " + title + " by " + author;
    } 
}
