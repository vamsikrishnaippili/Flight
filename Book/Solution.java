import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    Book[] books = new Book[4];
        double min = 0;
        double max = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();
            String title = sc.nextLine();
            String author = sc.nextLine();
            sc.nextLine();
            double price = sc.nextDouble();
            
            books[i]= new Book(id,title,author,price);
        }
        min = sc.nextDouble();
        max = sc.nextDouble();
        
        Book[] newBooks = booksWithPriceRange(min,max,books);
        
    for(Book b:newBooks)
             System.out.println(b.getId());
    }
    
    public static Book[] booksWithPriceRange(double minPrice, double maxPrice,Book[] bk)
    {
        ArrayList<Book> res = new ArrayList<>();
        //iterate
        for(Book b: bk){
            //filter
            if(b.getPrice()>minPrice && b.getPrice()<maxPrice){
                //addition
                int i;
                for(i = 0; i<res.size(); i++){
                    if(res.get(i).getId()>b.getId()){
                        break;
                    }
                }
                res.add(i, b);
                //res.add(b);
            }
        }
        Book[] temp = new Book[res.size()];
        return res.toArray(temp);
    }
    //implement business methods here
}

class Book
{
    //implement class here
    int id;
    String title;
    String author;
    double price;
    public Book(int id, String title, String author, double price) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
