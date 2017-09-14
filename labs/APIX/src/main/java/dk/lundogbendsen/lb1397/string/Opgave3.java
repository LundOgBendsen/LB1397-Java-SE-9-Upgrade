package dk.lundogbendsen.lb1397.string;

import com.carrotsearch.sizeof.RamUsageEstimator;

import static java.lang.Runtime.getRuntime;

public class Opgave3 {

    // Try running this without and with -XX:-CompactStrings

    static {
        System.out.println("Free memory: " + (getRuntime().freeMemory() >> 10) + " KB, max memory: " + (getRuntime().maxMemory() >> 10) + " KB, total memory: " + (getRuntime().totalMemory() >> 10) + " KB");
    }

    // https://da.wikipedia.org/wiki/Merkur_(planet)
    public static final String LATIN_1 = null; // TODO
    public static final String UTF_16 =  null; // TODO

    public static void main(String[] args)
    {
        String latin1 = null; // TODO ()
        String utf16 =  null; // TODO (https://emojipedia.org/)

        System.out.println(LATIN_1);
        System.out.println(UTF_16);
        System.out.println(latin1);
        System.out.println(utf16);

        System.out.println();

        System.out.println("Free memory: " + getRuntime().freeMemory() + ", max memory: " + getRuntime().maxMemory() + ", total memory: " + getRuntime().totalMemory());
        System.out.println("Memory size of LATIN_1: " + RamUsageEstimator.sizeOf(LATIN_1));
        System.out.println("Memory size of UTF_16: " + RamUsageEstimator.sizeOf(UTF_16));
        System.out.println("Memory size of latin1: " + RamUsageEstimator.sizeOf(latin1));
        System.out.println("Memory size of utf16: " + RamUsageEstimator.sizeOf(utf16));

        System.out.println("Free memory: " + (getRuntime().freeMemory() >> 10) + " KB, max memory: " + (getRuntime().maxMemory() >> 10) + " KB, total memory: " + (getRuntime().totalMemory() >> 10) + " KB");
    }

}
