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
	public void testeInstanciaClasse() {
		classequebraString = new ClasseQuebraString();
	}
	
	
	@Test
	public void testeRemoveLetrasMaiusculas(){
		String stringSemEspaco = classequebraString.removeLetraMaiuscula("PedroAlves");   
		assertEquals("[, edro, lves]",stringSemEspaco);
	}
	
	
	
	@Test 
	public void teteRemoveCamelCase(){
		String teste = classequebraString.removeCamelCase("PedroAlves"); 
		assertEquals("[, pedro, alves]",teste);
		
	}
	
	
	@Test 
	public void testaStringSemLetraMaiuscula(){
		String teste = classequebraString.removeCamelCase("pedro"); 
		assertEquals("[pedro]",teste);
		
	}
	
	@Test 
	public void testaStringComMaiusculaSemNomeComposto(){
		String teste = classequebraString.removeCamelCase("Pedro"); 
		assertEquals("[, pedro]",teste);
		
	}
	
	@Test 
	public void testaStringComNumero(){
		String teste = classequebraString.removeCamelCase("Pedro1"); 
		assertEquals("[, pedro1]",teste);
		
	}
	
	@Test 
	public void testaStringCompostaComNumero(){
		String teste = classequebraString.removeCamelCase("Pedro1Alves"); 
		assertEquals("[, pedro1, alves]",teste);
		
	}
	
	@Test(expected=Exception.class)
	public void testaStringIniciandoComNumero() throws Exception{
		String teste = classequebraString.rejeitaStringsForaDoFormato("12Pedro");   
	}
	
	@Test(expected=Exception.class)
	public void testaStringComCaracteresEspeciais() throws Exception{
		String teste = classequebraString.rejeitaStringsForaDoFormato("Pe@d#ro");    
	}
}
