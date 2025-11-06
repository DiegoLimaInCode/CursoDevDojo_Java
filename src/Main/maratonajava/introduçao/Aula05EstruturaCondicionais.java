package Main.maratonajava.introduçao;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 25;
        String categoria;
        if(idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade <=18) {
            categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
