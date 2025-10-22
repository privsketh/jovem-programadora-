
package jovemprogamadorajava;


public class NewClass2 {
    
    public static void main (String[]args){ 
        int numero1=37;
        int numero2=59;
        int multiplica;
        
        multiplica=multiplicaDoisNumeros(numero1,numero2);
        
        System.out.println("Resultado da soma:"+ multiplica);
        
        
    }
    
    public static int multiplicaDoisNumeros(int num1, int num2){
    int resultado;
    
    resultado = num1 + num2;
    return resultado;
    } 
}
