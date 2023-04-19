public class CartaoDebito extends Pagamento{
    public String numCartao, titularCartao;

    public CartaoDebito(String numCartao, String titularCartao) {
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public CartaoDebito() {
        super();
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal(String cupomFiscal){
        System.out.println(numCartao + titularCartao);
        return cupomFiscal;
    }

    public void imprimirCupomFiscal() {
    }
}
