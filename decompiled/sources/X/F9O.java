package X;

import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class F9O implements F8K {
    public Map<String, Object> A00;
    public Map<String, F8J> A01;
    public final Set<String> A02 = C60O.A13();

    @Override // X.F8K
    public final void A39(String str) {
        C7384Etj.A0Y(str, 0);
        this.A02.add(str);
    }

    @Override // X.F8K
    public final void A3N(Iterable<String> iterable) {
        C7384Etj.A0Y(iterable, 0);
        AbstractC0882AGj.A0r(iterable, this.A02);
    }

    @Override // X.F8K
    public final boolean AfX() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.F9O r7, X.C7648F8p r8, java.util.Map r9) {
        /*
            java.util.Iterator r6 = X.AnonymousClass002.A0n(r9)
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4f
            java.util.Map$Entry r0 = X.C3cH.A0l(r6)
            java.lang.Object r5 = r0.getKey()
            java.lang.Object r4 = r0.getValue()
            X.F8J r4 = (X.F8J) r4
            X.F8p r3 = r4.A00
            r2 = 0
            if (r3 == 0) goto L23
            int[] r0 = r3.A01
            int r0 = r0.length
            r1 = 0
            if (r0 != 0) goto L24
        L23:
            r1 = 1
        L24:
            int[] r0 = r8.A01
            int r0 = r0.length
            if (r0 != 0) goto L2a
            r2 = 1
        L2a:
            if (r1 == 0) goto L3b
            if (r2 == 0) goto L3b
        L2e:
            java.util.Set<java.lang.String> r1 = r7.A02
            java.util.Set<java.lang.String> r0 = r4.A04
            r1.addAll(r0)
            java.util.Map<java.lang.String, X.F8J> r0 = r4.A03
            A00(r7, r8, r0)
            goto L4
        L3b:
            boolean r0 = X.C7384Etj.areEqual(r3, r8)
            if (r0 != 0) goto L2e
            java.util.Map<java.lang.String, X.F8J> r0 = r7.A01
            if (r0 != 0) goto L4b
            java.util.HashMap r0 = X.BV4.A0u()
            r7.A01 = r0
        L4b:
            r0.put(r5, r4)
            goto L4
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F9O.A00(X.F9O, X.F8p, java.util.Map):void");
    }

    @Override // X.F8K
    public final void A40(F8J f8j, String str) {
        AnonymousClass003.A0u(str, f8j);
        Map mapA0u = this.A01;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            this.A01 = mapA0u;
        }
        mapA0u.put(str, f8j);
    }
}
