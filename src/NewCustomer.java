/**
 * Класс, представляющий покупателя в новой системе записей.
 * Наследует от класса OldCustomer и добавляет номер телефона.
 */
public class NewCustomer extends OldCustomer {
    private String phoneNumber; // Номер мобильного телефона покупателя

    /**
     * Конструктор класса NewCustomer.
     *
     * @param lastName    Фамилия покупателя
     * @param firstName   Имя покупателя
     * @param middleName  Отчество покупателя
     * @param dateOfBirth Дата рождения покупателя
     * @param phoneNumber Номер телефона покупателя
     */
    public NewCustomer(String lastName, String firstName, String middleName, String dateOfBirth, String phoneNumber) {
        super(lastName, firstName, middleName, dateOfBirth);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Получить номер телефона покупателя.
     *
     * @return Номер телефона
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "NewCustomer{" +
                "lastName='" + super.getFullName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
