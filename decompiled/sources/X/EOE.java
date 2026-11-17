package X;

/* loaded from: classes5.dex */
public abstract class EOE {
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(java.util.List r5, X.C6669EOg r6, int r7, int r8) {
        /*
            r4 = 0
            if (r5 == 0) goto L4e
            java.util.Iterator r2 = r5.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.EOL r0 = (X.EOL) r0
            X.ENz r1 = r0.A02
            X.ENz r0 = X.ENz.A03
            if (r1 == r0) goto L7
            X.ENz r0 = X.ENz.A02
            if (r1 == r0) goto L7
            X.ENz r0 = X.ENz.A04
            if (r1 != r0) goto L24
            goto L7
        L23:
            r3 = r4
        L24:
            X.EOL r3 = (X.EOL) r3
            if (r3 != 0) goto L30
            java.lang.Object r3 = X.AbstractC0878AGe.A0G(r5)
            X.EOL r3 = (X.EOL) r3
            if (r3 == 0) goto L44
        L30:
            X.ENz r0 = r3.A02
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "error_code"
            com.facebook.quicklog.QuickPerformanceLogger r2 = r6.A01
            r2.markerAnnotate(r7, r8, r0, r1)
            java.lang.String r1 = "error_message"
            java.lang.String r0 = r3.A00
            r2.markerAnnotate(r7, r8, r1, r0)
        L44:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L55
        L4e:
            r1 = 2
        L4f:
            com.facebook.quicklog.QuickPerformanceLogger r0 = r6.A01
            r0.markerEnd(r7, r8, r1)
            return
        L55:
            java.util.Iterator r2 = r5.iterator()
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r2.next()
            X.EOL r0 = (X.EOL) r0
            X.ENz r1 = r0.A02
            X.ENz r0 = X.ENz.A03
            if (r1 == r0) goto L59
            X.ENz r0 = X.ENz.A02
            if (r1 == r0) goto L59
            X.ENz r0 = X.ENz.A04
            if (r1 == r0) goto L59
            r1 = 3
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOE.A00(java.util.List, X.EOg, int, int):void");
    }
}
