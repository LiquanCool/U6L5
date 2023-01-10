import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.makeUppercase(words);

        // original word list IS modified
        System.out.println(Arrays.toString(words));

    }
}
