public class MyClickable2 {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        button.reg(new IClick() {  // Анонимный вложенный класс
            @Override
            public void onClick() {
                System.out.println("Нажата кнопка");
            }
        });
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
