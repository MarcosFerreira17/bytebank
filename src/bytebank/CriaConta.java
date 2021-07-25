package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(0001, 1234);
		primeiraConta.getSaldo();
		System.out.println("O saldo da primeira conta é: " + primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println("O saldo da primeira conta é: " +primeiraConta.getSaldo());
		
	}
}
