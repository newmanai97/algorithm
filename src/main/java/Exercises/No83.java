package Exercises;

/**
 * @Author: jiahao
 * @Date: 2023/03/24/11:47
 * @Description: LeetCode83
 */

import DataStructure.ListNode;

import java.util.Objects;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 */
public class No83 {

    public static ListNode deleteDuplicates(ListNode head){
        if (Objects.isNull(head)){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (Objects.nonNull(fast)){
            if (slow.getVal() != fast.getVal()){
                slow.setNext(fast);
                slow = slow.getNext();
            }
            fast = fast.getNext();
        }
        slow.setNext(null);
        return head;
    }


    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode two  = new ListNode(1);
        ListNode three  = new ListNode(2);
        ListNode four  = new ListNode(3);
        ListNode five  = new ListNode(3);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);

        ListNode head = deleteDuplicates(one);
        while (head != null){
            System.out.println("val:" + head.getVal());
            head = head.getNext();
        }
    }
}
