
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.getSquares()){
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int priceApartment = this.squares * this.princePerSquare;
        int priceCompared = compared.getSquares() * compared.getPrice();
        
        return Math.abs(priceApartment - priceCompared);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int priceApartment = this.squares * this.princePerSquare;
        int priceCompared = compared.getSquares() * compared.getPrice();
    
        if(priceApartment > priceCompared){
            return true;
        }
        
        return false;
    }
    
    public int getSquares(){
        return this.squares;
    }
    
    public int getPrice(){
        return this.princePerSquare;
    }

}
