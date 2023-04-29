package chapters.caseStudies.desiningTheCourseClass;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        Course course1 = new Course("Database Systems");

        course.addStudent("Burak Tetik");
        course.addStudent("Burcu Tetik");
        course.addStudent("Beyzanur Tetik");

        course1.addStudent("Kamil Tetik");
        course1.addStudent("Ayfer Tetik");

        System.out.println("Number of students in course : " + course.getNumberOfStudents());

        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println();

        System.out.println("Number of students in course1 : " + course1.getNumberOfStudents());
    }
}
