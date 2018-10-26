public class MyArraySizeException extends RuntimeException {

    private String message;

    public MyArraySizeException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
