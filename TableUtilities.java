 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        Integer height = 4; //tests are wrong
        Integer width = 4;
        String answer = "";
        Integer row = 0;
        Integer column = 1;
        Integer print = 1;
        for (int i = 0; i < height; i++){ //vertical
            for (int j = 0; j < width; j++){ //horizontal
                row++;
                print = row * column;
                answer += " " + print + " |";
            }
            column++;
            answer += "\n";
            row = 0;
        }
        return answer;
    }

    public static String getLargeMultiplicationTable() {
        Integer height = 9; //tests are wrong
        Integer width = 9;
        String answer = "";
        Integer row = 0;
        Integer column = 1;
        Integer print = 1;
        for (int i = 0; i < height; i++){ //vertical
            for (int j = 0; j < width; j++){ //horizontal
                row++;
                print = row * column;
                answer +=  " " +print + " |";
            }
            column++;
            answer += "\n";
            row = 0;
        }
        return answer;
    }

    public static String getMultiplicationTable(int tableSize) {
        Integer height = tableSize; //tests are wrong
        Integer width = tableSize;
        String answer = "";
        Integer row = 0;
        Integer column = 1;
        Integer print = 1;
        for (int i = 0; i < height; i++){ //vertical
            for (int j = 0; j < width; j++){ //horizontal
                row++;
                print = row * column;
                answer += " " + print + " |";
            }
            column++;
            answer += "\n";
            row = 0;
        }
        return answer;
    }
}
