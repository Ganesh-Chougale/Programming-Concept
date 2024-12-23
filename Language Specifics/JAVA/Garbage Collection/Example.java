public class Example {
    public static void main(String[] args) {

        TempOBJ obj1 = new TempOBJ("Ganesh");

        System.out.println(obj1.toString());

        // Nullifying object
        obj1 = null;

        // activate garbage colletion
        System.gc();

        System.out.println("Removed the obj1 from memory");
    }

}

class TempOBJ {
    String name;

    public TempOBJ(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello " + name + " how are you?";
    }
}