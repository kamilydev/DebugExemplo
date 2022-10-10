
public class Calculadora {
	public float calcular(float a, float b, char operacao) {
		float resultado = 0;
		switch (operacao) {
		case '+': {
			resultado = a + b;

		}
		case '-': {
			resultado = a - b;

		}
		case '/': {
			resultado = a / b;
		}
		case '*': {
			resultado = a * b;

		}

		}
		return resultado;

	}
}
