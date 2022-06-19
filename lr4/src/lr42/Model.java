package lr42;

public class Model extends Siemens_mobile{
    private final String model;

    public Model(String model) {
        super();
        this.model = model;
    }

    @Override
    public String getFirm() {
        return super.getFirm();
    }

    @Override
    public void phone() {
        System.out.println(this.getFirm() + " " + this.model + " says bz-bz");
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Model{" +
                "firm='" + this.getFirm() + '\'' + ", " +
                "model='" + model + '\'' +
                '}';
    }
}
