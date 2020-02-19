
package calculadorafull;

    import javax.swing.JOptionPane; 

import javax.swing.JOptionPane;
public class Calculadorafull {

    public static void main(String[] args) {
 
        String pnumero = JOptionPane.showInputDialog("Digite primeiro número");
        String sinal = JOptionPane.showInputDialog("Deseja fazer o que? (+)soma (-)subtração (*)multipulicação (/)divisão");
        String snumero = JOptionPane.showInputDialog("Digite segundo número");
        
        int numero1 = Integer.parseInt(pnumero);
        int numero2 = Integer.parseInt(snumero);
        
        int soma= 0;
        String r= "";
        switch(sinal)
        {
            case "+":
                soma = numero1 + numero2;
                r= "soma";
                break;
            case "-":
                soma = numero1 - numero2;
                r= "subtração";
                break;
            case "*":
                soma = numero1 * numero2;
                r= "multiplicação";
                break;
            case "/":
                soma = numero1 / numero2;
                r= "divisão";
                break;
        }
         
        JOptionPane.showMessageDialog(null,"O resultado é "+soma,"De "+r+" dois numeros inteiros", JOptionPane.PLAIN_MESSAGE );
    }
    
}
