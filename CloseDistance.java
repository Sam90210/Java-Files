import java.util.Scanner;
public class CloseDistance{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
        
        String input = sc.nextLine();
        
        boolean same = ture;
        
        int index = -1;
        
        for(int i=0; i<planets.length; i++){
            if(planets[i].length() == input.length()){
            same;
            
            for(int j=0; j<input.length(); j++){
                if(planets[i].charAt(j) != input.charAt(j)){
                    same = false;
                    break;
                }
            }
            }
            if(same){
            index=i;
            break;
        }
        }
        if(index == -1){
            System.out.println("Invalid Input");
        }
        
        double x0 = x[index], y0 = y[index], z0 = z[index];
    }
}