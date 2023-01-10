import java.util.Locale;

public class ArrayAlgorithms {
    public static void printExclamation(String[] wordList)
    {
        for (int i = 0;i<wordList.length;i++)
        {
            System.out.println(wordList[i]+"!");
        }
    }
    public static void addExclamation(String[] wordList)
    {
        for (int i = 0;i<wordList.length;i++)
        {
            wordList[i] = wordList[i]+"!";
        }
    }
    public static int sum(int[] numList)
    {
        int t = 0;
        for (int i = 0;i<numList.length;i++)
        {
            t += numList[i];
        }
        return t;
    }
    public static double average(int[] numList)
    {
        return (double)sum(numList)/numList.length;
    }
    public static int minimum(int[] numList)
    {
        int m = numList[0];
        for (int i = 0;i<numList.length;i++)
        {
            if (numList[i] < m)
            {
                m = numList[i];
            }
        }
        return m;
    }
    public static int maximum(int[] numList)
    { int m = numList[0];
        for (int i = 0;i<numList.length;i++)
        {
            if (numList[i] > m)
            {
                m = numList[i];
            }
        }
        return m;
    }
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0;i<numList.length;i++)
        {
            numList[i] *= multiplier;
        }
    }
    public static int[] squares(int[] numList)
    {
        int[] newList = new int[numList.length];
        for (int i = 0;i<numList.length;i++)
        {
            newList[i] = numList[i]*numList[i];
        }
        return newList;
    }
    public static void flipBool(boolean[] boolList)
    {
        for (int i = 0;i<boolList.length;i++)
        {
            if (boolList[i])
            {
                boolList[i] = false;
            }
            else
            {
                boolList[i] = true;
            }
        }
    }
    public static String customToString(int[] numList)
    {
        String str = "[" + numList[0];
        if (numList.length>1)
        {
            for (int i = 0;i<numList.length;i++)
            {
                str += ", " + numList[i];
            }
        }
        str += "]";
        return str;
    }
    public static int longestString(String[] stringList)
    {
        String longest = stringList[0];
        for (String str : stringList)
        {
            if (str.length()> longest.length())
            {
                longest = str;
            }
        }
        return longest.length();
    }
    public static void makeUppercase(String[] wordList)
    {
        for (int i = 0;i < wordList.length;i++)
        {
            wordList[i] = wordList[i].toUpperCase();
        }
    }
}
