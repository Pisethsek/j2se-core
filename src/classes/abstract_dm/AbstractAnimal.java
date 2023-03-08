package classes.abstract_dm;

public abstract class AbstractAnimal implements InterAnimal{

    private String name, color;
    public AbstractAnimal(){}

    public AbstractAnimal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void status() {
        System.out.println("It can live with u");
    }
}
