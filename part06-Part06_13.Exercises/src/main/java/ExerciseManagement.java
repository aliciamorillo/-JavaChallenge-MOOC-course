
import java.util.ArrayList;


public class ExerciseManagement {

        private ArrayList<ExerciseManagementTest> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (ExerciseManagementTest exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new ExerciseManagementTest(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (ExerciseManagementTest ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (ExerciseManagementTest ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
