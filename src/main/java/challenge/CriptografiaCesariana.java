package challenge;

public class CriptografiaCesariana implements Criptografia {

    int code = 3;

    @Override
    public String criptografar(String texto) {
    	
    	testaString(texto);

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
    	
    	testaString(texto);
        
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
    
    public void testaString(String text) {
    	
    	if (text == "")
    		throw new IllegalArgumentException();
    	if (text.isEmpty())
    		throw new NullPointerException();
    	
    }
    

}
