package mypacak;

public class Wrappers {

	public static void main(String[] args) {
		
		//Integer
		

		Integer a = 100;
		System.out.println("Hashcode of "+a+" : "+System.identityHashCode(a));
		Integer b = 102;
		System.out.println("Hashcode of "+b+" : "+System.identityHashCode(b));
		Integer c = new Integer(100);
		System.out.println("Hashcode of "+c+" : "+System.identityHashCode(c));
		System.out.println(c == a);//Comparing their address
		System.out.println(c.equals(a));//Comparing their values
		int x = 400;
		b = x;
		System.out.println(b);
		x = c;
		System.out.println(x);
		String s = "123";
		Integer d = Integer.parseInt(s);
		System.out.println(d);
		String g = d+"";//converting integer into string by using +"" or .toString()
		System.out.println(g);
		String h = a.toString();
		System.out.println(h);
		System.out.println(Integer.MAX_VALUE);//Finding the Maximum value for Integer
		System.out.println(Integer.MIN_VALUE);//Finding the Minimum value for Integer
		System.out.println(d.compareTo(x));//return 1 if first is greater than the second
		System.out.println(a.compareTo(c));//return 0 if both values are same
		System.out.println(d.compareTo(b));//return -1 if first is lesser than the second
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toHexString(15));
		System.out.println(Integer.toOctalString(10));
		
		//Long
		
		
		Long r = 1238446465L;
		System.out.println(r);
		String p = "478656565781325";
		Long z = Long.parseLong(p);
		System.out.println(z);
		System.out.println(g.equals(r));
		Long t = new Long(1238446465L);
		System.out.println(r == t);
		System.out.println(r.equals(h));
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(t.compareTo(r));
		System.out.println(z.compareTo(r));
		System.out.println(t.compareTo(z));
		System.out.println(Long.toBinaryString(45));
		System.out.println(Long.toHexString(20));
		System.out.println(Long.toOctalString(63));
		
		
		//Float
		
		Float f = a.floatValue();// 'a' must be Integer nor int
		System.out.println(f);
		Float v = 450.14f;
		float o = v;
		System.out.println(v.equals(f));
		float n = 78.45f;
		f = n;
		System.out.println(f);
		f = 14575.45f;
		System.out.println(f);
		String l = "12.345f";
		f = Float.parseFloat(l);
		System.out.println(f);
		System.out.println(f.equals(v));
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(f.compareTo(v));
		System.out.println(v.compareTo(o));
		System.out.println(f.compareTo(10.256f));
		System.out.println(Float.toHexString(v));
		
		
		//Double
		
		Double y = 7898.4564;
		System.out.println(y);
		Double q = Double.parseDouble("45");
		Double m = q;
		System.out.println(q);
		System.out.println(q.equals(y));
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MIN_EXPONENT);
		System.out.println(Double.MIN_NORMAL);
		System.out.println(Double.min(d, r));
		System.out.println(q.compareTo(m));
		System.out.println(y.compareTo(q));
		System.out.println(q.compareTo(y));
		
	}

}
