/**
 * Класс, представляющий покупателя в старой системе записей.
 */
public class OldCustomer {
    private String lastName;    // Фамилия покупателя
    private String firstName;   // Имя покупателя
    private String middleName;  // Отчество покупателя
    private String dateOfBirth; // Дата рождения покупателя

    /**
     * Конструктор класса OldCustomer.
     *
     * @param lastName    Фамилия покупателя
     * @param firstName   Имя покупателя
     * @param middleName  Отчество покупателя
     * @param dateOfBirth Дата рождения покупателя
     */
    public OldCustomer(String lastName, String firstName, String middleName, String dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Получить полное имя покупателя.
     *
     * @return Полное имя в формате "Фамилия Имя Отчество"
     */
    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    /**
     * Получить дату рождения покупателя.
     *
     * @return Дата рождения
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "OldCustomer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
