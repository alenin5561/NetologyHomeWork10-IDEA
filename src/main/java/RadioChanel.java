public class RadioChanel {

    private int minChanel = 0;
    private int maxChanel = 24;
    private int currentChanel = minChanel;

    public int getMinChanel() {

        return minChanel;
    }

    public int getMaxChanel() {

        return maxChanel;
    }

    //Создаем конструктор для установки нового количества радиостаниций
    public RadioChanel(int minChanel, int maxChanel) {
        this.minChanel = minChanel;
        this.maxChanel = maxChanel;
        this.currentChanel = minChanel;

    }

}
