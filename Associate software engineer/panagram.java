public class PanagramString{
    public static void containAllLetters(String string)
    {
        string=string.toLowerCase();
        boolean allLetterPresent=true;
        for(char ch='a';ch<='z';ch++)
        {
            if(!string.contains(String.valueOf(ch)))
            {
                allLetterPresent=false;
                break;
            }
        }
        if(allLetterPresent)
        System.out.println("panagram String");
        else
        System.out.println("not a panagram string");
    }
    public static void main(String args[])
    {
        String string="abcdefghijklmnopqrstuvwxyz23";
        containAllLetters(string);
    }
}