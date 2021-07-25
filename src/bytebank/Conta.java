package bytebank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		total++;
		System.out.println("Sua conta foi criada com sucesso");
		System.out.println("Sua agência é: " + agencia);
		System.out.println("Sua conta é: " + numero);
	}
	
	public static int getTotal() {
		System.out.println("O total de contas abertas no banco ByteBank é: ");
		return Conta.total;
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depositado valor solicitado, sujeito a conferência: R$" + valor);
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Realizado saque no valor de: R$" + valor);
			return true;
		} else {
			System.out.println("Você não tem saldo suficiente, verifique seu saldo e tente novamente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			System.out.println("Você realizou um depósito no valor de: R$" + valor + " na conta: " +  destino );
			return true;
		} 
		System.out.println("Você não tem saldo suficiente, verifique seu saldo e tente novamente");
		return false;
	}
	
	public double getSaldo() {
		System.out.println("O seu saldo bancário é: ");
		return this.saldo;
	}

	public int getNumero() {
		System.out.println("O numero da sua conta é: ");
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		System.out.println("A sua agência é: ");
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		System.out.println("O titular desta conta é: ");
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
