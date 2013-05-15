package agh.mownit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

import edu.uci.ics.jung.visualization.BasicVisualizationServer;

import java.awt.Color;

public class ResultFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JToggleButton SaveButton;
	private JFileChooser chooser;
	private JTextField textField_4;
	private JTextField textField_5;
	private JScrollPane scrollPane;
	private JToggleButton tglbtnDraw;

	public ResultFrame(String filePath) throws Exception {

		setTitle("hmhmhmm");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 691, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		this.getContentPane().setLayout(null);
		
		tglbtnDraw = new JToggleButton("Draw");
		tglbtnDraw.setBounds(511, 97, 121, 23);
		contentPane.add(tglbtnDraw);
		tglbtnDraw.setFont(new Font("Verdana", Font.PLAIN, 11));
		tglbtnDraw.addActionListener(this);

		chooser = new JFileChooser("C:\\Users\\Paulina\\Desktop");

		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("CosTuBedzie1");
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("CosTuBedzie1");
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setText("CosTuBedzie1");
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("CosTuBedzie1");
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setText("CosTuBedzie1");
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setText("CosTuBedzie1");
		textField_5.setColumns(10);

		JLabel CosTuBedzie = new JLabel("Cos tu bedzie:");
		CosTuBedzie.setFont(new Font("Verdana", Font.PLAIN, 12));

		JLabel CosTuBedzie1 = new JLabel("CosTuBedzie1:");
		CosTuBedzie1.setFont(new Font("Verdana", Font.PLAIN, 12));

		SaveButton = new JToggleButton("Zapisz tekst");
		SaveButton.addActionListener(this);

		scrollPane = new JScrollPane();

		JTextPane txtpnN = new JTextPane();

		txtpnN.getStyledDocument();
		Style normal = txtpnN.addStyle("normal", null);
		Style underlined = txtpnN.addStyle("underlined", normal);
		StyleConstants.setUnderline(underlined, true);

		txtpnN.setEditable(false);
		txtpnN.setFont(new Font("Arial", Font.PLAIN, 11));

	}

	public void actionPerformed(ActionEvent e) throws NullPointerException {
		if (e.getSource() == tglbtnDraw) {
			try {
				BasicVisualizationServer<Integer, String> vv = SimpleGraphView.setGraph("hm");
				GraphFrame drawing = new GraphFrame(vv);
				drawing.setVisible(true);
				// this.setVisible(false);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	}
}
