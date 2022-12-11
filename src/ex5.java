public class ex5 {

    public static void main(String[] args) {

    	int preco = 20;
        System.out.println(somaImposto(preco, preco));
        
    }
    static double somaImposto(double taxaImposto, double imposto){
        imposto = 0.012;
        taxaImposto = (20.00 * imposto) + 20.00; 

        return taxaImposto;
    }
}