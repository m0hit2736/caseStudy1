package AssignDay8;

public class wrapperMethod {
	
	public static void main(String[] args)
    {
        Integer x = Integer.valueOf("10");
        System.out.println(x);
        Double D = Double.valueOf("10.0");
        System.out.println(D);
        
        Integer I = new Integer(130);
        System.out.println(I.byteValue());
        System.out.println(I.shortValue());
        System.out.println(I.intValue());
        System.out.println(I.longValue());
        System.out.println(I.floatValue());
        System.out.println(I.doubleValue());
        
        Integer l = new Integer(10);
        String s = l.toString();
        System.out.println(s);
        
    }
}
