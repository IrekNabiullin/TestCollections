import java.util.*;

//import javax.annotation.Nullable;

//import org.junit.Assert;
//import org.junit.Test;

public class NoRepeats {
    public static void main(String[] args) {
        String inputString = "Сссбббеерр, пррриииввеетттт! Как дела? А?";
        System.out.println(inputString);
        sberNorepeatTest();
    }

    //    @Nullable
    String noRepeatSber(String stringSber) {
        String[] split = stringSber.split("");
        System.out.println(Arrays.toString(split));
        String b = String.valueOf(split);
        List<String> arr = new ArrayList<>();
        arr.add(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].endsWith(split[i - 1].toLowerCase()) ||
                    split[i].endsWith(split[i - 1].toUpperCase())) {
            } else {
                arr.add(split[i]);
            }
            System.out.println(arr);
        }
        String output = String.valueOf(arr);
//        System.out.println("output: " + Arrays.toString());
        arr.forEach(System.out::print);
        System.out.println();


        Optional<String> resultOpt = Arrays.stream(split).reduce((x, y) ->
                x.endsWith(y) || x.endsWith(y.toLowerCase()) || x.endsWith(y.toUpperCase()) ? x : x + y);
        return resultOpt.orElse(null);
    }

    //    @Test
    public static void sberNorepeatTest() {
        String dataString = "Сссбббеерр, пррриииввеетттт! Как дела? А?";
        String expected = "Сбер, привет! Как дела? А?";
        NoRepeats noRepeats = new NoRepeats();
        String actual = noRepeats.noRepeatSber(dataString);
        System.out.println(actual);
//        Assert.assertEquals(expected, actual);
    }
}
