


public class MultiCatchDemo {
    public static void triggerException(int choice){
        if(choice == 1){
            throw  new ArrayIndexOutOfBoundsException();
        }
        else if(choice == 2){
            throw new  NullPointerException();
        }
        else if(choice == 3){
            throw new ClassCastException();
        }
        else{
            System.out.println("no exception");
        }
    }
    public static void main(String[] args) {
        for(int i =1 ; i <=3 ; i++){
            try{
                triggerException(i);
            }
            // catch(ArrayIndexOutOfBoundsException e){
            //     System.out.println(e);
            // }
            // catch(NullPointerException e){
            //     System.out.println(e);
            // }
            // catch(ClassCastException e){
            //     System.out.println(e);
            // }
            catch(ArrayIndexOutOfBoundsException  | NullPointerException  | ClassCastException e){
                System.out.println(e);
            }
        }
    }
}
