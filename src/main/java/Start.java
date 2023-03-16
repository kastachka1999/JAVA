public  class Start {
    public static void main(String[] args) {
        Patient a = new Patient("Толя","Иванов","мужской",23,"боль");
        Patient b = new Patient("Дима","Петухов","мужской",23,"лечение");
        Patient g = new Patient("Анна","Петухов","мужской",23,"лечение");
        Patient c = new Patient("Женя","Хачев","мужской",32,"консультация");
        Worker v = new Worker("Инна","Ветовласова","женский",34,"врач");
        Sick<Integer,Patient> sicks = new Sick<>();

        sicks.add(a.getId(),a);
        sicks.add(b.getId(),b);
        sicks.add(g.getId(),g);
        sicks.add(c.getId(),c);

        sicks.ConsoleLog();

        System.out.println(sicks.Priority().getStatus() + " " + sicks.Priority().getName());

        v.Health(sicks.Priority());
        sicks.ConsoleLog();

        WriteFile asd= new WriteFile("1234","12.03.2022 17:00","Костко Артем Александрович");
        asd.Write(sicks.getSicks());

    }
}
