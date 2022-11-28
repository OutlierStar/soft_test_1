import java.util.Scanner;
public class triangle {
    public static void triangle(int a,int b,int c) {
        if(a<1||a>200){
            System.out.println("请输入合法的a");
        }else if(b<1 || b>200){
            System.out.println("请输入合法的b");
        }else if(c<1 || c>200){
            System.out.println("请输入合法的c");
        }else if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a){
            if (a == b && a == c && b == c) {
                System.out.print("是一个等边三角形");
            } else if (a == b || a == c || b == c) {
                System.out.print("是一个等腰三角形");
            } else {
                System.out.print("是一个一般三角形");
            }
        }else {
            System.out.print("不能构成三角形");
        }
    }


    public static void main(String[] args){
        int a;
        int b;
        int c;
        System.out.println("请输入三角形的三边: ");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        triangle(a,b,c);

    }

}
