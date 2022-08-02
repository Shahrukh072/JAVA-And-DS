package ClassObject;

public class Polynomial {
	DynamicArray Coefficient;
	public Polynomial() {
	
	}
		public void  setCoefficient(int deg, int coeff) {
			
		}
			public int getCoefficient(int deg) {
				return deg;
				
			}
		    public int degree() {
		    	return Coefficient.size();
		    }
		  	public void print() {
		    		
		    	}
		      public void add(Polynomial p) {
		       for(int i = 0; i <= p.degree(); i++) {
		      this.setCoefficient(i, this.getCoefficient(i)+ p.getCoefficient(i));
		        	}
		        }
		    public void subtract(Polynomial p) {
		        	
		        }
		    public void multiply(Polynomial p) {
		        		
		        	}
		   	public int evaluate( int x) {
		       	return x;
		        		}
	  public static Polynomial add(Polynomial p1, Polynomial p2) {
		return p2;
		       				
		        		
	}
}
