package Thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha =
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add (ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	
	@Override
	public void run() {
		
		System.out.println(" fila rodando ");
		
		
		while(true) {
		
		synchronized (pilha_filha) { /* BLOQUEAR O ACESSO A ESTA LISTA POR OUTROS PROCESSOS*/ 
			Iterator iteracao = pilha_filha.iterator();
        
			while (iteracao.hasNext()) { /* enquanto tiver dados na lista ir� processar*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /* pega o objeto atual */
				
				/* processar 10 mil notas fiscais*/
				/* gerar uma lista enorme de pdf*/
				/*gerar um envio em massa de email*/
				
				System.out.println("***********************************************************");
				System.out.println(processar.getNome());
				System.out.println(processar.getEmail());
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000); /* dar um tempo pra descarga de memoria*/
					
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
		}
				
				try {
					Thread.sleep(1000); /* dar um tempo pra limpeza  de memoria*/
					
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}		
				
		}
	}
			
}	
		

		
	

	
 

