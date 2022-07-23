public class RadioChanel {

    private int minChanel = 0;
    private int maxChanel = 24;
    private int currentChanel = minChanel;

    //Создаем конструктор для установки нового количества радиостаниций
    public RadioChanel (int minChanel, int maxChanel){
        this.minChanel = minChanel;
        this.maxChanel = maxChanel;
        this.currentChanel = minChanel;

    }

    public int getMaxChanel(){
        return maxChanel;
    }
    public int getMinChanel(){
        return minChanel;
    }
}
