package hafta2_Pratik_Ders;

public class Patient {

    private String identityNumber;
    private String name;
    private String surname;
    private int age;

    public Patient(String identityNumber) {
        setIdentityNumber(identityNumber);
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        if (identityNumber.length() != 11) {
            System.out.println("11 haneden farklı bir TC no giremezsiniz!");
        } else {
            this.identityNumber = identityNumber;
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
