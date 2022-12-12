public class Array{
int maxsize;
int tos1;
int tos2;

}
public class Createstack1 {
    int size;
    /*int arr[];
    //int tos;
    void createStack(int size)
    {
        tos=-1;
        MaxSize=size;
        stack=new int[MaxSize];
    }*/
    Createstack1(int size) {
        this.size = size;
        // this.arr = new int[size];
        // this.tos = -1;
    }
 
    public void push(int pushedElement) {
        if (!isFull()) {
            tos1++;
            arr[tos] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full !");
        }
    }
 
    public int pop() {
        if (!isEmpty()) {
            int returnedTos = tos;
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
 
    public static void main(String args[])
  {
      int ch,e;
     Createstack obj=new Createstack();
      Scanner in=new Scanner(System.in);
      System.out.println("Enter size of stack:");
      int s=in.nextInt();
      obj.createStack(s);
      do
      {
           System.out.println("1.push\n2.pop\n3.peek\n4.print\n0.exit");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                   if(!obj.isFull())//is not full
                   {
                        System.out.println("Enter Data:");
                        e=in.nextInt();
                        obj.push(e);
                        System.out.println("Pushed");
                   }
                   else
                        System.out.println("Stack Full");
                   break;
                   
                case 2:
                   if(!obj.isEmpty())//is not empty
                   {
                        e=obj.pop();
                        System.out.println("Poped:"+e);
                   }
                   else
                        System.out.println("Stack Empty");
                   break;
                   
                 case 3:
                   if(!obj.isEmpty())//is not empty
                   {
                        e=obj.peek();
                        System.out.println("@ peek:"+e);
                   }
                   else
                        System.out.println("Stack Empty");
                   break;  
                
                 case 4:
                   if(!obj.isEmpty())//is not empty
                   {
                        System.out.println("Stack has:");
                        obj.printStack();
                   }
                   else
                        System.out.println("Stack Empty");
                   break;  
                 case 0:
                        System.out.println("Exiting ");
                        break;
                 default:
                        System.out.println("Wrong option selected");
                        break;
           }
      }while(ch!=0);
      }
      
          
  }