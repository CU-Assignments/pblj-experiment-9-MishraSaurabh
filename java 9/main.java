import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        Student s1 = new Student("Saurabh", 21);
        dao.createStudent(s1);

        // Read
        Student fetched = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + fetched.getName() + ", Age: " + fetched.getAge());

        // Update
        fetched.setAge(22);
        dao.updateStudent(fetched);

        // Read All
        List<Student> all = dao.getAllStudents();
        System.out.println("All Students:");
        for (Student s : all) {
            System.out.println(s.getId() + ": " + s.getName() + " - " + s.getAge());
        }

        // Delete
        dao.deleteStudent(fetched.getId());
        System.out.println("Student deleted.");
    }
}

    

