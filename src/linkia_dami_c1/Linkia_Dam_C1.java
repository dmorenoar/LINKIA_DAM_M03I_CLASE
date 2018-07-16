/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c1;

/**
 *
 * @author DMORENOAR
 */
public class Linkia_Dam_C1 {

    public static void main(String[] args) {

        //Comentario en una línia
        
        /*  
        Comentario de más de una línia
        Hola
        ¿Qué tal?
        */
        
        /*Definición de variable
           La primera letra de la primera palábra en minúsucula
            y la segunda palábra en mayúscula
            numerodos -> NOOOOOO
            numeroDos -> SIIIIII
            nombreUsuarioEmail -> SIIII
            NOMBREUSUARIOEMAIL -> Nooo
            nombreusuarioemail -> Nooo
          Definición de clase
           Las primeras letras de cada palábra siempre en mayúsculas.
           LinkiaDamC1 -> Si
           PracticaNumeroDos ->Si
           AhorcadoJuego ->Si
           AhoRCadojuego ->No
        */
        
        //Definición de variables
        
        //variable del tipo int (Guarda números, sin decimales)
        int numeroUno = 0; 
        int numero = 4;
        int resultado, valor;
        
        //Variable del tipo booleano (Guarda valores true o false)
        boolean esVerdad; 
        boolean estado = true;
        boolean estadoDos = false;
        
        //Variable del tipo Char
        char letra;
        char letrita = 'A';
        
        
        //Variable String
        String palabra = "Hola que tal";
        String saludo = "Buenos días";
        
        //Variable double (guarda decimales)
        double decimal = 4.5;
        
        int valor1 = 5;
        int valor2 = 3;
        
        int resultadoSuma = 5 - 3;
        
        //Mostrar por pantalla un valor
        //Utilizamos el + para juntar una variable y un texto.
        System.out.println("Suma: " + resultadoSuma);
        
        resultadoSuma++; //Incrementamos 1 valor, es decir, sumamos 1
        
        //Incremento un valor a resultadoSuma y lo muestro
        System.out.println(resultadoSuma + " Valor sumado");
        
        resultadoSuma += 2; // Si
        //resultadoSuma = resultadoSuma + 2; //NOOOOO
        
        System.out.println("Modificado ->" + resultadoSuma);
        
       // resultadoSuma--; //Resto 1 valor a la variable
        
       //Compruebo si el resultadoSuma cumple que sea mayor a 8
        System.out.println("Es verdad que es más grande? " + (resultadoSuma > 8));
        
        System.out.println("Es verdad que es más pequeño? " + (resultadoSuma < 8));
        
        int prueba = 35;
        
        //Compruebo los operadores lógicos.
        //Operador AND -> Los dos deben ser verdaderos
        System.out.println((resultadoSuma > 3) && (prueba != 0));
        
        //Operador OR -> Con que solo uno sea verdadero es true
        System.out.println("Es prueba > 88 " + (prueba > 88));
        System.out.println("Es resultadoSuma > 3 " + (resultadoSuma >3));
        System.out.println((resultadoSuma > 3) || (prueba > 88));
    }  
}
