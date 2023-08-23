import java.util.Random;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        respuestas();
    }

    public static void respuestas(){
        Random random = new Random();
        int filas = random.nextInt(200);
        int columnas = 2;
        char [][] valores = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j == 0){
                    valores[i][j] = genero().charAt(0);
                }else{
                    valores[i][j] = respuesta().charAt(0);
                }
            }
        }
        imprimir(valores);
    }

    public static void imprimir(char[][] valores){
        int hombres = 0;
        int  mujeres= 0;
        int total_aprueban = 0;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                if (j == 0){
                    if (valores[i][j] == 'm' && valores[i][j+1] == 's'){
                        hombres++;
                    }else if (valores[i][j] == 'f' && valores[i][j+1] == 's'){
                        mujeres++;
                    }
                    if (valores[i][j+1] == 's'){
                        total_aprueban++;
                    }
                }
            }
        }
        double porcentaje = (double) total_aprueban/valores.length*100;
        System.out.println("Total de hombres que aprobaron: " + hombres);
        System.out.println("Total de mujeres que aprobaron: " + mujeres);
        System.out.println("Porcentaje de personas que aprobaron: " + porcentaje + "%");
        System.out.println("Total de personas que participaron: " + (valores.length));
    }

    public static String genero(){
        Random random = new Random();
        String[] genero = {"m","f"};
        // elegir un genero aleatorio
        int generoAleatorio = random.nextInt(2);
        return genero[generoAleatorio];
    }

    public static String respuesta(){
        Random random = new Random();
        String[] respuestas = {"s","n","x"};
        // elegir una respuesta aleatoria
        int respuestaAleatoria = random.nextInt(3);
        return respuestas[respuestaAleatoria];
    }
}
