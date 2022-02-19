package data;

public class FixedSizeArrayStack {
	protected int capacity;
	
	public static final int CAPACITY = 10;
	
	protected int [] stackRep;
	
	protected int top = -1;
	
	public FixedSizeArrayStack() {
		this(CAPACITY);
	}
	
	public FixedSizeArrayStack(int cap) {
		int capacity = cap;
		stackRep = new int[capacity];
	}
	
	public int size() {
		return (top+1);
	}
	
	public boolean isEmpty() {
		return (top<0);
	}
	
	public void push(int data) throws Exception{
		if(size()==CAPACITY) {
			throw new Exception("stack is full");
		}else {
			stackRep[++top]=data;
		}
	}
	
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}else {
			return stackRep[top];
		}
	}
	
    public int pop() throws Exception{
    	int data;
    	if(isEmpty()) {
    		throw new Exception("stack is empty");
    	}
    	data = stackRep[top];
    	stackRep[top--]=Integer.MIN_VALUE;
    	return data;
    	
    }
    
    public String toString() {
    	String s;
    	s="|";
    	if(size()>0) {
    		s+=stackRep[0];
    	}
    	if(size()>1) {
    		for(int i=1; i< size()-1; i++) {
    			s+=","+stackRep[i];
    		}
    		
    	}
    	return s+"|";
    }
}
