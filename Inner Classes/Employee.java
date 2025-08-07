package patika_week_5;

public class Employee {


    private String firstName;
    private String lastName;
    private String birthDate;
    private String position;

    public Employee(String firstName, String lastName, String birthDate, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
    }

    public void printEmployeeInfo() {
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Doğum Tarihi: " + birthDate);
        System.out.println("Pozisyon: " + position);
    }


    class ContactInfo{
        private String phoneNumber;
        private String email;

        public ContactInfo(String email, String phoneNumber) {
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public void printContacInfo(){
            System.out.println("Email: " + email);
            System.out.println("Telefon Numarası: " +phoneNumber);
        }
    }
}
