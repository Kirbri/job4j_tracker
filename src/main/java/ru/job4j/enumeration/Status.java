package ru.job4j.enumeration;

public enum Status implements Code {
    ACCEPTED(1, "Принят") {
        private String message = "Автомобиль принят на СТО";

        @Override
        public String getMessage() {
            return message;
        }

    },
    IN_WORK(2, "В работе") {
        private String message = "Автомобиль в работе";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING(3, "Ожидание") {
        private String message = "Автомобиль ожидает запчасти";

        @Override
        public String getMessage() {
            return message;
        }
    },
    FINISHED(4, "Работы завершены") {
        private String message = "Все работы завершены";

        @Override
        public String getMessage() {
            return message;
        }
    };

    @Override
    public int code() {
        return code;
    }

    private final String text;
    private final int code;

    Status(int code, String text) {
        this.text = text;
        this.code = code;
    }

    public String getInfo() {
        return code + " " + text;
    }

    public abstract String getMessage();

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota.getInfo());
        System.out.println("Статус Volvo: " + volvo.getInfo());
    }
}