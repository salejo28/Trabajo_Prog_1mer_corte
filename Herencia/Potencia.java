public class Potencia extends Operacion{
    
    double res;

    public Potencia(double n1, double n2) {
        super(n1, n2, '^');
        this.res = Math.pow(n1, n2);
        this.setRes(this.res);
    }

}
