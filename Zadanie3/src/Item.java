public class Item {

    String name;
    int id;

    Item(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(this.name);
    }

}
