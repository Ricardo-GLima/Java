import javax.swing.JOptionPane;

public class CalculadoraTeste {

    public static void main(String[]args){
        Calculadora cas = new Calculadora(
            Double.parseDouble(JOptionPane.showInputDialog("Digite seu numero preferido: ")));  
            String ac = JOptionPane.showInputDialog("Digite a operação: ");
            
            switch (ac) {
                case "soma":
                        double resultSoma = cas.Calc(5, 6);
                        System.out.println(resultSoma);
                    break;
                case "sub":
                        double resultSub = cas.Sub(15, 8);
                        System.out.println(resultSub);
                    break;
                case "somap":
                         System.out.println(cas.CalcPreferido(
                         Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para somar com o preferido: "))
                        ));
                    break;
                default:
                        System.out.println("Erro");
                    break;
            }         
    }
}