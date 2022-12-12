public class Createstack {
    int size;
    int arr[];
    int tos;
 
    Createstack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.tos = -1;
    }
 
    public void push(int pushedElement) {
        if (!isFull()) {
            tos++;
            arr[tos] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full !");
        }
    }
 
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = tos;
            tos--;
            System.out.println("Popped element :" + arr[returnedTos]);
            return arr[returnedTos];
 
        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }
 
    public int peek() {
        if(!this.isEmpty())
                        return arr[tos];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
    }
 
    public boolean isEmpty() {
        return (tos == -1);
    }
 
    public boolean isFull() {
        return (size - 1 == tos);
    }
 
    public static void main(String[] args) {
        Createstack Createstack= new Createstack(10);
        Createstack.pop();
        System.out.println("Enter data");
        Createstack.push(10);
        Createstack.push(30);
        Createstack.push(50);
        Createstack.push(40);
        System.out.println("Pushed");
        Createstack.pop();
        Createstack.pop();
        Createstack.pop();
        System.out.println("Poped");
    }
}