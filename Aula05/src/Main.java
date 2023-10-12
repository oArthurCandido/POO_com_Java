// Press Shift twice to open the Search Everywhere dialog and type
// `show
// whitespaces`,
// then press Enter. You can now see whitespace characters in your
// code.
public class Main {
    public static void main(String[] args) {
       Conta c1 = new Conta(1, "CC", "Jubileu");
       c1.abrir(300);
       System.out.println(c1.getSaldo());
       c1.fechar();
       System.out.println(c1.sacar(350));
       c1.fechar();
       c1.getSaldo();

        Conta c2 = new Conta(1, "CP", "Creuza");
        c2.abrir(500);
        System.out.println(c2.getSaldo());
        c2.fechar();
        System.out.println("Saldo após o pagmento da mensalidade " + c2.pagarMensal());
        System.out.println(c2.sacar(630));
        c2.fechar();
        c2.getSaldo();

    }
}