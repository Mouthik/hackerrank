public class MyRegex {

    String validip = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = validip + "." + validip + "." + validip + "." + validip;

}
