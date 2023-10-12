// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
            Caneta c1 = new Caneta("Bic", 0.7f, false, "Vermelha");
            Caneta c2 = new Caneta();

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("O modelo é: "+ c1.getModelo() + " com a ponta " + c1.getPonta() + " está " + (c1.isTampada()? "tampada": "destampada"));
            c1.setTampada(true);
            System.out.println("O modelo é: "+ c1.getModelo()
                    + " com a ponta " + c1.getPonta()
                    + " da cor " + c1.getCor()
                    + " está " + (c1.isTampada()? "tampada": "destampada"));
        System.out.printf("O modelo é: %s com a ponta %s da cor %s está %s%n",
                c2.getModelo(),
                c2.getPonta(),
                c2.getCor(),
                c2.isTampada() ? "tampada" : "destampada");
    }
}