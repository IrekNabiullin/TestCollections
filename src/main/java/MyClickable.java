public class MyClickable {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        IClick ic = new A();
        button.reg(ic);           // Регистрация обработчика
        for (int i = 0; i < 5; i++) {
            button.click();        // Генерируем нажатие
            try {
                Thread.sleep(1000); // Имитация ожидания
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

@FunctionalInterface
interface IClick {
    void onClick();
}

class A implements IClick {
    @Override
    public void onClick() {
        System.out.println("Нажата кнопка");
    }
}
class MyButton {
    private IClick ic = null;
    public void reg(IClick ic) { // Регистрация обработчика
        this.ic = ic;
    }
    public void click() {        // Нажатие кнопки
        if (this.ic != null)
            this.ic.onClick();
    }
}

