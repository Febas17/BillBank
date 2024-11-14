import java.util.Random;

public class Cliente {
    String nome, cpf, contas;
    Random randomizador = new Random();
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void abrirConta(){
        System.out.println(randomizador.nextInt(15));
    }

    void fecharConta(){
    }

    void puxarExtrato(int numero){
    }
}
