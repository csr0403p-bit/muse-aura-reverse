package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class Hma {
    public static final Map<String, Integer> A00;
    public static final Map<Integer, String> A01;

    static {
        Map<String, Integer> mapA0D = AGH.A0D(AnonymousClass002.A0p("UNKNOWN", 0), C3cG.A0r("CHEST_STRAP", 7), C3cG.A0r("FITNESS_BAND", 6), C3cG.A0r("HEAD_MOUNTED", 5), AnonymousClass002.A0p("PHONE", 2), AnonymousClass002.A0p("RING", 4), AnonymousClass002.A0p("SCALE", 3), C3cG.A0r("SMART_DISPLAY", 8), AnonymousClass002.A0p("WATCH", 1));
        A00 = mapA0D;
        Set<Map.Entry<String, Integer>> setEntrySet = mapA0D.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<String, Integer>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMapA15.put(entryA0l.getValue(), entryA0l.getKey());
        }
        A01 = linkedHashMapA15;
    }
}
