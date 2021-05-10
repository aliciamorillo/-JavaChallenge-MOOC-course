import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String title = scan.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year:");
            int year = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String information = scan.nextLine();
        
        for(Book book: books){
            
            if(information.equals("everything")){
                System.out.println(book);
            }
            
            if(information.equals("name")){
                System.out.println(book.getName());
            }
            
            if(information.equals("pages")){
                System.out.println(book.getPages());
            }
            
            if(information.equals("year")){
                System.out.println(book.getYear());
            }
        
        }
    }
}
