package Main.maratonajava.javacore.ZZEStreams.test;

import Main.maratonajava.javacore.ZZEStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Full metal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4)
    ));

    static void main() {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList();

        System.out.println(titles);



    }
}
