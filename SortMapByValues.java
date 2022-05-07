import java.util.*;

public class SortMapByValues
{
    public static void main(String[] args)
    {

        Map<String,String> map = new HashMap<>();

        map.put("a","zebra");
        map.put("b","umberla");
        map.put("c","teja");
        map.put("d","tim");

        solveSolution(map);


    }

    private static Map solveSolution(Map<String, String> map)
    {
        List<Map.Entry<String,String>> listMap = new LinkedList<>(map.entrySet());

        Collections.sort(listMap,new Comparator<Map.Entry<String,String>>(){

            @Override
            public int compare(Map.Entry<String,String> map1, Map.Entry<String,String> map2)
            {
                return map1.getValue().compareTo(map2.getValue());
            }
        });

        for (Map.Entry<String,String> mapSet : listMap)
        {
            System.out.println("Key :: "+mapSet.getKey() +" Value :: "+mapSet.getValue());
        }

        return null;
    }
}
