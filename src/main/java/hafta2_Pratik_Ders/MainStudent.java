package hafta2_Pratik_Ders;

import java.time.LocalDate;

public class MainStudent {

    public static void main(String[] args) {

        // Öğretmenler oluşturuluyor
        Teacher[] teachers = new Teacher[5];
        teachers[0] = new Teacher("Gökalp", "KURT", "5616616161");
        teachers[1] = new Teacher("Sude", "KILIÇ", "5616616107");
        teachers[2] = new Teacher("Göksu", "KURT", "5616610761");
        teachers[3] = new Teacher("Göksud", "KURTU", "5616610007");
        teachers[4] = new Teacher("Gökasu", "UKURT", "5616613461");

        // Dersler oluşturuluyor
        Course[] courses = new Course[5];
        courses[0] = new Course("Matematik", "Mat061", 8);
        courses[1] = new Course("Fizik", "FZK061", 7);
        courses[2] = new Course("Kimya", "kmy061", 7);
        courses[3] = new Course("Biyoloji", "BYJ061", 8);
        courses[4] = new Course("Beden", "BDN061", 5);

        // Öğretmen–ders eşlemesi yapılıyor
        for (int i = 0; i < courses.length; i++) {
            courses[i].setTeacher(teachers[i]);
            teachers[i].setCourse(courses[i]);
        }

        // Öğrenciler oluşturuluyor
        Student student1 = new Student("Gökalp", "KURT", LocalDate.of(2003, 7, 7), 6107);
        Student student2 = new Student("Sude", "KILIÇ", LocalDate.of(2000, 11, 3), 712);
        Student student3 = new Student("Müzeyyen", "KURT", LocalDate.of(1974, 12, 3), 3461);
        Student student4 = new Student("Yusuf", "KURT", LocalDate.of(1970, 1, 12), 61);

        // Tüm dersler öğrencilere atanıyor
        student1.setCourses(courses);
        student2.setCourses(courses);
        student3.setCourses(courses);
        student4.setCourses(courses);

        // Öğretmen bilgileri yazdırılıyor
        System.out.println("\n--- Öğretmenler ---");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        // Ders bilgileri yazdırılıyor
        System.out.println("\n--- Dersler ---");
        for (Course course : courses) {
            System.out.println(course);
        }

        // Öğrenci bilgileri yazdırılıyor
        System.out.println("\n--- Öğrenciler ---");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}