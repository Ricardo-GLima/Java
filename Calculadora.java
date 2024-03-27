public class Calculadora {

    private double meuNumeroPreferido;

    public Calculadora(double meuNumeroPreferido){
        this.meuNumeroPreferido = meuNumeroPreferido;
    }
 
    public double Calc(double v1, double v2){
        return v1 + v2;
    }
    public double Sub(double v1, double v2){
        return v1 - v2;
    }
    public double CalcPreferido(double v1){
        return v1 + meuNumeroPreferido;
    }
}