package lr42;

public abstract class Warship implements Ship{

    private String code;

    public Warship(String code) {
        this.code = code;
    }


    @Override
    public void swim() {
        System.out.println(this.code + " goes brrrr");
    }

    @Override
    public String getName() {
        return code;
    }
}
