package patika_week_5;

public class StudentRecordTest {

    public static void main(String[] args) {
        Student student1 = new Student("Ali","Ak",001);
        Student student2 = new Student("Veli","Kara", 002);
        Student student3 = new Student("Ayşe","Güçlü",003);
        Student student4 = new Student("Veli","Kara", 002);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);


        //hashCode veequals testi

        System.out.println("student2 equals student4? " + student2.equals(student4));
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
        System.out.println("student4 hashCode: " + student4.hashCode());



    }

}
