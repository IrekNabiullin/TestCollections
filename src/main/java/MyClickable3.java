public class MyClickable3 {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        button.reg( //лямда-выражение вместо анонимного вложенного класса
                () -> System.out.println("Нажата кнопка")
        );
        for (int i = 0; i < 5; i++) {
            button.click();        // Генерируем нажатие
            try {
                Thread.sleep(1000); // Имитация ожидания
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

