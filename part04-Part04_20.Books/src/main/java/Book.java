
public class Book {
    
    String name;
    int pages;
    int year;
    
    public Book(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }
    
    public String toString(){
        return name + ", " + pages + " pages, " + year;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPages(){
        return pages;
    }
    
    public int getYear(){
        return year;
    }
}
