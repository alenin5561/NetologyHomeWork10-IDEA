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
    public Volume(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;

    }

    //метод для установки уровня громкости по возрастанию
    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    //метод для установки уровня громкости по убыванию
    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

}

