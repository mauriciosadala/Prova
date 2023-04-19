public class CartaoCredito extends Pagamento{

    public String numCartao, bandeiraCartao, titularCartao;

    public CartaoCredito(String numCartao, String bandeiraCartao, String titularCartao) {
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    public CartaoCredito() {
        super();
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
     public String imprimirCupomFiscal(String cupumfiscal){
        System.out.println(numCartao + bandeiraCartao + titularCartao);
         return cupumfiscal;
     }

    public void imprimirCupomFiscal() {
    }
}
