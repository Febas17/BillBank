public class Conta {
    int numero, saldo;
    String tipoConta, historico;
    
    void sacar(int qtd){
        if(qtd > saldo){
            System.out.println("Erro! Saldo Atual: "+this.saldo);
        }
        else{
            System.out.println("Você sacou R$"+ qtd);
            System.out.println("Saldo atual: R$"+this.saldo);
        }
    }
    
    void depositar(int qtd){
        System.out.println("Você depositou R$"+qtd);
    }
    
    //Falta fazer o método transferir
    
    void exibirSaldo(int numero){
        System.out.println("Saldo atual: R$"+this.saldo);
    }
}
