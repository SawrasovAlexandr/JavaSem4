import java.util.ArrayList;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

        ArrayList <Integer> arrayLst = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            arrayLst.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        LinkedList <Integer> linkedLst = new LinkedList<>();
        for (int i = 0; i < 200_000; i++) {
            linkedLst.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Time LinkedList: " + (end - start));
    }
}