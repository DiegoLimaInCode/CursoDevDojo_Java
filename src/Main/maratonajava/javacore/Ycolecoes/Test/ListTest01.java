package Main.maratonajava.javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main() {
        List<String> nomes = new ArrayList();
        nomes.add("William");
        nomes.add("Devdojo Academy");

        for (String nome:nomes){
            System.out.println(nome);
        }
        nomes.add("Suane");
        System.out.println("---------------");
        int size =nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros =new ArrayList<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        System.out.println(numeros);
    }
    
}
