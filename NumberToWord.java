package main;

/**
* The NumberToWord program implements an application that
* converts given number to word and prints the output in console.
*
* @author  Kiran Balli
* @version 1.0
* @since   2020-03-11 
*/
public class NumberToWord {
	
	    // declares an String Array of units	
	    final private  static String[] units = {"Zero","One","Two","Three","Four",
			"Five","Six","Seven","Eight","Nine","Ten",
			"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
			"Sixteen","Seventeen","Eighteen","Nineteen"};
	    
	    // declares an String Array of tens
		final private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
			"Sixty","Seventy","Eighty","Ninety"};

		/**
		* This method is used to convert number to word.
		* @param i This is the Integer paramter to be converted.
		* @return String This returns word of given Integer i.
		*/
		public static String convert(Integer i) {
			if(null==i){
				throw new NullPointerException("Please Enter Integer Value");				
				
			}
			// if given number is less than 20 the return units index array value
			if( i < 20)  return units[i];			
			if( i < 100) return tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");
			if( i < 1000) return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
			if( i < 1000000) return convert(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;
			if(i>999999999 || i<0){
				throw new IllegalArgumentException("Please enter Integer Value less than 999999999");
				
			}
			return convert(i / 1000000) + " Million " + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;
		}
		
		/**
		* This is the main method which makes use of convert method.
		* @param args Unused.
		* @return Nothing.		   
		*/	
		public static void main(String[] args) {
		NumberToWord nwObj = new NumberToWord();
		System.out.println("NumberToWord(1)---> " + nwObj.convert(1));
        System.out.println("NumberToWord(21)---> " + nwObj.convert(21));
        System.out.println("NumberToWord(105)---> " + nwObj.convert(105));
        System.out.println("NumberToWord(56945781)---> " + nwObj.convert(56945781));
        System.out.println("NumberToWord(999999999)---> " + nwObj.convert(999999999));    
		}

}
