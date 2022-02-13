import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        //int number = (int)(Math.random() *100);

        Scanner input = new Scanner(System.in);
        int right =0;
        int selected;
        int [] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while (right<5){
            System.out.println("Tahmin ");
            selected = input.nextInt();

            if (selected<0 || selected >99){
                System.out.println("0 ve 100 arasinda bir sayi Giriniz");
                if (!isWrong){
                    isWrong = true;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("dogru tahmin"+number);
                isWin = true;
                break;

            }else {

                System.out.println("Hatali Sayi Girdiniz");
                if (selected >number){
                    System.out.println(selected +"sayi gizliden buyuk");
                }else {
                    System.out.println(selected+"sayi gizliden kucuk");
                }
                wrong[right++]= selected;
                //right++;
                System.out.println("Kalan Hak"+(5-right));
            }

        }

        if (!isWin){
            System.out.println("Kaybettiniz");
            System.out.println("Tahminleriniz"+ Arrays.toString(wrong));
        }

    }
}
