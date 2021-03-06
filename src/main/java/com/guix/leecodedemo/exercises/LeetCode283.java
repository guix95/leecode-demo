package com.guix.leecodedemo.exercises;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @ClassName LeetCode283
 * @Description TODO
 * @Author .abbeyleix
 * @Date 2021/3/30 0030 上午 10:35
 * @Version 1.0
 **/
public class LeetCode283 {
    public static void main(String[] args) {
//        int[] nums = {1,7,0,0,1,2,0,3,12};
        int[] nums = {1,7};
        nums = moveZeroes(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }
    public static int[] moveZeroes(int[] nums) {
        // index 记录数组出现第一个 0 的位置 ,找到非 0 的数值就交换 然后index +1
        // 这样不断 把 非0 数值放到前面 0 放到index 后面
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                nums[index] = nums[i];
                if(i != index){
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
        return nums;
    }
}
