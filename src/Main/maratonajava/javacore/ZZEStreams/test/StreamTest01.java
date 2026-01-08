package Main.maratonajava.javacore.ZZEStreams.test;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4

import Main.maratonajava.javacore.ZZEStreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);


    }
}
