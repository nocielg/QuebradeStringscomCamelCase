import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TesteQuebraStringCamelCase {

	ClasseQuebraString classequebraString;
	private String string;

	@Before
	public void teste() {
		classequebraString = new ClasseQuebraString();
	}
	/*
	por depois
	@Test
	public void testeAcessaMetodo(){
		classequebraString.converterCamelCase(string);
	}
	*/
	/*
	@Test
	public void testeAcessaMetodoPassandoString(){
		String testandoStringTransformadaEmArraydeCaracter = classequebraString.converterCamelCase("Nome");
	}	
	*/
	
	/*
	@Test
	public void testeStringTransformadaEmChar(){
		String resultado = classequebraString.quebrarStringTranformarEmArrayDeCaracter("nome");
		assertEquals('n''o''m''e',resultado);
		Assert.
	}*/
	
	
	@Test
	public void testandoStringComEspacos(){
		String stringSemEspaco = classequebraString.removeLetraMaiuscula("PedroAlves");   
		assertEquals("[, edro, lves]",stringSemEspaco);
	}
	
	
	
	@Test 
	public void tastaMetodoEduardo(){
		String teste = classequebraString.separaPorMaiusculas("PedroAlves");
		assertEquals("[, pedro, alves]",teste);
	}
	
	
}
