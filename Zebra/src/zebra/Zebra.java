
package zebra;

import java.util.Random;

/**
 *
 * @author João Vitor
 */
public class Zebra {

    private static Random randomGenerator;

    public static boolean atendeRestricoes(Pessoa ingles, Pessoa espanhol, Pessoa noruegues, Pessoa ucraniano, Pessoa japones) {
        Pessoa aux = new Pessoa();
        Pessoa aux2 = new Pessoa();
        if (ingles.cor != 0) //o ingles mora na casa vermelha
        {
            return false;
        }
        if (espanhol.animal != 1)//o espanhol é dono do cachorro
        {
            return false;
        }
        if (noruegues.posicao != 0)//o norueguês mora na primeira casa a esquerda
        {
            return false;
        }
        //fumam-se cigarros kool na casa amarela
        if (ingles.cigarro == 0) {
            aux = ingles;
        } else if (espanhol.cigarro == 0) {
            aux = espanhol;
        } else if (noruegues.cigarro == 0) {
            aux = noruegues;
        } else if (ucraniano.cigarro == 0) {
            aux = ucraniano;
        } else if (japones.cigarro == 0) {
            aux = japones;
        }
        if (aux.cor != 1) {
            return false;
        }
        //o homem que fuma cigarros chesterfiled ao lado do homem que mora com a raposa
        if (ingles.animal == 2) {
            aux = ingles;
        } else if (espanhol.animal == 2) {
            aux = espanhol;
        } else if (noruegues.animal == 2) {
            aux = noruegues;
        } else if (ucraniano.animal == 2) {
            aux = ucraniano;
        } else if (japones.animal == 2) {
            aux = japones;
        }
        //aux é o homem que tem a raposa como animal
        if (ingles.cigarro == 1) {
            aux2 = ingles;
        } else if (espanhol.cigarro == 1) {
            aux2 = espanhol;
        } else if (noruegues.cigarro == 1) {
            aux2 = noruegues;
        } else if (ucraniano.cigarro == 1) {
            aux2 = ucraniano;
        } else if (japones.cigarro == 1) {
            aux2 = japones;
        }
        //aux2 é o homem que fuma chesterfield
        if (!(aux.posicao == aux2.posicao + 1 || aux.posicao == aux2.posicao - 1)) {
            return false;
        }
        //o noruegues moral ao lado da casa azul
        if (ingles.cor == 2) {
            aux = ingles;
        } else if (espanhol.cor == 2) {
            aux = espanhol;
        } else if (noruegues.cor == 2) {
            aux = noruegues;
        } else if (ucraniano.cor == 2) {
            aux = ucraniano;
        } else if (japones.cor == 2) {
            aux = japones;
        }
        if (!(aux.posicao == noruegues.posicao + 1 || aux.posicao == noruegues.posicao - 1)) {
            return false;
        }
        //o fumante de cigarros winston cria caramujos
        if (ingles.cigarro == 2) {
            aux = ingles;
        } else if (espanhol.cigarro == 2) {
            aux = espanhol;
        } else if (noruegues.cigarro == 2) {
            aux = noruegues;
        } else if (ucraniano.cigarro == 2) {
            aux = ucraniano;
        } else if (japones.cigarro == 2) {
            aux = japones;
        }
        if (aux.animal != 3) {
            return false;
        }
        //o fumante de lucky strike bebe suco de laranja
        if (ingles.cigarro == 3) {
            aux = ingles;
        } else if (espanhol.cigarro == 3) {
            aux = espanhol;
        } else if (noruegues.cigarro == 3) {
            aux = noruegues;
        } else if (ucraniano.cigarro == 3) {
            aux = ucraniano;
        } else if (japones.cigarro == 3) {
            aux = japones;
        }
        if (aux.bebida != 1) {
            return false;
        }
        if (ucraniano.bebida != 2)//o ucraniano bebe chá
        {
            return false;
        }
        if (japones.cigarro != 4) //o japones fuma parliament
        {
            return false;
        }
        //fumam-se cigarros kool na casa ao lado da casa que tem cavalo
        if (ingles.animal == 4) {
            aux = ingles;
        } else if (espanhol.animal == 4) {
            aux = espanhol;
        } else if (noruegues.animal == 4) {
            aux = noruegues;
        } else if (ucraniano.animal == 4) {
            aux = ucraniano;
        } else if (japones.animal == 4) {
            aux = japones;
        }
        if (ingles.cigarro == 0) {
            aux2 = ingles;
        } else if (espanhol.cigarro == 0) {
            aux2 = espanhol;
        } else if (noruegues.cigarro == 0) {
            aux2 = noruegues;
        } else if (ucraniano.cigarro == 0) {
            aux2 = ucraniano;
        } else if (japones.cigarro == 0) {
            aux2 = japones;
        }
        //aux2 é o homem que fuma chesterfield
        if (!(aux.posicao == aux2.posicao + 1 || aux.posicao == aux2.posicao - 1)) {
            return false;
        }
        //bebe-se café na casa verde
        if (ingles.cor == 3) {
            aux = ingles;
        } else if (espanhol.cor == 3) {
            aux = espanhol;
        } else if (noruegues.cor == 3) {
            aux = noruegues;
        } else if (ucraniano.cor == 3) {
            aux = ucraniano;
        } else if (japones.cor == 3) {
            aux = japones;
        }
        if (aux.bebida != 3) {
            return false;
        }
        //a casa verde esta imediatamente a direita da casa marfim
        if (ingles.cor == 3) {
            aux = ingles;
        } else if (espanhol.cor == 3) {
            aux = espanhol;
        } else if (noruegues.cor == 3) {
            aux = noruegues;
        } else if (ucraniano.cor == 3) {
            aux = ucraniano;
        } else if (japones.cor == 3) {
            aux = japones;
        }
        if (ingles.cor == 4) {
            aux2 = ingles;
        } else if (espanhol.cor == 4) {
            aux2 = espanhol;
        } else if (noruegues.cor == 4) {
            aux2 = noruegues;
        } else if (ucraniano.cor == 4) {
            aux2 = ucraniano;
        } else if (japones.cor == 4) {
            aux2 = japones;
        }
        if (aux.posicao != aux2.posicao + 1) {
            return false;
        }
        //bebe-se leite na casa do meio
        if (ingles.bebida == 4) {
            aux = ingles;
        } else if (espanhol.bebida == 4) {
            aux = espanhol;
        } else if (noruegues.bebida == 4) {
            aux = noruegues;
        } else if (ucraniano.bebida == 4) {
            aux = ucraniano;
        } else if (japones.bebida == 4) {
            aux = japones;
        }
        if (aux.posicao != 2) {
            return false;
        }
        return true;
    }

