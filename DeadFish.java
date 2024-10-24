import java.util.List;
import java.util.ArrayList;
public class DeadFish {
    public static int[] parse(String data) {
      int num = 0;
      List<String> numeros = new ArrayList<>();
      
        for (int i = 0; i < data.length(); i++){
          if(data.charAt(i) == 'i'){
            num++;
          }
      else if(data.charAt(i) == 'd'){num--;}
      else if(data.charAt(i) == 's'){num*=num;}
      else if(data.charAt(i) == 'o'){numeros.add(String.valueOf(num));}
    } 
      String solucion = String.join(",", numeros);
      return numeros.stream()
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
  
}
