public class multi_catch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        
        System.out.println("rest of the code");
    }
    
}
