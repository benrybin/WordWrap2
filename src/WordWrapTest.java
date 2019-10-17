import org.junit.Assert;
import org.junit.Test;

public class WordWrapTest {

    @Test
    public void wrapTextTest1() {
        String test = "word is on the street";


        String actual = WordWrap.wrapText(test,13);
        String expected = "word is on\nthe street";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wrapTextBaseCase() {
        String test = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";


        String actual = WordWrap.wrapText(test,13);
        String expected = "Four score\nand seven\nyears ago\nour fathers\nbrought\nforth upon\nthis\ncontinent a\nnew nation,\nconceived in\nliberty and\ndedicated to\nthe\nproposition\nthat all men\nare created\nequal";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wrapTextTest2() {
        String test = "hmmm things are going to get weird thahkfsjkj t!!222345 gjkasjfk";


        String actual = WordWrap.wrapText(test,13);
        String expected = "hmmm things\nare going to\nget weird\nthahkfsjkj\nt!!222345\ngjkasjfk";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wrapTextWidthTest() {
        String test = "123 4 12 3 1234";


        String actual = WordWrap.wrapText(test,6);
        String expected = "123 4\n12 3\n1234";
        Assert.assertEquals(expected, actual);
    }
    }
