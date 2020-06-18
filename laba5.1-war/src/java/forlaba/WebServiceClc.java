package forlaba;

import java.io.IOException;
import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "WebServiceClc")
@Stateless()
public class WebServiceClc {

    @WebMethod(operationName = "calculate")
    public String calculate(@WebParam(name = "word") String word) throws IOException {
       String alph = "qwertyuiopasdfghjklzxcvbnm";
       for (int a = 0; a < alph.length(); a++){
            char letter = alph.charAt(a); 
            HashMap<Character, Integer> map = new HashMap<Character, Integer>(40);
            for (int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);            
                if (Character.isLetter(c)) {
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
                if (map.get(letter) == null){}
                else{            
                  System.out.println("Кількість повторів літер: "+ letter+" - "+map.get(letter));
                }
        }
             return word; 
    }
}
        
 
