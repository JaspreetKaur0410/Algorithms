/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NextGreaterElementRight;

import Stack.StackOperations;

/**
 *
 * @author jaspr_000
 */
public class NextSmallerElement_Left {
    
    public int[] getVectorNextSmallerElement_Left(int[] array, int n){
        int[] result = new int[n];
        StackOperations stack = new StackOperations();
        stack.top = -1;
        //int j = 0;
        for (int i = 0; i<n; i++) {
            if (stack.top == -1) {
                result[i] = -1;
            } else {
                if (!stack.isEmpty() && stack.getTopElement() < array[i]) {
                    result[i] = stack.getTopElement();
                } else if (!stack.isEmpty() && stack.getTopElement() >= array[i]) {
                    // POP
                    while (!stack.isEmpty() && stack.getTopElement() >= array[i]) {
                        System.out.println("TOP is " + stack.top);
                        System.out.println("TOP ELEMENT IS " + stack.getTopElement());
                        stack.pop();
                    }
                    if (stack.isEmpty()) {
                        result[i] = -1;
                    } else {
                        result[i] = stack.getTopElement();
                    }
                }
            }
            //j++;
            stack.push(array[i]);
        }
        return result;
    }  
}
