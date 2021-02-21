public class Main {
    public static void main(String[] args){
            int[] list = EnoughIsEnough.deleteNth(new int[] { 7, 0, 6, 8, 6, 6, 11, 8, 8, 3, 3, 2 }, 8 );
        System.out.println(list.length);
        for(int item : list){
            System.out.print(item);
        }
    }
}
