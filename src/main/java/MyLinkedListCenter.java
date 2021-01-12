/*
1. Как найти средний элемент в LinkedList за один проход?
Решение.
В этой задаче достаточно ввести два указателя. Первый будет увеличиваться при прохождении одного узла списка,
второй – при прохождении двух узлов. В момент, когда второй указатель дойдёт до конца списка (наткнётся на NULL),
первый будет указывать на середину списка.
 */

public class MyLinkedListCenter {
        public static void main(String args[]) {
            LinkedList2 linkedList2 = new LinkedList2();
            LinkedList2.Node head = linkedList2.head();
            linkedList2.add( new LinkedList2.Node("1"));
            linkedList2.add( new LinkedList2.Node("2"));
            linkedList2.add( new LinkedList2.Node("3"));
            linkedList2.add( new LinkedList2.Node("4"));
            linkedList2.add( new LinkedList2.Node("5"));
            linkedList2.add( new LinkedList2.Node("6"));
            linkedList2.add( new LinkedList2.Node("7"));
            linkedList2.add( new LinkedList2.Node("8"));
            linkedList2.add( new LinkedList2.Node("9"));
            linkedList2.add( new LinkedList2.Node("10"));
            LinkedList2.Node current = head;
            int length = 0;
            LinkedList2.Node middle = head;
            while(current.next() != null){
                length++;
                if(length%2 ==0){
                    middle = middle.next();
                }
                current = current.next();
            }
            if(length%2 == 1){
                middle = middle.next();
            }
            System.out.println("length of LinkedList: " + length);
            System.out.println("middle element of LinkedList : " + middle);
        }
    }
    class LinkedList2{
        private Node head;
        private Node tail;
        public LinkedList2(){
            this.head = new Node("head");
            tail = head;
        }
        public Node head(){
            return head;
        }
        public void add(Node node){
            tail.next = node;
            tail = node;
        }
        public static class Node{
            private Node next;
            private String data;
            public Node(String data){
                this.data = data;
            }
            public String data() {
                return data;
            }
            public void setData(String data) {
                this.data = data;
            }
            public Node next() {
                return next;
            }
            public void setNext(Node next) {
                this.next = next;
            }
            public String toString(){
                return this.data;
            }
        }
    }
