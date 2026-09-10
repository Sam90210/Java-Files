public class MinToYearConversion{
    public static void main(String[]args){
        System.out.println("Given number: 3456789");
        int min = 3456789;
        int hours = min/60;
        int days = hours/24;
        int years = days/365;
        int rest =  days%365;
        System.out.println("3456789 minutes is approximately "+years+" years and "+rest+" days");

    }
}