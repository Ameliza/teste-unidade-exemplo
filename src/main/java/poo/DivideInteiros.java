package poo;

public class DivideInteiros {

    /**
     * Este método faz a divisão de dois inteiros
     * @param a número 1
     * @param b número 2
     * @return a soma de dois números, a e b
     */

    public double divisao(int a, int b) {
        double resultado = 0;

        if(b == 0){
            return resultado;
        }
        else{
            resultado = (double)a/b;
        }


        return resultado;
    }
}