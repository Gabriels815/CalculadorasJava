package Principal;

/**
 *
 * @author Gabriel de Souza
 */
public class Funcoes {
    
    public int somaInt(int x, int y) {
        int resultado = 0;
        try {
            resultado = x + y;
            return resultado;
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage() + "\n");
        }
        return resultado;
    }
    
    public double somaDouble(double x, double y) {
        double resultado = 0;
        try {
            resultado = x + y;
            return resultado;
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage() + "\n");
        }
        return resultado;
    }
    
    public int subtraiInt(int x, int y) {
        int resultado = 0;
        try {
            resultado = x - y;
            return resultado;
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage() + "\n");
        }
        return resultado;
    }
    
    public double subtraiDouble(double x, double y) {
        double resultado = 0;
        try {
            resultado = x - y;
            return resultado;
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: " + e.getMessage() + "\n");
        }
        return resultado;
    }
    
    
}
