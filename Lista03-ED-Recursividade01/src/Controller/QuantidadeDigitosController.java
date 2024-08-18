package Controller;

public class QuantidadeDigitosController {

	public QuantidadeDigitosController() {
		super();
	}
	
	public int QuantidadeDigitos (int num) {
		
		//Condição de parada: Se o número for menor que 10, ele tem apenas 1 dígito.
		
		if (num < 10) {
			return 1;
		} else {
			// Soma o dígito atual à quantidade de dígitos do último número.
			return 1 + QuantidadeDigitos(num / 10);
		}
	}

}
