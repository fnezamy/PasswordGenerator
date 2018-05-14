import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Frame {

	private JFrame frame;
	private JTextField textColor;
	private JTextField textYear;
	private JTextField SentenceGeneratedTextField;
	private JTextField RandomGeneratedTextField;
	private JTextField RandomGeneratedInput;
	private JTextField SentenceGenTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.setBounds(100, 100, 1598, 848);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
	
		
		JButton btnNewButton = new JButton("Other Generator");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(52, 344, 233, 89);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("My Generator");
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyGenerator random = new MyGenerator();
				random.generate(4);
				
				
			}
		});
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(344, 53, 1094, 552);
		frame.getContentPane().add(tabbedPane);
		tabbedPane.setFont(new Font("Tahoma", Font.ITALIC, 24));
		JLabel lblUserGen = new JLabel("");
		lblUserGen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel UserGeneratedPanel = new JPanel();
		tabbedPane.addTab("User Generated", null, UserGeneratedPanel, null);
		UserGeneratedPanel.setLayout(null);
		
		textColor = new JTextField();
		textColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textColor.setBounds(546, 46, 374, 61);
		UserGeneratedPanel.add(textColor);
		textColor.setColumns(10);
		
		textYear = new JTextField();
		textYear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textYear.setColumns(10);
		textYear.setBounds(546, 171, 374, 61);
		UserGeneratedPanel.add(textYear);
		
		JLabel lblEnterYourFavorite = new JLabel("Enter your favorite color :");
		lblEnterYourFavorite.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnterYourFavorite.setBounds(25, 43, 413, 63);
		UserGeneratedPanel.add(lblEnterYourFavorite);
		
		
		JLabel lblYourGeneratedPassword = new JLabel("Your generated password : ");
		lblYourGeneratedPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblYourGeneratedPassword.setBounds(15, 365, 459, 40);
		UserGeneratedPanel.add(lblYourGeneratedPassword);
		
		JButton btnGenerate = new JButton("Generate");
		JButton btnAnalysis = new JButton("Analysis");

		btnAnalysis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAnalysis.setBounds(441, 438, 115, 29);
		UserGeneratedPanel.add(btnAnalysis);
		btnGenerate.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String color = textColor.getText();
				String year = textYear.getText();
				
				UserGenerated ug = new UserGenerated();
				
				
				String pass = ug.generate(color, year);
				
		
				
				lblUserGen.setText(pass);
				
				
			}
		});
		btnAnalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblAnalysisOfPassword = new JLabel("Analysis of password : ");
				lblAnalysisOfPassword.setBounds(344, 654, 399, 39);
				frame.getContentPane().add(lblAnalysisOfPassword);
				lblAnalysisOfPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
				RandomGeneratedTextField = new JTextField();
				RandomGeneratedTextField.setHorizontalAlignment(SwingConstants.LEFT);
				RandomGeneratedTextField.setBounds(643, 656, 795, 39);
				frame.getContentPane().add(RandomGeneratedTextField);
				RandomGeneratedTextField.setColumns(20);
				UserGenerated ug = new UserGenerated();
				RandomGeneratedTextField.setFont(new Font("Tahoma",Font.BOLD,20));
				RandomGeneratedTextField.setText(ug.printanaylsis(lblUserGen.getText()));
				
			}
		});
		btnGenerate.setBounds(794, 436, 172, 29);
		UserGeneratedPanel.add(btnGenerate);
		
		JLabel lblEnterTheLast = new JLabel("Enter the last two digits of your birth year : ");
		lblEnterTheLast.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnterTheLast.setBounds(15, 179, 531, 40);
		UserGeneratedPanel.add(lblEnterTheLast);
		
		
		lblUserGen.setBounds(449, 365, 358, 40);
		UserGeneratedPanel.add(lblUserGen);

		
		JPanel RandomGeneratedPanel = new JPanel();
		tabbedPane.addTab("Random Generated", null, RandomGeneratedPanel, null);
		RandomGeneratedPanel.setLayout(null);
		
		JLabel label = new JLabel("Your generated password : ");
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(15, 365, 459, 40);
		RandomGeneratedPanel.add(label);
		JLabel lblRandomGen = new JLabel("");
		lblRandomGen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRandomGen.setBounds(449, 365, 358, 40);
		RandomGeneratedPanel.add(lblRandomGen);
		JButton button = new JButton("Analysis");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblAnalysisOfPassword = new JLabel("Analysis of password : ");
				lblAnalysisOfPassword.setBounds(344, 654, 399, 39);
				frame.getContentPane().add(lblAnalysisOfPassword);
				lblAnalysisOfPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
				RandomGeneratedTextField = new JTextField();
				RandomGeneratedTextField.setHorizontalAlignment(SwingConstants.LEFT);
				RandomGeneratedTextField.setBounds(643, 656, 795, 39);
				frame.getContentPane().add(RandomGeneratedTextField);
				RandomGeneratedTextField.setColumns(20);
				MyGenerator random = new MyGenerator();
				RandomGeneratedTextField.setFont(new Font("Tahoma",Font.BOLD,20));
				RandomGeneratedTextField.setText(random.printanaylsis(lblRandomGen.getText()));
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(441, 438, 115, 29);
		RandomGeneratedPanel.add(button);
		
		JButton button_1 = new JButton("Generate");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int characters = Integer.parseInt(RandomGeneratedInput.getText());
				MyGenerator random = new MyGenerator();
				String pass = random.generate(characters);
				lblRandomGen.setText(pass);
				
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(794, 436, 172, 29);
		RandomGeneratedPanel.add(button_1);
		
		
		RandomGeneratedInput = new JTextField();
		RandomGeneratedInput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomGeneratedInput.setColumns(10);
		RandomGeneratedInput.setBounds(548, 104, 374, 61);
		RandomGeneratedPanel.add(RandomGeneratedInput);
		
		JLabel lblEnterHowMany = new JLabel("Enter how many characters :");
		lblEnterHowMany.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnterHowMany.setBounds(15, 106, 386, 52);
		RandomGeneratedPanel.add(lblEnterHowMany);
		
		
		
		JPanel SentenceGeneratorPanel = new JPanel();
		tabbedPane.addTab("Sentence Generated", null, SentenceGeneratorPanel, null);
		SentenceGeneratorPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("Your generated password : ");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBounds(15, 365, 459, 40);
		SentenceGeneratorPanel.add(label_1);
		JLabel lblSentenceGen = new JLabel("");
		lblSentenceGen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSentenceGen.setBounds(438, 365, 358, 40);
		SentenceGeneratorPanel.add(lblSentenceGen);
		
		JButton button_2 = new JButton("Analysis");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblAnalysisOfPassword = new JLabel("Analysis of password : ");
				lblAnalysisOfPassword.setBounds(344, 654, 399, 39);
				frame.getContentPane().add(lblAnalysisOfPassword);
				lblAnalysisOfPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
				SentenceGeneratedTextField = new JTextField();
				SentenceGeneratedTextField = new JTextField();
				SentenceGeneratedTextField.setHorizontalAlignment(SwingConstants.LEFT);
				SentenceGeneratedTextField.setBounds(643, 656, 795, 39);
				frame.getContentPane().add(SentenceGeneratedTextField);
				SentenceGeneratedTextField.setColumns(20);
				SentenceGenerator sentence = new SentenceGenerator();
				SentenceGeneratedTextField.setFont(new Font("Tahoma",Font.BOLD,20));
				SentenceGeneratedTextField.setText(sentence.printanaylsis(lblSentenceGen.getText()));
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_2.setBounds(441, 438, 115, 29);
		SentenceGeneratorPanel.add(button_2);
		
		JButton GenerateSentence = new JButton("Generate");
		GenerateSentence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SentenceGenerator sentence = new SentenceGenerator();
				String pass = sentence.generate();
				lblSentenceGen.setText(pass);
			}
		});
		GenerateSentence.setFont(new Font("Tahoma", Font.BOLD, 24));
		GenerateSentence.setBounds(794, 436, 172, 29);
		SentenceGeneratorPanel.add(GenerateSentence);
		
		
		btnNewButton_1.setBounds(52, 163, 233, 89);
		frame.getContentPane().add(btnNewButton_1);
		

		
	
	}
}
