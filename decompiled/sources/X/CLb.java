package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CLb {
    public final String A00;
    public final Map<String, Object> A01;

    public final void A00(DAV dav) {
        dav.AQF("startReason", this.A00);
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                long jLongValue = ((Number) value).longValue();
                C7384Etj.A0Y(str, 0);
                CLc cLc = ((C3412CLd) dav).A00.get();
                if (cLc != null && cLc.A02.put(str, true) == null) {
                    cLc.A01.markerAnnotate(cLc.A00, str, jLongValue);
                }
            } else if (value instanceof Boolean) {
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                C7384Etj.A0Y(str, 0);
                CLc cLc2 = ((C3412CLd) dav).A00.get();
                if (cLc2 != null && cLc2.A02.put(str, true) == null) {
                    cLc2.A01.markerAnnotate(cLc2.A00, str, zBooleanValue);
                }
            } else if (value instanceof String) {
                String str2 = (String) value;
                C7384Etj.A0Y(str, 0);
                C7384Etj.A0Y(str2, 1);
                CLc cLc3 = ((C3412CLd) dav).A00.get();
                if (cLc3 != null && cLc3.A02.put(str, true) == null) {
                    cLc3.A01.markerAnnotate(cLc3.A00, str, str2);
                }
            } else {
                CFK.A04("StartReason", FGI.A0M("Unsupported type for extra annotation: ", str));
            }
        }
    }

    public CLb(String str, Map<String, ? extends Object> map) {
        this.A00 = str;
        this.A01 = map;
    }
}
