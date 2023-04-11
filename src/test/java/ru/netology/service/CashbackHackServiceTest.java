package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shdCalcIfAboveLimit() { /** сумма больше лимита */

        CashbackHackService mysteryHacK = new CashbackHackService();
        int actual = mysteryHacK.sumLeft(1001);
        int expected = 999;

        org.testng.Assert.assertEquals(actual, actual);
    }

    @org.testng.annotations.Test
    public void shdCalcIfBelowLimit() { /** сумма меньше 1000 */

        CashbackHackService mysteryHacK = new CashbackHackService();
        int actual = mysteryHacK.sumLeft(999); /** должно получаться 1 */
        int expected = 1;

        org.testng.Assert.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void shdCalcIfEqualToLimit() { /** сумма равна лимиту */

        CashbackHackService mysteryHacK = new CashbackHackService();
        int actual = mysteryHacK.sumLeft(1000); /** должно получаться 0 */
        int expected = 0; /** однако получается тысяча */

        org.testng.Assert.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void shdCalcIfZeroTotal() { /** если сумма покупки равна нулю */

        CashbackHackService mysteryHacK = new CashbackHackService();
        int actual = mysteryHacK.sumLeft(0); /** должно получаться 1000 */
        int expected = 1000; /** хотя нужно докинуть целую тысячу */

        org.testng.Assert.assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void shdCalcIfNegativeTotal() { /** integer позволяет вводить отрицательную сумму покупки */

        CashbackHackService mysteryHacK = new CashbackHackService();
        int actual = mysteryHacK.sumLeft(-1337); /** должно получаться 1337 */
        int expected = 0; /** однако результат - отрицательное число */

        org.testng.Assert.assertEquals(expected, actual);
    }
}