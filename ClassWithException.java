package Module_10;

public class ClassWithException {
    public static void main(String[] args) throws Exception{
        try{
            throw new Exception("Massage with error");
        } catch (Throwable e){
            System.err.println(e.getMessage());
        }
    }
}
