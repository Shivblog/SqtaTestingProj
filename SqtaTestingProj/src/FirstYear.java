import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class FirstYear extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFSSub1;
	private JTextField textFieldFSSub2;
	private JTextField textFieldFSSub3;
	private JTextField textFieldFSSub4;
	private JTextField textFieldFSsub5;
	private JTextField textFieldFSSub6;
	private JTextField textFieldFSSub7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstYear frame = new FirstYear();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FirstYear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstSem = new JLabel("First Semester");
		lblFirstSem.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstSem.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblFirstSem.setBounds(325, 75, 310, 75);
		contentPane.add(lblFirstSem);
		
		JLabel lblSecondSem = new JLabel("Second Semester");
		lblSecondSem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondSem.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSecondSem.setBounds(1285, 75, 310, 75);
		contentPane.add(lblSecondSem);
		
		JLabel lblFSSub1 = new JLabel("107001  ");
		lblFSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub1.setBounds(100, 245, 150, 60);
		contentPane.add(lblFSSub1);
		
		JLabel lblFSSub2a = new JLabel("107002 /");
		lblFSSub2a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub2a.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub2a.setBounds(100, 320, 150, 60);
		contentPane.add(lblFSSub2a);
		
		JLabel lblFSSub2b = new JLabel("107009  ");
		lblFSSub2b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub2b.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub2b.setBounds(100, 360, 150, 60);
		contentPane.add(lblFSSub2b);
		
		JLabel lblFSSub3 = new JLabel("102006  ");
		lblFSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub3.setBounds(100, 435, 150, 60);
		contentPane.add(lblFSSub3);
		
		JLabel lblFSSub4a = new JLabel("103004 /");
		lblFSSub4a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub4a.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub4a.setBounds(100, 510, 150, 60);
		contentPane.add(lblFSSub4a);
		
		JLabel lblFSSub4b = new JLabel("104012  ");
		lblFSSub4b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub4b.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub4b.setBounds(100, 550, 150, 60);
		contentPane.add(lblFSSub4b);
		
		JLabel lblFSSub5 = new JLabel("101005  ");
		lblFSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub5.setBounds(100, 625, 150, 60);
		contentPane.add(lblFSSub5);
		
		JLabel lblFSSub6 = new JLabel("110003  ");
		lblFSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub6.setBounds(100, 700, 150, 60);
		contentPane.add(lblFSSub6);
		
		JLabel lblFSSub7 = new JLabel("110007  ");
		lblFSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblFSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblFSSub7.setBounds(100, 775, 150, 60);
		contentPane.add(lblFSSub7);
		
		textFieldFSSub1 = new JTextField();
		textFieldFSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub1.setBounds(595, 245, 250, 60);
		contentPane.add(textFieldFSSub1);
		textFieldFSSub1.setColumns(10);
		
		textFieldFSSub2 = new JTextField();
		textFieldFSSub2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub2.setColumns(10);
		textFieldFSSub2.setBounds(595, 320, 250, 60);
		contentPane.add(textFieldFSSub2);
		
		textFieldFSSub3 = new JTextField();
		textFieldFSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub3.setColumns(10);
		textFieldFSSub3.setBounds(595, 435, 250, 60);
		contentPane.add(textFieldFSSub3);
		
		textFieldFSSub4 = new JTextField();
		textFieldFSSub4.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub4.setColumns(10);
		textFieldFSSub4.setBounds(595, 505, 250, 60);
		contentPane.add(textFieldFSSub4);
		
		textFieldFSsub5 = new JTextField();
		textFieldFSsub5.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSsub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSsub5.setColumns(10);
		textFieldFSsub5.setBounds(595, 625, 250, 60);
		contentPane.add(textFieldFSsub5);
		
		textFieldFSSub6 = new JTextField();
		textFieldFSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub6.setColumns(10);
		textFieldFSSub6.setBounds(595, 700, 250, 60);
		contentPane.add(textFieldFSSub6);
		
		textFieldFSSub7 = new JTextField();
		textFieldFSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textFieldFSSub7.setColumns(10);
		textFieldFSSub7.setBounds(595, 775, 250, 60);
		contentPane.add(textFieldFSSub7);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 45));
		btnCalculate.setBounds(860, 900, 250, 75);
		contentPane.add(btnCalculate);
		
		JLabel lblSSSub1 = new JLabel("107008 ");
		lblSSSub1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub1.setBounds(1135, 245, 150, 60);
		contentPane.add(lblSSSub1);
		
		JLabel lblSSSub2a = new JLabel("107009 /");
		lblSSSub2a.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub2a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub2a.setBounds(1135, 320, 150, 60);
		contentPane.add(lblSSSub2a);
		
		JLabel lblSSSub2b = new JLabel("107002  ");
		lblSSSub2b.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub2b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub2b.setBounds(1135, 360, 150, 60);
		contentPane.add(lblSSSub2b);
		
		JLabel lblSSSub3 = new JLabel("102013  ");
		lblSSSub3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub3.setBounds(1135, 435, 150, 60);
		contentPane.add(lblSSSub3);
		
		JLabel lblSSSub4a = new JLabel("104012 /");
		lblSSSub4a.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub4a.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub4a.setBounds(1135, 510, 150, 60);
		contentPane.add(lblSSSub4a);
		
		JLabel lblSSSub4b = new JLabel("103004  ");
		lblSSSub4b.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub4b.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub4b.setBounds(1135, 550, 150, 60);
		contentPane.add(lblSSSub4b);
		
		JLabel lblSSSub5 = new JLabel("101011  ");
		lblSSSub5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub5.setBounds(1135, 625, 150, 60);
		contentPane.add(lblSSSub5);
		
		JLabel lblSSSub6 = new JLabel("110010  ");
		lblSSSub6.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub6.setBounds(1135, 700, 150, 60);
		contentPane.add(lblSSSub6);
		
		JLabel lblSSSub7 = new JLabel("102014  ");
		lblSSSub7.setHorizontalAlignment(SwingConstants.CENTER);
		lblSSSub7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSSSub7.setBounds(1135, 775, 150, 60);
		contentPane.add(lblSSSub7);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setColumns(10);
		textField.setBounds(1570, 245, 250, 60);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_1.setColumns(10);
		textField_1.setBounds(1570, 320, 250, 60);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_2.setColumns(10);
		textField_2.setBounds(1570, 435, 250, 60);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_3.setColumns(10);
		textField_3.setBounds(1570, 505, 250, 60);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_4.setColumns(10);
		textField_4.setBounds(1570, 625, 250, 60);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_5.setColumns(10);
		textField_5.setBounds(1570, 700, 250, 60);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField_6.setColumns(10);
		textField_6.setBounds(1570, 775, 250, 60);
		contentPane.add(textField_6);
	}
}
