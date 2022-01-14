public class palindromeNumber {

    public static void main(String[] args) {


        int x=1212121;
        int temp=x;
        int n=0;

        while (temp>0){
            n=10*n+temp%10;
            temp/=10;
        }

        if ((n == x)) {
            System.out.println("true");} else { System.out.println("false");}
    }

    }

