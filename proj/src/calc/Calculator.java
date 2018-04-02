package calc;

public class Calculator {
	private float x;
	private float y;
	private float z;
		
	public float calcR() {
		return  this.x/100*this.y;//расход на указанное расстояние
	}
	public float calcS(float r) {
		return r*this.z;//стоимость топлива
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	
}
