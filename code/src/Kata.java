import java.util.*;

public class Kata {
    public String convertIndex(int num, String low, String mid, String high){
        switch (num){
            case 1:
                return ""+low;
            case 2:
                return ""+low+low;
            case 3:
                return ""+low+low+low;
            case 4:
                return ""+low+mid;
            case 5:
                return ""+mid;
            case 6:
                return ""+mid+low;
            case 7:
                return ""+mid+low+low;
            case 8:
                return ""+mid+low+low+low;
            case 9:
                return ""+low+high;
        }
        return "";
    }
    public String toRomanNum(int n){

        String output = "";

        int M = 1000;
        int D = 500;
        int C = 100;
        int L = 50;
        int X = 10;
        int V = 5;
        int I = 1;

        System.out.println(n);
            for(int i = 0; i < n / 1000; i ++){
                output += "M";
            }
            n -= M * (n / M);

            /*
            * divide by 100
            * if1 - 2 -> c
            * if3 - 7 -> dc  cd
            * if8 - 9 -> cM
            * */
            output += this.convertIndex(n/C,"C","D","M");
            n -= C *(n/C);

            output += this.convertIndex(n/X,"X","L","C");
            n -= X * (n/X);

            output += this.convertIndex(n/I,"I","V","X");
            n -= I * (n/I);

            System.out.println(output);
            return output;

    }
    public int[] deadFish(String data){
        List<Integer> output = new ArrayList<>();
        int val = 0;
        for(int i = 0; i < data.length(); i++){
            switch (data.charAt(i)){
                case 'i':
                    val++;
                    break;
                case 'd':
                    val--;
                    break;
                case 's':
                    val *= val;
                    break;
                case 'o':
                    output.add(val);
                    break;
            }
        }
        System.out.println(output);
        int [] result = new int[output.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = output.get(i).intValue();
        }

        return result;
    }
    public String convertSecondsToHMS(int seconds){

        int H = seconds / 3600;
        seconds = seconds%3600;
        int M = seconds / 60;
        int S = seconds % 60;
        String hString = H < 10 ? "0"+H : ""+H;
        String mString = M < 10 ? "0"+M : ""+M;
        String sString = S < 10 ? "0"+S : ""+S;


        return hString + ":"+mString+":"+sString;
    }
    public String whoIsNext(String[] names, int n){
        Deque<String> queue = new ArrayDeque<>();

        for(int i = 0; i < names.length; i++){
            queue.add(names[i]);
        }

        System.out.println(queue);

        for(int i = 0; i < n-1; i++){
            String temp = queue.poll();
            queue.add(temp);
            queue.add(temp);
        }

        return queue.getFirst();
    }
}
