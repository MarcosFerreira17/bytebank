package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(0001, 1234);
		primeiraConta.getSaldo();
		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println("O saldo da primeira conta é: " +primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(50);
		System.out.println("O saldo da primeira conta é: " +segundaConta.getSaldo());
		
		System.out.println("A primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("A segunda conta tem: " + segundaConta.getSaldo());
	}
}
