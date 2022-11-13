public class Respondent extends AHuman{
    Respondent(){
        super();
    }
    Respondent(String name){
        super(name);
    }
    Respondent(String name,Status status){
        super(name, status);
    }
    public void answer_about_rocket(Rocket rocket){
        System.out.println(name + " рассказывает про ракту :\"" + rocket.getName() + "\"");
        System.out.println("Ракета сделана из материала " + rocket.getMaterial());
        if(rocket.getBroken()){
            System.out.println("Ракета сломана");
        }
        else{
            System.out.println("Ракета в рабочем состоянии");
        }
    }
}
