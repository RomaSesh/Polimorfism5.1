import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс для демонстрации работы с записями о покупателях.
 */
public class Main {
    public static void main(String[] args) {
        // Создание коллекции для хранения покупателей
        List<OldCustomer> shoppers = new ArrayList<>();

        // Добавление покупателей в коллекцию
        shoppers.add(new OldCustomer("Иванов", "Иван", "Иванович", "01.01.1980"));
        shoppers.add(new NewCustomer("Петров", "Петр", "Петрович", "02.02.1990", "89001234567"));
        shoppers.add(new NewCustomer("Сидоров", "Сидор", "Сидорович", "03.03.1985", "89007654321"));

        // Вывод информации о всех покупателях
        System.out.println("Информация о всех покупателях:");
        for (OldCustomer shopper : shoppers) {
            System.out.println(shopper);
        }
        // Поиск телефона по фамилии, имени и отчеству
        String searchFullName = "Петров Петр Петрович";
        String phoneNumber = findPhoneNumber(shoppers, searchFullName);
        System.out.println("Номер телефона для " + searchFullName + ": " + phoneNumber);

        // Полная информация о новых записях
        System.out.println("Новые записи:");
        for (OldCustomer shopper : shoppers) {
            if (shopper instanceof NewCustomer) {
                System.out.println(shopper);
            }
        }

        // Количество старых и новых записей
        int oldCount = 0, newCount = 0;
        for (OldCustomer shopper : shoppers) {
            if (shopper instanceof NewCustomer) {
                newCount++;
            } else {
                oldCount++;
            }
        }
        System.out.println("Количество старых записей: " + oldCount);
        System.out.println("Количество новых записей: " + newCount);
    }

    /**
     * Найти номер телефона покупателя по его полному имени.
     *
     * @param shoppers   Список покупателей
     * @param fullName   Полное имя покупателя
     * @return Номер телефона или сообщение о том, что он не найден
     */
    private static String findPhoneNumber(List<OldCustomer> shoppers, String fullName) {
        for (OldCustomer shopper : shoppers) {
            if (shopper.getFullName().equals(fullName) && shopper instanceof NewCustomer) {
                return ((NewCustomer) shopper).getPhoneNumber();
            }
        }
        return "Телефон не найден";
    }
}
