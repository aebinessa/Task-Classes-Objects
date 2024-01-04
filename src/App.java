
/*import University.Student;*/
import University.course;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Student firstStudent = new Student("Alice", "Computer Science", 20, 3.5);
         * System.out.println(firstStudent);
         * 
         * Student AbdullahBinEssa = new Student("Abdullah Bin Essa",
         * "computer engineering", 23, 3.185);
         * System.out.println(AbdullahBinEssa);
         */

        course Compe271 = new course("Computer Organization and Architecture", "Ken Arnold", 80);
        System.out.println(Compe271);

    }
}
