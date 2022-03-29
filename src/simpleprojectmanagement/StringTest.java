package simpleprojectmanagement;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GFG");

        StringBuilder stringBuilder1 = new StringBuilder("ivnonenwjn");

        System.out.println("String str " + stringBuilder1.reverse());
        stringBuilder.setLength(0);
        System.out.println(stringBuilder);

    }


}
