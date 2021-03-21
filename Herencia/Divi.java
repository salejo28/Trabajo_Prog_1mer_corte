public class Divi extends Operacion{
    
    private double divi;

    public Divi(double n1, double n2) {
        super(n1, n2, '/');
        this.divi = n1/n2;
        this.setRes(this.divi);
    }

}
