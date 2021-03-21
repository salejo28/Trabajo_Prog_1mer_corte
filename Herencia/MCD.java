public class MCD extends Operacion{
    double mcd, r;

    public MCD(double n1, double n2) {
        super(n1, n2, 'M');
        this.mcd = mcd(n1, n2);
        this.setMessage("El MCD("+n1+","+n2+") es: ");
        this.setRes(this.mcd);
    }

    public double mcd(double n1, double  n2) {
       
        if (n1==n2) {
            return r = n1;
        } else if(n1>n2) {
            return r = mcd(n1 - n2, n2);
        } else if (n1<n2) {
            return r = mcd(n1, n2 - n1);
        }

        return r;
    }
}
