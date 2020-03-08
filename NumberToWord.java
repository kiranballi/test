package main; 

public class NumberToWord
{
    private static final String[] unitNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
     };
    private static final String[] calNames = {
            "",
            " thousand",
            " million"
     };
    
    private String format(int number) {
        String str;
        if (number % 100 < 20){
        	str = unitNames[number % 100];
            number = number/100;
        }
        else {
        	str = unitNames[number % 10];
            number = number/10;
            str = tensNames[number % 10] + str;
            number = number/10;
            }
        if (number == 0) {return str;}
        return unitNames[number] + " hundred and" + str;
    }
    public String convert(int number) {
    	if (number == 0) { return "zero"; }
    	String prefix = "";
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        String current = "";
        int temp = 0;
        do {
            int n = number % 1000;            
            if (n != 0){
                String s = format(n);
                current = s + calNames[temp] + current;
            }
            temp++;
            number = number/1000;
        } while (number > 0);
        return (prefix + current).trim();
    }
    public static void main(String[] args) {
        NumberToWord nwObj = new NumberToWord();
        System.out.println("NumberToWord(1)---> " + nwObj.convert(1));
        System.out.println("NumberToWord(21)---> " + nwObj.convert(21));
        System.out.println("NumberToWord(105)---> " + nwObj.convert(105));
        System.out.println("NumberToWord(56945781)---> " + nwObj.convert(56945781));
        System.out.println("NumberToWord(999999999)---> " + nwObj.convert(999999999));
    }
}

 