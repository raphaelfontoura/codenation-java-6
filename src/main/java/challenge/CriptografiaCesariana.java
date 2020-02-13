package challenge;

public class CriptografiaCesariana implements Criptografia {

    int code = 3;

    @Override
    public String criptografar(String texto) {
    	
    	if (texto == "")
    		throw new IllegalArgumentException();
    	if (texto.isEmpty())
    		throw new NullPointerException();
        //	throw new UnsupportedOperationException("esse method nao esta implementado aainda");

    	String result = "";
    	texto = texto.toLowerCase();
    	
        for (int i = 0; i < texto.length(); i++){
        	if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
        		result += ((char) (texto.charAt(i)+code));
        	} else {
        		result += texto.charAt(i);
        	}
            
        }
        
        
		return result;

       
    }

    @Override
    public String descriptografar(String texto) {
    	
    	if (texto == "")
    		throw new IllegalArgumentException();
    	if (texto.isEmpty())
    		throw new NullPointerException();
    	//	throw new UnsupportedOperationException("esse method nao esta implementado aainda");
        
    	String result = "";
    	texto = texto.toLowerCase();

    	 for (int i = 0; i < texto.length(); i++){
         	if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
         		result += ((char) (texto.charAt(i)-code));
         	} else {
         		result += texto.charAt(i);
         	}
             
         }
    	
    	
        
        return result;
    }
    

}
