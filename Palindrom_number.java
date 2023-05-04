package java101;

public class Palindrom_number {
    static boolean İsPalindrom(int number) {
        int temp = number, reversenumber = 0, lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }
        if (reversenumber == number){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(İsPalindrom(243));
    }
}
