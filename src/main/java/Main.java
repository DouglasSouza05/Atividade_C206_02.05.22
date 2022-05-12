import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> ListaDeNomes = new ArrayList<>();
        List<Bolo> ListaDeBolos = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o nome do Comprador: " + i);
            ListaDeNomes.add(sc.next());
        }
        System.out.println();
        System.out.println("Os nomes dos seis Compradores foram registrados com sucesso!");

        Bolo bm1 = new BoloDeMorango(ListaDeNomes.get(0));
        Bolo bm2 = new BoloDeMorango(ListaDeNomes.get(1));

        Bolo ba1 = new BoloDeAbacaxi(ListaDeNomes.get(2));
        Bolo ba2 = new BoloDeAbacaxi(ListaDeNomes.get(3));

        Bolo bc1 = new BoloDeChocolate(ListaDeNomes.get(4));
        Bolo bc2 = new BoloDeChocolate(ListaDeNomes.get(5));

        ListaDeBolos.add(bm1);
        ListaDeBolos.add(bm2);
        ListaDeBolos.add(ba1);
        ListaDeBolos.add(ba2);
        ListaDeBolos.add(bc1);
        ListaDeBolos.add(bc2);

        for (Bolo bolo: ListaDeBolos) {
            if (bolo instanceof BoloDeMorango) {
                bolo.preco = new Random().nextDouble()*100;
            }
            else if (bolo instanceof BoloDeAbacaxi) {
                bolo.preco = new Random().nextDouble()*100;
            }
            else bolo.preco = new Random().nextDouble()*100;
        }

        //Antes da ordenação
        System.out.println();
        System.out.println("Lista Desordenada: ");
        System.out.println();

        for (Bolo bolo: ListaDeBolos) {
            System.out.println("Nome do Comprador do Produto " + bolo + ": " + bolo.nomeDoComprador);
            System.out.println("Preço Pago: " + bolo.preco);
        }

        Collections.sort(ListaDeBolos);
        Collections.reverse(ListaDeBolos);

        //Após a ordenaçao
        System.out.println();
        System.out.println("Lista Ordenada de forma Decrescente: ");
        System.out.println();

        for (Bolo bolo: ListaDeBolos) {
            System.out.println("Nome do Comprador do Produto " + bolo + ": " + bolo.nomeDoComprador);
            System.out.println("Preço Pago: " + bolo.preco);
        }
    }
}
