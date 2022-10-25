package Menu;

public class Menu {

    private void Start(){
        LT in = new LT();
        Boolean exit = false;
        Integer option = 0;
        int option_a,option_b;
        Auxiliar_funct funct = new Auxiliar_funct();
        option_a = option_b = 0;

        while (exit == false){

            System.out.println("Por favor, introduce que quieres hacer: \n1.Opcion A\n2.Opcion B\n3.Salir");
            option = funct.integer_validation(option);

            switch(option){

                case 1:
                    option_a++;
                    break;
                case 2:
                    option_b++;
                    break;
                case 3:
                    exit = true;
                    break;

                default:

                    break;
                   
            }
        }
        System.out.println("Has entrado " + option_a + " veces en la opcion A y " + option_b
        + " veces en la opcion B");
    }

    public static void main(String[] args) {
       
        (new Menu()).Start();
    }
}
