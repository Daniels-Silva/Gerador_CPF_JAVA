package Gerador_CPF;

import java.util.ArrayList;
import java.util.Random;

public class geraCPF {

    /*         GERADOR DE CPF			*/
	

	//Função que retorna o digito verificador
    public static int verificaDigito (int soma, int digito, int resto){
        resto = soma % 11;
 
        if(resto < 2){
            digito = 0;
        }else{
            digito = 11 - resto;
        }
        
        return digito;
    }


    public static void main(String args[]) {
    	
      ArrayList<Integer> resultados = new ArrayList<>();
      ArrayList<Integer> cpf = new ArrayList<>();
      int digito = 0, resto = 0, soma=0, result = 0, decremento = 10;
	  
      Random random = new Random();
      //Gerar 9 numeros inteiros e adicionar ao ArrayList CPF
      for(int i=0; i < 9;i++) {
    	  int number = random.nextInt(10);
    	  cpf.add(number); 
      }
      
      System.out.println("CPF SEM DIGITOS VERIFICADORES: " + cpf);
      
        //Calculo primeiro digito
        for (Integer i:cpf) {
            if(i <= 9){
                result = i * decremento;
                decremento--;
                resultados.add(result); 	
            }
        }
        
        for(Integer iN:resultados) {
    		soma += iN;
    	}
        
        //Chamando a função que retorna o digito verificador
        int digitoUm = verificaDigito(soma, digito, resto);
        System.out.println("O Primeiro digito do CPF é: " + digitoUm);
        
        cpf.add(digitoUm);

        
        // Calculo segundo digito
        resultados.clear();
        decremento = 11;
        soma = 0;
        
        for (int i:cpf) {
            if(i <= 9){
                result = i * decremento;
                decremento--;
                resultados.add(result);  	
            }
        }
        
        for(Integer iN:resultados) {
    		soma += iN;
    	}
     
        
         //Chamando a função que retorna o digito verificador
         int digitoDois = verificaDigito(soma, digito, resto);
         System.out.println("O Segundo digito do CPF é: " + digitoDois);
         cpf.add(digitoDois);
        
         System.out.println("O CPF GERADO É: " + cpf);
        

    	}
    
    }
