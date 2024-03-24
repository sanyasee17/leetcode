package leetcode.LeetCode225;


// https://leetcode.com/problems/implement-stack-using-queues/

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        this.main = new LinkedList<>();
        this.helper = new LinkedList<>();
    }

    public void push(int x) {
        main.add(x);
    }

    public int pop() {
        int size = main.size();
        for (int i = 0; i < size - 1; i++) {
            helper.add(main.poll());
        }
        int topItem = main.poll();
        while(!helper.isEmpty()) {
            main.add(helper.poll());
        }
        return topItem;
    }

    public int top() {
        int size = main.size();
        for (int i = 0; i < size - 1; i++) {
            int temp = main.poll();
            helper.add(temp);
        }
        int topItem = main.poll();
        helper.add(topItem);
        while(!helper.isEmpty()) {
            main.add(helper.poll());
        }
        return topItem;
    }

    public boolean empty() {
        return main.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(2);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
