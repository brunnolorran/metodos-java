public class Main01 {
    public static void main(String[] args) {
        // calculadora
        Calculo.soma(4, 2);
        Calculo.subtrai(10, 2);
        Calculo.multiplica(10, 2);
        Calculo.divide(10, 2);

        // Date
        Date.obterHora(19);

        // Emprestimo
        Emprestimo.calcularEmprestimo(2000, 2);
        Emprestimo.calcularEmprestimo(2000, 3);
        Emprestimo.calcularEmprestimo(2000, 5);
        Emprestimo.calcularEmprestimo(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(2000, Emprestimo.getTresParcelas());

    }
}
