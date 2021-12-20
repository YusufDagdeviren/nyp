public class YusufExcepiton extends Exception {
    public YusufExcepiton(String message){
        super(message);
    }
    @Override
    public String getMessage() {
        return "Sinif calisiyor";
    }
}
