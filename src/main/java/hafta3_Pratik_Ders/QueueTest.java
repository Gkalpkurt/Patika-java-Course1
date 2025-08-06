package hafta3_Pratik_Ders;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        //İlk Gelen İlk Çıkar

        Queue<String> breadQueue = new PriorityQueue<>();

        breadQueue.add("muhammet");
        breadQueue.add("emin");
        breadQueue.add("gökalp");
        breadQueue.add("KURT");

        System.out.println(breadQueue);

        breadQueue.remove();

        System.out.println(breadQueue);


    }
}
