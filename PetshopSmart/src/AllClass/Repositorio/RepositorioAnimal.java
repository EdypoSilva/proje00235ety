/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Animal;
import BancoDeDados.BancoPetshop;
import static BancoDeDados.BancoPetshop.BancoListAnimal;

public class RepositorioAnimal {

    public static boolean vAnimal;
    private static int contAnimal;

    public static boolean setCadastroAnimal(Animal cadAnimal) {
        boolean result = false;
        try {
            cadAnimal.setCodigoA(contAnimal);
            BancoPetshop.BancoListAnimal.add(cadAnimal);
            result = true;
            contAnimal++;
        } catch (Exception e) {
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

    public static boolean setAlterarAnimal(Animal cadAnimal, int posi) {
        vAnimal = false;
        Animal x = new Animal();
        try {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                x = BancoListAnimal.get(i);
                if (x.getCpf().equals(cadAnimal.getCpf()) && posi == x.getCodigoA()) {
                    cadAnimal.setCodigoA(posi);
                    BancoListAnimal.set(i, cadAnimal);
                    vAnimal = true;
                }
            }
        } catch (Exception e) {
            vAnimal = false;
        }
        return vAnimal;
        //Alterando Animal
    }

    public static boolean setDeletarAnimal(String cpf, int posicao) {
        vAnimal = false;
        Animal x = new Animal();
        try {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                x = BancoListAnimal.get(i);
                if (x.getCpf().equals(cpf) && posicao == x.getCodigoA()) {
                    BancoListAnimal.remove(i);
                    vAnimal = true;
                }
            }
        } catch (Exception e) {
            vAnimal = false;
        }
        return vAnimal;
    }

    public static Animal setExibirAnimal(String cpf, int posicao) {
        vAnimal = false;
        Animal xAnimal = new Animal();
        try {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                Animal x = BancoListAnimal.get(i);
                if (x.getCpf().equals(cpf) && x.getCodigoA() == posicao) {
                    xAnimal = x;
                }
            }
        } catch (Exception e) {
        }
        return xAnimal;
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
