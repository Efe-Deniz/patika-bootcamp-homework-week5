package patika_week_5;

public class InnerClassTest {
    public static void main(String[] args) {
        //çalışanı oluşturalım

        Employee user1 = new Employee("Ahmet","Baraner","1990","Avukat");
        Employee user2 =new Employee("Selda", "Bağcan","1998","Müdür");
        Employee user3 = new Employee("Kıvanç","Tatlıtuğ","2000","Manken");

        //çalışanlara ait alt iletişim bilgilerini oluşturuyoruz

        Employee.ContactInfo contactInfo= user1.new ContactInfo("ahmet-baraner@gmail.com", "0512 345 67 89");
        Employee.ContactInfo contactInfo1= user2.new ContactInfo("selda.bağcan@gmail.com","0312 123 65 98");
        Employee.ContactInfo contactInfo2= user3.new ContactInfo("kıvanc__tatlı@gmail.com", "0555 987 65 32");

        // Bilgileri yazdıralım
        user1.printEmployeeInfo();
        user2.printEmployeeInfo();
        user3.printEmployeeInfo();

        System.out.println();
        System.out.println("İletişi Bilgileri");

        contactInfo1.printContacInfo();
        contactInfo2.printContacInfo();
        contactInfo.printContacInfo();

    }
}
