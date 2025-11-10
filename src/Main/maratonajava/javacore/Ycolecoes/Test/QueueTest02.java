package Main.maratonajava.javacore.Ycolecoes.Test;

import Main.maratonajava.javacore.Ycolecoes.Domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    static void main() {

        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangaQueue.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangaQueue.add(new Manga(1L, "Berserk", 9.5, 5));
        mangaQueue.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangaQueue.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangaQueue.add(new Manga(2L, "Dragon ball Z", 2.99, 0));
        mangaQueue.add(new Manga(10L, "Aaragon", 2.99, 0));

        while (!mangaQueue.isEmpty()){
            System.out.println(mangaQueue.poll());
        }
    }
}
