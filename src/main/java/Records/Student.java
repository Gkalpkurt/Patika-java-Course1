package Records;

public record Student(String firstName, String lastName, String studentId) {
    // Record'larda hashCode, equals ve toString otomatik olarak oluşturulur.
    // Ancak istersek ek metotlar yazabiliriz.

    // Tam adı döndüren yardımcı metot
    public String fullName() {
        return firstName + " " + lastName;
    }
}
