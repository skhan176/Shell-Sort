


 

public class Hypot 
{
	public void insertion(int a[]) {
		
		int n=a.length;
		int min=n/2;
		while(min>0) {
		for(int j=min;j<n;j++) 
			for(int i=j-min;i>=0;i=i-min) 
				if(a[i]>a[i+min]) {
					int temp=a[i];
					a[i]=a[i+min];
					a[i+min]=temp;
				
				}
				
				else break;
		min=min/2;
				
		
		
	}
	}
	public void printarray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[]args) {
		int a[]= {5,32,65,3,90};
		Hypot t=new Hypot();
		t.insertion(a);
		t.printarray(a);
		
	}

}


