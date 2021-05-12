
public class Fitbyte {
    
    private int age;
    private int restingHeart;
    
    public Fitbyte(int age, int restingHeart){
        this.age = age;
        this.restingHeart = restingHeart;
    }

    double targetHeartRate(double percentage) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHeart) * (percentage) + this.restingHeart;
    }
    
    
    
}
