/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockSpamProblem;

import Stack.StackOperations;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author jaspr_000
 */
public class StockSpanProblem {

    public int[] getstackSpanSolution(int[] arr, int n) {

        int ngl_index[] = new int[n];
        Stack<StackStockSpanrob_store> s = new Stack<>();

        for (int i = 0; i <= n - 1; i++) {
           if (s.isEmpty()) {
                ngl_index[i] = -1;
            } else if (!s.isEmpty() && s.peek().getNgl() > arr[i]) {
                ngl_index[i] = s.peek().getIndex();
            } else if (!s.isEmpty() && s.peek().getNgl() <= arr[i]) {
                while (!s.isEmpty() && s.peek().getNgl() <= arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    ngl_index[i] = -1;
                } else {
                    ngl_index[i] = s.peek().getIndex();
                }
            }
            StackStockSpanrob_store stack_ngl = new StackStockSpanrob_store();
            stack_ngl.setIndex(i);
            stack_ngl.setNgl(arr[i]);
            s.push(stack_ngl);
        }
        return ngl_index;
    }
}
