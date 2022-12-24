package TypeData;

public class typeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long inilong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniInteger2 = iniInt;

        short iniShort = iniInteger2.shortValue();
        long iniong = iniInteger2.longValue();
        float iniFloat = iniInteger2.floatValue();



    }
}
