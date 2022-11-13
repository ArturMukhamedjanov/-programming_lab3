import java.util.Random;

public class Rocket implements IFlyable{
    private String name;
    private Material material;
    private boolean broken;
    Rocket(String name, Material material){
        this.name = name;
        this.material = material;
        this.broken = false;
    }

    public String getName() {
        return name;
    }
    public Material getMaterial(){
        return material;
    }
    public boolean getBroken(){return broken;}
    public void fly(String location){
        if (!broken) {
            takeoff();
            Random random = new Random();
            if(random.nextBoolean()){
                fall();
                broken = true;
            }
            else {
                System.out.println("Ракета \"" + name + "\" летит на локацию " + location);
                landing();
            }
        }
        else{
            System.out.println("Ракета \"" + name + "\" сломана! Полет невозможен.");
        }
    }
    public void fall(){
        System.out.println("Ракета \"" + name + "\" упала");
    }
    public void landing(){
        System.out.println("Ракета \"" + name+ "\" успешно приземлилась");
    }
    public void takeoff(){
        System.out.println("Ракета \"" + name + "\" успешно взелета");
    }
}
