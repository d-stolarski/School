public class School {
    public static void main(String[] args) {

        Student student = new Student("Paweł","Nowak", 234563, "Warsaw");
        Teacher teacher = new Teacher("Jan","Kowalski",6500);
        Person teacher1 = new Teacher("Wojciech","Potocki",4500);

        student.showInfo();
        teacher.showInfo();
        teacher1.showInfo();
    }
}
