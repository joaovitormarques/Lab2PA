
package rainhas;

/**
 *
 * @author João Vitor
 */
public class Tabuleiro {
    int tamanho;
    int[][] tabuleiro;
    
    
    public Tabuleiro(int tam){
        this.tamanho = tam;
        this.tabuleiro = new int[tam][tam];
        for(int i=0; i<tam; i++)
            for(int j=0; j<tam; j++)
                this.tabuleiro[i][j] =0;
    }
    
    public void imprimeTabuleiro(Tabuleiro tab){
        for(int i=0; i<tab.tamanho; i++){
            for(int j=0; j<tab.tamanho; j++){
                System.out.print(tab.tabuleiro[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    //xy  00 ate xy 33 (00 01 02 03 10 11 12 13...)
    //podeColocarRainhas verifica se naquela posição ela vai atacar outras rainhas e ser atacada
    public boolean podeColocarRainha(Tabuleiro tab, int x, int y){
        if(tab.tabuleiro[x][y] == 1 || tab.tabuleiro[x][y] == 2) //verifica se ta ocupada ou atacada
            return false;
        //Agora verifica se naquela posição ela vai atacar outras rainhas
        //verifica a coluna de x
        for(int i=0; i<tab.tamanho; i++)
            if(tab.tabuleiro[x][i] == 2)
                return false;
        //verifica a linha de y
        for(int i=0; i<tab.tamanho; i++)
            if(tab.tabuleiro[i][y] == 2)
                return false;
        //verifica as diagonais
        for(int diagonal = 0; diagonal<tab.tamanho; diagonal++){
            if(diagonal+x >=0 && diagonal+x<tab.tamanho && diagonal+y >=0 && diagonal+y<tab.tamanho)
                if(tab.tabuleiro[x+diagonal][y+diagonal] == 2)
                    return false;
            if(x-diagonal >=0 && x-diagonal<tab.tamanho && y-diagonal >=0 && y-diagonal<tab.tamanho)
                    if(tab.tabuleiro[x-diagonal][y-diagonal] == 2)
                        return false;
            if(diagonal+x >=0 && diagonal+x<tab.tamanho && y-diagonal >=0 && y-diagonal<tab.tamanho)
                    if(tab.tabuleiro[x+diagonal][y-diagonal] == 2)
                        return false;
            if(x-diagonal >=0 && x-diagonal<tab.tamanho && diagonal+y >=0 && diagonal+y<tab.tamanho)
                    if(tab.tabuleiro[x-diagonal][y+diagonal] == 2)
                        return false;
        }
        return true;
    }
    
    
    public Tabuleiro colocaRainha(Tabuleiro tab, int x, int y, int faltaColocar){
        
        Tabuleiro auxtab = new Tabuleiro(tab.tamanho);
        for(int i=0; i<tab.tamanho; i++)
            for(int j=0; j<tab.tamanho; j++)
                auxtab.tabuleiro[i][j] = tab.tabuleiro[i][j];
        
        auxtab.tabuleiro[x][y] = 2;
        //Agora atualiza o tabuleiro
        //atualiza a coluna de x
        for(int i=0; i<tab.tamanho; i++)
            if(auxtab.tabuleiro[x][i] != 2)
               auxtab.tabuleiro[x][i] = 1;
        //atualiza a linha de y
        for(int i=0; i<tab.tamanho; i++)
            if(auxtab.tabuleiro[i][y] != 2)
                auxtab.tabuleiro[i][y] = 1;
        //atualiza as diagonais
        for(int diagonal = 0; diagonal<tab.tamanho; diagonal++){
            if(diagonal+x >=0 && diagonal+x<tab.tamanho && diagonal+y >=0 && diagonal+y<tab.tamanho)
                if(auxtab.tabuleiro[x+diagonal][y+diagonal] != 2)
                    auxtab.tabuleiro[x+diagonal][y+diagonal] = 1;
            if(x-diagonal >=0 && x-diagonal<tab.tamanho && y-diagonal >=0 && y-diagonal<tab.tamanho)
                    if(auxtab.tabuleiro[x-diagonal][y-diagonal] != 2)
                        auxtab.tabuleiro[x-diagonal][y-diagonal] = 1;
            if(diagonal+x >=0 && diagonal+x<tab.tamanho && y-diagonal >=0 && y-diagonal<tab.tamanho)
                    if(auxtab.tabuleiro[x+diagonal][y-diagonal] != 2)
                        auxtab.tabuleiro[x+diagonal][y-diagonal] = 1;
            if(x-diagonal >=0 && x-diagonal<tab.tamanho && diagonal+y >=0 && diagonal+y<tab.tamanho)
                    if(auxtab.tabuleiro[x-diagonal][y+diagonal] != 2)
                        auxtab.tabuleiro[x-diagonal][y+diagonal] = 1;
        }
        if(faltaColocar == 0)
            return auxtab;
        for(int i=0; i<tab.tamanho; i++)
            for(int j=0; j<tab.tamanho; j++){
                Tabuleiro auxtab1 = new Tabuleiro(tab.tamanho);
                 for(int u=0; u<tab.tamanho; u++)
                     for(int v=0; v<tab.tamanho; v++)
                         auxtab1.tabuleiro[u][v] = auxtab.tabuleiro[u][v];
        
                if(auxtab1.podeColocarRainha(auxtab1, i, j))
                    return auxtab1.colocaRainha(auxtab1, i, j, faltaColocar - 1);
            }
        return null;
    }
}
