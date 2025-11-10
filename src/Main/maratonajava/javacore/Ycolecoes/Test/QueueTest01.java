package Main.maratonajava.javacore.Ycolecoes.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main() {
        Queue<String> fila= new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
