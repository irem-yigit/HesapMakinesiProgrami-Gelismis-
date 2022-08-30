import java.util.Scanner;

public class miniproje17 {
    public static int çıkarma(int a, int b){
        return (a-b);
    }
    public static double bolme(int a, int b){
        return (a/b);
    }
    public static int toplama(int a , int b){
        return (a+b);
    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }
    public static int carpma(int a, int b){
        return (a*b);
    }
    public static int carpma(int a, int b, int c){
        return (a*b*c);
    }
    public static void main(String[] args){
        //method overloading kullanarak gelişmiş hesap makinesi programı
        Scanner scan = new Scanner(System.in);

        String islemler = "1. Toplama İşlemi\n"
                         +"2. Çıkarma İşlemi\n"
                         +"3. Çarpma İşlemi\n"
                         +"4. Bölme İşlemi\n"
                         +"Çıkış için q'ya basın\n";
        System.out.print("*************************\n");
        System.out.print(islemler);
        System.out.print("*************************\n");

        while (true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scan.nextLine();
            if (islem.equals("q")){
                System.out.print("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.print("Kaç değer toplayacaksınız? (2 veya 3): ");
                int kacsayı=scan.nextInt();

                if (kacsayı == 2){
                    System.out.print("Birinci sayı: ");
                    int a = scan.nextInt();
                    System.out.print("İkinci sayı: ");
                    int b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Sayıların toplamı: " + toplama(a,b));
                }
                else if (kacsayı == 3){
                    System.out.print("Birinci sayı: ");
                    int a = scan.nextInt();
                    System.out.print("İkinci sayı: ");
                    int b = scan.nextInt();
                    System.out.print("Üçüncü sayı: ");
                    int c =scan.nextInt();
                    scan.nextLine();
                    System.out.println("Sayıların toplamı: " + toplama(a,b,c));
                }
                else{
                    System.out.println("Geçersiz bir işlem girdiniz...");
                }
            }
            else if(islem.equals("2")){
                System.out.print("Birinci sayı: ");
                int a = scan.nextInt();
                System.out.print("İkinci sayı: ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println("Sayıların farkı: " + çıkarma(a,b));
            }
            else if (islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız? (2 veya 3): ");
                int kacsayı=scan.nextInt();

                if (kacsayı == 2){
                    System.out.print("Birinci sayı: ");
                    int a = scan.nextInt();
                    System.out.print("İkinci sayı: ");
                    int b = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Sayıların çarpımı: " + carpma(a,b));
                }
                else if (kacsayı == 3){
                    System.out.print("Birinci sayı: ");
                    int a = scan.nextInt();
                    System.out.print("İkinci sayı: ");
                    int b = scan.nextInt();
                    System.out.print("Üçüncü sayı: ");
                    int c =scan.nextInt();
                    scan.nextLine();
                    System.out.println("Sayıların çarpımı: " + carpma(a,b,c));
                }
                else{
                    System.out.print("Geçersiz bir işlem girdiniz...");
                }
            }
            else if (islem.equals("4")){
                System.out.print("Birinci sayı: ");
                int a = scan.nextInt();
                System.out.print("İkinci sayı: ");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println("Sayıların bölümü: " + bolme(a,b));
            }
        }
    }
}
