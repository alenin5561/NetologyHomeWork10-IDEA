
public class Radio {

    public int currentChanel;
    //объявлем поле для хранения текущего прослушиваемого канала

    public int getCurrentChanel(){

        return currentChanel;
    }
    //поле для запроса данных о текущем канале

    public int getCurrentVolume(){
        return currentVolume;
    }
    //поле для запроса данных о текущем уровне громкости

    //поле всех каналов

    //метод для переключения каналов по возрастанию
    public int next() {
        if (currentChanel <9) {
            currentChanel++;
        }
        else {
            return currentChanel=0;
        }
        return currentChanel;
    }


    //метод для переключения каналов по убыванию
    public int prev() {
        if (currentChanel < 9) {
            currentChanel--;
        }
        if (currentChanel <0){
            return 9;
        }
        return currentChanel;
    }


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


    public int currentVolume;
    //поле для текущей уровня громкости

    //метод для установки уровня громкости по возрастанию
    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
        else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    //метод для установки уровня громкости по убыванию
    public int decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume--;
        }
        if (currentVolume <0){
            return 10;
        }
        return currentVolume;
    }

    //объявляем поле для установки уровня громкости в диапозоне от 0 до 9
    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

}

