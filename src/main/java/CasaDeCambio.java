public class CasaDeCambio {

    public static String formula = "valorReais * cotacao";

    public static double calcularConversao(double valorReais, double cotacao){
        String expressao;
        expressao = formula.replace("valorReais", Double.toString(valorReais));
        expressao = expressao.replace("cotacao", Double.toString(cotacao));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
