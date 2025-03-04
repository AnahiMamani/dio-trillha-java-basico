import java.util.Scanner;
public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    Double saldo;
    
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seus dados pessoais para receber um resumo sobre eles. \nInsira seu nome completo: ");
        nomeCliente = sc.next();
        System.out.print("\n Insira sua agencia: ");
        agencia = sc.next();
        System.out.print("\nInsira seu numero de Conta: ");
        numero = sc.nextInt();
        System.out.print("\nInsira seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+"; já está disponível para saque");
    }
}
