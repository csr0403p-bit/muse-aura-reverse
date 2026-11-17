package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EuE {
    public final String A00;
    public final Map<String, String> A01;

    public final boolean equals(Object obj) {
        if (obj instanceof EuE) {
            EuE euE = (EuE) obj;
            if (euE.A00.equals(this.A00) && C7384Etj.areEqual(euE.A01, this.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (899 + this.A00.hashCode()) * 31);
    }

    public EuE(String str, Map<String, String> map) {
        AnonymousClass003.A0u(str, map);
        this.A00 = str;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            linkedHashMapA0j.put(strA0t == null ? null : C60Q.A0g(strA0t), entryA0l.getValue());
        }
        this.A01 = Collections.unmodifiableMap(linkedHashMapA0j);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        sbA0w.append(" authParams=");
        return C8j3.A14(this.A01, sbA0w);
    }
}
