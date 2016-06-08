/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Animal;
import BancoDeDados.BancoPetshop;
import static BancoDeDados.BancoPetshop.BancoListAnimal;
import javax.swing.JOptionPane;

public class RepositorioAnimal {

    public static boolean vAnimal;
    public static Animal exibirAnimal;
    private static int contAnimal;

    public static boolean setCadastroAnimal(String nome, String idade, String cor, String raca, String sexo, String cpf) {
        boolean result = false;
        try {
            String codigo = Integer.toString(contAnimal);
            Animal animais = new Animal(nome, idade, cor, raca, sexo, cpf, codigo);
            BancoPetshop.BancoListAnimal.add(animais);
            result = true;
            contAnimal++;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!!!");
            result = false;
        }
        return result;
        //Cadastra Animal
    }

    public static boolean getExisteClienteAnimal(String cpf) {
        boolean result = false;
        Animal a = new Animal();
        for (int i = 0; i < BancoListAnimal.size(); i++) {
            a = BancoListAnimal.get(i);
            if (a.getCpf().equals(cpf)) {
                result = true;
            }
        }
        return result;
        //Verifica se existe alguma animal do cliente (Caso deseje remover um cliente)
    }

    public static boolean setAlterarAnimal(String alt_Nome, String alt_idade, String alt_Cor, String alt_Raca, String alt_Sexo, String cpf, String posi) {
        vAnimal = false;
        Animal a = new Animal();
        Animal x = new Animal();
        try {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                x = BancoListAnimal.get(i);
                String testCodigo = Integer.toString(x.getCodigoA());
                if (x.getCpf().equals(cpf) && testCodigo.equals(posi)) {
                    int posicao = Integer.parseInt(posi);
                    int converIdade = Integer.parseInt(alt_idade);
                    if (!alt_Nome.equals("") && !alt_Cor.equals("") && !alt_Raca.equals("") && !alt_Sexo.equals("")) {
                        a.setNome(alt_Nome);
                        a.setIdade(converIdade);
                        a.setCor(alt_Cor);
                        a.setRaca(alt_Raca);
                        a.setSexo(alt_Sexo);
                        a.setCpf(cpf);
                        a.setCodigoA(posicao);
                        int resp = JOptionPane.showConfirmDialog(null, "Confirma Alteração?");
                        if (resp == 0) {
                            BancoListAnimal.set(posicao, a);
                            vAnimal = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!!!");
            vAnimal = false;
        }
        return vAnimal;
        //Alterando Animal
    }

    public static boolean setDeletarAnimal(String cpf, String posicao) {
        vAnimal = false;
        Animal x = new Animal();
        try {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                x = BancoListAnimal.get(i);
                String testCodigo = Integer.toString(x.getCodigoA());
                if (x.getCpf().equals(cpf) && testCodigo.equals(posicao)) {
                    int posi = Integer.parseInt(posicao);
                    int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover o Animal?" + "\nNome: " + x.getNomeA() + "\nRaça: " + x.getRaca());
                    if (resp == 0) {
                        BancoListAnimal.remove(posi);
                        vAnimal = true;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!!!");
            vAnimal = false;
        }
        return vAnimal;
    }

    public static boolean setExibirAnimal(String cpf, String posicao) {
        vAnimal = false;
        exibirAnimal = null;

        try {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                Animal x = BancoListAnimal.get(i);
                String testCodigo = Integer.toString(x.getCodigoA());
                if (x.getCpf().equals(cpf) && testCodigo.equals(posicao)) {
                    JOptionPane.showMessageDialog(null, "OK!!!");
                    int posi = Integer.parseInt(posicao);
                    exibirAnimal = BancoListAnimal.get(posi);
                    vAnimal = true;
                }
            }
        } catch (Exception e) {
            vAnimal = false;
        }
        return vAnimal;
    }

    public static int getQuantAnimalCliente(String cpf) {
        int contAni = 0;

        for (int i = 0; i < BancoListAnimal.size(); i++) {
            Animal x = BancoListAnimal.get(i);
            if (x.getCpf().equals(cpf)) {
                contAni++;
            }
        }
        return contAni;
        //Retorna a quantidade de animal do determinado cliente
    }

}
