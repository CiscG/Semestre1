using System:

public class Ordem{
    int[] ordenado;
    for(i = 0; i < 5; i++){
        ordenado[i] = Console.ReadLine();
    }
    int aux = null;
    int count;
    for(int i = 0; i < 4; i++){
        for(int a = i+1; a < 5; a++){
            if(ordenado[i] < ordenado[a]){
                aux = ordenadi[a];
                count = a;
            }
        }         
        if(aux != null){
            ordenado[count] = ordenado[i];
            ordenado[i] = aux;
            aux = null;       
        }
    }
}
