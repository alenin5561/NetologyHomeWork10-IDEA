
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    // тест на проверку текущего канала
    public void shouldSetCurrentChanel() {
        Radio chanel = new Radio();

        chanel.currentChanel = 1;

        int expected = 1;
        int actual = chanel.currentChanel;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    //тест переключения канала по возрастанию
    public void shouldNextChanelIfPressNext1() {
        Radio chanel = new Radio();

        chanel.setChanel(6);

        int expected = 7;
        int actual = chanel.next();

        Assertions.assertEquals(expected, actual);
    }

    //тест на верхнюю границу
    @Test
     public void upBorderNext1() {
        Radio chanel = new Radio();

        chanel.setChanel(9);

        int expected = 0;
        int actual = chanel.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест переключения каналов по убыванию
    public void shouldPreviousChanelIfPressPrevious1() {
        Radio chanel = new Radio();

        chanel.setChanel(4);

        int expected = 3;
        int actual = chanel.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на нижнюю границу
    public void lowBorderPrev1() {
        Radio chanel = new Radio();

        chanel.setChanel(0);

        int expected = 9;
        int actual = chanel.prev();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //тест на нижнюю границы каналов
    public void lowBorderPrev2() {
        Radio chanel = new Radio();

        chanel.setChanel(-1);

        int expected = 0;
        int actual = chanel.currentChanel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на проверку доступнеость каналов
    public void shouldNewChanel1() {
        Radio chanel = new Radio();

        chanel.setChanel(8);

        int expected = 8;
        int actual = chanel.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //тест на проверку доступнеость каналов
    public void shouldNewChanel2() {
        Radio chanel = new Radio();

        chanel.setChanel(10);

        int expected = 0;
        int actual = chanel.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    // тест на проверку текущего уровня громкости
    public void shouldSetCurrentVolume() {
        Radio chanel = new Radio();

        chanel.currentVolume = 1;

        int expected = 1;
        int actual = chanel.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест переключения уровня громкости по возрастанию
    public void shouldHighVolumeIfPressIncrease() {
        Radio chanel = new Radio();

        chanel.setVolume(5);

        int expected = 6;
        int actual = chanel.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на границу уровня громкости по возрастанию
    public void upBorderVolume() {
        Radio chanel = new Radio();

        chanel.setVolume(10);

        int expected = 0;
        int actual = chanel.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на переключение уровня громкости  по убыванию
    public void shouldLowVolumeIfPressDecrease1() {
        Radio chanel = new Radio();

        chanel.setVolume(4);

        int expected = 3;
        int actual = chanel.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на границу уровня громкости  по убыванию
    public void lowBorderVolume1() {
        Radio chanel = new Radio();

        chanel.setVolume(0);

        int expected = 10;
        int actual = chanel.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    ////тест на границу уровня громкости  по убыванию
    @Test
    public void lowBorderVolume2() {
        Radio chanel = new Radio();

        chanel.setVolume(-1);

        int expected = 0;
        int actual = chanel.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на проверку доступнеости уровней громкости
    public void setNewVolume() {
        Radio chanel = new Radio();

        chanel.setVolume(7);

        int expected = 7;
        int actual = chanel.currentVolume;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    //тест на верхнюю границу допустимых уровней грромкости
    public void setVolumeAboveTheBorder() {
        Radio chanel = new Radio();

        chanel.setVolume(11);

        int expected = 0;
        int actual = chanel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на нижнюю границу допустимых уровней грромкости
    public void setVolumeBelowTheBorder() {
        Radio chanel = new Radio();

        chanel.setVolume(-1);

        int expected = 0;
        int actual = chanel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


