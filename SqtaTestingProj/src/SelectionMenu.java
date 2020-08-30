import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectionMenu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionMenu frame = new SelectionMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SelectionMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblMenu.setBounds(860, 75, 200, 100);
		contentPane.add(lblMenu);
		
		JButton btnFirstYear = new JButton("First Year");
		btnFirstYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				FirstYear FE = new FirstYear();
				FE.setVisible(true);
			}
		});
		btnFirstYear.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnFirstYear.setBounds(405, 300, 225, 75);
		contentPane.add(btnFirstYear);
		
		JButton btnSecondYear = new JButton("Second Year");
		btnSecondYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SecondYear SE = new SecondYear();
				SE.setVisible(true);
			}
		});
		btnSecondYear.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnSecondYear.setBounds(405, 550, 225, 75);
		contentPane.add(btnSecondYear);
		
		JButton btnThirdYear = new JButton("Third Year");
		btnThirdYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ThirdYear TE = new ThirdYear();
				TE.setVisible(true);
			}
		});
		btnThirdYear.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnThirdYear.setBounds(1365, 300, 225, 75);
		contentPane.add(btnThirdYear);
		
		JButton btnFourthYear = new JButton("Fourth Year");
		btnFourthYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FourthYear BE = new FourthYear();
				BE.setVisible(true);
			}
		});
		btnFourthYear.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnFourthYear.setBounds(1365, 550, 225, 75);
		contentPane.add(btnFourthYear);
	}
}
