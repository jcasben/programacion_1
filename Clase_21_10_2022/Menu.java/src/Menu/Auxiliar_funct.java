package Menu;

public class Auxiliar_funct {

    LT in =  new LT();

    public Auxiliar_funct(){

    }
    
    //GETTER: funcion usada para hacer un seguimiento de lo introducido por teclado por el usuario y contar cuántos grupos de "las" hay.
    public String find_LAS(){

        Character letter = ' ', previous_letter = ' ', previous_letter2 = ' ';
        int counter = 0;

        System.out.println("Por favor, introduce carácteres y yo te diré cuantos grupos de 'las' has introducido.");

        while (letter != '.'){

            System.out.println("Introduce un carácter.");
            if ((previous_letter2 == 'l') && (previous_letter == 'a') && (letter == 's')){
                counter++;
            }

            previous_letter2 = previous_letter;
            previous_letter = letter;

            letter = in.llegirCaracter();
            while(letter ==  null){
                System.out.println("ERROR: lo que has introducido no es un carácter");
                letter = in.llegirCaracter();
            }
        }
        return "Has encontrado " + counter + " grupos de 'LAS'";
    }

    //GETTER: funcion usada para validar una entrada de usuario de un Integer. Hay que pasarle por parámetro la entrada que queremos validar de tipo Integer.
    public Integer integer_validation(Integer entry){
        entry = 0;
        entry = in.llegirSencer();

        while(entry ==  null){
            System.out.println("ERROR: lo que has introducido no es un número entero.");
            entry = in.llegirSencer();
        }

        return entry;
    }

    //GETTER: funcion usada para validar una entrada de usuario de un Character. Hay que pasarle por parámetro la entrada que queremos validarde tipo Character.
    public Character character_validation(Character entry){
        entry = 0;
        entry = in.llegirCaracter();

        while(entry ==  null){
            System.out.println("ERROR: lo que has introducido no es un carácter");
            entry = in.llegirCaracter();
        }

        return entry;
    }
}
