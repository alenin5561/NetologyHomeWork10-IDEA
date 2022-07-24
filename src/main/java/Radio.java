
public class Radio {

    private int currentChanel;


    public int getCurrentChanel() {

        return currentChanel;
    }
    //поле для запроса данных о текущем канале

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


    //метод для переключения каналов по возрастанию
    public int next() {
        if (currentChanel < 9) {
            currentChanel++;
        } else {
            return  0;
        }
        return currentChanel;
    }


    //метод для переключения каналов по убыванию
    public int prev() {
        if (currentChanel < 9) {
            currentChanel--;
        }
        if (currentChanel < 0) {
            return 9;
        }
        return currentChanel;
    }


}
