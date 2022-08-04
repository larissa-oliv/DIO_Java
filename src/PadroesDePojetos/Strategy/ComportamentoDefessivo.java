package PadroesDePojetos.Strategy;

public class ComportamentoDefessivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
