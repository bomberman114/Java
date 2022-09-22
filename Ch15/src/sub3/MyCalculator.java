package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setTitle("MyCalculater");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 21, 386, 81);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(28, 127, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(137, 127, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(250, 127, 60, 60);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(370, 127, 60, 60);
		contentPane.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(28, 225, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(137, 225, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(250, 225, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setBounds(370, 225, 60, 60);
		contentPane.add(btnMulti);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(370, 330, 60, 60);
		contentPane.add(btnMinus);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(250, 330, 60, 60);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(137, 330, 60, 60);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(28, 330, 60, 60);
		contentPane.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(28, 443, 60, 60);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(137, 443, 60, 60);
		contentPane.add(btnC);
		
		JButton btnEq = new JButton("=");
		btnEq.setBounds(250, 443, 60, 60);
		contentPane.add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(370, 443, 60, 60);
		contentPane.add(btnPlus);
	}
}
