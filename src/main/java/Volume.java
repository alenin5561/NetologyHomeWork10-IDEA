public class Volume {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }
    //поле для запроса данных о текущем уровне громкости

    //объявляем поле для установки уровня громкости в диапозоне от 0 до 9
    public void setVolume(int newVolume) {

        currentVolume = newVolume;
    }

    //Создаем конструктор для установки новой границы уровня громкости
    public Volume(int minSound, int maxSound) {
        this.minVolume = minSound;
        this.maxVolume = maxSound;
        this.currentVolume = currentVolume;

    }

    //метод для установки уровня громкости по возрастанию
    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            return currentVolume = maxVolume;
        }
        return currentVolume;
    }

    //метод для установки уровня громкости по убыванию
    public int decreaseVolume() {
        if (currentVolume < 100) {
            currentVolume--;
        }
        if (currentVolume < 0) {
            return minVolume = 0;
        }
        return currentVolume;
    }

}

