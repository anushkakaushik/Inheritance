package CoreJava;

class Sum {
	//method  of class Sum
	int sum (int x,int y) {
		//sum with return type int
		return x+y;
	}
		int sum (int x,int y, int z) {
			return x+y+z;
		}	
double sum(double x , double y) {
	//sum with return type double
	return x+y;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Sum s = new Sum(); 
//obj of class Sum
System.out.println(s.sum(1,2 ));
System.out.println(s.sum(1,2.8 ));
System.out.println(s.sum(1,2 ,0));
	}
}
