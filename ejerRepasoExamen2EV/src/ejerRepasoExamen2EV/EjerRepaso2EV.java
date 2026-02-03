package ejerRepasoExamen2EV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

public class EjerRepaso2EV {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjerRepaso2EV window = new EjerRepaso2EV();
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
	public EjerRepaso2EV() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		HashMap <String, String> palabra=new HashMap<>();
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(457, 30, 181, 232);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("Palabra: ");
		lblNewLabel.setBounds(12, 30, 60, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTraduccion = new JLabel("Traduccion: ");
		lblTraduccion.setBounds(12, 61, 72, 17);
		frame.getContentPane().add(lblTraduccion);
		
		textField = new JTextField();
		textField.setBounds(100, 28, 114, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 59, 114, 21);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				palabra.put(textField.getText(), textField_1.getText());
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 294, 114, 21);
		frame.getContentPane().add(textField_2);
		btnNewButton.setBounds(68, 90, 105, 27);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Palabra: ");
		lblNewLabel_1.setBounds(12, 296, 60, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblLaPalabraTraducida = new JLabel("La palabra traducida es ");
		lblLaPalabraTraducida.setBounds(12, 388, 143, 17);
		frame.getContentPane().add(lblLaPalabraTraducida);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(167, 388, 60, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (String p : palabra.keySet()) {
				    textArea.append(p+" - "+ palabra.get(p)+"\n");
				}
				
			}
		});
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_2.setText(palabra.get(textField_2.getText())); 
			}
		});
		btnBuscar.setBounds(68, 332, 105, 27);
		frame.getContentPane().add(btnBuscar);
		btnNewButton_1.setBounds(493, 274, 105, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Palabra: ");
		lblNewLabel_1_1.setBounds(457, 361, 60, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(524, 359, 114, 21);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(493, 401, 105, 27);
		frame.getContentPane().add(btnNewButton_2);
	}
}
