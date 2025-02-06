public class DayFive {
    public static void main(String[] args) {
        String name1 = "Chandhru";
        String name2 = new String("Chandhru");
        // try to understand why it is false
        if(name1==name2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
