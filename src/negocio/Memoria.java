package negocio;

import java.util.ArrayList;

public class Memoria {

    public ArrayList<String> numeros = new ArrayList<>();

    public void setNumero(String numero) {
        numeros.add(numero);
    }

    public String resultado() {
        if (numeros.size() == 3) {
            double parte1 = Double.parseDouble(numeros.get(0));
            String operacao = numeros.get(1);
            double parte2 = Double.parseDouble(numeros.get(2));
        
            return Double.toString(calcular(parte1, operacao, parte2));
        }
        return "";
    }

    private double calcular(double parte1, String operacao, double parte2) {
        switch(operacao) {
            case "+": return parte1 + parte2;
            case "-": return parte1 - parte2;
            case "*": return parte1 * parte2;
            case "/": return (parte2 != 0) ? parte1 / parte2 : 0;
            default: return 0;
        }
    }
}
