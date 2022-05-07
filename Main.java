import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.function.Supplier;



public class Main
{

    public static void main(String[] args) throws InterruptedException, ExecutionException
    {



        Map<String,Map<String,String[]>> mapMap = new HashMap<>();

        Map<String,String[]> map = new HashMap();
        String[] strings = new String[1];
        strings[0] = "http://cts.comcast.com/fields/tvp/era";
        map.put("era",strings);

        mapMap.put("$xmlns",map);

        for (Map.Entry m : mapMap.entrySet())
        {
            System.out.println(m.getKey() +" "+ m.getValue());
        }

    }
}
