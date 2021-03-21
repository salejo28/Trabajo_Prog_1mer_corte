public class Mult extends Operacion {
    
    private double mult;

    public Mult(double n1, double n2) {
        super(n1, n2, '*');
        this.mult = n1*n2;
        this.setRes(this.mult);
    }

}
