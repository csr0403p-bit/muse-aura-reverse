package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DE1 implements C1J, InterfaceC4896DDp {
    public int A00;
    public int A01;
    public CXK A02;
    public byte[] A03;
    public final int A04;

    public static void A02(InterfaceC4897DDq interfaceC4897DDq, String str, Map map) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC4897DDq.AWj(str, list.get(0));
    }

    public final void A03(DDj dDj) {
        Map<String, List<String>> responseHeaders;
        CXK cxk = this.A02;
        if (cxk == null || dDj == null || (responseHeaders = cxk.getResponseHeaders()) == null) {
            return;
        }
        List listA0z = BV4.A0z("x-fb-origin-hit", responseHeaders);
        if (listA0z != null && !listA0z.isEmpty()) {
            dDj.AWj("x-fb-origin-hit", listA0z.get(0));
        }
        A02(dDj, "x-fb-edge-hit", responseHeaders);
        List listA01 = AbstractC7382Etg.A01("X-FB-Connection-Quality", responseHeaders, true);
        if (listA01 != null && !listA01.isEmpty()) {
            dDj.AWj("X-FB-Connection-Quality", listA01.get(0));
        }
        A02(dDj, "x-fb-response-time-ms", responseHeaders);
        A02(dDj, "x-bwe-mean", responseHeaders);
        A02(dDj, "x-bwe-std-dev", responseHeaders);
        A02(dDj, "x-fb-next-valid-segment-id", responseHeaders);
        A02(dDj, "x-fb-dynamic-predictive-response-chunk-size", responseHeaders);
        A02(dDj, "x-fb-session-id", responseHeaders);
        A02(dDj, "x-fb-conn-uuid-client", responseHeaders);
        A02(dDj, "x-fb-ptm-uuid", responseHeaders);
        Iterator itA0n = AnonymousClass002.A0n(responseHeaders);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            List list = (List) entryA0l.getValue();
            if (!list.isEmpty() && (AnonymousClass005.A1a(strA0t, "x-fb-dynamic-") || strA0t.startsWith("x-fb-ull-"))) {
                dDj.AWj(strA0t, list.get(0));
            }
        }
        A02(dDj, "x-fb-dynamic-client-wallclock-offset-ms", responseHeaders);
    }

    public boolean A04() {
        int i = this.A01;
        return i >= 0 && i == this.A00;
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        CXK cxk = this.A02;
        if (cxk == null) {
            return null;
        }
        return cxk.getUri();
    }

    public DE1(int i) {
        this.A04 = i;
    }
}
