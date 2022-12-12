import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class gymRegApp {

	private JFrame frmGymnaesthetics;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmailHere;
	private JTextField textFieldNumber;
	private JTextField txtName;
	private JTextField txtCardNumber;
	private JPasswordField pswdCVV;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gymRegApp window = new gymRegApp();
					window.frmGymnaesthetics.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public gymRegApp() {
		initialize();
	}

	private void initialize() {
		frmGymnaesthetics = new JFrame();
		frmGymnaesthetics.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\JLL\\Downloads\\IDM\\Mayor-Gym-icon.png"));
		frmGymnaesthetics.setTitle("GYM Subscription - GYMnAESTHETICS");
		frmGymnaesthetics.setResizable(false);
		frmGymnaesthetics.setMaximumSize(new Dimension(1062, 640));
		frmGymnaesthetics.setBounds(100, 100, 1062, 640);
		frmGymnaesthetics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGymnaesthetics.getContentPane().setLayout(null);
		
		JLabel lblRegistration = new JLabel("REGISTRATION :");
		lblRegistration.setForeground(Color.WHITE);
		lblRegistration.setFont(new Font("Eras Demi ITC", Font.PLAIN, 30));
		lblRegistration.setBounds(10, 86, 597, 80);
		frmGymnaesthetics.getContentPane().add(lblRegistration);
		
		JLabel lblTitleName = new JLabel("Name: ");
		lblTitleName.setFont(new Font("Eras Demi ITC", Font.PLAIN, 25));
		lblTitleName.setForeground(Color.WHITE);
		lblTitleName.setBounds(20, 145, 116, 54);
		frmGymnaesthetics.getContentPane().add(lblTitleName);
		
		txtLastName = new JTextField();
		txtLastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLastName.setText(null);
			}
		});
		txtLastName.setOpaque(false);
		txtLastName.setText("Last Name");
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		txtLastName.setColumns(10);
		txtLastName.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLastName.setBackground(Color.GRAY);
		txtLastName.setBounds(37, 257, 209, 47);
		frmGymnaesthetics.getContentPane().add(txtLastName);
		
		txtFirstName = new JTextField();
		txtFirstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFirstName.setText(null);
			}
		});
		txtFirstName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtFirstName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtFirstName.setOpaque(false);
		txtFirstName.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtFirstName.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		txtFirstName.setText("First Name");
		txtFirstName.setBackground(Color.GRAY);
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setBounds(35, 199, 211, 46);
		frmGymnaesthetics.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Eras Demi ITC", Font.PLAIN, 25));
		lblGender.setBounds(438, 145, 116, 54);
		frmGymnaesthetics.getContentPane().add(lblGender);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setContentAreaFilled(false);
		rbMale.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		rbMale.setForeground(Color.WHITE);
		rbMale.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		rbMale.setBackground(Color.GRAY);
		rbMale.setAlignmentX(Component.CENTER_ALIGNMENT);
		rbMale.setBounds(458, 199, 208, 45);
		frmGymnaesthetics.getContentPane().add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setContentAreaFilled(false);
		rbFemale.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		rbFemale.setForeground(Color.WHITE);
		rbFemale.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		rbFemale.setBackground(Color.GRAY);
		rbFemale.setAlignmentX(0.5f);
		rbFemale.setBounds(458, 258, 208, 45);
		frmGymnaesthetics.getContentPane().add(rbFemale);
		ButtonGroup b1 =new ButtonGroup();
		b1.add(rbMale);
		b1.add(rbFemale);
		
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Eras Demi ITC", Font.PLAIN, 25));
		lblEmail.setBounds(20, 307, 116, 54);
		frmGymnaesthetics.getContentPane().add(lblEmail);
		
		txtEmailHere = new JTextField();
		txtEmailHere.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmailHere.setText(null);
			}
		});
		txtEmailHere.setText("xyz@gmail.com");
		txtEmailHere.setOpaque(false);
		txtEmailHere.setForeground(Color.WHITE);
		txtEmailHere.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		txtEmailHere.setColumns(10);
		txtEmailHere.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtEmailHere.setBackground(Color.GRAY);
		txtEmailHere.setBounds(35, 359, 211, 46);
		frmGymnaesthetics.getContentPane().add(txtEmailHere);
		
		JLabel lblPhone = new JLabel("Phone: ");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Eras Demi ITC", Font.PLAIN, 25));
		lblPhone.setBounds(438, 314, 116, 54);
		frmGymnaesthetics.getContentPane().add(lblPhone);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setText("+91 ");
		textFieldNumber.setOpaque(false);
		textFieldNumber.setForeground(Color.WHITE);
		textFieldNumber.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		textFieldNumber.setColumns(10);
		textFieldNumber.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		textFieldNumber.setBackground(Color.GRAY);
		textFieldNumber.setBounds(455, 379, 211, 46);
		frmGymnaesthetics.getContentPane().add(textFieldNumber);
		
		JLabel lblSubscription = new JLabel("Subscription :");
		lblSubscription.setForeground(Color.WHITE);
		lblSubscription.setFont(new Font("Eras Demi ITC", Font.PLAIN, 25));
		lblSubscription.setBounds(760, 145, 209, 54);
		frmGymnaesthetics.getContentPane().add(lblSubscription);
		
		JRadioButton rdbtn_subs1 = new JRadioButton("1 Month ( Rs.1,000 )");
		rdbtn_subs1.setForeground(Color.WHITE);
		rdbtn_subs1.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		rdbtn_subs1.setContentAreaFilled(false);
		rdbtn_subs1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		rdbtn_subs1.setBackground(Color.GRAY);
		rdbtn_subs1.setAlignmentX(0.5f);
		rdbtn_subs1.setBounds(778, 199, 208, 45);
		frmGymnaesthetics.getContentPane().add(rdbtn_subs1);
		
		JRadioButton rdbtn_subs2 = new JRadioButton("3 Months ( Rs.2,600 )");
		rdbtn_subs2.setForeground(Color.WHITE);
		rdbtn_subs2.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		rdbtn_subs2.setContentAreaFilled(false);
		rdbtn_subs2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		rdbtn_subs2.setBackground(Color.GRAY);
		rdbtn_subs2.setAlignmentX(0.5f);
		rdbtn_subs2.setBounds(778, 258, 208, 45);
		frmGymnaesthetics.getContentPane().add(rdbtn_subs2);
		
		JRadioButton rdbtn_subs3 = new JRadioButton("12 Months ( Rs.10,000 )");
		rdbtn_subs3.setForeground(Color.WHITE);
		rdbtn_subs3.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		rdbtn_subs3.setContentAreaFilled(false);
		rdbtn_subs3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		rdbtn_subs3.setBackground(Color.GRAY);
		rdbtn_subs3.setAlignmentX(0.5f);
		rdbtn_subs3.setBounds(778, 314, 238, 45);
		frmGymnaesthetics.getContentPane().add(rdbtn_subs3);
		ButtonGroup b2 =new ButtonGroup();
		b2.add(rdbtn_subs1);
		b2.add(rdbtn_subs2);
		b2.add(rdbtn_subs3);
		
		
		JLabel lblCreditCard = new JLabel("Credit Card :");
		lblCreditCard.setForeground(Color.WHITE);
		lblCreditCard.setFont(new Font("Eras Demi ITC", Font.PLAIN, 25));
		lblCreditCard.setBounds(20, 405, 209, 54);
		frmGymnaesthetics.getContentPane().add(lblCreditCard);
		
		txtName = new JTextField();
		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtName.setText(null);
			}
		});
		txtName.setText("Name");
		txtName.setOpaque(false);
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		txtName.setColumns(10);
		txtName.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtName.setBackground(Color.GRAY);
		txtName.setBounds(37, 470, 238, 46);
		frmGymnaesthetics.getContentPane().add(txtName);
		
		txtCardNumber = new JTextField();
		txtCardNumber.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				txtCardNumber.setText(null);
			}
		});
		txtCardNumber.setText("Card Number");
		txtCardNumber.setOpaque(false);
		txtCardNumber.setForeground(Color.WHITE);
		txtCardNumber.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		txtCardNumber.setColumns(10);
		txtCardNumber.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtCardNumber.setBackground(Color.GRAY);
		txtCardNumber.setBounds(428, 470, 238, 46);
		frmGymnaesthetics.getContentPane().add(txtCardNumber);
		
		pswdCVV = new JPasswordField();
		pswdCVV.setToolTipText("CVV");
		pswdCVV.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			}
		});
		pswdCVV.setOpaque(false);
		pswdCVV.setForeground(Color.WHITE);
		pswdCVV.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		pswdCVV.setColumns(10);
		pswdCVV.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		pswdCVV.setBackground(Color.GRAY);
		pswdCVV.setBounds(760, 470, 116, 46);
		frmGymnaesthetics.getContentPane().add(pswdCVV);
		
		JLabel n = new JLabel("n");
		n.setForeground(Color.LIGHT_GRAY);
		n.setFont(new Font("Eras Bold ITC", Font.PLAIN, 40));
		n.setBounds(438, 27, 32, 33);
		frmGymnaesthetics.getContentPane().add(n);
		
		JLabel lblNewLabel = new JLabel("GYM   AESTHETICS");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.PLAIN, 46));
		lblNewLabel.setPreferredSize(new Dimension(1000, 600));
		lblNewLabel.setSize(new Dimension(1000, 600));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(326, 9, 491, 66);
		frmGymnaesthetics.getContentPane().add(lblNewLabel);
		
		JButton btnSUBMIT = new JButton("SUBMIT");
		btnSUBMIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","KADURISHITA");
					String query = "insert into registration values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					
					ps.setString(1, txtFirstName.getText());
					
					ps.setString(2, txtLastName.getText());
					
					if(rbMale.isSelected())
						ps.setString(3, rbMale.getText());
					else
						ps.setString(3, rbFemale.getText());
					
					if(rdbtn_subs1.isSelected())
						ps.setString(4, rdbtn_subs1.getText());
					else if(rdbtn_subs2.isSelected())
						ps.setString(4, rdbtn_subs2.getText());
					else
						ps.setString(4, rdbtn_subs3.getText());
					
					ps.setString(5, txtEmailHere.getText());
					ps.setString(6,textFieldNumber.getText());
					ps.setString(7, txtName.getText());
					ps.setString(8,txtCardNumber.getText());
					ps.setString(9,pswdCVV.getText());
					
					ps.executeUpdate();
					JOptionPane.showMessageDialog(btnSUBMIT,"Registered Succesfully");
					ps.close();
					con.close();
				} catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnSUBMIT.setIconTextGap(5);
		btnSUBMIT.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSUBMIT.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSUBMIT.setBackground(new Color(112, 128, 144));
		btnSUBMIT.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		btnSUBMIT.setForeground(Color.WHITE);
		btnSUBMIT.setBounds(438, 538, 221, 54);
		frmGymnaesthetics.getContentPane().add(btnSUBMIT);
		
		JLabel bckColor = new JLabel("");
		bckColor.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bckColor.setForeground(new Color(169, 169, 169));
		bckColor.setBackground(new Color(169, 169, 169, 75));
		bckColor.setOpaque(true);
		bckColor.setBounds(0, 97, 1048, 506);
		frmGymnaesthetics.getContentPane().add(bckColor);
		
		JLabel topPanel = new JLabel("");
		topPanel.setOpaque(true);
		topPanel.setBackground(Color.BLACK);
		topPanel.setForeground(Color.BLACK);
		topPanel.setBounds(0, 0, 1048, 100);
		frmGymnaesthetics.getContentPane().add(topPanel);
		
		JLabel bckImg = new JLabel("");
		bckImg.setIcon(new ImageIcon("C:\\Users\\JLL\\Downloads\\wallpaperbetter (1).jpg"));
		bckImg.setBounds(0, 97, 1048, 506);
		frmGymnaesthetics.getContentPane().add(bckImg);
	}
}
