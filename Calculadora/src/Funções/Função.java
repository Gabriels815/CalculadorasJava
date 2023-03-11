package Funções;

/**
 *
 * @author Gabriel de Souza
 */
public class Função {
    
    private int transInt(double numero) {
        int numeroInt = (int) numero;
        return numeroInt;
    }
    
    private boolean isInt(double numero) {
        String numeroS = String.valueOf(numero);
        if (numeroS.contains(".0")) {
            return true;
        } else {
            return false;
        }
    }
    
    private double soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }
    
    private double subt(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }
    
    private double divs(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        return resultado;
    }
    
    private double mult(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }
    
    private double convertToDouble(String num) {
        double numero = Double.valueOf(num);
        return numero;
    }
    
}
