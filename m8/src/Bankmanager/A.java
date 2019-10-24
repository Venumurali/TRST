package Bankmanager;
class A {
            int i;
            int j;
	        public void display() {
	            System.out.println(i);	        }    
	    }    
	    class B extends A {
	        int j;
	        public void display() {
            System.out.println(j);
        } 
	    }    
    class Dynamic_dispatch {
        public static void main(String args[])
        {
            A obj2 = (A)new B();
            obj2.i = 1;
            obj2.j = 2;
            A r;
            r = obj2;
            r.display();     
	        }
	   }