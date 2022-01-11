/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author jaspr_000
 */
public class StackOperations {
      
    public int top;
    public int[] items = new int[100];
    
    public void push(int x){
        if(top == 99){
            System.out.println("STACK FULL");
        }
        else{
            top++;
            items[top] = x;
        }
    }
    
    public int pop(){
        if(top == -1){
            System.out.println("No Element to Delete");
            return -1;
        }
        else{
            int element = items[top];
            System.out.println("TOP BEFORE DELETE "+top);
            top--;
            System.out.println("TOP AFTER DELETE "+top);
            return element;
        }
    }
    
    public boolean isEmpty(){
        return (top == -1) ? true:false;
    }   

    public int getTopElement(){
        if(top!=-1){
            return items[top];
        }
        return 0;
    }
}
