package TcsDigitalCode;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] array={"flower", "flow", "flight"};
        StringBuilder result=new StringBuilder();
        if(array.length==0) {
            System.out.println("No common prefix ");
            return;
        }
        for (int i=0;i< array[0].length();i++)
        {
            char ch=array[0].charAt(i);
            for (int j=1;j< array.length;j++)
            {
                if(i>=array[j].length() || array[j].charAt(i)!=ch)
                {
                    System.out.println(result.toString());
                    return;
                }
            }
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}
