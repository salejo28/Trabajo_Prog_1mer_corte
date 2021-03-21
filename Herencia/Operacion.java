/**
 * Operations
 */
public class Operacion {

    private double n1, n2, res;
    private char oper;
    private String message;

    public Operacion(double n1, double n2, char oper) {
        super();
        this.n1 = n1;
        this.n2 = n2;
        this.oper = oper;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String showMessageResult() {
        return this.message + this.res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String showResult() {
        return "El resultado de la operacion: " + this.n1 + this.oper + this.n2 + " es: " + this.res;
    }

}