
import org.junit.Assert;
import org.junit.Test;

import ta2.Vector;
import ta2.Calculadora;
import ta2.Interpretador;
import ta2.Lector;

public class Pruebas {

	@Test
	public void probarSuma() {
		Calculadora c = new Calculadora();
		Assert.assertEquals(c.sumar(
				Integer.parseInt(Lector.leer("testSuma", "valor1")),
				Integer.parseInt(Lector.leer("testSuma", "valor2"))),
				Integer.parseInt(Lector.leer("testSuma", "esperado")));
	}

	@Test
	public void probarInterpretadorTexto(){
		Interpretador i = new Interpretador();
		Assert.assertEquals(i.interpretarNumero(
				Integer.parseInt(Lector.leer("testInterpretador", "numero"))),
				Lector.leer("testInterpretador", "esperado")
				);
	}

	@Test
	public void probarInterpretadorTextoDif(){
		Interpretador i = new Interpretador();
		Assert.assertNotEquals(i.interpretarNumero(
				Integer.parseInt(Lector.leer("testInterpretadorDif", "numero"))),
				Lector.leer("testInterpretadorDif", "esperado")
				);
	}
	
	@Test
	public void probarModuloVector(){
		Vector v = new Vector(
				Integer.parseInt(Lector.leer("testModuloVector", "x")) , 
				Integer.parseInt(Lector.leer("testModuloVector", "y"))
				);
		Assert.assertNotEquals(v.getModulo(),
				Integer.parseInt(Lector.leer("testModuloVector", "esperado")));
	}
	
	/*
	@Test
	public void probarInterpretadorNull(){
		Interpretador i = new Interpretador();
		Assert.assertNull( i.interpretarNumero(Integer.parseInt(Lector.leer("testInterpretadorNull", "valor"))) );
	}
*/
	@Test
	public void pruebaEsPar(){
		Calculadora c = new Calculadora();
		Assert.assertTrue( c.esPar(Integer.parseInt(Lector.leer("testPar", "valor"))));	
	}
	
	@Test
	public void pruebaListaPrimos(){
		Calculadora c = new Calculadora();		
		Assert.assertArrayEquals( c.getPrimosHasta(6) , new int[]{2,3,5});
	}
	
	@Test
	public void pruebaListaCoordsVector(){
		Vector v = new Vector( 120 , 1337 );		
		Assert.assertArrayEquals( v.coords() , new float[] { 120, 1337}, 0 );
	}


	@Test
	public void pruebaObjetoVectorClonado(){
		Vector v = new Vector(2,1);
		Vector v2 = new Vector(2,1);
		Assert.assertTrue(v.equals(v2));
		//Assert.assertEquals( v2 , v.copiar());
	}

	@Test
	public void pruebaObjeto2(){
		
		Vector v = new Vector( 3 , 4);
		Vector v2 = new Vector(6 , 8);
		Assert.assertTrue(v2.equals(v.cambiarMod(10)));
		//Assert.assertEquals( v2 ,v.cambiarMod(10));
	}
	
	@Test(expected=IllegalArgumentException.class) 
	public void pruebaExcepcion1(){
		Interpretador i = new Interpretador();
		i.interpretarNumero(123);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void pruebaExcepcion2(){
		Calculadora c = new Calculadora();
		c.dividir(2, 0);
	}
}