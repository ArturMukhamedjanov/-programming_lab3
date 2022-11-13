public class Scientist extends AHuman{
    private Science science;
    private Science default_science = Science.UNKNOWN_SCIENCE;

    Scientist(){
        super();
        science = default_science;
    }
    Scientist(String name){
        super(name);
        science = default_science;
    }
    Scientist(String name, Status status){
        super(name, status);
        science = default_science;
    }
    Scientist(String name, Status status, Science science){
        super(name, status);
        this.science = science;
    }
    public Science getScience(){
        return science;
    }
    public void ask_about_rocket(Rocket rocket){
        System.out.println("Ученый из области науки: "+ science.name() +", по имени "+ name + " спрашивает про ракету \"" + rocket.getName() + "\"");
    }
}
