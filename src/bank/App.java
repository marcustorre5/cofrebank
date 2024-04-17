package bank;

public class App {
    public static void main(String[] args) {

        Cofrebank c = new Cofrebank();

        c.add(new Moeda("EURO", 0.59));
        c.add(new Moeda("DOLLAR", 0.23));
        c.add(new Moeda("LIBRA", 0.625));
        c.add(new Moeda("YUAN", 0.0075));

        System.out.printf("O total no cofre é: %.2f\n", c.calculartotal());

    }


}

