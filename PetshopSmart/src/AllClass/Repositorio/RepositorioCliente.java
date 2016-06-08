/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClass.Repositorio;

import AllClass.Cliente;
import static BancoDeDados.BancoPetshop.BancoListCliente;
import javax.swing.JOptionPane;

public class RepositorioCliente {

    public static boolean CPFativo = false;
    public static boolean clienteAlterado = false;
    public static Cliente clientes;
    private static boolean statusDebitar;

    public static boolean setCadastroCliente(String nome, String cpf, String telefone, String sexoC) {
        boolean result = false;
        try {
            Cliente c = new Cliente(nome, cpf, telefone, sexoC);
            BancoListCliente.add(c);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!!!");
            result = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, cliente não cadastrado!!!");
            result = false;
        }
        return result;
        //Cadastrando Cliente
    }

    public static boolean setAlterarCliente(String alt_Nome, String cpf, String alt_Telefone, String alt_Sexo) {
        clienteAlterado = false;
        Cliente c = new Cliente();
        try {
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    c.setNome(alt_Nome);
                    c.setTelefone(alt_Telefone);
                    c.setSexo(alt_Sexo);
                    BancoListCliente.set(i, c);
                    clienteAlterado = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!!!");
        }
        return clienteAlterado;
        //Alterando Cliente
    }

    public static boolean setRemoverCliente(String cpf) {
        boolean clienteRemovido = false;
        Cliente c = new Cliente();
        if ((!RepositorioCompra.getExisteClienteCompra(cpf)) && (!RepositorioAnimal.getExisteClienteAnimal(cpf))) {
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    int resp = JOptionPane.showConfirmDialog(null, "Deseja Remover o Cliente?" + "\nNome: " + c.getNome() + "\nCPF: " + c.getCpf());
                    if (resp == 0) {
                        BancoListCliente.remove(i);
                        clienteRemovido = true;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "!!!Cliente não existente!!!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "!!!Não pode ser removido!!! - Cliente possue compras ou animais!!!");
        }
        return clienteRemovido;
        //Remover Cliente
    }

    public static void setCreditar(String cpf, String valor) {
        try {
            double valorConv = Double.parseDouble(valor);
            Cliente c = new Cliente();
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    c.setSaldoCreditar(valorConv);
                    BancoListCliente.set(i, c);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro, cliente não alterado!!!");
        }
        //Adicionar Compra
    }

    public static boolean setDebitar(String cpf, String xvalor) {
        statusDebitar = false;
        try {
            double valor = Double.parseDouble(xvalor);
            Cliente c = new Cliente();
            for (int i = 0; i < BancoListCliente.size(); i++) {
                c = BancoListCliente.get(i);
                if (c.getCpf().equals(cpf)) {
                    c.setSaldoDebitar(valor);
                    BancoListCliente.set(i, c);
                    statusDebitar = true;
                }
            }
        } catch (Exception e) {
        }
        return statusDebitar;
        //Remover Compra
    }

    public static boolean setValidarCPF(String cpf) {
        CPFativo = false;
        clientes = null;
        Cliente c = new Cliente();
        for (int i = 0; i < BancoListCliente.size(); i++) {
            c = BancoListCliente.get(i);
            if (c.getCpf().equals(cpf)) {
                clientes = BancoListCliente.get(i);
                CPFativo = true;
            }
        }
        return CPFativo;
        //validando CPF
    }

    //FimClass
}
