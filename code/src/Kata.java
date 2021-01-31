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
}
