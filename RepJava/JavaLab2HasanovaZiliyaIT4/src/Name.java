public class Name {
    private String surname;        // Фамилия
    private String personalName;   // Имя
    private String patronymic;     // Отчество

    public Name(String surname, String personalName, String patronymic) {
        this.surname = surname;
        this.personalName = personalName;
        this.patronymic = patronymic;
    }

    public Name(String surname, String personalName) {
        this.surname = surname;
        this.personalName = personalName;
        this.patronymic = null;
    }

    public Name(String personalName) {
        this.surname = null;
        this.personalName = personalName;
        this.patronymic = null;
    }

    @Override
    public String toString() {
        String result = "";

        if (surname != null && !surname.isEmpty()) {
            result += surname;
        }

        if (personalName != null && !personalName.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += personalName;
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += patronymic;
        }

        return result;
    }
}




