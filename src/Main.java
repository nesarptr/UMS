import contact.Address;
import contact.Contact;
import person.Guardian;
import person.Staff;
import person.Student;
import person.Teacher;
import university.Department;
import university.Exam;
import university.Subject;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        Guardian guardian1 = new Guardian("GR1",  "Mr.Khaled", "Engineer", 7500);


        Student student1 = new Student("UN13", "Rishan", "ST1", guardian1);
        Student student2 = new Student("UN14", "Kishan", "ST2", guardian1);
        Student student3 = new Student("UN15", "Lishan", "ST3", guardian1);
        Student student4 = new Student("UN16", "Nishan", "ST4", guardian1);
        Student student5 = new Student("UN17", "Mishan", "ST5", guardian1);
        Student student6 = new Student("UN18", "Jishan", "ST6", guardian1);
        Student student7 = new Student("UN19", "Uishan", "ST7", guardian1);
        Student student8 = new Student("UN20", "Tishan", "ST8", guardian1);


        Teacher teacher1 = new Teacher("UN2", "Pafan", "EMP1", 4500);
        Teacher teacher2 = new Teacher("UN4", "Rafan", "EMP3", 4600);
        Teacher teacher3 = new Teacher("UN5", "Jafan", "EMP4", 5500);
        Teacher teacher4 = new Teacher("UN6", "Mafan", "EMP5", 3500);
        Teacher teacher5 = new Teacher("UN7", "Nafan", "EMP6", 9500);
        Teacher teacher6 = new Teacher("UN8", "Lafan", "EMP7", 8500);


        Staff staff = new Staff("UN3", "Nishat", "EMP2", 5000, "Computer Operator");

        Subject sub1 = new Subject("SB1", "Physics", 3);
        Subject sub2 = new Subject("SB2", "Math", 4);
        Subject sub3 = new Subject("SB3", "Geography", 3);
        Subject sub4 = new Subject("SB4", "Calculus", 3);
        Subject sub5 = new Subject("SB5", "Chemistry", 3);

        Exam ex2 = new Exam("EX2", "Mid-Term", 40, sub1);
        Exam ex3 = new Exam("EX3", "Mid-Term", 40, sub2);
        Exam ex1 = new Exam("EX1", "Mid-Term", 40, sub3);
        Exam ex4 = new Exam("EX4", "Mid-Term", 40, sub4);
        Exam ex5 = new Exam("EX5", "Mid-Term", 40, sub5);
        Exam ex6 = new Exam("EX6", "Term", 40, sub1);
        Exam ex7 = new Exam("EX7", "Term", 40, sub2);
        Exam ex8 = new Exam("EX8", "Term", 40, sub3);
        Exam ex9 = new Exam("EX9", "Term", 40, sub4);

        Address addr1 = new Address("AD1", "4-A", "Dhaka", "Dhaka Region", "Bangladesh", "1216");
        Address addr2 = new Address("AD2", "14-C", "Bagerhat", "Khulna Region", "Bangladesh", "1210");
        Address addr3 = new Address("AD3", "16-A", "Gazipur", "Dhaka Region", "Bangladesh", "1320");

        Contact cont1 = new Contact("CN1", "rish@test.com", "+8801724563571",  addr1);
        Contact cont2 = new Contact("CN2", "khal@test.com", "+8801748963571",  addr1);
        Contact cont3 = new Contact("CN3", "rafa@test.com", "+8801188963571",  addr2);
        Contact cont4 = new Contact("CN3", "nish@test.com", "+8801741363571",  addr3);

        Department dept1 = new Department("DPT1", "Computer Science", teacher5);

        guardian1.setBloodGroup("B+");
        guardian1.setContact(cont2);

        guardian1.setChildren(student1);
        guardian1.setChildren(student2);
        guardian1.setChildren(student3);
        guardian1.setChildren(student4);
        guardian1.setChildren(student5);
        guardian1.setChildren(student6);
        guardian1.setChildren(student7);
        guardian1.setChildren(student8);

        student1.setBloodGroup("B+");
        student2.setBloodGroup("O+");
        student3.setBloodGroup("AB+");
        student4.setBloodGroup("B-");
        student5.setBloodGroup("B-");
        student6.setBloodGroup("O+");
        student7.setBloodGroup("AB+");
        student8.setBloodGroup("B+");

        student1.setDepartment(dept1);
        student2.setDepartment(dept1);
        student3.setDepartment(dept1);
        student4.setDepartment(dept1);
        student5.setDepartment(dept1);
        student6.setDepartment(dept1);
        student7.setDepartment(dept1);
        student8.setDepartment(dept1);


        student1.setContact(cont1);
        student2.setContact(cont1);
        student3.setContact(cont1);
        student4.setContact(cont1);
        student5.setContact(cont1);
        student6.setContact(cont1);
        student7.setContact(cont1);
        student8.setContact(cont1);


        student1.setDepartment(dept1);

        student1.setExams(ex1);
        student2.setExams(ex7);
        student3.setExams(ex6);
        student4.setExams(ex8);
        student5.setExams(ex9);
        student6.setExams(ex1);
        student7.setExams(ex2);
        student8.setExams(ex3);
        student4.setExams(ex4);
        student5.setExams(ex5);

        student1.setFee(5000);
        student2.setFee(5000);
        student3.setFee(5000);
        student4.setFee(5000);
        student5.setFee(5000);
        student6.setFee(5000);
        student7.setFee(5000);
        student8.setFee(5000);

        staff.setBloodGroup("AB-");
        staff.setContact(cont3);
        staff.setDepartment(dept1);

        dept1.setStudents(student1);
        dept1.setStudents(student2);
        dept1.setStudents(student3);
        dept1.setStudents(student4);
        dept1.setStudents(student5);
        dept1.setStudents(student6);
        dept1.setStudents(student7);
        dept1.setStudents(student8);

        dept1.setSubjects(sub1);
        dept1.setSubjects(sub2);
        dept1.setSubjects(sub3);
        dept1.setSubjects(sub4);
        dept1.setSubjects(sub5);

        teacher1.setContact(cont4);
        teacher5.setContact(cont4);

        dept1.setTeachers(teacher1);
        dept1.setTeachers(teacher2);
        dept1.setTeachers(teacher3);
        dept1.setTeachers(teacher4);
        dept1.setTeachers(teacher5);

        teacher1.setDepartment(dept1);
        teacher2.setDepartment(dept1);
        teacher3.setDepartment(dept1);
        teacher4.setDepartment(dept1);
        teacher5.setDepartment(dept1);

        System.out.print(dept1);
        System.out.println("\n\n");
        System.out.print(dept1.getTeachers());
        System.out.println("\n\n");
        System.out.print(dept1.getStudents());
        System.out.println("\n\n");
        System.out.print(dept1.getSubjects());
        System.out.println("\n\n");
        System.out.print(student1.getExams());
        System.out.println("\n\n");
        System.out.print(student1.getGuardian());
        System.out.println("\n\n");
        System.out.print(student1.getContact());






    }
}
