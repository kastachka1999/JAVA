public class Patient extends Human {
    private String status;
    private Integer priority;

    /**
     * Выставляет приоритет клиента(пациента)
     * @param a - жалоба,цель посещения
     */
    private void Priority(String a){
        if (a.equalsIgnoreCase("боль")) this.priority =  1;
        else if (a.equalsIgnoreCase("лечение")) this.priority =  2;
        else if (a.equalsIgnoreCase("консультация")) this.priority =  3;
        else {
            this.priority = 0;
            System.out.println("Измените статус пациента (боль,лечение,консультанция) для назначения лечения");
        }
    }

    public Patient(String name, String surname, String gender, Integer age, String status) {
        super(name, surname, gender, age);
        this.status = status;
        Priority(status);
    }

    public Patient(String status) {
        this.status = status;
        Priority(status);
    }

    /**
     * Возвращает обьект с параметрами класса (име,фамилия,пол,год,приоритет)
     * @param a - любая строка
     * @return - Object[]
     */
    @Override
    public Object[] toArray(String a) {
        return super.toArray(this.priority.toString());
    }

    public Integer getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
