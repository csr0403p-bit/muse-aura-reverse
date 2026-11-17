package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7mA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mA {
    public C7381Etf A01;
    public long A00 = 0;
    public final ArrayList<String> A03 = C3cG.A0h();
    public final ArrayList<String> A04 = C3cG.A0h();
    public final ArrayList<String> A02 = C3cG.A0h();
    public final Map<C7mC, Set<String>> A05 = new HashMap();

    public final C06977mk A00() {
        if (this.A01 != null && !this.A05.isEmpty()) {
            throw C60O.A0i("TrustedCaller needs to be configured with either a TrustedApp or list of trusted packages");
        }
        Map<C7mC, Set<String>> map = this.A05;
        if (!map.isEmpty()) {
            this.A01 = new C7381Etf(map);
        }
        return new C06977mk(this);
    }
}
