public class DayTwo {
    public static void main(String args[]) {
        System.out.println("Mulptipication table");
        MulptipicationTable obj = new MulptipicationTable();
        obj.table(5);
        obj.tableWithRange(5, 10);
        obj.tableWithStartAndEndRange(1,10,2);
    }

}

class MulptipicationTable {
    void table(int n) {
        for (int i = 1; i <=10; i++) {
            System.out.println(i + "*" + n + "=" + n * i);
        }
        System.out.println("========================================");
    }

    void tableWithRange(int n, int r) {
        for (int i = 1; i <= r; i++) {
            System.out.println(i + "*" + n + "=" + i * n);
        }
        System.out.println("========================================");
    }
    
    void tableWithStartAndEndRange(int s, int e, int n){
        if(s>e){
            for(int i = s; i>=e; i--){
                    System.out.println(i+"*"+n+"="+n*1);
            }
        }else if(s<e){
            for(int i = s; i<=e; i++){
                System.out.println(i+"*"+n+"="+n*i);
            }
        }
        System.out.println("========================================");
    }
}
