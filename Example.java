import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String[] subjects = { "Mathematics", "Science", "English", "Sinhala", "History", "Buddhism", "Business Studies",
                "Computer Studies" };

        subjects = addSubject(subjects, "Music");

        System.out.println("Updated Subject List: " + Arrays.toString(subjects));
    }

    public static String[] addSubject(String[] subjects, String newSubject) {
        String[] updatedSubjects = new String[subjects.length + 1];
        int index = 7;

        for (int i = 0; i < index; i++) {
            updatedSubjects[i] = subjects[i];
        }

        updatedSubjects[index] = newSubject;

        for (int i = index + 1; i < updatedSubjects.length; i++) {
            updatedSubjects[i] = subjects[i - 1];
        }

        return updatedSubjects;
    }
}
