import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Temperatureconverter extends Exception {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatureconverter window = new Temperatureconverter();
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
	public Temperatureconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 577, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEMPERATURE CONVERTER TOOL");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel.setBounds(119, 22, 350, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Degree Celsius", "Kelvin"}));
		comboBox.setToolTipText("From");
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setBounds(125, 87, 150, 32);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(0, 0, 255));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Degree Celsius", "Kelvin"}));
		comboBox_1.setToolTipText("To");
		comboBox_1.setBounds(331, 87, 150, 32);
		frame.getContentPane().add(comboBox_1);
		JLabel lblNewLabel_1 = new JLabel("Enter Your Temp");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(83, 169, 117, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 255));
		textField.setBackground(new Color(220, 220, 220));
		textField.setBounds(249, 170, 185, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("           Result");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(83, 220, 117, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 128));
		textField_1.setBackground(new Color(220, 220, 220));
		textField_1.setColumns(10);
		textField_1.setBounds(249, 223, 185, 20);
		frame.getContentPane().add(textField_1);
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(255, 0, 0));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Degree Celsius", "Kelvin"}));
				if(comboBox.getSelectedItem().equals("Fahrenheit")) {
					comboBox_1.removeItem("Fahrenheit");
				}
				if(comboBox.getSelectedItem().equals("Degree Celsius")) {
					comboBox_1.removeItem("Degree Celsius");
				}
				if(comboBox.getSelectedItem().equals("Kelvin")) {
					comboBox_1.removeItem("Kelvin");
				}
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Select") ||comboBox_1.getSelectedItem().equals("Select")  ) {
					JOptionPane.showMessageDialog(comboBox,"Invalid Entry.Select proper forms");
				}
				else {
				try {
				float a=(Float.parseFloat(textField.getText()));
				if(comboBox.getSelectedItem().equals("Fahrenheit")) {
					textField.setText(a+" (Fahrenheit)");
					if(comboBox_1.getSelectedItem().equals("Degree Celsius")) {
						float c=((a-32)*5)/9;
						textField_1.setText(c+" (Degree Celsius)");
					}
					if(comboBox_1.getSelectedItem().equals("Kelvin")) {
						float c=(float) ((a-32)*5/9+273.15);
						textField_1.setText(c+" (Kelvin)");
					}
				}
				if(comboBox.getSelectedItem().equals("Degree Celsius")) {
					textField.setText(a+" (Degree Celsius)");
					if(comboBox_1.getSelectedItem().equals("Fahrenheit")) {
						float c=a*9/5+32;
						textField_1.setText(c+" (Fahrenheit)");
					}
					if(comboBox_1.getSelectedItem().equals("Kelvin")) {
						float c=(float) (a+273.15);
						textField_1.setText(c+" (Kelvin)");
					}
				}
				if(comboBox.getSelectedItem().equals("Kelvin")) {
					textField.setText(a+" (Kelvin)");
					if(comboBox_1.getSelectedItem().equals("Degree Celsius")) {
						float c=(float) (a-273.15);
						textField_1.setText(c+" (Degree Celsius)");
					}
					if(comboBox_1.getSelectedItem().equals("Fahrenheit")) {
						float c=(float) ((a-273.15)*9/5+32);
						textField_1.setText(c+" (Fahrenheit)");
					}
				}
			}
			
			catch(Exception e1) {
				JOptionPane.showMessageDialog(textField,"Invalid Entry");
			}
			}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(232, 264, 89, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("From");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(73, 87, 42, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("To");
		lblNewLabel_4_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(298, 87, 35, 32);
		frame.getContentPane().add(lblNewLabel_4_1);
	}
}
