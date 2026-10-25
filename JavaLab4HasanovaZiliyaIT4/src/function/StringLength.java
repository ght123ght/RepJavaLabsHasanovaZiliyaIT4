package function;

public class StringLength implements Transformer<String, Integer> {

    @Override
    public Integer apply(String value) {
        return value.length();
    }
}
