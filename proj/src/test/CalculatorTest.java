package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calc.Calculator;

class CalculatorTest {

	
	@Test
	void testCalcR() {
		Calculator calculator = new Calculator();
		calculator.setX(8);//������ �� 100��
		calculator.setY(100);//�����������
		float r = calculator.calcR();
		assertEquals(r, 8);//���������, ������� ������ ����
	}

	@Test
	void testCalcS() {
		Calculator calculator = new Calculator();
		calculator.setZ(40);//��������� �� 1 ����
		float r = 8;//������ �� ��������� ����������
		float s = calculator.calcS(r);
		assertEquals(s, 320);//���������, ������� ������ ����
	}

}
