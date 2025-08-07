package patika_week_5;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            try{
                System.out.println("Lütfen bir gün giriniz (veya 'HAFTA' yazarak tüm haftayı görebilir, 'Q' ile çıkabilirsiniz):\n");
                String input = scanner.nextLine().toUpperCase();

                if(input.equals("Q")){
                    System.out.println("Sistemden Çıkış Yapılıyor!!");
                    return;
                } else if (input.equals("HAFTA")) {
                    for(Day day: Day.values()){
                        System.out.println(day + ": " + day.getWorkingHours());

                    }
                }else {
                    Day day = Day.valueOf(input);
                    System.out.println(day.getWorkingHours());
                }

            }catch (IllegalArgumentException e){
                System.out.println("Hata!!" + e.getMessage());
            }

        }






    }

}
