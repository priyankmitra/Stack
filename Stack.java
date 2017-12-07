import java.util.Scanner;
class Stack
{
	int arr[];
	int top;
	int size;
	public Stack()
	{
		arr=new int[10];
		top = -1;
		size = 10;
	}
	public Stack(int n)
	{
		arr = new int[n];
		top = -1;
		size = n;
	}
	public void push(int val)
	{
		if(top==(size-1))
		{
			System.out.println("Stack is Full!!!");
		}
		else
		{
			arr[++top]=val;
		}
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow!!!");
			System.exit(0);
		}
		int v = arr[top];
		top--;
		return v;
	}
	public int peep()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow!!!");
			System.exit(0);	
		}
		int v = arr[top];
		return v;
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty!!");
			return true;
		}
		else
		{
			System.out.println("Stack is not empty!!");
			return false;
			
		}
	}
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
}
class Stest
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the size of stack you want :");
		n = sc.nextInt();
		Stack s = new Stack(n);
		s.push(10);
		s.push(11);
		s.push(7);
		int x=s.peep();
		System.out.println("Topmost Element :"+x);
		int y=s.pop();
		x=s.peep();
		System.out.println("Topmost Element :"+x);

	}
}
