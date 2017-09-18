package dk.lundogbendsen.lb1397.ex5.solution;

import com.carrotsearch.sizeof.RamUsageEstimator;

import static java.lang.Runtime.getRuntime;

public class CompactStrings {

    // Try running this without and with -XX:-CompactStrings

    static {
        System.out.println("Free memory: " + (getRuntime().freeMemory() >> 10) + " KB, max memory: " + (getRuntime().maxMemory() >> 10) + " KB, total memory: " + (getRuntime().totalMemory() >> 10) + " KB");
    }

    // https://da.wikipedia.org/wiki/Merkur_(planet)
    public static final String LATIN_1 = "Merkur er planeten tættest på Solen og den mindste planet i Solsystemet,[1] med en omløbstid om Solen på 87,969 dage. Merkurs kredsløb har den største excentricitet af alle Solsystemets planeter og den mindste aksehældning. Planeten roterer tre gange om sin akse, for hver gang den laver to omløb om Solen. Merkurbanens perihelium præcesserer omkring Solen med en størrelse, der er større end 43 buesekunder per århundrede; et fænomen, der blev forklaret i det 20. århundrede af Albert Einsteins Generelle relativitetsteori.[2] Merkur er klar set fra Jorden, varierende i tilsyneladende størrelsesklasse fra -2,0 til 5,5, men den er ikke let at se, da den største vinkelafvigelse fra Solen kun er 28,3°. Da Merkur overstråles af Solens lys, kan den normalt kun ses i morgen- og aftenskumringen, medmindre der er solformørkelse.";
    public static final String UTF_16 = "Merkur er planeten tættest på Solen og den mindste planet i Solsystemet,[1] med en omløbstid om Solen på 87,969 dage. Merkurs kredsløb har den største excentricitet af alle Solsystemets planeter og den mindste aksehældning. Planeten roterer tre gange om sin akse, for hver gang den laver to omløb om Solen. Merkurbanens perihelium præcesserer omkring Solen med en størrelse, der er større end 43 buesekunder per århundrede; et fænomen, der blev forklaret i det 20. århundrede af Albert Einsteins Generelle relativitetsteori.[2] Merkur er klar set fra Jorden, varierende i tilsyneladende størrelsesklasse fra −2,0 til 5,5, men den er ikke let at se, da den største vinkelafvigelse fra Solen kun er 28,3°. Da Merkur overstråles af Solens lys, kan den normalt kun ses i morgen- og aftenskumringen, medmindre der er solformørkelse.";

    public static void main(String[] args)
    {
        String latin1 = "Forholdsvist lidt er kendt omkring Merkur; jordbaserede teleskoper afslører kun en oplyst 'halvmåne' med begrænsede detaljer. Den første af to rumfartøjer, der har besøgt planeten var Mariner 10, der kun kortlagde omkring 45 % af planetens overflade fra 1974 til 1975. Den anden er MESSENGER, der kortlagde yderligere 30 % under sin første forbiflyvning d. 14. januar 2008. MESSENGER foretog to andre forbiflyvninger i henholdsvis oktober 2008 og september 2009, hvorefter den i 2011 gik i kredsløb og kortlagde hele planeten og foretog en lang række observationer af planeten frem til 2015.";
        String utf16 = "\uD83C\uDF0D";

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
