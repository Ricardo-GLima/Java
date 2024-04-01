import javax.swing.JOptionPane;

public class CalculadoraTeste {

    public static void main(String[] args) {

        boolean teste = true;
        while (teste) {
            try {
                Calculadora cas = new Calculadora(
                    Double.parseDouble(JOptionPane.showInputDialog("Digite seu numero preferido: ")));
                String ac = JOptionPane.showInputDialog("Digite a operação: ");
                switch (ac) {
                    case "soma":
                        double resultSoma = cas.Calc(
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro numero: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo numero: ")));
                        JOptionPane.showMessageDialog(null, resultSoma);
                        teste = false;

                        break;
                    case "sub":
                        double resultSub = cas.Sub(
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro numero: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo numero: ")));
                        JOptionPane.showMessageDialog(null, resultSub);
                        teste = false;

                        break;
                    case "somap":
                        System.out.println(cas.CalcPreferido(
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Digite um numero para somar com o preferido: "))));
                        teste = false;

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Erro");
                        teste = false;
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números!!");
            }

        }

    }
}