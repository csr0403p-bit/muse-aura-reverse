package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EtU {
    public final InterfaceC7539F0o A00;
    public final C4oT A01;

    public final boolean A02(String str) {
        C7384Etj.A0Y(str, 0);
        return Math.abs((double) (this.A00.now() - BV5.A08(this.A01, str))) >= 8.64E7d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.HashMap] */
    public final Set<String> A00() {
        ?? ACL = this.A01.ACL();
        HashSet hashSetA13 = C60O.A13();
        if (ACL != 0) {
            Iterator itA0i = C3cG.A0i(ACL);
            while (itA0i.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0i.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                C7384Etj.A0X(str);
                if (str.endsWith(".token") && !C7384Etj.areEqual(value, "<cleared>")) {
                    hashSetA13.add(str.substring(0, C7BY.A0B(str, ".token", 0, false)));
                }
            }
        }
        return hashSetA13;
    }

    public EtU(InterfaceC7539F0o interfaceC7539F0o, C7cU c7cU) {
        this.A00 = interfaceC7539F0o;
        this.A01 = c7cU.A00("pushlite");
    }

    public final void A01(String str, String str2, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        C4oT c4oT = this.A01;
        boolean z2 = c4oT.getBoolean(FGI.A0M(str, ".pause_token_refresh"), zA1b);
        BzK bzKA02 = BzK.A02(c4oT);
        bzKA02.AYr(FGI.A0M(str, ".error"), str2);
        bzKA02.A0A(FGI.A0M(str, ".pause_token_refresh"), z2 || !z);
        bzKA02.apply();
    }
}
