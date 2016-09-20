package rainhas;

import java.util.Random;

/**
 *
 * @author João Vitor
 */

/*O tabuleiro é uma matriz de inteiros. Cada 0 representa um espaço vago que não está sendo atacado, 1 representa 
um estado vago que está sendo atacado e 2 representa uma rainha*/
public class Rainhas {
    static int TAMANHO_TABULEIRO = 5;
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Random gerador = new Random();
        int randomIndex;
        int randomValue;
        int linha, coluna; //vai escolher uma linha aleatoria para colocar a rainha
        boolean achouSolucao = false;
        Tabuleiro tab = new Tabuleiro(TAMANHO_TABULEIRO);
        //poe todas as rainhas na primeira linha
        for(int i=0; i<TAMANHO_TABULEIRO; i++)
            tab.tabuleiro[0][i] = 2;
        int[] nums = new int[TAMANHO_TABULEIRO];
            for (int i = 0; i < nums.length; ++i){
                nums[i] = i;
            }
 
        //Algoritmo Hill Climbing
        while(!achouSolucao){
            linha =0;  

            for(int i = 0; i < nums.length; ++i){
                 randomIndex = gerador.nextInt(nums.length);
                 randomValue = nums[randomIndex];
                 nums[randomIndex] = nums[i];
                 nums[i] = randomValue;
            }
                //coluna = gerador.nextInt(TAMANHO_TABULEIRO);
                //acha onde esta a rainha nessa coluna
                for(int i=0; i<TAMANHO_TABULEIRO; i++){
                    for(int j=0; j<TAMANHO_TABULEIRO; j++)
                        tab.tabuleiro[i][j] = 1;
                }
                for(int i=0; i<TAMANHO_TABULEIRO; i++){
                    coluna = gerador.nextInt(TAMANHO_TABULEIRO);
                    tab.tabuleiro[i][nums[i]] = 2;
                }
                if(tab.EhSolucao(tab))
                    achouSolucao = true;
        }
        tab.imprimeTabuleiro(tab);
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000 + " microsegundos de duracao.");
    }
    
}
