package pekan8_2511538002;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class operatorAritmatika extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAngka1;
	private JTextField textAngka2;
	private JTextField textHasil;

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,  pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operatorAritmatika frame = new operatorAritmatika();
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
	public operatorAritmatika() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMETIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 14));
		lblNewLabel.setBounds(93, 29, 174, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setBounds(10, 71, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Angka 2");
		lblNewLabel_1_1.setBounds(10, 93, 44, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(10, 140, 71, 12);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(10, 178, 44, 12);
		contentPane.add(lblNewLabel_1_3);
		
		textAngka1 = new JTextField();
		textAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		textAngka1.setBounds(77, 68, 96, 18);
		contentPane.add(textAngka1);
		textAngka1.setColumns(10);
		
		textAngka2 = new JTextField();
		textAngka2.setHorizontalAlignment(SwingConstants.CENTER);
		textAngka2.setBounds(77, 90, 96, 18);
		contentPane.add(textAngka2);
		textAngka2.setColumns(10);
		
		textHasil = new JTextField();
		textHasil.setEditable(false);
		textHasil.setHorizontalAlignment(SwingConstants.CENTER);
		textHasil.setBounds(77, 175, 96, 18);
		contentPane.add(textHasil);
		textHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(78, 136, 95, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (textAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");
				} else if (textAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");
				} else {
					try {
						int a = Integer.valueOf(textAngka1.getText ());
						int b = Integer.parseInt(textAngka2.getText());
						int c = cbOperator.getSelectedIndex();
						if(c==0) {hasil= a+b;}
						if(c==1) {hasil= a-b;}
						if(c==2) {hasil= a*b;}
						if(c==3) {hasil= a/b;}
						if(c==4) {hasil= a%b;}
						textHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanEror("angka 1 dan Angka 2 tidak valid");
						
					}
				}
				
				} 
		});
		btnNewButton.setBounds(183, 136, 84, 20);
		contentPane.add(btnNewButton);

	}
}
