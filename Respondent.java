import java.util.Objects;

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
        System.out.println("Ракета сделана из материала " + rocket.getMaterial().getName());
        if(rocket.getBroken()){
            System.out.println("Ракета сломана");
        }
        else{
            System.out.println("Ракета в рабочем состоянии");
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Respondent respondent = (Respondent) o;
        return getName().equals(respondent.getName())
                && getStatus() == respondent.getStatus()
                && getCondition() == respondent.getCondition()
                && getPlace().equals(respondent.getPlace());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getStatus(), getCondition(), getPlace());
    }
    @Override
    public String toString(){
        return "Respondent{" +
                "name='" + getName() + '\''+
                ", status=" + getStatus() +
                ", condition=" + getCondition() +
                ", place=" + getPlace() +"}";
    }
}
