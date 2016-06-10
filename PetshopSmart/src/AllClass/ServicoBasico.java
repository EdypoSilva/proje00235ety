package AllClass;

import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Nome: " + this.s_NomeS + "\nInformações: " + this.s_InforS + "\nValor: " + this.s_ValorS + "\nCodigo: " + this.s_CodigoS);
    }

    public String getNome() {
        return s_NomeS;
    }

    public String getInforP() {
        return s_InforS;
    }

    public double getValorP() {
        return s_ValorS;
    }

    public int CodigoP() {
        return s_CodigoS;
    }

    public void setCodigo(int codigoP) {
        this.s_CodigoS = codigoP;
    }

}
