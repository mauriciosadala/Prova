public class Pix extends Pagamento{
    public Boolean comprovanteTransacaoPix;

    public Pix(Boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public Pix() {
        super();
    }

    public Boolean getComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(Boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCupomFiscal(String cupomFiscal){
        System.out.println(comprovanteTransacaoPix);
                return cupomFiscal;
    }

    public void imprimirCupomFiscal() {
    }
}
