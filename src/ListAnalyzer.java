import java.util.ArrayList;
import java.util.List;
public class ListAnalyzer {
    
    public static int contadorImpares(List<Integer> lista){
        int salida=0;
        for (Integer x : lista){
            if   (x%2!=0){
                salida+=1;
            
            }
        }
        return salida;
    }
    public static List<Integer> numerosConsecutivos(List<Integer> lista){
        int index= 0;
        int largo= lista.size();
        List<Integer> salida=new ArrayList<>();
        while (index< largo){
            System.out.println(index);
            if(lista.get(index)+1==lista.get(index+1)){
                salida.add(lista.get(index));
                salida.add(lista.get(index+1));
                index+=2;
            }
            else{
                index++;
            }
        }
        return salida;
        }

    }

