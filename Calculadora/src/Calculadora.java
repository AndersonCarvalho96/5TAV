public class Calculadora {
	
	public int somar(int a, int b) {
		
		return a + b;
	}
	
	public int sub(int a, int b) {
			
			return a - b;
		}
	public int mult(int a, int b) {
		
		return a * b;
		}
	public int div(int a, int b) {
		
		return a / b;
		}
	public float divF(float a, float b) {
		
		return a / b;
		}
	public double multD(double a, double b) {
		
		return a * b;
		}
	public double pow(double a, double b) {
		
		return Math.pow(a,b);
		}
	public double raizQ(double a) {
		
		return Math.sqrt(a);
	}
	public double raizCub(double a) {
		
		return Math.cbrt(a);
	}
	public float porcent(float a, float b) {
		
		return (a*100)/b;
	}
}
