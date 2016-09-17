package rainhas;

/**
 *
 * @author João Vitor
 */

/*O tabuleiro é uma matriz de inteiros. Cada 0 representa um espaço vago que não está sendo atacado, 1 representa 
um estado vago que está sendo atacado e 2 representa uma rainha*/
public class Rainhas {
    static int TAMANHO_TABULEIRO = 4;
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Tabuleiro tabuleiro = new Tabuleiro(TAMANHO_TABULEIRO);
        boolean achouSolucao = false;
        int rainhasColocadas=0;
        //pode-se colocar aqui alguma rainha inicial
        tabuleiro = tabuleiro.colocaRainha(tabuleiro, 0, 2);
        rainhasColocadas++;
        
        //Aqui o algoritmo acontece: Para cada espaço disponível, tenta colocar uma 
        //rainha, se ao final, elas não se atacarem, achou uma solução.
        for(int i=0; i<TAMANHO_TABULEIRO; i++){
            for(int j=0; j<TAMANHO_TABULEIRO; j++){
                if(tabuleiro.podeColocarRainha(tabuleiro, i, j)){
                    tabuleiro = tabuleiro.colocaRainha(tabuleiro, i, j);
                    rainhasColocadas++;
                    if(rainhasColocadas == TAMANHO_TABULEIRO){
                        i= TAMANHO_TABULEIRO;
                        tabuleiro.imprimeTabuleiro(tabuleiro);
                        break;
                    }
                        
                }
            }
        }
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000 + " microsegundos de duracao.");
    }
    
}
