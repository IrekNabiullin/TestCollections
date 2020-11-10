import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyPrintChar {
    public static void main(String[] args) {
        PrintChar obj = new PrintChar("Строка");
        for (Character ch : obj) {
            System.out.println(ch);
        }
        obj.forEach(ch -> System.out.println(ch));
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
    }


    static class PrintChar implements Iterable<Character>,
            Iterator<Character> {
        private String str;
        private int index = 0;

        public PrintChar(String str) {
            this.str = str;
        }

        public int getX(int i) {
            return str.charAt(i);
        }

        @Override
        public Iterator<Character> iterator() {
            return this;
        }

        @Override
        public boolean hasNext() {
            if (this.index < this.str.length()) return true;
            this.index = 0;
            return false;
        }

        @Override
        public Character next() {
            if (this.index >= this.str.length()) {
                this.index = 0;
                throw new NoSuchElementException();
            }
            this.index++;
            return this.str.charAt(this.index - 1);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
