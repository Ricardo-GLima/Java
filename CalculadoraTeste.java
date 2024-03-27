import javax.swing.JOptionPane;

public class CalculadoraTeste {

    public static void main(String[]args){
        Calculadora cas = new Calculadora(
            Double.parseDouble(JOptionPane.showInputDialog("Digite seu numero preferido: ")));  

        double resultSoma = cas.Calc(5, 6);
        System.out.println(resultSoma);

        System.out.println(cas.CalcPreferido(
            Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para somar com o preferido: "))
        ));
    }
}