    public static boolean backtracking(Pessoa ingles, Pessoa espanhol, Pessoa noruegues, Pessoa ucraniano, Pessoa japones) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = i;
        }

        int randomIndex;
        int randomValue;
        for (int i = 0; i < nums.length; ++i) {
            randomIndex = randomGenerator.nextInt(nums.length);
            randomValue = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = randomValue;
        }
        ingles.animal = nums[0];
        espanhol.animal = nums[1];
        noruegues.animal = nums[2];
        ucraniano.animal = nums[3];
        japones.animal = nums[4];
        for (int i = 0; i < nums.length; ++i) {
            randomIndex = randomGenerator.nextInt(nums.length);
            randomValue = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = randomValue;
        }
        ingles.bebida = nums[0];
        espanhol.bebida = nums[1];
        noruegues.bebida = nums[2];
        ucraniano.bebida = nums[3];
        japones.bebida = nums[4];
        for (int i = 0; i < nums.length; ++i) {
            randomIndex = randomGenerator.nextInt(nums.length);
            randomValue = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = randomValue;
        }
        ingles.cigarro = nums[0];
        espanhol.cigarro = nums[1];
        noruegues.cigarro = nums[2];
        ucraniano.cigarro = nums[3];
        japones.cigarro = nums[4];
        for (int i = 0; i < nums.length; ++i) {
            randomIndex = randomGenerator.nextInt(nums.length);
            randomValue = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = randomValue;
        }
        ingles.cor = nums[0];
        espanhol.cor = nums[1];
        noruegues.cor = nums[2];
        ucraniano.cor = nums[3];
        japones.cor = nums[4];
        for (int i = 0; i < nums.length; ++i) {
            randomIndex = randomGenerator.nextInt(nums.length);
            randomValue = nums[randomIndex];
            nums[randomIndex] = nums[i];
            nums[i] = randomValue;
        }
        ingles.posicao = nums[0];
        espanhol.posicao = nums[1];
        noruegues.posicao = nums[2];
        ucraniano.posicao = nums[3];
        japones.posicao = nums[4];
        if (atendeRestricoes(ingles, espanhol, noruegues, ucraniano, japones)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Pessoa ingles, espanhol, noruegues, ucraniano, japones;
        randomGenerator = new Random();
        ingles = new Pessoa();
        ingles.nacionalidade = 0;
        noruegues = new Pessoa();
        noruegues.nacionalidade = 2;
        ucraniano = new Pessoa();
        ucraniano.nacionalidade = 3;
        espanhol = new Pessoa();
        espanhol.nacionalidade = 1;
        japones = new Pessoa();
        japones.nacionalidade = 4;
        System.out.println("Rodando..."
                + "");
        while (!backtracking(ingles, espanhol, noruegues, ucraniano, japones)) {
        }
        if (ingles.animal == 0) {
            System.out.println("A zebra pertence ao ingles");
        } else if (espanhol.animal == 0) {
            System.out.println("A zebra pertence ao espanhol");
        } else if (noruegues.animal == 0) {
            System.out.println("A zebra pertence ao noruegues");
        } else if (ucraniano.animal == 0) {
            System.out.println("A zebra pertence ao ucraniano");
        } else if (japones.animal == 0) {
            System.out.println("A zebra pertence ao japones");
        }
        if (ingles.bebida == 0) {
            System.out.println("O ingles bebe água");
        } else if (espanhol.bebida == 0) {
            System.out.println("O espanhol bebe água");
        } else if (noruegues.bebida == 0) {
            System.out.println("O noruegues bebe água");
        } else if (ucraniano.bebida == 0) {
            System.out.println("O ucraniano bebe água");
        } else if (japones.bebida == 0) {
            System.out.println("O japones bebe água");
        }
    }

}
