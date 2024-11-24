package count;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter some text with few line and exit with word stop");
        Scanner scanner = new Scanner(System.in);
        Analysis obj = new Analysis();
        String text1 =scanner.nextLine();
        while (!text1.equals("stop")){
            obj.rowsanalyser(text1);
            text1 = scanner.nextLine();
        }
        System.out.println(obj.rowscounter());
        System.out.println(obj.charactercounter());
    }
}
