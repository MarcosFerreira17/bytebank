package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaMarcos = new Conta(0001, 1234);
		contaMarcos.deposita(1000);
		Conta contaBarbara = new Conta(0001, 1235);
		contaBarbara.deposita(2000);
		contaBarbara.transfere(500, contaMarcos);
		contaBarbara.saca(500);
		System.out.println("O saldo da conta da Bárbara é : " + contaBarbara.getSaldo());
		System.out.println("O saldo da conta do Marcos é: " + contaMarcos.getSaldo());;
	
		Conta contaDaMarcela = new Conta(0001, 1236);
		contaDaMarcela.setTitular(new Cliente());
		contaDaMarcela.getTitular().setNome("Marcela");
		
		System.out.println(contaDaMarcela.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
	}
}
