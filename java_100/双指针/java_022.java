package java_100.双指针;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 编写一个Java程序，要求用户输入一个整数N和一个整数数组，
// 然后计算并输出数组中最长的无重复元素的子数组的长度。
public class java_022 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0, j = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

            while (map.get(a[i]) > 1) {
                map.put(a[j], map.get(a[j]) - 1);
                j++;
            }

            ans = Math.max(ans, i - j + 1);
        }

        System.out.println(ans);
    }
}
