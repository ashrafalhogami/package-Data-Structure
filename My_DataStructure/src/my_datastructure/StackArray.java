/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_datastructure;

/**
 *
 * @author أشرف الهجامي
 */
public class StackArray<t> {

    private Object[] stack;//name array for type object
    private int top = 0;//varible max value
//نمرر حجم  مصفوفةالمكدس للباني

    public StackArray(int size) {
        stack = new Object[size];
    }
//دالة ادخال القيم للمكدس

    public void push(t value) {
        if (!(isfull())) {
            stack[top] = value;
            top++;
        } else {
            System.out.println("stack is full");
        }
    }
//دالة إخراج القيم من المكدس

    public void pop() {

        if (!(isempty())) {
            t item = (t) stack[top - 1];
            top--;

        } else {
            System.out.println("stack is empty");
        }
    }

//دالة لمعرفة عدد القيم المدخلة للمكدس
    public int get_top() {
        return top;
    }
//دالة تفحص المكدس إذا كان فارغ 

    public boolean isempty() {
        if (top == 0) {
            return true;
        }
        return false;
    }
//دالة لفحص إذا كان المكدس ممتلىء

    public boolean isfull() {
        if (top == stack.length) {
            return true;
        }
        return false;

    }
//طباعة القيم الموجودة داخل المكدس بدون حذفها

    public void desplay() {
        for (Object i : stack) {
            System.out.println(i);
        }

    }

}
