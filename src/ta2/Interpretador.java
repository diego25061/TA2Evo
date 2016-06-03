/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta2;

/**
 *
 * @author diego
 */
public class Interpretador {

	/**
	 * 
	 * @param n
	 * 	Valores de 0 a 9
	 * @return
	 */
	public String interpretarNumero(int n){
		switch (n){
		case 0:
			return "cero";
		case 2:
			return "dos";
		case 3:
			return "tres";
		case 4:
			return "cuatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "siete";
		case 8:
			return "ocho";
		case 9:
			return "nueve";
		default:
			throw new IllegalArgumentException();
		} 
	}
}
