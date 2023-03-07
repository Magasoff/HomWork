package Transport;

public enum bodyCar {
    Type1("седан"),
    Type2("хэтчбэк"),
    Type3("купе"),
    Type4("Универсал"),
    Type5("Внедорожник"),
    Type6("Кроссовер"),
    Type7("Пикап"),
    Type8("Фургон"),
    Type9("Минивэн");

    private String name;

    bodyCar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Тип кузова " + name;
    }
}