
public class Timer {
    
    private ClockHand hundredths;
    private ClockHand seconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    
    public void advance(){
        this.hundredths.advance();
        
        if(this.hundredths.value() == 0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds + ":" + hundredths;
    }
}
