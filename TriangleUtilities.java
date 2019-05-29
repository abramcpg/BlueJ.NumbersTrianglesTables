
public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String answer = "";
            for (int i = 0; i < numberOfStars; i++){
                answer += "*";
            }
        return answer;
    }
    
    public static String getTriangle(int numberOfRows) {
        String answer = "";
        String row = "";
            for (int i = 0; i < numberOfRows; i++){
                row += "*";
                answer += row + "\n";
            }   
        return answer;
    }


    public static String getSmallTriangle() {
        String answer = "";
        String row = "";
        Integer size = 4;
        for (int i = 0; i < size; i++){
                row += "*";
                answer += row + "\n";
            }   
            
        return answer;
    }

    public static String getLargeTriangle() {
        String answer = "";
        String row = "";
        Integer size = 9;
        for (int i = 0; i < size; i++){
                row += "*";
                answer += row + "\n";
            }   
            
        return answer;
    }
}
