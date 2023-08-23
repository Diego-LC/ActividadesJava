import java.util.Collections;
import java.util.Arrays;
public class MagicScuare {
    public static void crear_cuadrado(){
        Integer[] lista_numeros = new Integer[9];
        for (int i = 0; i < lista_numeros.length; i++) {
            lista_numeros[i] = i+1;
        }
        Collections.shuffle(Arrays.asList(lista_numeros));
        int[][] cuadrado = new int[3][3];
        int contador = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                cuadrado[i][j] = lista_numeros[contador];
                contador++;
            }
        }
        imprimir(cuadrado);
    }
    public static void main(String[] args) {
        crear_cuadrado();
    }
    public static void imprimir(int[][] cuadrado){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
        isMagicScuare(cuadrado);
    }
    public static void isMagicScuare(int[][] scuare){
        boolean isMagic = true;
        for (int i = 0; i < scuare.length; i++){
            if (scuare[i][0] + scuare[i][1] + scuare[i][2] != 15){
                isMagic = false;
            }
            if (scuare[0][i] + scuare[1][i] + scuare[2][i] != 15){
                isMagic = false;
            }
            if (scuare[0][0] + scuare[1][1] + scuare[2][2] != 15){
                isMagic = false;
            }
            if (scuare[0][2] + scuare[1][1] + scuare[2][0] != 15){
                isMagic = false;
            }
        }
        if (isMagic){
            System.out.println("Es un cuadrado magico");
        }
        else{
            System.out.println("No es un cuadrado magico");
        }
    }
}
