package testarray;

public class ConceptInner {

	public static void main(String[] args) {
//		another ano = new another();// calling statement for non static function
//		another.xyz anoxyz = ano.new xyz();
//		
//		anoxyz.fact();
		////////////////////////////
		
		another.abc.doubleFact();//when calling static function then we have to check fun, if funtion is 
		//is static then not need to object of its class and class is static then no need to create object outer 
		//class
		another.abc anoabc = new another.abc();
		anoabc.Nons();///calling non static function of static class and it outer class is not static 
		
		
		
	}
	

}
 class another 
{
	 class xyz
		{
			void fact()
			{
				System.out.println("hello");
				
			}
		}
		static class abc
		{
			static void doubleFact()
			{
				System.out.println("double hello");
			}
			void Nons()
			{
				System.out.println("i am non static function in static class");
			}
		}
}
