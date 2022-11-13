public class Main {
    public static void main(String[] args){
        //создаем ракету, которая прилетела с земли на луну
        Rocket rocket = new Rocket("Ракета с земли", Material.METAL);
        rocket.fly("Луна");
        //создаем улицу, сцену и наполняем ее стульями
        Street street = new Street("Улица перед студией");
        Scene scene = new Scene("Главная сцена");
        Chair chair1 = new Chair("Первый стул",Material.METAL);
        Chair chair2 = new Chair("Второй стул",Material.METAL);
        Chair chair3 = new Chair("Третий стул",Material.METAL);
        scene.setFurniture(chair1);
        scene.setFurniture(chair2);
        scene.setFurniture(chair3);
        //создаем действующие лица
        Respondent neznaika = new Respondent("Незнайка");
        neznaika.sitDown(chair1);
        Respondent miga = new Respondent("Мига");
        miga.sitDown(chair2);
        Respondent kozlik = new Respondent("Козлик");
        kozlik.sitDown(chair3);
        //создаем тех, кто будет задавать вопросы
        Journalist journalist = new Journalist("Журналюга", Status.CALM,"Luna Today");
        Scientist scientist = new Scientist("Безумный ученый", Status.SAD, Science.PHYSICS);
        //диалог
        scientist.ask_about_rocket(rocket);
        neznaika.answer_about_rocket(rocket);
        journalist.ask("Как прошел полет?");
        miga.answer("Хорошо, но было страшно");

    }
}
