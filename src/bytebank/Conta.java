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
		System.out.println("Sua ag�ncia �: " + agencia);
		System.out.println("Sua conta �: " + numero);
	}
	
	public static int getTotal() {
		System.out.println("O total de contas abertas no banco ByteBank �: ");
		return Conta.total;
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depositado valor solicitado, sujeito a confer�ncia: R$" + valor);
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Realizado saque no valor de: R$" + valor);
			return true;
		} else {
			System.out.println("Voc� n�o tem saldo suficiente, verifique seu saldo e tente novamente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			System.out.println("Voc� realizou um dep�sito no valor de: R$" + valor + " na conta: " +  destino );
			return true;
		} 
		System.out.println("Voc� n�o tem saldo suficiente, verifique seu saldo e tente novamente");
		return false;
	}
	
	public double getSaldo() {
		System.out.println("O seu saldo banc�rio �: ");
		return this.saldo;
	}

	public int getNumero() {
		System.out.println("O numero da sua conta �: ");
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		System.out.println("A sua ag�ncia �: ");
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		System.out.println("O titular desta conta �: ");
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
