package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
	public JButton b1;
	public JLabel l1, l2, l3, l4, l5, l6;
	public JTextField t1, t2, t3;
	public Obr handler;
	
	public GUI () {
		super("������ ������� �������");//�������� ����
		this.setSize(300,250);//������ ����
		this.setResizable(false);//������ �� ��������� ������� ����
		this.setLocationRelativeTo(null);//���� �� �������� ������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ �������� ����
		setLayout(new FlowLayout());
		b1 = new JButton("                    ���������                    ");
		l1 = new JLabel("                    ������� ������:                    ");
		l2 = new JLabel("������ �� 100 ��:");
		l3 = new JLabel("����������:");
		l4 = new JLabel("��������� �������:");
		l5 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
				
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(b1);
		add(l5);
	}
}
	

