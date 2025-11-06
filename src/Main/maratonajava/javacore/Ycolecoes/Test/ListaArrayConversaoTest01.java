package Main.maratonajava.javacore.Ycolecoes.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] ListToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(ListToArray));
        System.out.println("--------------)");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        System.out.println(arrayToList);
        System.out.println("-----------------\ndentro do arrayList");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<String> list = Arrays.asList("1", "2");
    }
}
