package TypeData;

public class typeDataArray {
    public static void main(String[] args) {
        String [] arrayString;
        arrayString = new String[2];
        arrayString[0] = "aqna";
        arrayString[1] = "azmi";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);

        long[] arayLong = {
          10L, 12L, 13L
        };
        System.out.println(arayLong.length);

        String[][] members = {
                {"aqna"},
                {"azmi"},
                {"azmyn"}
        };
        System.out.println(members[0]);
        System.out.println(members[1]);
        System.out.println(members[2]);

    }
}
