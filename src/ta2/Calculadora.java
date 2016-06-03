package ta2;

import java.util.ArrayList;

public class Calculadora {
	
	public int sumar(int a, int b){
		return a+b;
	}
	
	public int restar(int a, int b){
		return a-b;
	}
	
	public double dividir ( double a, double b){
		if(b == 0)
			throw new IllegalArgumentException();
		return a/b;
	}
	
	public boolean esPar(int n){
		return n%2==0;
	}
	
	public boolean esImpar(int n){
		return !(n%2==0);
	}
	
	public int[] getPrimosHasta(int n){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for(int i = 2 ; i<n ; i++){
			if(esPrimo(i))
				lista.add(new Integer(i));
		}
		
		int l [] = new int [ lista.size() ];
		for(int i = 0 ; i < lista.size(); i++){
			l[i] = lista.get( i );
		}
		return l;
	}
	
	public boolean esPrimo(int n){
		for(int i = 2 ; i<n ; i++){
			if (n%i==0)
				return false;
		}
		return true;
	}
	
	public int sumaDigitos ( int n){
		int a = n;
		int suma = 0;
		while( a != 0 ){
			suma += a%10;
			a /= 10;
		}
		return suma;
	}
	
	
}
