package general;

import java.lang.reflect.Method;

class ReflectionEx {

	public static void main (String args[]) throws Exception{
		
		Class classobj = Class.forName("general.Reflection");
		System.out.println(classobj.getName()); 
		
		//Reflection r = new Reflection();
		//Class classobj = r.getClass();
		
		//Class classobj = Reflection.class;
		//System.out.println(classobj.getName());
		
		Reflection r = (Reflection)classobj.newInstance();
		
		Method m = classobj.getDeclaredMethod("display", null);
		m.setAccessible(true);
		m.invoke(r, null);
		
		
	}
}
