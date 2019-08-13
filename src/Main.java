public class Main {
    public static void main(String[] args) {
        int a = 3;
        int valorMinimo =0;
        int valorMaximo =10;

        //operador y

       if( a>=valorMinimo && a <= valorMaximo)
        System.out.println(" dentro de rango");
       else
           System.out.println("fuera de rango");


       //operador or

        boolean vacaciones = false;
        boolean diaDescanso = false;


        if (vacaciones || diaDescanso)
            System.out.println("padre puede asistir al juego");
        else
            System.out.println("padre ocupado");

    }



}
