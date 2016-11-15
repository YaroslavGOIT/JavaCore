package Module_10;

public class Task10_2 {
    public static void main(String[] args) throws My_exceptions{
        try{
            throw new My_exceptions("This is my error");
        }catch (My_exceptions e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("In finally block");
        }
    }
}
