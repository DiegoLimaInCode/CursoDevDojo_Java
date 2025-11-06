package Main.maratonajava.javacore.Qstring.Test;

public class StringPerformaceTest01 {
    static void main() {
//        long inicio = System.currentTimeMillis();
//        concaString(100_000);
//        long fim = System.currentTimeMillis();
//        System.out.println("tempo gasto para string " + (fim - inicio) + "ms");

         long inicio = System.currentTimeMillis();
        concaStringBuilder(100_000);
          long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para string " + (fim - inicio) + "ms");
    }

    private static void concaString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concaStringBuilder(int tamanho) {
        StringBuilder sb= new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concaStringBuffer(int tamanho) {
        StringBuffer sb= new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
