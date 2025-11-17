package pekan8_2511532007;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOperatorAritmatika;
	private JTextField txtBilangan_1;
	private JTextField txtBilangan;
	private JTextField txtOperator;
	private JTextField txtField;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan",JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI frame = new OperatorAritmatikaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtOperatorAritmatika = new JTextField();
		txtOperatorAritmatika.setFont(new Font("Javanese Text", Font.BOLD, 14));
		txtOperatorAritmatika.setText("OPERATOR ARITMATIKA");
		txtOperatorAritmatika.setBounds(135, 11, 187, 20);
		contentPane.add(txtOperatorAritmatika);
		txtOperatorAritmatika.setColumns(10);
		
		txtBilangan_1 = new JTextField();
		txtBilangan_1.setText("Bilangan 1");
		txtBilangan_1.setBounds(10, 63, 96, 20);
		contentPane.add(txtBilangan_1);
		txtBilangan_1.setColumns(10);
		
		txtBilangan = new JTextField();
		txtBilangan.setText("Bilangan 2");
		txtBilangan.setBounds(10, 103, 96, 20);
		contentPane.add(txtBilangan);
		txtBilangan.setColumns(10);
		
		txtOperator = new JTextField();
		txtOperator.setText("Operator");
		txtOperator.setBounds(10, 145, 96, 20);
		contentPane.add(txtOperator);
		txtOperator.setColumns(10);
		
		txtField = new JTextField();
		txtField.setText("Hasil");
		txtField.setBounds(10, 211, 96, 20);
		contentPane.add(txtField);
		txtField.setColumns(10);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(135, 63, 96, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(135, 103, 96, 20);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(135, 144, 45, 22);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(135, 211, 96, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		btnNewButton_3 = new JButton("Proses");
		btnNewButton_3.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
			if(txtBil1.getText().trim().isEmpty()) {
				pesanPeringatan("Silakan Input Bilangan 1");
			} else if(txtBil2.getText().trim().isEmpty()) {
				pesanPeringatan("Silakan Input Bilangan 2");
			} else if(txtBil2.getText().trim().startsWith("0")) {
				pesanPeringatan("Bilangan 2 tidak boleh angka 0");
			} else {
			try{
				int a = Integer.parseInt(txtBil1.getText());
	        	int b = Integer.parseInt(txtBil2.getText());
	        	int c = cbOperator.getSelectedIndex();
	        	
	        	if(c==0) { hasil = a+b; }
		        if(c==1){ hasil = a-b;}
		        if(c==2) { hasil = a*b;}
		        if(c==3) { hasil = a%b; }
			
				
		        txtHasil.setText(String.valueOf(hasil));
			} catch (NumberFormatException ex) {
				pesanError("Bilangan 1 dan 2 harus Angka");
			}
		}
		int a = Integer.parseInt(txtBil1.getText());
		int b = Integer.parseInt(txtBil2.getText());
		int c = cbOperator.getSelectedIndex();
		
		if(c==0) { hasil = a+b; }
		if (c==1){ hasil = a-b;}
		if(c==2) { hasil = a*b;}
		if(c==3) { hasil = a%b; }
		txtHasil.setText(String.valueOf(hasil));
	
		}});
		btnNewButton_3.setBounds(190, 144, 88, 22);
		contentPane.add(btnNewButton_3);
		
			
}}
