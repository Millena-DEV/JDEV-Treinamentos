package Thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); /* painel de componentes */

	private JLabel descricaoHora = new JLabel(" Nome ");

	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel(" Email ");

	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("STOP");
	
	
	private implementaoFilaThread fila = new implementaoFilaThread();

	
	public TelaTimeThread() {

		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		/*********************************************/
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); /*
																			 * controlador de posicionamento de
																			 * posicionamento de componentes
																			 */

		gridBagConstraints.gridx = 0; /* linha */

		gridBagConstraints.gridy = 0; /* coluno */

		gridBagConstraints.gridwidth = 2; /* largura */

		gridBagConstraints.insets = new Insets(5, 10, 5, 5);

		gridBagConstraints.anchor = gridBagConstraints.WEST; /* alinhamento a esqueda */

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; /* pular pra proxima linha */
	
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
	
		jPanel.add(mostraTempo2, gridBagConstraints);

		/**********************************************/
		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {
			
		
			@Override
			public void actionPerformed(ActionEvent e) { /* executa o clique no bot�o */
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setEmail(mostraTempo.getText());
				filaThread.setNome(mostraTempo2.getText());
				
				fila.add(filaThread);

			}
		});

		fila.start();
		add(jPanel, BorderLayout.WEST); /* posicionamento da esquerda */
		setVisible(true); /* tela visivel para o usuario, sempre ser� ultimo comando */

	}

}
