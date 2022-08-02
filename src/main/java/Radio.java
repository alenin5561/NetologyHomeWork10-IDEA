
public class Radio {

    private int currentChanel;

    private int currentVolume;
    private int chanels;

    public int getCurrentChanel() {

        return currentChanel;
    }
    //поле для запроса данных о текущем канале

    public int getCurrentVolume() {

        return currentVolume;
    }
    //поле для запроса данных о текущем уровне громкости

    //объявляем поле для переключения между каналами которые находяться в диапозоне от 0 до 9
    public void setChanel(int newChanel) {
        if (newChanel < 0) {
            return;
        }
        if (newChanel > 9) {
            return;
        }
        currentChanel = newChanel;
    }

    //объявляем поле для установки уровня громкости
    public void setVolume(int newVolume) {
        currentVolume = newVolume;
    }

    //конструктор с каналами котороые мы задаем по умолчанию
    public Radio() {
        this.chanels = 10;
    }

    //конструктор с установкой каналов котороые мы хотим установить и которые будут достпуны в этом диапозоне
    public Radio(int chanels) {
        this.chanels = chanels;
    }


    //метод для переключения каналов по возрастанию
    public int next() {
        if (currentChanel < chanels - 1) {
            currentChanel++;
        } else {
            currentChanel = 0;
        }
        return currentChanel;
    }


    //метод для переключения каналов по убыванию
    public int prev() {
        if (currentChanel > 0) {
            currentChanel--;
        } else {
            currentChanel = chanels - 1;
        }
        return currentChanel;
    }

    //метод для установки уровня громкости по возрастанию
    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    //метод для установки уровня громкости по убыванию
    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

}
