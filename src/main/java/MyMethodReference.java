public class MyMethodReference {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        B b = new B();
        button.reg(b::printOnClick); // Передаем ссылку на метод
        for (int i = 0; i < 5; i++) {
            button.click();           // Генерируем нажатие
            try {
                Thread.sleep(1000);    // Имитация ожидания
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

interface IntClick {
    void onClick();
}

class B {
    private int x = 10;

    public void printOnClick() {
        System.out.println("Нажата кнопка. x = " + this.x);
        this.x++;
    }
}

class MyNewButton {
    private IntClick ic = null;

    public void reg(IntClick ic) { // Регистрация обработчика
        this.ic = ic;
    }

    public void click() {        // Нажатие кнопки
        if (this.ic != null)
            this.ic.onClick();
    }
}
