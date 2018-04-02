package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Obr implements ActionListener{
	GUI gui;

	public void actionPerformed(ActionEvent o) {
		float x, y, z, r, s;
		String a;
		Calculator calculator = new Calculator();
		try {
			x = Float.parseFloat(gui.t1.getText());
			y = Float.parseFloat(gui.t2.getText());
			z = Float.parseFloat(gui.t3.getText());
			calculator.setX(x);
			calculator.setY(y);
			calculator.setZ(z);
			r = calculator.calcR();
			s = calculator.calcS(r);
			a = "������ ������� �� " + y + " ��. ����� " + Math.round(r) + " �. �� " + Math.round(s) + " �.";//����� ����������
			gui.l5.setText(a);//����� ����������
		} catch(NumberFormatException e) {
			gui.l5.setText("�� ��������� ������� ��������");
		}
		
	}
	
}

