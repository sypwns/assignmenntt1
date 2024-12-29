public class Teacher extends Person {
    private String subject;
    public int yearOfExperience;
    public int salary;
    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearOfExperience = yearOfExperience;
        this.salary = salary;
    }

    public void giveRaise (double percentage){
        if(percentage > 0){
            salary += salary * percentage/100;
        }
        else{
            System.out.println("Invalid raise");
        }
    }

    public String toString() {
        return super.toString() + " " +"I teach" + " "+ subject + "." + " Years of Experience: "+ yearOfExperience + ", " + "Salary: "+ salary + "$\n";
    }
}