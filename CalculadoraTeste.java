public class CalculadoraTeste {

    public static void main(String[]args){
        Calculadora cas = new Calculadora(8);
        double resultSoma = cas.Calc(5, 6);
        System.out.println(resultSoma);

        System.out.println(cas.CalcPreferido(8));
    }
}