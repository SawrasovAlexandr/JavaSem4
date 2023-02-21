import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<String> arrayLst = new LinkedList<>();
            while (true) {
                String scanResult = scanner.nextLine();
                if (scanResult.equals("revert")) {
                    if (arrayLst.size() >= 1)
                        arrayLst.removeFirst();
                } else if (scanResult.equals("print")) {

                    System.out.println(arrayLst);
                } else {
                    arrayLst.addFirst(scanResult);
                }
            }
        }
    }
}
