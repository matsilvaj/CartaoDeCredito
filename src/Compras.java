public class Compra {
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorProduto() {
        return valor;
    }

    public void setValorProduto(double valorProduto) {
        this.valor = valorProduto;
    }
}
