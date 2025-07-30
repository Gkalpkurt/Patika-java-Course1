package hafta2_Pratik_Ders;

import java.time.LocalDate;

public class Student {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private Integer studentNo;
    private Course[] courses = new Course[5];

    public Student(String name, String surname, LocalDate birthDate, Integer studentNo) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", studentNo=" + studentNo +
                '}';
    }
}
