package characters_searcher;

public class characters_searcher {
    
    private void inicio(){
    
        Character letter = 's';
        LT in =  new LT();
        Boolean validation = false;
        
        while ((!validation) && (letter != '.')){
                        
            while(letter ==  null){
                System.out.println("ERROR: lo que has introducido no es una carácter");
                letter = in.llegirCaracter();
            }
            
            System.out.println("Introduce una letra");
            letter = in.llegirCaracter();
            while(letter ==  null){
                System.out.println("ERROR: lo que has introducido no es un carácter");
                letter = in.llegirCaracter();
            }
            
            if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')){
                validation = true;
            }
        }
        if (letter == '.'){
            System.out.println("No se han encontrado la letra a");
        }else{
            System.out.println("Se ha encontrado una vocal minúscula, la vocal '" + letter + "'");
        }        
    }
    public static void main(String[] args) {
        
        (new characters_searcher()).inicio();
    }   
}
