package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class Hr8 {
    public final Map<String, String> A00;
    public final Map<String, Long> A01;

    public Hr8(Map<String, Long> map, Map<String, String> map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public static final Hr8 A01(Hr8... hr8Arr) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        for (Hr8 hr8 : hr8Arr) {
            linkedHashMapA0j.putAll(hr8.A00);
            linkedHashMapA0j2.putAll(hr8.A01);
        }
        return new Hr8(AGH.A0A(linkedHashMapA0j2), AGH.A0A(linkedHashMapA0j));
    }
}
