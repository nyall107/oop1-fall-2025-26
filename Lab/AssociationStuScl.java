
class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public void showContact() {
        System.out.println("   Phone : " + phone);
        System.out.println("   Email : " + email);
    }
}

class Student {
    private String name;
    private int id;
    private Contact contact;   

    public Student(String name, int id, Contact contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    public void showStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID  : " + id);
        System.out.println("Contact Info:");
        contact.showContact();
        System.out.println("-----------------------------------");
    }
}

class School {
    private String schoolName;
    private Student[] students;   
    private int count;

    public School(String schoolName, int size) {
        this.schoolName = schoolName;
        this.students = new Student[size];   
        this.count = 0;
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Array full. Cannot add more students.");
        }
    }

    public void showSchool() {
        System.out.println("===== School: " + schoolName + " =====");
        for (int i = 0; i < count; i++) {
            students[i].showStudent();
        }
    }
}

public class AssociationStuScl {
    public static void main(String[] args) {

        School school = new School("Green View School", 3);

        Contact c1 = new Contact("01711-222222", "rahim@mail.com");
        Contact c2 = new Contact("01833-444444", "karim@mail.com");
        Contact c3 = new Contact("01955-666666", "jannat@mail.com");

        Student s1 = new Student("Rahim", 101, c1);
        Student s2 = new Student("Karim", 102, c2);
        Student s3 = new Student("Jannat", 103, c3);

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        school.showSchool();
    }
}
