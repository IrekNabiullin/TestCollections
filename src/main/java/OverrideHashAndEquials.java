import java.util.ArrayList;

public class OverrideHashAndEquials {
    //Written by K@stackoverflow
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            ArrayList<Person> people = new ArrayList<Person>();
            people.add(new Person("Name1", 28));
            people.add(new Person("Name2", 28));
            people.add(new Person("Name3", 4));
            people.add(new Person("Name1", 28));

            for (int i = 0; i < people.size() - 1; i++) {
                for (int y = i + 1; y <= people.size() - 1; y++) {
                    boolean check = people.get(i).equals(people.get(y));

                    System.out.print("-- " + people.get(i).getName() + " - VS - " + people.get(y).getName() + ": ");
                    System.out.println(check);
                }
            }
        }
    }



    //written by K@stackoverflow
    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (obj.getClass() != this.getClass()) {
                return false;
            }

            final Person other = (Person) obj;
            if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
                return false;
            }

            if (this.age != other.age) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
            hash = 53 * hash + this.age;
            return hash;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

