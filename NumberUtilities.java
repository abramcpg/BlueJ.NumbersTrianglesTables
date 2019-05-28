


public class NumberUtilities 
{

    public static String getRange(int stop) 
    {
        String answer = "";
        for (int i = 0; i < stop; i++)
        {
            answer = answer + i;
        }

        return answer;
    }

    public static String getRange(int start, int stop) 
    {
        String answer = "";
        for (int i = start; i < stop; i++)
        {
            answer = answer + i;
        }
        return answer;
    }


    public static String getRange(int start, int stop, int step) 
    {
        String answer = "";
        for (int i = start; i < stop; i += step)
        {
            answer = answer + i;
        }
        return answer;
    }

    public static String getEvenNumbers(int start, int stop) 
    {
        String answer = "";
        for (int i = start; i < stop; i++)
        {
            if ((i % 2 == 0))
            {
                answer = answer + i;
            }
        }
        return answer;
    }
    public static String getOddNumbers(int start, int stop) 
    {
        String answer = "";
        for (int i = start; i < stop; i++)
        {
            
            if (!(i % 2 == 0))
            {
                answer = answer + i;
            }
            
        } 
        
        return answer;
    }


    public static String getExponentiations(int start, int stop, int exponent) 
    {
        String answer = ""; //fail square and cube tests
        double tempAnswer;
        for (int i = start; i <= stop; i++)
        {
            tempAnswer = Math.pow(i,exponent);
            answer = answer + tempAnswer;
        }
        return answer;
    }
}
