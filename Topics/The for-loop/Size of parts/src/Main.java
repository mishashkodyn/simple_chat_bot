import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int shipped = 0, fixed = 0, rejects = 0;
        for(int i = 0; i < n; i++){
            int num = scanner.nextInt();
            if(num == 0) shipped++;
            if(num == 1) fixed++;
            if(num == -1) rejects++;
        }
        System.out.println(shipped + " " + fixed + " " + rejects);
    }
}