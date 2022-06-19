package lr41;

import java.util.ArrayList;

public class Shop {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Storage{
        ArrayList<String> departments;
        ArrayList<String> goods;
        ArrayList<String> servivices;

        public Storage() {
            this.departments = new ArrayList<>();
            this.goods = new ArrayList<>();
            this.servivices = new ArrayList<>();
        }

        public void add_department(String d){
            this.departments.add(d);
        }

        public void add_goods(String g){
            this.goods.add(g);
        }

        public void add_service(String s){
            this.servivices.add(s);
        }

        @Override
        public String toString() {
            return "Storage{" +
                    "departments=" + departments +
                    ", goods=" + goods +
                    ", servivices=" + servivices +
                    '}';
        }
    }
}
