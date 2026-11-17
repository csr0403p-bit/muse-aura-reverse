package X;

/* loaded from: classes5.dex */
public final class C4J {
    public final F18<C4Z> A00;

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[LOOP:3: B:25:0x0059->B:26:0x005b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4N[] A00(X.EnumC3223C4g[] r10) {
        /*
            r9 = this;
            int r6 = r10.length
            java.util.ArrayList r5 = X.C60O.A11(r6)
            r4 = 0
            r1 = 0
        L7:
            if (r1 >= r6) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.add(r0)
            int r1 = r1 + 1
            goto L7
        L14:
            X.F18<X.C4Z> r0 = r9.A00
            if (r0 != 0) goto L48
            java.io.File[] r9 = new java.io.File[r4]
        L1a:
            int r8 = r9.length
            r7 = 0
        L1c:
            if (r7 >= r8) goto L57
            r3 = r9[r7]
            if (r3 == 0) goto L42
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L42
            r2 = 0
        L29:
            if (r2 >= r6) goto L42
            java.lang.String r1 = r3.getName()
            r0 = r10[r2]
            java.lang.String r0 = r0.prefix
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L45
            java.lang.Object r0 = r5.get(r2)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r3)
        L42:
            int r7 = r7 + 1
            goto L1c
        L45:
            int r2 = r2 + 1
            goto L29
        L48:
            java.lang.Object r0 = r0.AMN()
            X.C4Z r0 = (X.C4Z) r0
            java.io.File r0 = r0.A01
            java.io.File[] r9 = r0.listFiles()
            if (r9 == 0) goto L57
            goto L1a
        L57:
            X.C4N[] r3 = new X.C4N[r6]
        L59:
            if (r4 >= r6) goto L7f
            r2 = r10[r4]
            java.lang.Object r1 = r5.get(r4)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object r0 = r5.get(r4)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r0 = r0.size()
            java.io.File[] r0 = new java.io.File[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.io.File[] r1 = (java.io.File[]) r1
            X.C4N r0 = new X.C4N
            r0.<init>(r2, r1)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L59
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4J.A00(X.C4g[]):X.C4N[]");
    }

    public C4J(F18<C4Z> f18) {
        this.A00 = f18;
    }
}
