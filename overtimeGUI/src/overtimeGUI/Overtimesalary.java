package overtimeGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Overtimesalary {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField textFieldempname;
	private JTextField textFieldhourlysalary;
	private JTextField textFieldMonday1;
	private JTextField textFieldTuesday1;
	private JTextField textFieldWednesday1;
	private JTextField textFieldThursday1;
	private JTextField textFieldFriday1;
	private JTextField textFieldMonday2;
	private JTextField textFieldTuesday2;
	private JTextField textFieldWednesday2;
	private JTextField textFieldThursday2;
	private JTextField textFieldFriday2;
	private JTextField textFieldSat2;
	private JTextField textFieldSat1;
	private JTextField textFieldSunday1;
	private JTextField textFieldSunday2;
	private JTextField textFieldnetpay;
	private JTextField textFieldreghours;
	private JTextField textFieldregamount;
	private JTextField textFieldoverhours;
	private JTextField textFieldoveramount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Overtimesalary window = new Overtimesalary();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Overtimesalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.getContentPane().setBackground(new Color(208, 201, 176));
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(93, 45, 117, 20);
		frmGeorgetownCleaningServices.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hourly Salary:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(440, 47, 117, 18);
		frmGeorgetownCleaningServices.getContentPane().add(lblNewLabel_2);
		
		textFieldempname = new JTextField();
		textFieldempname.setBounds(220, 48, 187, 19);
		frmGeorgetownCleaningServices.getContentPane().add(textFieldempname);
		textFieldempname.setColumns(10);
		
		textFieldhourlysalary = new JTextField();
		textFieldhourlysalary.setBounds(544, 48, 105, 19);
		frmGeorgetownCleaningServices.getContentPane().add(textFieldhourlysalary);
		textFieldhourlysalary.setColumns(10);
		
		JPanel panelTimeSheet = new JPanel();
		panelTimeSheet.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTimeSheet.setBackground(new Color(208, 201, 176));
		panelTimeSheet.setBounds(20, 134, 790, 117);
		frmGeorgetownCleaningServices.getContentPane().add(panelTimeSheet);
		GridBagLayout gbl_panelTimeSheet = new GridBagLayout();
		gbl_panelTimeSheet.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelTimeSheet.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panelTimeSheet.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelTimeSheet.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelTimeSheet.setLayout(gbl_panelTimeSheet);
		
		JLabel lblNewLabel_14 = new JLabel("Monday");
		lblNewLabel_14.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 1;
		gbc_lblNewLabel_14.gridy = 1;
		panelTimeSheet.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Tuesday");
		lblNewLabel_15.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 2;
		gbc_lblNewLabel_15.gridy = 1;
		panelTimeSheet.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Wednesday");
		lblNewLabel_16.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 3;
		gbc_lblNewLabel_16.gridy = 1;
		panelTimeSheet.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Thursday");
		lblNewLabel_17.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 4;
		gbc_lblNewLabel_17.gridy = 1;
		panelTimeSheet.add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Friday");
		lblNewLabel_18.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 5;
		gbc_lblNewLabel_18.gridy = 1;
		panelTimeSheet.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Saturday");
		lblNewLabel_19.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 6;
		gbc_lblNewLabel_19.gridy = 1;
		panelTimeSheet.add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		JLabel lblNewLabel_13 = new JLabel("Sunday");
		lblNewLabel_13.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_13.gridx = 7;
		gbc_lblNewLabel_13.gridy = 1;
		panelTimeSheet.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JLabel lblNewLabel_20 = new JLabel("First Week:");
		lblNewLabel_20.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 0;
		gbc_lblNewLabel_20.gridy = 2;
		panelTimeSheet.add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		textFieldMonday1 = new JTextField();
		GridBagConstraints gbc_textFieldMonday1 = new GridBagConstraints();
		gbc_textFieldMonday1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMonday1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMonday1.gridx = 1;
		gbc_textFieldMonday1.gridy = 2;
		panelTimeSheet.add(textFieldMonday1, gbc_textFieldMonday1);
		textFieldMonday1.setColumns(10);
		
		textFieldTuesday1 = new JTextField();
		GridBagConstraints gbc_textFieldTuesday1 = new GridBagConstraints();
		gbc_textFieldTuesday1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTuesday1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTuesday1.gridx = 2;
		gbc_textFieldTuesday1.gridy = 2;
		panelTimeSheet.add(textFieldTuesday1, gbc_textFieldTuesday1);
		textFieldTuesday1.setColumns(10);
		
		textFieldWednesday1 = new JTextField();
		GridBagConstraints gbc_textFieldWednesday1 = new GridBagConstraints();
		gbc_textFieldWednesday1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldWednesday1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldWednesday1.gridx = 3;
		gbc_textFieldWednesday1.gridy = 2;
		panelTimeSheet.add(textFieldWednesday1, gbc_textFieldWednesday1);
		textFieldWednesday1.setColumns(10);
		
		textFieldThursday1 = new JTextField();
		GridBagConstraints gbc_textFieldThursday1 = new GridBagConstraints();
		gbc_textFieldThursday1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldThursday1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldThursday1.gridx = 4;
		gbc_textFieldThursday1.gridy = 2;
		panelTimeSheet.add(textFieldThursday1, gbc_textFieldThursday1);
		textFieldThursday1.setColumns(10);
		
		textFieldFriday1 = new JTextField();
		GridBagConstraints gbc_textFieldFriday1 = new GridBagConstraints();
		gbc_textFieldFriday1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFriday1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFriday1.gridx = 5;
		gbc_textFieldFriday1.gridy = 2;
		panelTimeSheet.add(textFieldFriday1, gbc_textFieldFriday1);
		textFieldFriday1.setColumns(10);
		
		textFieldSat1 = new JTextField();
		GridBagConstraints gbc_textFieldSat1 = new GridBagConstraints();
		gbc_textFieldSat1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldSat1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSat1.gridx = 6;
		gbc_textFieldSat1.gridy = 2;
		panelTimeSheet.add(textFieldSat1, gbc_textFieldSat1);
		textFieldSat1.setColumns(10);
		
		textFieldSunday1 = new JTextField();
		GridBagConstraints gbc_textFieldSunday1 = new GridBagConstraints();
		gbc_textFieldSunday1.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldSunday1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSunday1.gridx = 7;
		gbc_textFieldSunday1.gridy = 2;
		panelTimeSheet.add(textFieldSunday1, gbc_textFieldSunday1);
		textFieldSunday1.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Second Week:");
		lblNewLabel_21.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_21.gridx = 0;
		gbc_lblNewLabel_21.gridy = 3;
		panelTimeSheet.add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		textFieldMonday2 = new JTextField();
		GridBagConstraints gbc_textFieldMonday2 = new GridBagConstraints();
		gbc_textFieldMonday2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldMonday2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMonday2.gridx = 1;
		gbc_textFieldMonday2.gridy = 3;
		panelTimeSheet.add(textFieldMonday2, gbc_textFieldMonday2);
		textFieldMonday2.setColumns(10);
		
		textFieldTuesday2 = new JTextField();
		GridBagConstraints gbc_textFieldTuesday2 = new GridBagConstraints();
		gbc_textFieldTuesday2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldTuesday2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTuesday2.gridx = 2;
		gbc_textFieldTuesday2.gridy = 3;
		panelTimeSheet.add(textFieldTuesday2, gbc_textFieldTuesday2);
		textFieldTuesday2.setColumns(10);
		
		textFieldWednesday2 = new JTextField();
		GridBagConstraints gbc_textFieldWednesday2 = new GridBagConstraints();
		gbc_textFieldWednesday2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldWednesday2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldWednesday2.gridx = 3;
		gbc_textFieldWednesday2.gridy = 3;
		panelTimeSheet.add(textFieldWednesday2, gbc_textFieldWednesday2);
		textFieldWednesday2.setColumns(10);
		
		textFieldThursday2 = new JTextField();
		GridBagConstraints gbc_textFieldThursday2 = new GridBagConstraints();
		gbc_textFieldThursday2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldThursday2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldThursday2.gridx = 4;
		gbc_textFieldThursday2.gridy = 3;
		panelTimeSheet.add(textFieldThursday2, gbc_textFieldThursday2);
		textFieldThursday2.setColumns(10);
		
		textFieldFriday2 = new JTextField();
		GridBagConstraints gbc_textFieldFriday2 = new GridBagConstraints();
		gbc_textFieldFriday2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldFriday2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFriday2.gridx = 5;
		gbc_textFieldFriday2.gridy = 3;
		panelTimeSheet.add(textFieldFriday2, gbc_textFieldFriday2);
		textFieldFriday2.setColumns(10);
		
		textFieldSat2 = new JTextField();
		GridBagConstraints gbc_textFieldSat2 = new GridBagConstraints();
		gbc_textFieldSat2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldSat2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSat2.gridx = 6;
		gbc_textFieldSat2.gridy = 3;
		panelTimeSheet.add(textFieldSat2, gbc_textFieldSat2);
		textFieldSat2.setColumns(10);
		
		textFieldSunday2 = new JTextField();
		GridBagConstraints gbc_textFieldSunday2 = new GridBagConstraints();
		gbc_textFieldSunday2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSunday2.gridx = 7;
		gbc_textFieldSunday2.gridy = 3;
		panelTimeSheet.add(textFieldSunday2, gbc_textFieldSunday2);
		textFieldSunday2.setColumns(10);
		
		JButton btnProcessIt = new JButton("Process It");
		btnProcessIt.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnProcessIt.setBackground(new Color(208, 201, 176));
		btnProcessIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String empname= textFieldempname.getText();
			double hourlysal=Integer.parseInt(textFieldhourlysalary.getText());
			hourlysal=Math.round(hourlysal);
			double mon1,tue1,wed1,thur1,fri1,sat1,sun1,mon2,tue2,wed2,thur2,fri2,sat2,sun2;
	        mon1=Integer.parseInt(textFieldMonday1.getText());
			tue1=Integer.parseInt(textFieldTuesday1.getText());
			wed1=Integer.parseInt(textFieldWednesday1.getText());
			thur1=Integer.parseInt(textFieldThursday1.getText());
			fri1=Integer.parseInt(textFieldFriday1.getText());
			sat1=Integer.parseInt(textFieldSat1.getText());
			sun1=Integer.parseInt(textFieldSunday1.getText());
			mon2=Integer.parseInt(textFieldMonday2.getText());
			tue2=Integer.parseInt(textFieldTuesday2.getText());
			wed2=Integer.parseInt(textFieldWednesday2.getText());
			thur2=Integer.parseInt(textFieldThursday2.getText());
			fri2=Integer.parseInt(textFieldFriday2.getText());
			sat2=Integer.parseInt(textFieldSat2.getText());
			sun2=Integer.parseInt(textFieldSunday2.getText());
			double days[]= {mon1,tue1,wed1,thur1,fri1,sat1,sun1,mon2,tue2,wed2,thur2,fri2,sat2,sun2};
			double regular=0;
			double overtime=0;
			for(int i=0;i<=14;i++) {
				if(days[i]<8) {
					regular+=days[i];
				}else {
					regular+=8;
					overtime+=days[i]-8;
				}
			}
			double amount=regular*hourlysal;
			double overamount=overtime*27.28;
			double netpay=amount+overamount;
			textFieldreghours.setText(String.valueOf(regular));
			textFieldregamount.setText(String.valueOf(amount));
			textFieldoverhours.setText(String.valueOf(overtime));
			textFieldoveramount.setText(String.valueOf(overamount));
			textFieldnetpay.setText(String.valueOf(netpay));			}
		});
		btnProcessIt.setBounds(37, 355, 96, 79);
		frmGeorgetownCleaningServices.getContentPane().add(btnProcessIt);
		
		JLabel lblNewLabel_5 = new JLabel("Net Pay:");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(534, 365, 55, 20);
		frmGeorgetownCleaningServices.getContentPane().add(lblNewLabel_5);
		
		textFieldnetpay = new JTextField();
		textFieldnetpay.setEditable(false);
		textFieldnetpay.setBounds(599, 367, 96, 19);
		frmGeorgetownCleaningServices.getContentPane().add(textFieldnetpay);
		textFieldnetpay.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(new Color(0, 0, 0));
		btnClose.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnClose.setBackground(new Color(208, 201, 176));
		btnClose.setBounds(705, 355, 87, 79);
		frmGeorgetownCleaningServices.getContentPane().add(btnClose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(208, 201, 176));
		panel_1.setBounds(155, 334, 369, 117);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_8 = new JLabel("Hours");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 1;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Amount");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_9.gridx = 2;
		gbc_lblNewLabel_9.gridy = 1;
		panel_1.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_6 = new JLabel("Regular:");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 2;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textFieldreghours = new JTextField();
		textFieldreghours.setEditable(false);
		GridBagConstraints gbc_textFieldreghours = new GridBagConstraints();
		gbc_textFieldreghours.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldreghours.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldreghours.gridx = 1;
		gbc_textFieldreghours.gridy = 2;
		panel_1.add(textFieldreghours, gbc_textFieldreghours);
		textFieldreghours.setColumns(10);
		
		textFieldregamount = new JTextField();
		textFieldregamount.setEditable(false);
		GridBagConstraints gbc_textFieldregamount = new GridBagConstraints();
		gbc_textFieldregamount.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldregamount.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldregamount.gridx = 2;
		gbc_textFieldregamount.gridy = 2;
		panel_1.add(textFieldregamount, gbc_textFieldregamount);
		textFieldregamount.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Overtime:");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 3;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textFieldoverhours = new JTextField();
		textFieldoverhours.setEditable(false);
		GridBagConstraints gbc_textFieldoverhours = new GridBagConstraints();
		gbc_textFieldoverhours.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldoverhours.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldoverhours.gridx = 1;
		gbc_textFieldoverhours.gridy = 3;
		panel_1.add(textFieldoverhours, gbc_textFieldoverhours);
		textFieldoverhours.setColumns(10);
		
		textFieldoveramount = new JTextField();
		textFieldoveramount.setEditable(false);
		GridBagConstraints gbc_textFieldoveramount = new GridBagConstraints();
		gbc_textFieldoveramount.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldoveramount.gridx = 2;
		gbc_textFieldoveramount.gridy = 3;
		panel_1.add(textFieldoveramount, gbc_textFieldoveramount);
		textFieldoveramount.setColumns(10);
		
		JPanel panelPayrollP = new JPanel();
		panelPayrollP.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPayrollP.setBackground(new Color(208, 201, 176));
		panelPayrollP.setBounds(20, 310, 790, 141);
		frmGeorgetownCleaningServices.getContentPane().add(panelPayrollP);
		
	
		JPanel panelEmp_Id = new JPanel();
		panelEmp_Id.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEmp_Id.setBackground(new Color(208, 201, 176));
		panelEmp_Id.setBounds(20, 10, 790, 93);
		frmGeorgetownCleaningServices.getContentPane().add(panelEmp_Id);
		frmGeorgetownCleaningServices.setForeground(new Color(255, 255, 255));
		frmGeorgetownCleaningServices.setFont(new Font("Arial", Font.PLAIN, 18));
		frmGeorgetownCleaningServices.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frmGeorgetownCleaningServices.setBackground(new Color(0, 0, 255));
		frmGeorgetownCleaningServices.setBounds(100, 100, 863, 509);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
