import java.io.ObjectInputStream.GetField;

public class TestaGetESET {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		
	}
}
