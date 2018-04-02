package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calc.Calculator;

class CalculatorTest {

	
	@Test
	void testCalcR() {
		Calculator calculator = new Calculator();
		calculator.setX(8);//расход на 100км
		calculator.setY(100);//расстоояние
		float r = calculator.calcR();
		assertEquals(r, 8);//результат, который должен быть
	}

	@Test
	void testCalcS() {
		Calculator calculator = new Calculator();
		calculator.setZ(40);//стоимость за 1 литр
		float r = 8;//расход на указанное расстояние
		float s = calculator.calcS(r);
		assertEquals(s, 320);//результат, который должен быть
	}

}
