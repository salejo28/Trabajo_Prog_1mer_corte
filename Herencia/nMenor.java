public class nMenor extends Operacion{

    double menor;
    
    public nMenor(double n1, double n2) {
        super(n1, n2, '<');
        if (n1 < n2) {
            this.menor = n1;
        } else {
            this.menor = n2;
        }

        this.setMessage("El numero menor es: ");
        this.setRes(this.menor);
    }

}
