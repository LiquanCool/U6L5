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
    public static boolean containsPositive(int[] numList)
    {
        for (int num:numList)
        {
            if (num>0)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean containsString(String[] stringList, String searchStr)
    {
        for (String str:stringList)
        {
            if (str.toLowerCase().indexOf(searchStr.toLowerCase())>=0)
            {
                return true;
            }
        }
        return false;
    }
    public static String[] makeLowercase(String[] wordList)
    {
        String[] strArray = new String[wordList.length];
        for (int i = 0;i < wordList.length;i++)
        {
            strArray[i] = wordList[i].toLowerCase();
        }
        return strArray;
    }
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] intArray = new int[intArr1.length];
        for (int i = 0;i < intArr1.length;i++)
        {
            if (intArr1[i]>=intArr2[i])
            {
                intArray[i] = intArr1[i];
            }
            else
            {
                intArray[i] = intArr2[i];
            }
        }
        return intArray;
    }
    public static int endsInExclamations(String[] stringList)
    {
        int counter = 0;
        for (String str:stringList)
        {
            if (str.substring(str.length()-1).equals("!"))
            {
                counter++;
            }
        }
        return counter;
    }
    public static int countConsecutiveDoubles(int[] numList)
    {
        int counter = 0;
        for (int i = 0;i < numList.length-1;i++)
        {
            if (numList[i]==numList[i+1])
            {
                counter++;
            }
        }
        return counter;
    }
    public static int[] shiftLeft(int[] numList)
    {
        int[] intArray = new int[numList.length];
        intArray[intArray.length-1] = numList[0];
        for (int i = 0;i<numList.length-1;i++)
        {
            intArray[i] = numList[i+1];
        }
        return intArray;
    }
    public static void shiftLeftModify(int[] numList)
    {
        int temp = numList[numList.length-1];
        int temp2 =0;
        numList[numList.length-1] = numList[0];
        for (int i = numList.length-2;i>=0;i--)
        {
            temp2 = numList[i];
            numList[i] = temp;
            temp = temp2;
        }
    }
    public static void shiftNumLeftModify(int[] numList, int shiftNum)
    {
        int[] nums = new int[numList.length];
        for (int i = numList.length-1;i>=0;i--)
        {
            int difference = i-shiftNum;
            difference = difference%numList.length;
            if (difference<0)
            {
                nums[nums.length-Math.abs(difference)] = numList[i];
            }
            else
            {
                nums[difference] = numList[i];
            }
        }
        for (int i = 0;i<numList.length;i++)
        {
            numList[i]=nums[i];
        }
    }
    public static void shiftNumRightModify(int[] numList, int shiftNum)
    {
        shiftNum = numList.length-shiftNum;
        ArrayAlgorithms.shiftNumLeftModify(numList,shiftNum);
    }
    public static int[] reverse(int[] numList)
    {
        int[] reverseNums = new int[numList.length];
        for (int i=0;i<numList.length;i++)
        {
            reverseNums[reverseNums.length-i-1]=numList[i];
        }
        return reverseNums;
    }
    public static void reverseModify(int[] numList)
    {
        int temp = 0;
        int temp2 = 0;
        for (int i=0;i<(int)((double)numList.length/2);i++)
        {
            temp=numList[numList.length-1-i];
            temp2=numList[i];
            numList[i]=temp;
            numList[numList.length-1-i]=temp2;
        }
    }


}
