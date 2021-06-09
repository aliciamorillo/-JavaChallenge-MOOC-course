
import java.util.ArrayList;

public class GradeRegister {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;
    
    public GradeRegister(){
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPoints(int points){
        this.points.add(points);
        
        if (points >= 50) {
            this.passingPoints.add(points);
        }    
        
        this.grades.add(pointsToGrade(points));
    }
    
    public double averagePoints(){
        int sum = 0;
        
        if(this.points.isEmpty()){
            return -1;
        } else {
            for(Integer point: this.points){
                sum += point;
            }
        }
    
        return 1.0 * sum/this.points.size();
    }
    
    public double averagePassingPoints(){
        double sum = 0.0;
        
        if (passingPoints.isEmpty()) {
            return 0.00;
        } else {
            for (Integer passingPoint : passingPoints) {
                sum += passingPoint;
            }
        }
        
        return sum/passingPoints.size();
    }
    
    public static int pointsToGrade(int points){
        int grade = 0;
        
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }
    
    public int totalGradesFromPoints(int grade){
        int total = 0;
        
        for(int received: this.grades){
            if(received == grade){
                total++;
            }
        }
        return total;
    }
    
    public double passPercentaje(){
        double passingRatio = (double)passingPoints.size() / points.size();
        
        if(points.size() == 0){
            return -1;
        } else {
            return 100.00 * passingRatio;
        }
    }
    
}
