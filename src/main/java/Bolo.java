public class Bolo implements Comparable<Bolo>{

    protected String nomeDoComprador;
    protected double preco;

    public Bolo(String nomeDoComprador) {
        this.nomeDoComprador = nomeDoComprador;
    }

    @Override
    public int compareTo(Bolo bol) {
        if (this.preco < bol.getPreco()) {
            return -1;
        }
        else if (this.preco > bol.getPreco()) {
            return 1;
        }
        else return 0;
    }

    public double getPreco() {
        return preco;
    }
}
