package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Hy5 {
    public static final void A00(String str, String str2, List list) {
        List listA0X;
        AnonymousClass003.A0u(str, list);
        StringBuilder sbA0x = C3cI.A0x("Reliability event:\n", str);
        sbA0x.append("\nlocalCallId=");
        sbA0x.append(str2);
        sbA0x.append("\nsharedCallId=");
        sbA0x.append((String) null);
        String strA0y = AnonymousClass006.A0y(null, "\neventData=", sbA0x);
        C7384Etj.A0Y(strA0y, 1);
        AbstractC7608F5v.A1L(strA0y);
        C10608Hyi c10608Hyi = C10608Hyi.A01;
        if (c10608Hyi == null) {
            c10608Hyi = new C10608Hyi();
            C10608Hyi.A01 = c10608Hyi;
        }
        List list2 = c10608Hyi.A00;
        synchronized (list2) {
            listA0X = AbstractC0878AGe.A0X(list2);
        }
        Iterator it = listA0X.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onReliabilityEvent");
        }
    }
}
