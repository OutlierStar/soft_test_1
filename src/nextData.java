import java.util.Scanner;

public class nextData {
    public static void NextDate(int year, int month, int day) {
        if (year % 4 == 0 && year % 100 != 0 && month == 2 && day == 29) {//当为润年的时候,二月有29天
            month = month + 1;
            day = 1;
            System.out.printf("%d", year);
            System.out.printf("年");
            System.out.printf("%d", month);
            System.out.printf("月");
            System.out.printf("%d", day);
            System.out.printf("日");
        } else if (month == 2 && day == 28) {//当该年为平年的时候，二月为28天,输出日期后一天，月份加1，将具体几号置为1
            month = month + 1;
            day = 1;
            System.out.printf("%d", year);
            System.out.printf("年");
            System.out.printf("%d", month);
            System.out.printf("月");
            System.out.printf("%d", day);
            System.out.printf("日");

        } else if (month == 12 && day == 31) {//当输入月份为12月31日此情况下要输出后一天则要将其年份加1，月份和日期号置为1
            year = year + 1;
            month = 1;
            day = 1;
            System.out.printf("%d", year);
            System.out.printf("年");
            System.out.printf("%d", month);
            System.out.printf("月");
            System.out.printf("%d", day);
            System.out.printf("日");
        }
        //当输入月大，日子为最大31号，则执行月份+1，日期号置为1
        else if (month == 1 && day == 31 || month == 3 && day == 31 || month == 5 && day == 31 || month == 7 && day == 31 || month == 8 && day == 31 || month == 10 && day == 31) {
            month = month + 1;
            day = 1;
            System.out.printf("为什么输出");
            System.out.printf("%d", year);
            System.out.printf("年");
            System.out.printf("%d", month);
            System.out.printf("月");
            System.out.printf("%d", day);
            System.out.printf("日");
        } else if (month == 4 && day == 30 || month == 6 && day == 30 || month == 9 && day == 30 || month == 11 && day == 30) {
            month = month + 1;
            day = 1;
            System.out.printf("%d", year);
            System.out.printf("年");
            System.out.printf("%d", month);
            System.out.printf("月");
            System.out.printf("%d", day);
            System.out.printf("日");
        } else {
            day = day + 1;
            System.out.printf("%d", year);
            System.out.printf("年");
            System.out.printf("%d", month);
            System.out.printf("月");
            System.out.printf("%d", day);
            System.out.printf("日");
        }
    }

    public static void ErrorTip(int i) {//当输入年份月份日期号不正确的时候给出的提示
        System.out.println("输入的整数不合法");
    }

    public static void main(String[] args) {//主函数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scan.nextInt();
        if (year > 1998 && year < 2051) {
            System.out.println("请输入月份");
        } else {
            ErrorTip(year);
        }
        int month = scan.nextInt();
        if (month > 0 && month < 13) {
            System.out.println("请输入具体几号");
        } else {
            ErrorTip(month);
        }
        int day = scan.nextInt();//输入天数
        if (year % 4 == 0 && year % 100 != 0 && month == 2)//当输入的年份该年为润年的情况下
        {
            if (day > 0 && day < 30)
                NextDate(year, month, day);
            else
                ErrorTip(day);
        } else if (month == 2) {//输入的该年为平年的情况如下
            if (day > 0 && day < 29)
                NextDate(year, month, day);
            else
                ErrorTip(month);
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {//月大则一个月有31天
            if (day > 0 && day < 32)
                NextDate(year, month, day);
            else
                ErrorTip(day);
        } else {//月小则一月有30天二月份除外
            if (day > 0 && day < 31)
                NextDate(year, month, day);
            else
                ErrorTip(day);
        }
        scan.close();
    }
}
