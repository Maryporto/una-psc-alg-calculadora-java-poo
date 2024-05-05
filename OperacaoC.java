public class OperaçaoC{
    
    public double adicao(double nUm, double nDois) {
        return nUm+nDois;
    }
    public double subtracao(double nUm, double nDois){
        return nUm-nDois;
    }
    public void divisao(double nUm, double nDois){
        if (nDois !=0){
            System.out.println("Resultado da divisão é: " + nUm/nDois);
        }else{
            System.out.println("*NAO E POSSIVEL DIVIDIR POR ZERO. ");            
        }
    }
    public double multiplicacao(double nUm, double nDois){
        return nUm*nDois;
    }
    public double potencia(double nUm, double nDois){
        if(nDois==0){
            System.out.println("Todo numero elevado a 0 é igual a 1!!!");
            return 1;
        }else {
            return Math.pow(nUm, nDois);
        }
    }
    public double raiz(double umNu){
        if(umNu<0){
            System.out.println("Nao existe raiz de numero negativo!!!");
            return Double.NaN;
        }return Math.sqrt(umNu);

    }
}
