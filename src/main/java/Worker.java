import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;

public class Worker extends Human implements Healthing{
    private String role;

    /**
     * Сравнивает из существующующей роли роль введенную.При неверном вводе присвивает роль "неопределена" и просит изменить
     * @param a - роль работника
     */
    private void Role(String a){
        if (a.equalsIgnoreCase("врач") || a.equalsIgnoreCase("медсестра"))
        {
            this.role = a;
        } else {
            System.out.println("Для дальнейшей работы необходимо правильно указать " +
                    "роль сотрудника (врач или медсестра).Используйте метод setRole('')");
            this.role = "неопределена";
        }
    }

    public Worker(String name, String surname, String gender, Integer age, String role) {
        super(name, surname, gender, age);
        Role(role);
    }

    @Override
    public void Health(Patient pat) {
        pat.setStatus("здоров");
    }

    /**
     * Возвращает обьект с параметрами класса (име,фамилия,пол,год,специализация
     * @param a - любая строка
     * @return - Object[]
     */
    @Override
    public Object[] toArray(String a) {
        return super.toArray(this.role.toString());
    }
    public Worker(String role) {
        Role(role);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
