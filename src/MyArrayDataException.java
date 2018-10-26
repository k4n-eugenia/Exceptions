public class MyArrayDataException extends RuntimeException {

    private String message;

    public MyArrayDataException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

}
