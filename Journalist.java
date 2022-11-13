public class Journalist extends AHuman{
    private String name_of_journal;
    private final String default_name_of_journal = "Неизвестный журнал";

    Journalist(){
        super();
        name_of_journal = default_name_of_journal;
    }
    Journalist(String name){
        super(name);
        name_of_journal = default_name_of_journal;
    }
    Journalist(String name,Status status){
        super(name, status);
        name_of_journal = default_name_of_journal;
    }
    Journalist(String name, Status status, String name_of_journal){
        super(name, status);
        this.name_of_journal = name_of_journal;
    }

    public String getName_of_journal(){
        return name_of_journal;
    }

    public void ask_about_rocket(Rocket rocket){
        System.out.println("Журналист " + name + " спрашивает про ракету \"" + rocket.getName() + "\"");
    }

}
