package controller;

import model.Conta;
import repository.ContaRepository;

import java.util.ArrayList;

public class ContaController implements ContaRepository {

   private ArrayList<Conta> listaContas = new ArrayList<>();
   int numero = 0;

    @Override
    public void procurarPorNumero(int numero) {

    }

    @Override
    public void listarTodas() {
        for (var conta : listaContas) {
            conta.visualizar();
        }
    }

    @Override
    public void cadastrar(Conta conta) {

    }

    @Override
    public void atualizar(Conta conta) {

    }

    @Override
    public void deletar(int numero) {

    }

    @Override
    public void sacar(int numero, float valor) {

    }

    @Override
    public void depositar(int numero, float valor) {

    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {

    }
}
