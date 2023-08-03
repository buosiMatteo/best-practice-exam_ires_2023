import exception.StringNotValidException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OldFashionPoundApp {

    public static void main(String[] args) throws StringNotValidException {
        String str1 = "1p5s10d";
        String str2 = "1p5s5d";
        List<Integer> value1 = extractListFromString(str1);
        List<Integer> value2 = extractListFromString(str2);
        System.out.println(sum(value1, value2));


    }

    private static List<Integer> extractListFromString(String str) throws StringNotValidException {
        Pattern pattern = Pattern.compile("^([0-9]+)p([0-9]+)s([0-9]+)d$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            Integer pound = Integer.parseInt(matcher.group(1));
            Integer shelling = Integer.parseInt(matcher.group(2));
            Integer pence = Integer.parseInt(matcher.group(3));
            List<Integer> amount = new ArrayList<>();
            amount.add(pound);
            amount.add(shelling);
            amount.add(pence);
            return amount;
        }
        throw new StringNotValidException();
    }

    public static String sum(List<Integer> value1, List<Integer> value2) {
        int value1P = value1.get(0);
        int value1S = value1.get(1);
        int value1D = value1.get(2);
        int value2P = value2.get(0);
        int value2S = value2.get(1);
        int value2D = value2.get(2);
        int resultD = value1D + value2D;
        int resultS = value1S + value2S;
        int resultP = value1P + value2P;
        int totalInD = resultD + resultS * 12 + resultP * 240;
        int totalD=totalInD%12;
        totalInD-=
        StringBuilder sb = new StringBuilder();
        sb.append(totalP).append('p');
        sb.append(totalS).append('s');
        sb.append(totalD).append('d');
        return sb.toString();
    }
}
