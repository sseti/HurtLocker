import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JerksonParserTest {
    private String groceryText;
    private JerksonParser jerksonParser;

    @Before
    public void setUp() {
        this.jerksonParser = new JerksonParser();
        this.groceryText = jerksonParser.getGroceryList();
    }

    @Test
    public void replaceBread() {
        String expected = groceryText;
        String actual = jerksonParser.getGroceryList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceMilk() {
        String expected = groceryText;
        String actual = jerksonParser.getGroceryList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceCookies() {
        String expected = groceryText;
        String actual = jerksonParser.getGroceryList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceApples() {
        String expected = groceryText;
        String actual = jerksonParser.getGroceryList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceName() {
        String expected = groceryText;
        String actual = jerksonParser.getGroceryList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replacePrice() {
        String expected = groceryText;
        String actual = jerksonParser.getGroceryList();
        Assert.assertEquals(expected, actual);
    }
}