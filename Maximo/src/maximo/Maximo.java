package maximo;

import java.util.Random;

/**
 *
 * @author João Vitor
 */
public class Maximo {

    public static float funcao(float x, float y){
        float e = (float)Math.E;
        float a = (float)(Math.pow(x,2) + Math.pow(y,2));
        float b = (float)(Math.pow(x-5,2) + Math.pow(y-5,2));
        float c = (float)(Math.pow(x+5,2) + Math.pow(y-5,2));
        float d = (float)(Math.pow(x-5,2) + Math.pow(y+5,2));
        float f = (float)(Math.pow(x+5,2) + Math.pow(y+5,2));  
        return (float)(4*Math.pow(e, -a) + Math.pow(e, -b) + Math.pow(e, -c) + Math.pow(e, -d)+ Math.pow(e, -f));
    }
    public static void main(String[] args) {
        Random gerador = new Random();
        float valor=0;
        float maximoGlobal = 0, proxValor=0;
        float x = -10, y = -10;
        valor = funcao(x, y);
        while(true){ //a condição de parada é de escolha do usuário
            if(valor > maximoGlobal){
                maximoGlobal = valor;
                System.out.printf("%f é máximo global para x = %f e y = %f\n", maximoGlobal, x, y);
            }
            if(x > -10 && x < 10 && y > -10 && y < 10){
                //olha os "vizinhos" para verificar maximo local
                if(valor > funcao((float) (x-0.5), y) && valor > funcao((float) (x+0.5), y)
                   && valor > funcao(x, (float) (y+0.5)) && valor > funcao(x, (float) (y-0.5)) && valor > funcao((float) (x-0.5), (float) (y-0.5))
                   && valor > funcao((float) (x+0.5), (float) (y +0.5)) && valor > funcao((float) (x-0.5), (float) (y+0.5)) 
                   && valor > funcao((float) (x+0.5), (float) (y-0.5)))
                        System.out.printf("%f é maximo local para x = %f e y = %f\n", valor, x, y);
            }
            switch(gerador.nextInt(9)){ //ele tem a chance de ir para um vizinho
                case 0:
                    proxValor = funcao(x, y);
                    break;
                case 1:
                    proxValor = funcao((float) (x+0.5), y);
                    x = (float) (x+0.5);
                    break;
                case 2:
                    proxValor = funcao((float) (x-0.5), y);
                    x = (float) (x-0.5);
                    break;
                case 3:
                    proxValor = funcao(x, (float) (y+0.5));
                    y = (float) (y+0.5);
                    break;
                case 4:
                    proxValor = funcao(x, (float) (y-0.5));
                    y = (float) (y-0.5);
                    break;
                case 5:
                    proxValor = funcao((float)(x+0.5), (float)(y+0.5));
                    x = (float) (x+0.5);
                    y = (float) (y+0.5);
                    break;
                case 6:
                    proxValor = funcao((float)(x+0.5), (float) (y-0.5));
                    x = (float) (x+0.5);
                    y = (float) (y-0.5);
                    break;
                case 7:
                    proxValor = funcao((float)(x-0.5), (float) (y+0.5));
                    x = (float) (x-0.5);
                    y = (float) (y+0.5);
                    break;
                case 8:
                    proxValor = funcao((float)(x-0.5), (float) (y-0.5));
                    x = (float) (x-0.5);
                    y = (float) (y-0.5);
                    break;
            }
            if(proxValor - valor > 0) //delta E do algoritmo de têmpera simulada
                valor = proxValor;
            else{ if(gerador.nextDouble() > Math.pow(Math.E, (proxValor - valor)/valor))
                        valor = proxValor;
            }
        }
        
    }
    
}
