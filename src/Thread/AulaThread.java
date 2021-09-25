package Thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1); /* PROCESSANDO EM PARALELO DO ENVIO DE EMAIL */

		threadEmail.start();

		System.out.println("*********************************************************************");

		new Thread() { /* PROCESSANDO EM PARALELO DO ENVIO DE NOTA FISCAL */

			public void run(){
				
		        /*codigo da rotina*/
				
				/*executa o que queremos*/
				for (int pos = 0 ; pos < 5; pos++) { 

					System.out.println("nota fiscal");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}/*da um tempo*/
					
				}/*fim do codigo paralelo*/
			};

		} .start();/* start liga a thread que fica processando paralelamente por trás; */
		
		System.out.println("CHEGOU AO FIM nota fiscal");
		JOptionPane.showMessageDialog(null, "SISTEMA CONTINUA EXECUTANDO PARA O USUÁRIO");
	
	}

	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
		    /*codigo da rotina*/
			
						/*executa o que queremos*/
						for (int pos = 0 ; pos < 5; pos++) { 

							System.out.println("E-mail");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}/*da um tempo*/
							
						}/*fim do codigo paralelo*/
		
		}
	};
}
		
		