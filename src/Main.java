public class Main {
    public static void main(String[] args) {
        Person person = new Person("Karima","Shurenova",17, true);
        System.out.println(person.toString());

        Student s1 = new Student("Jisoo", "Kim", 19,true);
        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(72);
        s1.addGrade(47);

        Student s2 = new Student("Sami", "Shuren", 18, false);
        s2.addGrade(100);
        s2.addGrade(98);
        s2.addGrade(92);
        s2.addGrade(95);

        Student s3 = new Student("Fatima", "Eshmurat", 20,true);
        s3.addGrade(66);
        s3.addGrade(96);
        s3.addGrade(56);
        s3.addGrade(86);

        Student s4 = new Student("Asima", "Shurenova", 18,true);
        s4.addGrade(89);
        s4.addGrade(69);
        s4.addGrade(98);
        s4.addGrade(55);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        Teacher t1 = new Teacher("Aktoty", "Bisengali", 53, true, "Math", 12, 1500000);
        Teacher t2 = new Teacher("Dilyara", "Sarsengali", 25, true, "Geography", 4, 520000);
        Teacher t3 = new Teacher("Iroha", "Berik", 32, true, "History", 11, 1320000);
        Teacher t4 = new Teacher("Serik", "Parasatuly", 28, false, "English", 6, 790000);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        School sch = new School();
        sch.addMember(s1.getSurname() + " " + s1.getName()+ " "  + "GPA: "+ s1.GpaDigit());
        sch.addMember(s2.getSurname() + " " + s2.getName()+ " "  + "GPA: "+ s2.GpaDigit());
        sch.addMember(s3.getSurname() + " " + s3.getName()+ " "  + "GPA: "+ s3.GpaDigit());
        sch.addMember(s4.getSurname() + " " + s4.getName()+ " "  + "GPA: "+ s4.GpaDigit());
        sch.addMember(t1.getSurname() + " " + t1.getName());
        sch.addMember(t2.getSurname() + " " + t2.getName());
        sch.addMember(t3.getSurname() + " " + t3.getName());
        sch.addMember(t4.getSurname() + " " + t4.getName());

        System.out.println(sch);
        System.out.println("Raised salaries:");
        if (t1.yearOfExperience > 10){
            t1.giveRaise(15);
            System.out.println("New salary of "+t1.getSurname() + " "+ t1.getName() + ": "+ t1.salary + "$");
        }
        if (t2.yearOfExperience > 10){
            t2.giveRaise(15);
            System.out.println("New salary of "+t2.getSurname() + " "+ t2.getName() + ": "+ t2.salary + "$");
        }
        if (t3.yearOfExperience > 10){
            t3.giveRaise(15);
            System.out.println("New salary of "+t3.getSurname() + " "+ t3.getName() + ": "+ t3.salary + "$");
        }
        if (t4.yearOfExperience > 10){
            t4.giveRaise(15);
            System.out.println("New salary of "+t4.getSurname() + " "+ t4.getName() + ": "+ t4.salary + "$");
        }
    }
}