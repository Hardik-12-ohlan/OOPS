class Cmd{
	public static void main(String args[]){
		double d,a,b;

		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);

		d=a/b;

		System.out.printf("Division : %.2f",d);
		
	}
}