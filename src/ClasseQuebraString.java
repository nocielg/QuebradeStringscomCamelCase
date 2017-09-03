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
	
	//Método que remove letras maiúsculas da string
	public String removeLetraMaiuscula(String string) {
		//Sting sendo transformada em um array de string
		String stringTransformada[] = string.split("[A-Z]");  
 		return Arrays.deepToString(stringTransformada);   
		
	}
	
	//Métoo que remove CamelCase das strings	
	public String removeCamelCase(String nome){
		List<String> lista = new ArrayList<>();
		String corrente = "";
		for(int i=0; i<nome.length(); i++){
			if(Character.isUpperCase(nome.charAt(i))){
				lista.add(corrente);
				corrente = "";
				corrente += Character.toLowerCase(nome.charAt(i)); }else{
				corrente += nome.charAt(i); }    }
		lista.add(corrente);
		return Arrays.toString(lista.toArray(new String[lista.size()]));
	}
	
	public String rejeitaStringsForaDoFormato(String nome) throws Exception{
		if (nome.matches("(^[\\d])(.*)"))
			throw new Exception("Erro: A string está começando com numero.");
		else if (nome.matches("((.*)\\p{Punct}(.*))"))
			throw new Exception("Erro: A string contém caracteres especiais.");
		else
			return removeCamelCase(nome);
	}
			
			
		
	

}
