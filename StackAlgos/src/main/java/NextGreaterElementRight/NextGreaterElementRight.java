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
public class NextGreaterElementRight {

    public int[] getVectorNextGreaterElement(int[] nextgreaterelement_array, int n) {
        int[] result = new int[n];
        StackOperations stack = new StackOperations();
        stack.top = -1;
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {

            if (stack.top == -1) {
                result[j] = -1;
            } else {
                if (!stack.isEmpty() && stack.getTopElement()>nextgreaterelement_array[i]) {
                    result[j] = stack.getTopElement();
                } else if (!stack.isEmpty() && nextgreaterelement_array[i] >= stack.getTopElement()) {
                    // POP
                    while (!stack.isEmpty() && nextgreaterelement_array[i] >= stack.getTopElement() ) {
                        System.out.println("TOP is " + stack.top);
                        System.out.println("TOP ELEMENT IS " + stack.getTopElement());
                        stack.pop();
                    }
                    if (stack.isEmpty()) {
                        result[j] = -1;
                    } else {
                        result[j] = stack.getTopElement();
                    }
                }
            }
            j++;
            stack.push(nextgreaterelement_array[i]);
        }
        return result;
    }

}
