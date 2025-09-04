public class stackpop {
    final static int maxsize = 10;
    public static int stack[] = new int[maxsize];
    public static int top = -1; //pointer to the topmost element in stack
    public static boolean isempty(){
        return top == -1; //returns true if stack is empty
    }
    public static boolean isfull(){
        return top == maxsize - 1; //returns true if stack is full
    }
        public static int push(int data){ // Pushes an element onto the stack if it's not full
        if(!isfull()) {
            top++;
            stack[top] = data;
        }
        else {
            System.out.println("Stack is already Full.");
        }
        return data;
    }
    public static int pop(){
        int data;
        if(!isempty()) {
            data = stack[top];
            top = top - 1;
            return data;
        }
        else {
            System.out.println("Stack is Empty..");
            return -1; 
        }
    }
    public static void main(String args [] ){
        push(41);
        push(14);
        push(62);
        push(23);
        push(15);
        System.out.println("Elements popped: ");
        while(!isempty()) {
            int data = pop();
            System.out.print(data+" ");
        }
    }
}
