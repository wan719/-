package java_100;

import java.util.Scanner;
import java.util.Arrays;

// 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
public class java_003 { // 定义一个名为java_003的公共类
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：x");
        int x = scan.nextInt();
        System.out.println("请输入第二个整数：y");
        int y = scan.nextInt();
        System.out.println("请输入第三个整数：z");
        int z = scan.nextInt();
        int[] sort = { x, y, z };
        Arrays.sort(sort);
        System.out.println("从小到大排序的结果是：" + Arrays.toString(sort));
        scan.close();
    } // 主方法，用于生成所有可能的三位数组合
}
