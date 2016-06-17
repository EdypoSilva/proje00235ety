package AllClass;


/**
 *
 * @author Felly
 */
public class ServicoBasico {

    String s_NomeS;
    String s_InforS;
    double s_ValorS;
    int s_CodigoS;

    public ServicoBasico(String nomeS, String inforS, String valorS, String codigoS) {
        this.s_NomeS = nomeS;
        this.s_InforS = inforS;
        this.s_ValorS = Double.parseDouble(valorS);
        this.s_CodigoS = Integer.parseInt(codigoS);
    }

    public String getS_NomeS() {
        return s_NomeS;
    }

    public void setS_NomeS(String s_NomeS) {
        this.s_NomeS = s_NomeS;
    }

    public String getS_InforS() {
        return s_InforS;
    }

    public void setS_InforS(String s_InforS) {
        this.s_InforS = s_InforS;
    }

    public double getS_ValorS() {
        return s_ValorS;
    }

    public void setS_ValorS(double s_ValorS) {
        this.s_ValorS = s_ValorS;
    }

    public int getS_CodigoS() {
        return s_CodigoS;
    }

    public void setS_CodigoS(int s_CodigoS) {
        this.s_CodigoS = s_CodigoS;
    }

   
}
