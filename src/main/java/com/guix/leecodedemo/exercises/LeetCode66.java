package com.guix.leecodedemo.exercises;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * @ClassName LeetCode66
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/30 0030 上午 9:22
 * @Version 1.0
 **/
public class LeetCode66 {
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
        // 从后向前循环数组, +1 进位
        for(int i = digits.length-1; i >= 0; i--) {
            // 数组当前元素+1 后 除10 取余赋值当前元素 , 得0 代表需要进位就继续循环
            digits[i]++;
            digits[i] %= 10; //得0 ,同时赋值为0
            // 除10 取余赋值当前元素 不等于0 说明 +1 不再需要进位 直接返回数组
            if(digits[i]!=0)
                return digits;
        }
        //走到这里说明 数组循环完还需进位
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
