
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
    //тест переключения кнопок по возрастанию
    public void shouldNextChanelIfPressNext() {
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

        chanel.setChanel(0);

        int expected = 9;
        int actual = chanel.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на проверку доступнеости каналов
    public void shouldNewChanel() {
        Radio chanel = new Radio();

        chanel.setChanel(8);

        int expected = 8;
        int actual = chanel.currentChanel;

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
    //тест установки уровня громкости по возрастанию
    public void shouldHighVolumeIfPressIncrease() {
        Radio chanel = new Radio();

        chanel.setVolume(10);

        int expected = 0;
        int actual = chanel.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест установки уровня громкости  по убыванию
    public void shouldLowVolumeIfPressDecrease() {
        Radio chanel = new Radio();

        chanel.setVolume(0);

        int expected = 10;
        int actual = chanel.decreasingVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //тест на проверку доступнеости уровней громкости
    public void shouldNewVolume() {
        Radio chanel = new Radio();

        chanel.setVolume(7);

        int expected = 7;
        int actual = chanel.currentVolume;

        Assertions.assertEquals(expected, actual);


    }
}


