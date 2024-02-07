import org.example.ArrayListMethodsImpl;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayListMethodsTest {
    private ArrayListMethodsImpl<Integer> list;

    @BeforeEach
    public void createList(){
        list = new ArrayListMethodsImpl<>();
        list.addElement(1);
        list.addElement(10);
        list.addElement(100);
    }

    @Test
    public void testCapacityList() {
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testAddAndDeleteElement() {
        list.addElement(777);
        list.deleteElement(10);
        Integer [] expected = {1, 100, 777};
        Assert.assertEquals(expected, list.getAllElements());
    }

    @Test
    public void testAddByIndex() {
        Integer expected = 100;
        Assert.assertEquals(expected,list.getIndexElement(2));
    }
}
