public class Student extends Person{

    private int number;
    private String birthCity;

    public Student(String firstName, String lastName, int number, String birthCity){
        super(firstName, lastName);
        this.number = number;
        this.birthCity = birthCity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", numer studenta: " + getNumber());
    }
}
