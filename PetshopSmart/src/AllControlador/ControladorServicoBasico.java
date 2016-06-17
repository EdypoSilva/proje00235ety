/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllControlador;

import AllClass.Repositorio.RepositorioServicoBasico;
import AllClass.ServicoBasico;
import javax.swing.JOptionPane;

public class ControladorServicoBasico {

    private static boolean testVariaveis;
    private static String erros;

    public static String validarServico(ServicoBasico cadServico) {
        testVariaveis = true;
        erros = "Campo * Incorreto *\n";

        if (cadServico.getS_NomeS().equals("")) {
            testVariaveis = false;
            erros += "* Nome";
        }

        if (cadServico.getS_InforS().equals("")) {
            testVariaveis = false;
            erros += "* Informação";
        }

        if (cadServico.getS_ValorS() < 0) {
            testVariaveis = false;
            erros += "* Valor Incorreto";
        }

        if (cadServico.getS_CodigoS() < 0) {
            testVariaveis = false;
            erros += "* Código Incorreto";
        }

        if (testVariaveis) {
            erros = "1";
        }

        return erros;
    }

    public static String cadastrarSercico(ServicoBasico cadServico) {
        String testDados = validarServico(cadServico);
        if (testDados.equals("1")) {
            if (!RepositorioServicoBasico.getValidarServicoBasico(cadServico.getS_CodigoS())) {
                if (RepositorioServicoBasico.setCadServico(cadServico)) {
                    testDados = "1";
                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
                } else {
                    testDados = "Erro ao tentar cadastrar";
                }
            } else {
                testDados = "* Código Existente";
            }
        }

        return testDados;
    }

    public static String editarServico(ServicoBasico altServico) {
        String testDados = validarServico(altServico);
        if (testDados.equals("1")) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Alterar o Serviço?");
            if (resp == 0) {
                if (RepositorioServicoBasico.getValidarServicoBasico(altServico.getS_CodigoS())) {
                    if (RepositorioServicoBasico.setEditarServico(altServico)) {
                        JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!!");
                        testDados = "1";
                    } else {
                        testDados = "Erro, Não Alterado!!!";
                    }
                }
            }
        }

        return testDados;
    }

    public static String removerProduto(int idServicoBasico) {
        String testRemoverServico = "1";
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Alterar o Animal?");
        if (resp == 0) {
            if (RepositorioServicoBasico.setDeletarServicoBasico(idServicoBasico)) {
                testRemoverServico = "1";
                JOptionPane.showMessageDialog(null, "Removido com Sucesso!!!");
            } else {
                testRemoverServico = "Erro, Não Removido";
            }
        }
        return testRemoverServico;
    }

    public static ServicoBasico exibirServico(int idServicoBasico) {
        ServicoBasico exibirServico = null;
        if (RepositorioServicoBasico.getValidarServicoBasico(idServicoBasico)) {
            exibirServico = RepositorioServicoBasico.getExibirServico(idServicoBasico);
        }

        return exibirServico;
    }

    public static String validarServicoBasico(int idServicoBasico) {
        String testExisteCodServico = "Nao Existe";

        if (RepositorioServicoBasico.getValidarServicoBasico(idServicoBasico)) {
            testExisteCodServico = "1";
        }

        return testExisteCodServico;
    }

}
