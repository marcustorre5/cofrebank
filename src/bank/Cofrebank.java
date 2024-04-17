package bank;

import java.util.ArrayList;

public class Cofrebank {

    private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

    void add(Moeda m){

        moedas.add(m);

    }

    public double calculartotal() {
        double total = 0;
        for(Moeda m : moedas){
            total += m.getValor();
        }
        return total;

    }
}
