package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CYD {
    public CG5 A00;
    public String A03 = "";
    public Map<String, Set<String>> A06 = C3cG.A0j();
    public String A04 = "";
    public String A05 = "";
    public CXt A02 = CXt.A04;
    public CYV A01 = CYV.A06;

    public final /* bridge */ /* synthetic */ void A00(String str, String str2) {
        Map<String, Set<String>> map = this.A06;
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        linkedHashSet.add(new String[]{str2}[0]);
        map.put(str, linkedHashSet);
    }
}
