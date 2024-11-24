package count;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Testcount {


    @Test
    public void rowanalysis() {

        Analysis obj1 = new Analysis();
        obj1.rowsanalyser("hej");


        int actual = obj1.rowscounter();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void manyrowanalysis() {

        Analysis obj1 = new Analysis();
        obj1.rowsanalyser("hej");
        obj1.rowsanalyser("how are you");

        int actual = obj1.rowscounter();
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test

    public void charcounter() {

        Analysis obj2 = new Analysis();
        obj2.rowsanalyser("my name is junaid");
        int actual = obj2.charactercounter();
        int expected = 17;
        assertEquals(expected, actual);
    }

    @Test

    public void specialcharcounter() {
        Analysis obj3 = new Analysis();
        obj3.rowsanalyser("I got 100$ & 20£");
        obj3.rowsanalyser("I got 100$ & 20£");
        int actual = obj3.charactercounter();
        int expected = 32;
        assertEquals(expected, actual);
    }




}

