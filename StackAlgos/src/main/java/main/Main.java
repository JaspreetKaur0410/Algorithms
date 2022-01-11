/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import NextGreaterElementRight.NextGreaterElementRight;
import NextGreaterElementRight.NextGreaterElement_Left;
import NextGreaterElementRight.NextSmallerElement_Left;
import NextGreaterElementRight.NextSmallerElement_Right;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import StockSpamProblem.StockSpanProblem;

/**
 *
 * @author jaspr_000
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter size of array = " + "\n");
        int n = sc.nextInt();
        int[] array_input = new int[n];
        for (int i = 0; i < n; i++) {
            array_input[i] = sc.nextInt();
        }
        
        /************************************************NEXT GREATER ELEMENT_RIGHT************************************************/       
        /*NextGreaterElementRight nextgreaterelement = new NextGreaterElementRight();
        int[] result_stack = nextgreaterelement.getVectorNextGreaterElement(array_input, n);
        // sort resultant array
        for (int i = 0; i < result_stack.length / 2; i++) {
            int temp = result_stack[i];
            result_stack[i] = result_stack[result_stack.length - 1 - i];
            result_stack[result_stack.length - 1 - i] = temp;
        }
        for (int i = 0; i < result_stack.length; i++) {
            System.out.println(result_stack[i] + " ");
        }*/       
        /************************************************NEXT GREATER ELEMENT_RIGHT*********************************************************/
        
        /************************************************NEXT GREATER ELEMENT_LEFT********************************************************/
        /*NextGreaterElement_Left nextgreaterelement = new NextGreaterElement_Left();
        int[] result_stack = nextgreaterelement.getVectorNextGreaterElement_Left(array_input, n);
        for (int i = 0; i < result_stack.length; i++) {
            System.out.println(result_stack[i] + " ");
        }*/     
        /************************************************NEXT GREATER ELEMENT_LEFT**********************************************************/
        
        /************************************************NEXT SMALLER ELEMENT_LEFT****************************************************/
        /*NextSmallerElement_Left nextsmallerelement = new NextSmallerElement_Left();
        int[] result_stack = nextsmallerelement.getVectorNextSmallerElement_Left(array_input, n);
        for (int i = 0; i < result_stack.length; i++) {
            System.out.println(result_stack[i] + " ");
        }*/      
        /************************************************NEXT SMALLER ELEMENT_LEFT**************************************************************/
        
        /************************************************NEXT SMALLER ELEMENT_RIGHT****************************************************/
        /*NextSmallerElement_Right nextsmallerelement = new NextSmallerElement_Right();
        int[] result_stack = nextsmallerelement.getVectorNextSmallerElement_Right(array_input, n);
        for (int i = 0; i < result_stack.length; i++) {
            System.out.println(result_stack[i] + " ");
        }*/      
        /************************************************NEXT SMALLER ELEMENT_RIGHT**************************************************************/
        
        /************************************************STOCK SPAM PROBLEM****************************************************/
        StockSpanProblem stockspanproblem = new StockSpanProblem();
        int[] result_stack = stockspanproblem.getstackSpanSolution(array_input, n);
        for (int i = 0; i < result_stack.length; i++) {
            System.out.println(i - result_stack[i] + " ");
        }      
        /************************************************STOCK SPAM PROBLEM**************************************************************/
        
         
        
    }

}
