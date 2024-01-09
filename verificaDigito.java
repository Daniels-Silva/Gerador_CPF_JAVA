package Gerador_CPF;

public class verificaDigito {

		
		public static int verificaDigito (int soma, int digito, int resto){
	        resto = soma % 11;
	 
	        if(resto < 2){
	            digito = 0;
	        }else{
	            digito = 11 - resto;
	        }
	        
	        return digito;
	    }


	}
