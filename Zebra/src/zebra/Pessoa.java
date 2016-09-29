
package zebra;

/**
 *
 * @author João Vitor
 */
public class Pessoa {
    int nacionalidade, posicao, cor, cigarro, bebida, animal;
    /*
    Para cada atributo, existe uma correspodencia:
    nacionalidade: 0-ingles, 1-espanhol, 2-noruegues, 3-ucraniano, 4-japones
    posicao: 0-a primeira casa a esquerda, 4- a ultima casa a direita
    cor:0-vermelha, 1-amarelo, 2-azul, 3-verde, 4-marfim
    cigarro: 0-kool, 1-chesterfield, 2-winston, 3-lucky strike, 4-parliament
    bebida:0-água, 1-suco de laranja, 2-chá, 3-café, 4-leite
    animal:0-zebra, 1-cachorro, 2-raposa, 3-caramujos, 4-cavalo
    */
    public Pessoa(){
        this.animal = -1;
        this.bebida = -1;
        this.cigarro = -1;
        this.cor = -1;
        this.nacionalidade = -1;
        this.posicao = -1;
    }
}
