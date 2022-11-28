import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        double lockprice = 45;
        double stockprice = 30;
        double barrelprice = 25;
        double totallocks = 0;
        double totalstocks = 0;
        double totalbarrels = 0;
        double commission;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the locks,stocks and barrels:");
        int locks = input.nextInt();
        if (locks == -1) {
            System.out.print("当⽉销售活动结束！\n");
        }
        if (locks != -1) {
            int stocks = input.nextInt();
            int barrels = input.nextInt();
            if (1 > locks || locks > 70) {
                System.out.println("对不起，枪机数不能为负数且⼚商限制⼀个⽉只能卖出少于70个！");
            }
            if (1 >= stocks || locks >= 80) {
                System.out.println("对不起，枪托数不能为负数且⼚商限制⼀个⽉只能卖出少于80个！");
            }
            if (1 >= barrels || barrels >= 90) {
                System.out.println("对不起，枪管数不能为负数且⼚商限制⼀个⽉只能卖出少于90个！");
            }
            totallocks = totallocks + locks;
            totalstocks = totalstocks + stocks;
            totalbarrels = totalbarrels + barrels;
            System.out.print("Locks sold:" + totallocks + "\nStocks sold:" + totalstocks + "\nbarrels sold:" + totalbarrels + "\n");
        }
        double locksales = lockprice * totallocks;
        double stocksales = stockprice * totalstocks;
        double barrelsales = barrelprice * totalbarrels;
        double sales = locksales + stocksales + barrelsales;
        System.out.print("total sales:" + sales);
        if (sales > 1800) {
            commission = 0.10 * 1000;
            commission = commission + 0.15 * 800;
            commission = commission + 0.20 * (sales - 1800);
        } else if (sales > 1000) {
            commission = 0.10 * 1000;
            commission = commission + 0.15 * (sales - 1000);
        } else commission = 0.10 * sales;
        System.out.print("commission is $:" + commission);
    }
}