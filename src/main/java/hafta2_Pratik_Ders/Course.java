package hafta2_Pratik_Ders;

public class Course {

    private String name;
    private String code;
    private Integer hourseOffWeek;
    private Teacher teacher;
    private Integer note;

    public Course(String name, String code, Integer hourseOffWeek) {
        this.name = name;
        this.code = code;
        this.hourseOffWeek = hourseOffWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getHourseOffWeek() {
        return hourseOffWeek;
    }

    public void setHourseOffWeek(Integer hourseOffWeek) {
        this.hourseOffWeek = hourseOffWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hourseOffWeek=" + hourseOffWeek +
                ", teacher=" + (teacher != null ? teacher.getName() + " " + teacher.getSurname() : "null") +
                '}';
    }
}
