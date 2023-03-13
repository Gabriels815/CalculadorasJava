package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Souza
 */
public class Operações {
    
    protected int convertToInt(double numero) {
        int resultado = 0;
        try {
            resultado = (int) numero;
            return resultado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
    protected boolean isInt(double numero) {
        try {
            String numeroS = String.valueOf(numero);
            if (numeroS.contains(".0")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            
        }
        return false;
    }
    
    protected double somar(double numero1, double numero2) {
        double resultado = 0.0;
        try {
            resultado = numero1 + numero2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
    protected double subtrair(double numero1, double numero2) {
        double resultado = 0.0;
        try {
            resultado = numero1 - numero2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
    protected double dividir(double numero1, double numero2) {
        double resultado = 0.0;
        try {
            resultado = numero1 / numero2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
    protected double multiplicar(double numero1, double numero2) {
        double resultado = 0.0;
        try {
            resultado = numero1 * numero2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
    protected double expotenciar(double numero1, double numero2) {
        double resultado = 0.0;
        try {
            resultado = numero1 * (numero1 * numero2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
    protected double convertToDouble(String num) {
        double resultado = 0.0;
        try {
            resultado = Double.parseDouble(num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e,"Erro ao realizar operação!", 0);
        }
        return resultado;
    }
    
}
