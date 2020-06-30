package challenge;

public class CriptografiaTest {

    public static void main(String[] args) {
        
    	String TEXTO_CRIPTOGRAFADO = "d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr";
        String TEXTO_DESCRIPTOGRAFADO = "a ligeira raposa marrom saltou sobre o cachorro cansado";
        
        Criptografia criptografia1 = new CriptografiaCesariana();
       
        
        System.out.println(criptografia1.criptografar(null));
        System.out.println(criptografia1.criptografar(TEXTO_DESCRIPTOGRAFADO));
        System.out.println(criptografia1.descriptografar(TEXTO_CRIPTOGRAFADO));
        System.out.println(criptografia1.criptografar("sejam bem vindos ao Acelera Brasil 2019"));
        
        

    }
}
