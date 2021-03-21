public class MCM extends Operacion{

    double mcm;
    
    public MCM(double n1, double n2) {
        super(n1, n2, 'm');
        this.mcm = mcm(n1, n2);
        this.setMessage("El mcm("+n1+","+n2+") es: ");
        this.setRes(mcm);
    }

    public double mcm(double a, double b) {
        MCD obj = new MCD(a,b);
        return (a * b) / obj.mcd(a, b);
    }

}
