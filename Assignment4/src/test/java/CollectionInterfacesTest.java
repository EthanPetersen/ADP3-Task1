import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class CollectionInterfacesTest {

    @Test
    public void collection() {
        CollectionInterfaces c = new CollectionInterfaces();
        ArrayList<Integer> actual = c.collection();
        
        Collection<Integer> expected = new ArrayList<Integer>(Arrays.asList(9,82,99,8));
        
        assertEquals(expected,actual);
    }

    @Test
    public void collectionList(){
        CollectionInterfaces c = new CollectionInterfaces();
        ArrayList<Integer> actual = c.collectionList();

        Collection<Integer> expected = new ArrayList<Integer>(Arrays.asList(8,9,15));

        assertEquals(expected,actual);
    }

    @Test
    public void collectionSet(){
        CollectionInterfaces c = new CollectionInterfaces();
        TreeSet<Integer> actual = c.collectionSet();

        Collection<Integer> expected = new TreeSet<Integer>(Arrays.asList(8,9,15,25));

        assertEquals(expected,actual);
    }

    @Test
    public void collectionMap(){
        CollectionInterfaces c = new CollectionInterfaces();
        String actual = c.collectionMap();
        String expected = "Ethan";

        assertEquals(expected,actual);

    }



}