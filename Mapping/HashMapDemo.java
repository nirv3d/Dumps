import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Jordan");
        map.put(2, "Nirved");
        map.put(3, "Webster");

        System.out.println(map);
        String s = map.get(3);
        System.out.println(s);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Nirved"));
        System.out.println(map.containsValue("nirved"));

        for(int i : map.keySet()){
            System.err.println(map.get(i));
        }

        

    }
}
//hello again testing commits from vscode