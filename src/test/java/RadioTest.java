
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    //тест на установку нового количества каналов
    public void shouldSetNewChanelNumber() {
        RadioChanel chanel = new RadioChanel(0, 24);

        Assertions.assertEquals(24, chanel.getMaxChanel());
        Assertions.assertEquals(0, chanel.getMinChanel());
    }

    @Test
    // тест на проверку текущего канала
    public void shouldSetCurrentChanel() {
        Radio chanel = new Radio();

        chanel.setChanel(2);

        int expected = 2;
        int actual = chanel.getCurrentChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест переключения канала по возрастанию
    public void shouldNextChanelIfPressNext() {
        Radio chanel = new Radio();

        chanel.setChanel(6);

        int expected = 7;
        int actual = chanel.next();

        Assertions.assertEquals(expected, actual);
    }

    //тест на верхнюю границу
    @Test
    public void upBorderNext() {
        Radio chanel = new Radio();

        chanel.setChanel(9);

        int expected = 0;
        int actual = chanel.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест переключения каналов по убыванию
    public void shouldPreviousChanelIfPressPrevious() {
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
        int actual = chanel.getCurrentChanel();

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
        Volume sound = new Volume(0, 100);

        sound.setVolume(40);

        int expected = 40;
        int actual = sound.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест переключения уровня громкости по возрастанию
    public void shouldHighVolumeIfPressIncrease() {
        Volume sound = new Volume(0, 100);

        sound.setVolume(25);

        int expected = 26;
        int actual = sound.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на границу уровня громкости по возрастанию
    public void upBorderVolume() {
        Volume sound = new Volume(0, 100);

        sound.setVolume(100);

        int expected = 100;
        int actual = sound.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на переключение уровня громкости  по убыванию
    public void shouldLowVolumeIfPressDecrease1() {
        Volume sound = new Volume(0, 100);

        sound.setVolume(33);

        int expected = 32;
        int actual = sound.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }


    ////тест на границу уровня громкости  по убыванию
    @Test
    public void lowBorderVolume1() {
        Volume sound = new Volume(0, 100);

        sound.setVolume(0);

        int expected = 0;
        int actual = sound.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}


