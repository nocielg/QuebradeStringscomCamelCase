import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;


public class ClasseQuebraString {

	private String string;
		
	public String converterCamelCase(String string) {
		// TODO Auto-generated method stub
		String stringSemCamelCase = null;
		//convertendo String em caracter
		return string;
	}
/*
	public String[] deixandoStringComEspaco(String string) {
		//ArrayList<String> novaString = new ArrayList<String>();
		String[] novaString = {};
		//transformando a string do parametro em char
		//char[] stringTransformadaEmChar = string.toCharArray();
		for(int i = 0; i<string.length(); i++){
			//Se a string contém algum desses caracteres em maiúsculo
			if (string.matches("(?=[A-Z])")){ 
				novaString = string.split("(?=[A-Z])");
			}
		}
		
		return novaString;
	}
	*/
	
	public String removeLetraMaiuscula(String string) {
		//Sting sendo transformada em um array de string
		String stringTransformada[] = string.split("[A-Z]");  //("(?=\\p{Lu})") "[A-Z]"
 		return Arrays.deepToString(stringTransformada);   
		
	}
		
	/*
	public String quebrarStringTranformarEmArrayDeCaracter(String string){
		String testandoStringTransformadaEmArraydeCaracter = classequebraString.converterCamelCase("Nome");
		return stringTransformadaEmCaracter = null;
	}*/	
	
	//método Eduardo Guerra
		public String separaPorMaiusculas(String nome){
			List<String> lista = new ArrayList<>();
			String corrente = "";
			for(int i=0; i<nome.length(); i++){
				if(Character.isUpperCase(nome.charAt(i))){
					lista.add(corrente);
					corrente = "";
					corrente += Character.toLowerCase(nome.charAt(i));
					
				}else{
					corrente +=nome.charAt(i);
				}
			}
			lista.add(corrente);
			return Arrays.deepToString(lista.toArray(new String[lista.size()]));
			
		}
		
		
			
			
			
		
	

}
