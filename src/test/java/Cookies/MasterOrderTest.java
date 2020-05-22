package Cookies;

import static org.junit.Assert.assertEquals;

public class MasterOrderTest<underTest> {

    public void shouldReturnTotalBoxesOfOne() {
        Cookies.MasterOrder underTest = new Cookies.MasterOrder();
        Cookies.CookieOrder cookieOrderTest = new Cookies.CookieOrder("", 1);
        underTest.addOrder(cookieOrderTest);
        int check = underTest.getTotalBoxes();

        assertEquals(1, check);
    }


    public void shouldReturnTotalBoxesOfTwo() {
        Cookies.MasterOrder underTest = new Cookies.MasterOrder();
        Cookies.CookieOrder cookieOrderTest = new Cookies.CookieOrder("", 1);
        Cookies.CookieOrder cookieOrderTest2 = new Cookies.CookieOrder("", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        int check = underTest.getTotalBoxes();

        assertEquals(2, check);
    }

    public void shouldReturnTotalBoxesAsOneAfterRemoval() {

        Cookies.MasterOrder underTest = new Cookies.MasterOrder();
        Cookies.CookieOrder cookieOrderTest = new Cookies.CookieOrder("thin mints", 1);
        Cookies.CookieOrder cookieOrderTest2 = new Cookies.CookieOrder("samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        underTest.removeVariety("thin mints");
        int check = underTest.getTotalBoxes();

        assertEquals(1, check);

    }

    public void shouldReturnTotalBoxesWithMultipleOrdersSameVarietyAsOneAfterRemovalOfAll() {

        Cookies.MasterOrder underTest = new Cookies.MasterOrder();
        Cookies.CookieOrder cookieOrderTest = new Cookies.CookieOrder("thin mints", 1);
        Cookies.CookieOrder cookieOrderTest2 = new Cookies.CookieOrder("thin mints", 1);
        Cookies.CookieOrder cookieOrderTest3 = new Cookies.CookieOrder("samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        underTest.addOrder((cookieOrderTest3));
        underTest.removeVariety("thin mints");
        int check = underTest.getTotalBoxes();

        assertEquals(1, check);

    }

    public void shouldReturnTotalOf2ForThinMints() {

        Cookies.MasterOrder underTest = new Cookies.MasterOrder();
        Cookies.CookieOrder cookieOrderTest = new Cookies.CookieOrder("thin mints", 1);
        Cookies.CookieOrder cookieOrderTest2 = new Cookies.CookieOrder("thin mints", 1);
        Cookies.CookieOrder cookieOrderTest3 = new Cookies.CookieOrder("samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        underTest.addOrder((cookieOrderTest3));
        int check = underTest.getVarietyBoxes("thin mints");

        assertEquals(2, check);
    }


    public void shouldReturnTotalOf3ForThinMints() {

        Cookies.MasterOrder underTest = new Cookies.MasterOrder();
        Cookies.CookieOrder cookieOrderTest = new Cookies.CookieOrder("thin mints", 2);
        Cookies.CookieOrder cookieOrderTest2 = new Cookies.CookieOrder("thin mints", 1);
        Cookies.CookieOrder cookieOrderTest3 = new Cookies.CookieOrder("samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        underTest.addOrder((cookieOrderTest3));
        int check = underTest.getVarietyBoxes("thin mints");

        assertEquals(3, check);
    }
}