import java.util.*;


public class CollectionInterfaces {

    public ArrayList<Integer> collection (){
        Collection<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(82);
        c.add(99);
        c.add(8);

        return (ArrayList<Integer>) c;
    }

    public ArrayList<Integer> collectionList (){
        List<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(15);
        c.add(20);
        c.add(0,8);//Adds element at index 0
        c.remove(3); // removes element and index 3

        return (ArrayList<Integer>) c;
    }

    public TreeSet<Integer> collectionSet (){
        Set<Integer> c = new TreeSet<>();
        c.add(9);
        c.add(15);
        c.add(25);
        c.add(8);
        c.add(8); //It only adds the first value 8 does not duplicate it in the list

        return (TreeSet<Integer>) c;
    }

    public String collectionMap (){
        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(1,"Austin");
        m.put(2,"Petersen");
        m.put(3,"Nathan");
        m.put(1,"Ethan"); //Replaces the key value

        return m.get(1);
    }



}
