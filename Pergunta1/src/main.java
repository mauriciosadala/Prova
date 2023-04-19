public class main {
    public static void main(String[] args) {
        CartaoCredito cc = new CartaoCredito();
        cc.titularCartao = "aaa";
        cc.bandeiraCartao = "aaaa;";
        cc.numCartao = "12";
        CartaoDebito cd = new CartaoDebito();
        cd.titularCartao = "ss";
        cd.numCartao = "123";
        Pix p = new Pix();
        p.comprovanteTransacaoPix = true;
        cc.imprimirCupomFiscal();
        cd.imprimirCupomFiscal();
        p.imprimirCupomFiscal();
    }
}
