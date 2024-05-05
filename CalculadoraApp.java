public class CalculadoraApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculo calculo = new Calculo();

        char opcao;
        while(true){
            System.out.println("----ESCOLHA UMA OPERAÇÂO----");
            System.out.println("1.soma\n2.subtração\n3.divisão\n4.multiplicação\n5.potência\n6.raiz\nQ.SAIR");

            opcao = scanner.next().charAt(0);            
            if(opcao>='1' && opcao <='5'){
                System.out.println("Insira o primeiro numero: ");
                double nUm = scanner.nextDouble();
                System.out.println("Insita o segundo numermo: ");
                double nDois = scanner.nextDouble();
                switch (opcao) {
                    case '1':
                    System.out.println("O RESULTADO DA SOMA É: " + calculo.adicao(nUm, nDois));
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                    continue;
                    case '2':
                    System.out.println("O RESULTADO DA SUBTRAÇÃO É: " + calculo.subtracao(nUm, nDois));
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                    continue;
                    case '3':
                    calculo.divisao(nUm, nDois);
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                    continue;
                    case '4':
                    System.out.println("O RESULTADO DA MULTIPLICAÇÃO É: " + calculo.multiplicacao(nUm, nDois));
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                    continue;
                    case '5':
                    System.out.println("O RESULTADO DA POTÊNCIA É: " + calculo.potencia(nUm, nDois));
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                    continue;                    
                }
        
            }
                if(opcao =='6'){
                    System.out.println("Insira um numero para calcular a raiz quadrada");
                    double umNu = scanner.nextDouble();
                    System.out.println("O RESULTADO DA RAIZ É: " + calculo.raiz(umNu));
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                    continue;

                }
                if (opcao =='Q' || opcao =='q'){
                    System.out.println("***FIM DA CALCULADORA***");
                    System.out.println("--------------------------------------------------------");
                    System.out.println();                    
                    break;
                }else if(opcao<'1' || opcao>='7'){
                    System.out.println("*OPÇÃO INVÁLIDA*");
                    System.out.println("--------------------------------------------------------");
                    System.out.println();
                }else {
                    continue;
                   
                }
        }
        scanner.close();
    }
}
