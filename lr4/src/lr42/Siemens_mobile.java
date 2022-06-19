package lr42;

public abstract class Siemens_mobile implements Mobile{
    private final String firm;

    public Siemens_mobile() {
        this.firm = "Siemens";
    }

    public String getFirm() {
        return firm;
    }


    @Override
    public String toString() {
        return "Siemens_mobile{" +
                "firm='" + firm + '\'' +
                '}';
    }
}
