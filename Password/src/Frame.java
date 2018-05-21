import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
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

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JTable;

public class Frame {

	private JFrame frame;
	private JTextField textColor;
	private JTextField textYear;
	private JTextField SentenceGeneratedTextField;
	private JTextField RandomGeneratedTextField;
	private JTextField RandomGeneratedInput;
	private JTextField SentenceGenTextField;
	private JTextField UserGenAnalysis;
	private JTextField UserGenEntropy;
	private JTextField UserGenCrack1;
	private JTextField UserGenCrack2;
	private JTextField UserGenDis;
	private JTextField RandomGenAnalysis;
	private JTextField RandomGenEntropy;
	private JTextField RandomCrack1;
	private JTextField RandomCrack2;
	private JTextField RandomAdv;
	private JTextField RandomDis;
	private JTextField SentenceGenAnalysis;
	private JTextField SentenceEntropy;
	private JTextField SentenceCrack1;
	private JTextField SentenceCrack2;
	private JTextField SentenceAdv;
	private JTextField SentenceDis;
	private JTextField UserGenAdv;
	private JTextField OtherGen1Analysis;
	private JTextField Gen1Entropy;
	private JTextField Gen1Crack1;
	private JTextField Gen1Crack2;
	private JTextField Gen1Adv;
	private JTextField Gen1Dis;
	private JTextField OtherGen2Analysis;
	private JTextField OtherGen2Entropy;
	private JTextField OtherGen2Crack1;
	private JTextField OtherGen2Crack2;
	private JTextField OtherGen2Adv;
	private JTextField OtherGen2Dis;
	private JTextField HighestEntropy;
	private JTextField UserMem;

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
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 16, 1546, 740);
		frame.getContentPane().add(tabbedPane);
		tabbedPane.setFont(new Font("Tahoma", Font.ITALIC, 24));
		JLabel lblUserGen = new JLabel("");
		lblUserGen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		JPanel UserGeneratedPanel = new JPanel();
		tabbedPane.addTab("User Generated", null, UserGeneratedPanel, null);
		UserGeneratedPanel.setLayout(null);
		
		textColor = new JTextField();
		textColor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textColor.setBounds(651, 46, 374, 61);
		UserGeneratedPanel.add(textColor);
		textColor.setColumns(10);
		
		textYear = new JTextField();
		textYear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textYear.setColumns(10);
		textYear.setBounds(651, 171, 374, 61);
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
				btnAnalysis.setBounds(727, 438, 115, 29);
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
				btnGenerate.setBounds(1136, 436, 172, 29);
				UserGeneratedPanel.add(btnGenerate);
				
				JLabel lblEnterTheLast = new JLabel("Enter the last two digits of your birth year : ");
				lblEnterTheLast.setFont(new Font("Tahoma", Font.BOLD, 24));
				lblEnterTheLast.setBounds(15, 179, 531, 40);
				UserGeneratedPanel.add(lblEnterTheLast);
				
				
				lblUserGen.setBounds(667, 365, 358, 40);
				UserGeneratedPanel.add(lblUserGen);
				//UserGenAnalysis.setText(lblUserGen.getText());

		
		JPanel RandomGeneratedPanel = new JPanel();
		tabbedPane.addTab("Random Generated", null, RandomGeneratedPanel, null);
		RandomGeneratedPanel.setLayout(null);
		
		JLabel label = new JLabel("Your generated password : ");
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(15, 365, 459, 40);
		RandomGeneratedPanel.add(label);
		JLabel lblRandomGen = new JLabel("");
		lblRandomGen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRandomGen.setBounds(590, 365, 358, 40);
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
		button.setBounds(709, 438, 115, 29);
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
		button_1.setBounds(1118, 436, 172, 29);
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
		lblSentenceGen.setBounds(528, 365, 358, 40);
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
		button_2.setBounds(654, 438, 115, 29);
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
		GenerateSentence.setBounds(1074, 436, 172, 29);
		SentenceGeneratorPanel.add(GenerateSentence);
		

		JPanel OtherGenerator = new JPanel();
		tabbedPane.addTab("Other Generators", null, OtherGenerator, null);
		OtherGenerator.setLayout(null);
		
		JLabel lblWord = new JLabel("");
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWord.setBounds(384, 333, 358, 40);
		OtherGenerator.add(lblWord);
		
		JButton button_4 = new JButton("Generate");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WordGenerator word = new WordGenerator();
				String pass = word.generate(3);
				lblWord.setText(pass);
			}
		});
		
		JButton button_3 = new JButton("Analysis");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblAnalysisOfPassword = new JLabel("Analysis of password : ");
				lblAnalysisOfPassword.setBounds(344, 654, 399, 39);
				frame.getContentPane().add(lblAnalysisOfPassword);
				lblAnalysisOfPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
				JTextField WordGeneratedTextField = new JTextField();
				
				WordGeneratedTextField = new JTextField();
				WordGeneratedTextField.setHorizontalAlignment(SwingConstants.LEFT);
				WordGeneratedTextField.setBounds(643, 656, 795, 39);
				frame.getContentPane().add(WordGeneratedTextField);
				WordGeneratedTextField.setColumns(20);
				WordGenerator word = new WordGenerator();
				WordGeneratedTextField.setFont(new Font("Tahoma",Font.BOLD,20));
				WordGeneratedTextField.setText(word.printanaylsis(lblWord.getText()));
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_3.setBounds(667, 411, 115, 29);
		OtherGenerator.add(button_3);
		
	
		button_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_4.setBounds(1083, 409, 172, 29);
		OtherGenerator.add(button_4);
		
		JLabel label_2 = new JLabel("Your generated password : ");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_2.setBounds(25, 333, 459, 40);
		OtherGenerator.add(label_2);
		
		JLabel label_3 = new JLabel("Your generated password : ");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_3.setBounds(15, 114, 459, 40);
		OtherGenerator.add(label_3);
		
		JLabel lblPwd = new JLabel("");
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPwd.setBounds(384, 114, 358, 40);
		OtherGenerator.add(lblPwd);
		
		
		
		JButton button_6 = new JButton("Generate");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PwdGenerator pwd = new PwdGenerator();
				int x = 5;
				String pass = pwd.generatePassword(x);
				lblPwd.setText(pass);
			}
		});
		
		JButton button_5 = new JButton("Analysis");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblAnalysisOfPassword = new JLabel("Analysis of password : ");
				lblAnalysisOfPassword.setBounds(344, 654, 399, 39);
				frame.getContentPane().add(lblAnalysisOfPassword);
				lblAnalysisOfPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
				JTextField PwdGeneratedTextField = new JTextField();
				
				PwdGeneratedTextField = new JTextField();
				PwdGeneratedTextField.setHorizontalAlignment(SwingConstants.LEFT);
				PwdGeneratedTextField.setBounds(643, 656, 795, 39);
				frame.getContentPane().add(PwdGeneratedTextField);
				PwdGeneratedTextField.setColumns(20);
				PwdGenerator pwd = new PwdGenerator();
				PwdGeneratedTextField.setFont(new Font("Tahoma",Font.BOLD,20));
				PwdGeneratedTextField.setText(pwd.printanaylsis(lblPwd.getText()));
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_5.setBounds(667, 170, 115, 29);
		OtherGenerator.add(button_5);
		
		
		button_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_6.setBounds(1083, 168, 172, 29);
		OtherGenerator.add(button_6);
		
		Anaylsis a = new Anaylsis();
		
		Anaylsis ar = new Anaylsis();
		
		JLabel lblUserGeneratedr;
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Password Analysis", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 16, 1571, 717);
		panel_4.add(tabbedPane_2);
		
		JPanel UserMemorability = new JPanel();
		tabbedPane_2.addTab("User Generated", null, UserMemorability, null);
		UserMemorability.setLayout(null);
		
		
		Anaylsis user = new Anaylsis();
		UserGenAnalysis = new JTextField();
		UserGenAnalysis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserGenAnalysis.setColumns(10);
		UserGenAnalysis.setBounds(296, 86, 297, 26);
		UserMemorability.add(UserGenAnalysis);
		UserGenEntropy = new JTextField();
		UserGenEntropy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserGenEntropy.setText("");
		UserGenEntropy.setColumns(10);
		UserGenEntropy.setBounds(918, 68, 297, 26);
		UserMemorability.add(UserGenEntropy);
		UserGenEntropy.setText(user.Entropy(UserGenAnalysis.getText()));
		UserGenCrack1 = new JTextField();
		UserGenCrack1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserGenCrack1.setText("");
		UserGenCrack1.setColumns(10);
		UserGenCrack1.setBounds(918, 110, 297, 26);
		UserMemorability.add(UserGenCrack1);
		UserGenCrack1.setText(user.Crack1(UserGenAnalysis.getText()));
		UserGenCrack2 = new JTextField();
		UserGenCrack2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserGenCrack2.setText("");
		UserGenCrack2.setColumns(10);
		UserGenCrack2.setBounds(918, 148, 297, 26);
		UserMemorability.add(UserGenCrack2);
		UserGenCrack2.setText(user.Crack2(UserGenAnalysis.getText()));
		
		JLabel label_18 = new JLabel("Entropy");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_18.setBounds(682, 58, 121, 33);
		UserMemorability.add(label_18);
		
		JLabel label_19 = new JLabel("Time to Crack");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_19.setBounds(682, 103, 221, 26);
		UserMemorability.add(label_19);
		
		JLabel label_20 = new JLabel("Time to Crack");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_20.setBounds(682, 132, 221, 42);
		UserMemorability.add(label_20);
		
		UserGenAdv = new JTextField();
		UserGenAdv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserGenAdv.setText("User Memorability, Strong Entropy...");
		UserGenAdv.setColumns(10);
		UserGenAdv.setBounds(918, 190, 297, 26);
		UserMemorability.add(UserGenAdv);
		
		UserGenDis = new JTextField();
		UserGenDis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		UserGenDis.setText("Weak to Dictionary Attacks");
		UserGenDis.setColumns(10);
		UserGenDis.setBounds(918, 231, 297, 26);
		UserMemorability.add(UserGenDis);
		
		JLabel label_22 = new JLabel("Disadvantages");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_22.setBounds(682, 220, 221, 34);
		UserMemorability.add(label_22);
		
		JLabel label_23 = new JLabel("User Generated");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_23.setBounds(15, 68, 266, 48);
		UserMemorability.add(label_23);
		
		JLabel label_24 = new JLabel("Advantages");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_24.setBounds(682, 178, 209, 37);
		UserMemorability.add(label_24);
		
		JPanel UserGraph = new JPanel();
		UserGraph.setBounds(25, 270, 652, 349);
		UserMemorability.add(UserGraph);
		UserGraph.setLayout(new BorderLayout(0, 0));
		
		JButton button_7 = new JButton("Generate");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserGenAnalysis.setText(lblUserGen.getText());
				UserGenEntropy.setText(user.Entropy(UserGenAnalysis.getText()));
				UserGenCrack1.setText(user.Crack1(UserGenAnalysis.getText()));
				UserGenCrack2.setText(user.Crack2(UserGenAnalysis.getText()));
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				String cr1 = UserGenCrack1.getText();
				String[] c1 = cr1.split(" ");
				int cone = Integer.parseInt(c1[0]);
				String cr2 = UserGenCrack2.getText();
				String[] c2 = cr2.split(" ");
				int ctwo = Integer.parseInt(c2[0]);
				
				dataset.setValue(cone, "", "ONLINE_THROTTLED");
				dataset.setValue(ctwo, "", "OFFLINE_BCRYPT_12");
				
				JFreeChart chart = ChartFactory.createBarChart("", "", "", dataset);
				CategoryPlot catPlot = chart.getCategoryPlot();
				catPlot.setRangeGridlinePaint(Color.black);
				
				ChartPanel chartPanel = new ChartPanel(chart);
				UserGraph.removeAll();
				UserGraph.add(chartPanel, BorderLayout.CENTER);
				UserGraph.validate();
				
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_7.setBounds(1179, 532, 172, 29);
		UserMemorability.add(button_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(15, 132, 652, 128);
		UserMemorability.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRelateToUser = new JLabel("Relate to User");
		lblRelateToUser.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRelateToUser.setBounds(15, 16, 172, 37);
		panel_3.add(lblRelateToUser);
		
		JLabel lblMneomic = new JLabel("Mneomic Memorability");
		lblMneomic.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMneomic.setBounds(15, 69, 240, 37);
		panel_3.add(lblMneomic);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(225, 16, 69, 20);
		panel_3.add(label_4);
		
		JLabel lblWordsIncluded = new JLabel("Words included");
		lblWordsIncluded.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWordsIncluded.setBounds(289, 16, 240, 37);
		panel_3.add(lblWordsIncluded);
		
		JLabel lblRandomnessIncluded = new JLabel("Randomness Included");
		lblRandomnessIncluded.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRandomnessIncluded.setBounds(289, 69, 240, 37);
		panel_3.add(lblRandomnessIncluded);
		
		JLabel label_17 = new JLabel("5");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_17.setBounds(198, 24, 30, 26);
		panel_3.add(label_17);
		
		JLabel lblYes_7 = new JLabel("Yes");
		lblYes_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_7.setBounds(544, 27, 30, 26);
		panel_3.add(lblYes_7);
		
		JLabel label_46 = new JLabel("2");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_46.setBounds(264, 78, 30, 26);
		panel_3.add(label_46);
		
		JLabel lblYes_8 = new JLabel("Yes");
		lblYes_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_8.setBounds(544, 80, 30, 26);
		panel_3.add(lblYes_8);
		
		
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("Random Generated", null, panel_6, null);
		panel_6.setLayout(null);
		
		RandomGenAnalysis = new JTextField();
		RandomGenAnalysis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomGenAnalysis.setText("");
		RandomGenAnalysis.setColumns(10);
		RandomGenAnalysis.setBounds(305, 83, 297, 26);
		panel_6.add(RandomGenAnalysis);
		
		RandomGenEntropy = new JTextField();
		RandomGenEntropy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomGenEntropy.setText("");
		RandomGenEntropy.setColumns(10);
		RandomGenEntropy.setBounds(927, 63, 297, 26);
		panel_6.add(RandomGenEntropy);
		
		RandomCrack1 = new JTextField();
		RandomCrack1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomCrack1.setText("");
		RandomCrack1.setColumns(10);
		RandomCrack1.setBounds(927, 105, 297, 26);
		panel_6.add(RandomCrack1);
		
		RandomCrack2 = new JTextField();
		RandomCrack2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomCrack2.setText("");
		RandomCrack2.setColumns(10);
		RandomCrack2.setBounds(927, 147, 297, 26);
		panel_6.add(RandomCrack2);
		
		JLabel label_25 = new JLabel("Entropy");
		label_25.setBounds(237, 137, 0, 0);
		panel_6.add(label_25);
		
		JLabel label_26 = new JLabel("Time to Crack");
		label_26.setBounds(237, 137, 0, 0);
		panel_6.add(label_26);
		
		JLabel label_27 = new JLabel("Time to Crack");
		label_27.setBounds(237, 137, 0, 0);
		panel_6.add(label_27);
		
		JLabel label_28 = new JLabel("Time to Crack");
		label_28.setBounds(237, 137, 0, 0);
		panel_6.add(label_28);
		
		RandomAdv = new JTextField();
		RandomAdv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomAdv.setText("User Memorability, Strong Entropy...");
		RandomAdv.setColumns(10);
		RandomAdv.setBounds(927, 192, 297, 26);
		panel_6.add(RandomAdv);
		
		RandomDis = new JTextField();
		RandomDis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RandomDis.setText("Weak to Dictionary Attacks");
		RandomDis.setColumns(10);
		RandomDis.setBounds(927, 234, 297, 26);
		panel_6.add(RandomDis);
		
		JLabel label_29 = new JLabel("Disadvantages");
		label_29.setBounds(237, 137, 0, 0);
		panel_6.add(label_29);
		
		JLabel label_30 = new JLabel("Random Generated");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_30.setBounds(15, 63, 327, 53);
		panel_6.add(label_30);
		
		JLabel label_31 = new JLabel("Advantages");
		label_31.setBounds(237, 137, 0, 0);
		panel_6.add(label_31);
		
		JLabel label_32 = new JLabel("Entropy");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_32.setBounds(704, 51, 166, 37);
		panel_6.add(label_32);
		
		JLabel label_33 = new JLabel("Time to Crack");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_33.setBounds(704, 90, 222, 48);
		panel_6.add(label_33);
		
		JLabel label_35 = new JLabel("Time to Crack");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_35.setBounds(704, 137, 198, 43);
		panel_6.add(label_35);
		
		JLabel label_36 = new JLabel("Advantages");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_36.setBounds(704, 174, 193, 45);
		panel_6.add(label_36);
		
		JLabel label_37 = new JLabel("Disadvantages");
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_37.setBounds(704, 216, 234, 48);
		panel_6.add(label_37);
		
		JPanel RandomGraph = new JPanel();
		RandomGraph.setBounds(15, 290, 652, 349);
		panel_6.add(RandomGraph);
		RandomGraph.setLayout(new BorderLayout(0, 0));
		
		JButton button_8 = new JButton("Generate");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anaylsis random = new Anaylsis();
				RandomGenAnalysis.setText(lblRandomGen.getText());
				RandomGenEntropy.setText(random.Entropy(RandomGenAnalysis.getText()));
				RandomCrack1.setText(random.Crack1(RandomGenAnalysis.getText()));
				RandomCrack2.setText(random.Crack2(RandomGenAnalysis.getText()));
				
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				String cr1 = RandomCrack1.getText();
				String[] c1 = cr1.split(" ");
				int cone = Integer.parseInt(c1[0]);
				String cr2 = RandomCrack2.getText();
				String[] c2 = cr2.split(" ");
				int ctwo = Integer.parseInt(c2[0]);
				
				dataset.setValue(cone, "", "ONLINE_THROTTLED");
				dataset.setValue(ctwo, "", "OFFLINE_BCRYPT_12");
				
				JFreeChart chart = ChartFactory.createBarChart("", "", "", dataset);
				CategoryPlot catPlot = chart.getCategoryPlot();
				catPlot.setRangeGridlinePaint(Color.black);
				
				ChartPanel chartPanel = new ChartPanel(chart);
				RandomGraph.removeAll();
				RandomGraph.add(chartPanel, BorderLayout.CENTER);
				RandomGraph.validate();
				
				
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_8.setBounds(1165, 521, 172, 29);
		panel_6.add(button_8);
		
		JPanel RandomMemorability = new JPanel();
		RandomMemorability.setLayout(null);
		RandomMemorability.setBounds(15, 146, 652, 128);
		panel_6.add(RandomMemorability);
		
		JLabel label_48 = new JLabel("Relate to User");
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_48.setBounds(15, 16, 172, 37);
		RandomMemorability.add(label_48);
		
		JLabel label_49 = new JLabel("Mneomic Memorability");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_49.setBounds(15, 69, 240, 37);
		RandomMemorability.add(label_49);
		
		JLabel label_50 = new JLabel("");
		label_50.setBounds(225, 16, 69, 20);
		RandomMemorability.add(label_50);
		
		JLabel label_51 = new JLabel("Words included");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_51.setBounds(289, 16, 240, 37);
		RandomMemorability.add(label_51);
		
		JLabel label_52 = new JLabel("Randomness Included");
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_52.setBounds(289, 69, 240, 37);
		RandomMemorability.add(label_52);
		
		JLabel label_53 = new JLabel("0");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_53.setBounds(198, 24, 30, 26);
		RandomMemorability.add(label_53);
		
		JLabel lblYes = new JLabel("Yes");
		lblYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes.setBounds(544, 27, 30, 26);
		RandomMemorability.add(lblYes);
		
		JLabel label_55 = new JLabel("0");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_55.setBounds(264, 78, 30, 26);
		RandomMemorability.add(label_55);
		
		JLabel lblYes_1 = new JLabel("Yes");
		lblYes_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_1.setBounds(544, 80, 30, 26);
		RandomMemorability.add(lblYes_1);
		
		
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("Sentence Generated", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel label_38 = new JLabel("Sentence Generated");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_38.setBounds(0, 29, 325, 39);
		panel_7.add(label_38);
		
		SentenceGenAnalysis = new JTextField();
		SentenceGenAnalysis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SentenceGenAnalysis.setText("");
		SentenceGenAnalysis.setColumns(10);
		SentenceGenAnalysis.setBounds(310, 42, 297, 26);
		panel_7.add(SentenceGenAnalysis);
		
		SentenceEntropy = new JTextField();
		SentenceEntropy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SentenceEntropy.setText("");
		SentenceEntropy.setColumns(10);
		SentenceEntropy.setBounds(931, 133, 297, 26);
		panel_7.add(SentenceEntropy);
		
		SentenceCrack1 = new JTextField();
		SentenceCrack1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SentenceCrack1.setText("");
		SentenceCrack1.setColumns(10);
		SentenceCrack1.setBounds(931, 162, 297, 26);
		panel_7.add(SentenceCrack1);
		
		SentenceCrack2 = new JTextField();
		SentenceCrack2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SentenceCrack2.setText("");
		SentenceCrack2.setColumns(10);
		SentenceCrack2.setBounds(931, 195, 297, 26);
		panel_7.add(SentenceCrack2);
		
		SentenceAdv = new JTextField();
		SentenceAdv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SentenceAdv.setText("");
		SentenceAdv.setColumns(10);
		SentenceAdv.setBounds(931, 249, 297, 26);
		panel_7.add(SentenceAdv);
		
		SentenceDis = new JTextField();
		SentenceDis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SentenceDis.setText("");
		SentenceDis.setColumns(10);
		SentenceDis.setBounds(931, 291, 297, 26);
		panel_7.add(SentenceDis);
		
		JLabel label_39 = new JLabel("Entropy");
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_39.setBounds(692, 124, 172, 31);
		panel_7.add(label_39);
		
		JLabel label_40 = new JLabel("Time to Crack");
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_40.setBounds(692, 161, 234, 39);
		panel_7.add(label_40);
		
		JLabel label_41 = new JLabel("Time to Crack");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_41.setBounds(692, 199, 224, 39);
		panel_7.add(label_41);
		
		JLabel label_43 = new JLabel("Advantages");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_43.setBounds(692, 239, 214, 37);
		panel_7.add(label_43);
		
		JLabel label_44 = new JLabel("Disadvantages");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_44.setBounds(692, 278, 244, 39);
		panel_7.add(label_44);
		
		JPanel SentenceGraph = new JPanel();
		SentenceGraph.setBounds(28, 278, 652, 349);
		panel_7.add(SentenceGraph);
		SentenceGraph.setLayout(new BorderLayout(0, 0));
		
		JButton button_9 = new JButton("Generate");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SentenceGenAnalysis.setText(lblSentenceGen.getText());
				Anaylsis sen = new Anaylsis();
				SentenceEntropy.setText(sen.Entropy(SentenceGenAnalysis.getText()));
				SentenceCrack1.setText(sen.Crack1(SentenceGenAnalysis.getText()));
				SentenceCrack2.setText(sen.Crack2(SentenceGenAnalysis.getText()));
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				String cr1 = SentenceCrack1.getText();
				String[] c1 = cr1.split(" ");
				int cone = Integer.parseInt(c1[0]);
				String cr2 = SentenceCrack2.getText();
				String[] c2 = cr2.split(" ");
				int ctwo = Integer.parseInt(c2[0]);
				
				dataset.setValue(cone, "", "ONLINE_THROTTLED");
				dataset.setValue(ctwo, "", "OFFLINE_BCRYPT_12");
				
				JFreeChart chart = ChartFactory.createBarChart("", "", "", dataset);
				CategoryPlot catPlot = chart.getCategoryPlot();
				catPlot.setRangeGridlinePaint(Color.black);
				
				ChartPanel chartPanel = new ChartPanel(chart);
				SentenceGraph.removeAll();
				SentenceGraph.add(chartPanel, BorderLayout.CENTER);
				SentenceGraph.validate();
				
				
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_9.setBounds(1140, 545, 172, 29);
		panel_7.add(button_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(15, 121, 652, 128);
		panel_7.add(panel_8);
		
		JLabel label_57 = new JLabel("Relate to User");
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_57.setBounds(15, 16, 172, 37);
		panel_8.add(label_57);
		
		JLabel label_58 = new JLabel("Mneomic Memorability");
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_58.setBounds(15, 69, 240, 37);
		panel_8.add(label_58);
		
		JLabel label_59 = new JLabel("");
		label_59.setBounds(225, 16, 69, 20);
		panel_8.add(label_59);
		
		JLabel label_60 = new JLabel("Words included");
		label_60.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_60.setBounds(289, 16, 240, 37);
		panel_8.add(label_60);
		
		JLabel label_61 = new JLabel("Randomness Included");
		label_61.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_61.setBounds(289, 69, 240, 37);
		panel_8.add(label_61);
		
		JLabel label_62 = new JLabel("3");
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_62.setBounds(198, 24, 30, 26);
		panel_8.add(label_62);
		
		JLabel lblYes_2 = new JLabel("Yes");
		lblYes_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_2.setBounds(544, 27, 30, 26);
		panel_8.add(lblYes_2);
		
		JLabel label_64 = new JLabel("2");
		label_64.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_64.setBounds(264, 78, 30, 26);
		panel_8.add(label_64);
		
		JLabel lblYes_3 = new JLabel("Yes");
		lblYes_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_3.setBounds(544, 80, 30, 26);
		panel_8.add(lblYes_3);
		
		
		
		JPanel panel = new JPanel();
		tabbedPane_2.addTab("Other Generated", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(-15, 0, 1566, 683);
		panel.add(panel_1);
		
		JLabel OtherGen1 = new JLabel("Other Gen 1");
		OtherGen1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		OtherGen1.setBounds(81, 16, 183, 46);
		panel_1.add(OtherGen1);
		
		OtherGen1Analysis = new JTextField();
		OtherGen1Analysis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen1Analysis.setText("");
		OtherGen1Analysis.setColumns(10);
		OtherGen1Analysis.setBounds(247, 31, 297, 26);
		panel_1.add(OtherGen1Analysis);
		
		Gen1Entropy = new JTextField();
		Gen1Entropy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gen1Entropy.setText("");
		Gen1Entropy.setColumns(10);
		Gen1Entropy.setBounds(903, 16, 297, 26);
		panel_1.add(Gen1Entropy);
		
		Gen1Crack1 = new JTextField();
		Gen1Crack1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gen1Crack1.setText("");
		Gen1Crack1.setColumns(10);
		Gen1Crack1.setBounds(903, 59, 297, 26);
		panel_1.add(Gen1Crack1);
		
		Gen1Crack2 = new JTextField();
		Gen1Crack2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gen1Crack2.setText("");
		Gen1Crack2.setColumns(10);
		Gen1Crack2.setBounds(903, 96, 297, 26);
		panel_1.add(Gen1Crack2);
		
		Gen1Adv = new JTextField();
		Gen1Adv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gen1Adv.setText("");
		Gen1Adv.setColumns(10);
		Gen1Adv.setBounds(903, 125, 297, 26);
		panel_1.add(Gen1Adv);
		
		Gen1Dis = new JTextField();
		Gen1Dis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Gen1Dis.setText("");
		Gen1Dis.setColumns(10);
		Gen1Dis.setBounds(903, 162, 297, 26);
		panel_1.add(Gen1Dis);
		
		JLabel label_5 = new JLabel("Entropy");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_5.setBounds(671, 3, 128, 43);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Time to Crack");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_6.setBounds(671, 59, 192, 23);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Time to Crack");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_7.setBounds(671, 83, 183, 43);
		panel_1.add(label_7);
		
		JLabel label_9 = new JLabel("Advantages");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_9.setBounds(671, 110, 192, 46);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Disadvantages");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_10.setBounds(671, 144, 192, 52);
		panel_1.add(label_10);
		
		JPanel OtherGen1Graph = new JPanel();
		OtherGen1Graph.setBounds(81, 97, 497, 204);
		panel_1.add(OtherGen1Graph);
		OtherGen1Graph.setLayout(new BorderLayout(0, 0));
		
		JPanel OtherGen2Graph = new JPanel();
		OtherGen2Graph.setBounds(81, 372, 497, 204);
		panel_1.add(OtherGen2Graph);
		OtherGen2Graph.setLayout(new BorderLayout(0, 0));
		
		JButton button_10 = new JButton("Generate");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OtherGen1Analysis.setText(lblPwd.getText());
				Anaylsis gen1 = new Anaylsis();
				Gen1Entropy.setText(gen1.Entropy(OtherGen1Analysis.getText()));
				Gen1Crack1.setText(gen1.Crack1(OtherGen1Analysis.getText()));
				Gen1Crack2.setText(gen1.Crack2(OtherGen1Analysis.getText()));
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				String cr1 = Gen1Crack1.getText();
				String[] c1 = cr1.split(" ");
				int cone = Integer.parseInt(c1[0]);
				String cr2 = Gen1Crack2.getText();
				String[] c2 = cr2.split(" ");
				int ctwo = Integer.parseInt(c2[0]);
				
				dataset.setValue(cone, "", "ONLINE_THROTTLED");
				dataset.setValue(ctwo, "", "OFFLINE_BCRYPT_12");
				
				JFreeChart chart = ChartFactory.createBarChart("", "", "", dataset);
				CategoryPlot catPlot = chart.getCategoryPlot();
				catPlot.setRangeGridlinePaint(Color.black);
				
				ChartPanel chartPanel = new ChartPanel(chart);
				OtherGen1Graph.removeAll();
				OtherGen1Graph.add(chartPanel, BorderLayout.CENTER);
				OtherGen1Graph.validate();

				
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_10.setBounds(1329, 207, 172, 29);
		panel_1.add(button_10);
		
		JLabel OtherGen2 = new JLabel("Other Gen 2");
		OtherGen2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		OtherGen2.setBounds(81, 303, 183, 46);
		panel_1.add(OtherGen2);
		
		OtherGen2Analysis = new JTextField();
		OtherGen2Analysis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen2Analysis.setText("");
		OtherGen2Analysis.setColumns(10);
		OtherGen2Analysis.setBounds(247, 317, 297, 26);
		panel_1.add(OtherGen2Analysis);
		
		OtherGen2Entropy = new JTextField();
		OtherGen2Entropy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen2Entropy.setText("");
		OtherGen2Entropy.setColumns(10);
		OtherGen2Entropy.setBounds(903, 330, 297, 26);
		panel_1.add(OtherGen2Entropy);
		
		JLabel label_12 = new JLabel("Time to Crack");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_12.setBounds(654, 369, 200, 26);
		panel_1.add(label_12);
		
		OtherGen2Crack1 = new JTextField();
		OtherGen2Crack1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen2Crack1.setText("");
		OtherGen2Crack1.setColumns(10);
		OtherGen2Crack1.setBounds(903, 374, 297, 26);
		panel_1.add(OtherGen2Crack1);
		
		OtherGen2Crack2 = new JTextField();
		OtherGen2Crack2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen2Crack2.setText("");
		OtherGen2Crack2.setColumns(10);
		OtherGen2Crack2.setBounds(903, 395, 297, 26);
		panel_1.add(OtherGen2Crack2);
		
		JLabel label_13 = new JLabel("Time to Crack");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_13.setBounds(653, 395, 206, 26);
		panel_1.add(label_13);
		
		OtherGen2Adv = new JTextField();
		OtherGen2Adv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen2Adv.setText("");
		OtherGen2Adv.setColumns(10);
		OtherGen2Adv.setBounds(903, 427, 297, 26);
		panel_1.add(OtherGen2Adv);
		
		JLabel label_15 = new JLabel("Advantages");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_15.setBounds(657, 424, 206, 26);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Disadvantages");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_16.setBounds(657, 456, 206, 35);
		panel_1.add(label_16);
		
		OtherGen2Dis = new JTextField();
		OtherGen2Dis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		OtherGen2Dis.setText("");
		OtherGen2Dis.setColumns(10);
		OtherGen2Dis.setBounds(903, 465, 297, 26);
		panel_1.add(OtherGen2Dis);
		
		JButton button_11 = new JButton("Generate");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OtherGen2Analysis.setText(lblWord.getText());
				Anaylsis gen2 = new Anaylsis();
				OtherGen2Entropy.setText(gen2.Entropy(OtherGen2Analysis.getText()));
				OtherGen2Crack1.setText(gen2.Crack1(OtherGen2Analysis.getText()));
				OtherGen2Crack2.setText(gen2.Crack2(OtherGen2Analysis.getText()));
				
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				String cr1 = OtherGen2Crack1.getText();
				String[] c1 = cr1.split(" ");
				int cone = Integer.parseInt(c1[0]);
				String cr2 = OtherGen2Crack2.getText();
				String[] c2 = cr2.split(" ");
				int ctwo = Integer.parseInt(c2[0]);
				
				dataset.setValue(cone, "", "ONLINE_THROTTLED");
				dataset.setValue(ctwo, "", "OFFLINE_BCRYPT_12");
				
				JFreeChart chart = ChartFactory.createBarChart("", "", "", dataset);
				CategoryPlot catPlot = chart.getCategoryPlot();
				catPlot.setRangeGridlinePaint(Color.black);
				
				ChartPanel chartPanel = new ChartPanel(chart);
				OtherGen2Graph.removeAll();
				OtherGen2Graph.add(chartPanel, BorderLayout.CENTER);
				OtherGen2Graph.validate();
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_11.setBounds(1329, 534, 172, 29);
		panel_1.add(button_11);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(610, 201, 652, 128);
		panel_1.add(panel_9);
		
		JLabel label_66 = new JLabel("Relate to User");
		label_66.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_66.setBounds(15, 16, 172, 37);
		panel_9.add(label_66);
		
		JLabel label_67 = new JLabel("Mneomic Memorability");
		label_67.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_67.setBounds(15, 69, 240, 37);
		panel_9.add(label_67);
		
		JLabel label_68 = new JLabel("");
		label_68.setBounds(225, 16, 69, 20);
		panel_9.add(label_68);
		
		JLabel label_69 = new JLabel("Words included");
		label_69.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_69.setBounds(289, 16, 240, 37);
		panel_9.add(label_69);
		
		JLabel label_70 = new JLabel("Randomness Included");
		label_70.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_70.setBounds(289, 69, 240, 37);
		panel_9.add(label_70);
		
		JLabel label_71 = new JLabel("0");
		label_71.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_71.setBounds(198, 24, 30, 26);
		panel_9.add(label_71);
		
		JLabel lblYes_4 = new JLabel("Yes");
		lblYes_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_4.setBounds(544, 27, 30, 26);
		panel_9.add(lblYes_4);
		
		JLabel label_73 = new JLabel("0");
		label_73.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_73.setBounds(244, 80, 30, 26);
		panel_9.add(label_73);
		
		JLabel lblYes_5 = new JLabel("Yes");
		lblYes_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_5.setBounds(544, 80, 30, 26);
		panel_9.add(lblYes_5);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(610, 507, 652, 128);
		panel_1.add(panel_10);
		
		JLabel label_75 = new JLabel("Relate to User");
		label_75.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_75.setBounds(15, 16, 172, 37);
		panel_10.add(label_75);
		
		JLabel label_76 = new JLabel("Mneomic Memorability");
		label_76.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_76.setBounds(15, 69, 240, 37);
		panel_10.add(label_76);
		
		JLabel label_77 = new JLabel("");
		label_77.setBounds(225, 16, 69, 20);
		panel_10.add(label_77);
		
		JLabel label_78 = new JLabel("Words included");
		label_78.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_78.setBounds(289, 16, 240, 37);
		panel_10.add(label_78);
		
		JLabel label_79 = new JLabel("Randomness Included");
		label_79.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_79.setBounds(289, 69, 240, 37);
		panel_10.add(label_79);
		
		JLabel label_80 = new JLabel("3");
		label_80.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_80.setBounds(198, 24, 30, 26);
		panel_10.add(label_80);
		
		JLabel lblYes_6 = new JLabel("Yes");
		lblYes_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYes_6.setBounds(544, 27, 30, 26);
		panel_10.add(lblYes_6);
		
		JLabel label_82 = new JLabel("2");
		label_82.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_82.setBounds(244, 80, 30, 26);
		panel_10.add(label_82);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNo.setBounds(544, 80, 30, 26);
		panel_10.add(lblNo);
		
		JLabel label_11 = new JLabel("Entropy");
		label_11.setBounds(652, 331, 108, 35);
		panel_1.add(label_11);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 28));
		

		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("All passwords", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblHighestEntropy = new JLabel("Highest Entropy :");
		lblHighestEntropy.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHighestEntropy.setBounds(35, 35, 238, 42);
		panel_2.add(lblHighestEntropy);
		
		JLabel lblBestUserMemorability = new JLabel("Best User Memorability : ");
		lblBestUserMemorability.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBestUserMemorability.setBounds(35, 93, 270, 42);
		panel_2.add(lblBestUserMemorability);
		
		HighestEntropy = new JTextField();
		HighestEntropy.setBounds(330, 47, 496, 30);
		panel_2.add(HighestEntropy);
		HighestEntropy.setColumns(10);
		
		UserMem = new JTextField();
		UserMem.setColumns(10);
		UserMem.setBounds(330, 105, 496, 30);
		panel_2.add(UserMem);
		
		JButton button_12 = new JButton("Generate");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anaylsis entropy = new Anaylsis();
				String en = entropy.bestpass(RandomGenAnalysis.getText(), OtherGen2Analysis.getText(), OtherGen1Analysis.getText(), UserGenAnalysis.getText(), SentenceGenAnalysis.getText());
				HighestEntropy.setText(en);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_12.setBounds(935, 77, 172, 29);
		panel_2.add(button_12);
		
		
		
		
	
	}
}
