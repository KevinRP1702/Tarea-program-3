import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		Random r = new Random();
		for (int i=0; i<numeros.length; i++) {
            int posAleatoria = r.nextInt(numeros.length);
            int temp = numeros[i];
            numeros[i] = numeros[posAleatoria];
            numeros[posAleatoria] = temp;   
        }
		
		JButton btnNewButton = new JButton("Reinicio");
		btnNewButton.setBounds(0, 329, 434, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCasilla1 = new JButton("" + numeros[0]);
		btnCasilla1.setBounds(26, 34, 82, 63);
		frame.getContentPane().add(btnCasilla1);
		
		JButton btnCasilla5 = new JButton("" + numeros[1]);
		btnCasilla5.setBounds(26, 109, 82, 63);
		frame.getContentPane().add(btnCasilla5);
		
		JButton btnCasilla9 = new JButton("" + numeros[2]);
		btnCasilla9.setBounds(26, 183, 82, 63);
		frame.getContentPane().add(btnCasilla9);
		
		JButton btnCasilla13 = new JButton("" + numeros[3]);
		btnCasilla13.setBounds(26, 257, 82, 63);
		frame.getContentPane().add(btnCasilla13);
		
		JButton btnCasilla2 = new JButton("" + numeros[4]);
		btnCasilla2.setBounds(120, 34, 82, 63);
		frame.getContentPane().add(btnCasilla2);
		
		JButton btnCasilla6 = new JButton("" + numeros[5]);
		btnCasilla6.setBounds(118, 109, 82, 63);
		frame.getContentPane().add(btnCasilla6);
		
		JButton btnCasilla10 = new JButton("" + numeros[6]);
		btnCasilla10.setBounds(118, 183, 82, 63);
		frame.getContentPane().add(btnCasilla10);
		
		JButton btnCasilla14 = new JButton("" + numeros[7]);
		btnCasilla14.setBounds(120, 257, 82, 63);
		frame.getContentPane().add(btnCasilla14);
		
		JButton btnCasilla3 = new JButton("" + numeros[8]);
		btnCasilla3.setBounds(212, 34, 82, 63);
		frame.getContentPane().add(btnCasilla3);
		
		JButton btnCasilla7 = new JButton("" + numeros[9]);
		btnCasilla7.setBounds(210, 109, 82, 63);
		frame.getContentPane().add(btnCasilla7);
		
		JButton btnCasilla11 = new JButton("" + numeros[10]);
		btnCasilla11.setBounds(210, 183, 82, 63);
		frame.getContentPane().add(btnCasilla11);
		
		JButton btnCasilla15 = new JButton("" + numeros[11]);
		btnCasilla15.setBounds(212, 257, 82, 63);
		frame.getContentPane().add(btnCasilla15);
		
		JButton btnCasilla4 = new JButton("" + numeros[12]);
		btnCasilla4.setBounds(304, 34, 82, 63);
		frame.getContentPane().add(btnCasilla4);
		
		JButton btnCasilla8 = new JButton("" + numeros[13]);
		btnCasilla8.setBounds(302, 109, 82, 63);
		frame.getContentPane().add(btnCasilla8);
		
		JButton btnCasilla12 = new JButton("" + numeros[14]);
		btnCasilla12.setBounds(302, 183, 82, 63);
		frame.getContentPane().add(btnCasilla12);
		
		JButton btnCasilla16 = new JButton("");
		btnCasilla16.setBounds(302, 257, 82, 63);
		frame.getContentPane().add(btnCasilla16);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 409, 329);
		frame.getContentPane().add(panel);
	}
}
