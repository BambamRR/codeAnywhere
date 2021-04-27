//Desafio 4

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
//"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

public class Classe{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        if (B%A==0 || A%B==0) {
            System.out.println("Sao Multiplos");
        } else {
             System.out.println("Nao sao Multiplos");
        }
    }
    
}