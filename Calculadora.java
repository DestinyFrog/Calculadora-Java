import java.io.*;
import java.util.Arrays;
class Program {
    private static String table = 
    "----------------------------\n"+
    "|   Adição   |  +  | a + b |\n"+
    "| Subtração  |  -  | a - b |\n"+
    "|Mutiplicação|  *  | a * b |\n"+
    "|  Divisão   |  /  | a / b |\n"+
    "|Potenciação |  ^  | a ^ b |\n"+
    "----------------------------\n";
    public static void main(String[] args){
        Console cns = System.console();
        write("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        write(table);
        while(1 < 2){
            write("Insira a expressão:");
            String[] sent = calc(cns.readLine());
            double resp = Operate(Double.parseDouble(sent[0]),Double.parseDouble(sent[2]),sent[1]);
            write("A resposta é: "+resp);
            write("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            cns.readLine();
            write("Aperte 'Ctrl'+'C' para sair");
        }
    }

    private static String[] calc (String expr){
        var words = expr.split(" ");
        if(words.length < 3){
            write("Erro 201: Isso não é uma espressão aritmética aceitável");
            write("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.exit(0);
        }
        return words;
    }
    private static void write(String message){
        System.out.println(message);
    }
    private static double Operate(double a, double b, String ope){
        switch(ope){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                return -404;
        }
    }
}