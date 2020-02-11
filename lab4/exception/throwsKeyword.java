class Divide{
	int num, den ;
	public Divide(int n, int d){
		if(d == 0){
			throw new ArithmeticException("cannot divide when denominator is zero.") ;
		}
		num = n ;
		den = d ;
		System.out.println("Division result: " + num / den) ;
	}
}

class Test{
	public static void main(String[] args) throws ArithmeticException
	{
		Divide d = new Divide(4,5) ;
		Divide c = new Divide(5, 0) ;
	}
}