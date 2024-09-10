package exception;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("123-1", 2000.);
		
		try {
			cc.deposito(10.);
			cc.saque(200);
			
			
		} catch (ContaException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println(cc);
		}
		
	}

}
