import java.util.Scanner;

/**
 * @author com.zzy
 * @date 2021/10/15-17:02
 */
public class abc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        for (int i=s1.length-1;i>=0;i--) {
            System.out.print(s1[i]+" ");
            System.out.print(s1[i]+" hotkey");

        }
    }
}
