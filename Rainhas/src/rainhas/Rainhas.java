package rainhas;

/**
 *
 * @author João Vitor
 */

/*O tabuleiro é uma matriz de inteiros. Cada 0 representa um espaço vago que não está sendo atacado, 1 representa 
um estado vago que está sendo atacado e 2 representa uma rainha*/
public class Rainhas {
    static int TAMANHO_TABULEIRO = 8;
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        boolean achouSolucao = false;
        //pode-se colocar aqui alguma rainha inicial
        //tabuleiro = tabuleiro.colocaRainha(tabuleiro, 0, 0, TAMANHO_TABULEIRO-1);
        
        //Aqui o algoritmo acontece: Para cada espaço disponível, tenta colocar uma 
        //rainha, se ao final, elas não se atacarem, achou uma solução.
        for(int i=0; i<TAMANHO_TABULEIRO;i++){
            for(int j=0; j<TAMANHO_TABULEIRO; j++){
                 //if(tabuleiro != null && tabuleiro.podeColocarRainha(tabuleiro, i, j)){
                    //System.out.println(i + " " +j);
                    Tabuleiro tabuleiro = new Tabuleiro(TAMANHO_TABULEIRO);
                    tabuleiro = tabuleiro.colocaRainha(tabuleiro, i, j, TAMANHO_TABULEIRO-1);
                    if(tabuleiro != null){
                         tabuleiro.imprimeTabuleiro(tabuleiro);
                         i = TAMANHO_TABULEIRO;
                         break;
                    }
            }
        }
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000 + " microsegundos de duracao.");
    }
    
}
