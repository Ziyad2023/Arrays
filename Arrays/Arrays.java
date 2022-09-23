
public class Arrays
{
    public static void main(String[] args) 
    {
        String[] array ={"Alpha","Bravo","Charlie","Delta","Echo"};
        int part2 = array.length -1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i]");
        }
        for (String value : array) {
            System.out.print(value);
        }
        for (int h = 0; h < array.length; h++) {
            System.out.print(array[h]);
        }
    }