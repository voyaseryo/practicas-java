

public class usaCirculo{


public static void main(String [] args){
    //Creamos los dos objetos de tipo Circulo
    Circulo circulo1 = new Circulo ();
    Circulo circulo2 = new Circulo ();
    int resultado;

    //rellenamos el contenido del objeto circulo 1
    circulo1.x = 4 ;
    circulo1.y = 3;
    circulo1.radio=5;
    resultado=circulo1.x * circulo1.y;
    System.out.println("El resultado de la operaion es "+resultado);



}
}
