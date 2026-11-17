package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class FA0 implements F64, InterfaceC7626F7i {
    public final F9X A00;
    public final C7690FAj A01;
    public final FA3 A02;
    public final FAE<FAT> A03;
    public final C7673F9r A04;
    public final FCH A05;
    public final Map<String, Object> A06;
    public final Map<String, F8J> A07;
    public final F0C A08;
    public final F0C A09;
    public final FCA A0A;
    public final Map<String, Object> A0B;
    public final Map<String, Object> A0C;

    @Override // X.F64
    public final boolean A76(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.A0A.containsKey(str) || this.A04.A01.A0A.containsKey(str);
    }

    @Override // X.F64
    public final Object ADy(String str) {
        C7384Etj.A0Y(str, 0);
        Map<String, Object> map = this.A00.A01;
        if (!map.containsKey(str)) {
            map = this.A04.A01.A01;
        }
        return map.get(str);
    }

    @Override // X.F64
    public final Object AFR(String str) {
        C7384Etj.A0Y(str, 0);
        Object objA00 = A00(this.A0A, str);
        if (objA00 == AbstractC7685FAe.A00) {
            return null;
        }
        return objA00;
    }

    @Override // X.F64
    public final FDG AFx(String str) {
        C7384Etj.A0Y(str, 0);
        FDG fdg = this.A00.A03.get(str);
        return fdg == null ? this.A04.A01.A03.get(str) : fdg;
    }

    @Override // X.F64
    public final F6K AHN(String str) {
        C7384Etj.A0Y(str, 0);
        F6K f6k = (F6K) this.A00.A09.get(str);
        return f6k == null ? (F6K) this.A04.A01.A09.get(str) : f6k;
    }

    @Override // X.F64
    public final C7616F6s AIe(String str) {
        C7384Etj.A0Y(str, 0);
        C7616F6s c7616F6s = this.A00.A06.get(str);
        return c7616F6s == null ? this.A04.A01.A06.get(str) : c7616F6s;
    }

    @Override // X.F64
    public final F8L AMQ(String str) {
        C7384Etj.A0Y(str, 0);
        F8L f8l = this.A00.A08.get(str);
        return f8l == null ? this.A04.A01.A08.get(str) : f8l;
    }

    @Override // X.F64
    public final Object AMX(String str) {
        C7384Etj.A0Y(str, 0);
        Map<String, Object> map = this.A00.A0A;
        if (!map.containsKey(str)) {
            map = this.A04.A01.A0A;
        }
        return map.get(str);
    }

    @Override // X.F64
    public final boolean AN9(String str) {
        C7384Etj.A0Y(str, 0);
        return A00(this.A0A, str) != AbstractC7685FAe.A00;
    }

    @Override // X.F64
    public final boolean ANE(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.A06.containsKey(str) || this.A04.A01.A06.containsKey(str);
    }

    @Override // X.F64
    public final boolean ANK(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.A07.containsKey(str) || this.A04.A01.A07.containsKey(str);
    }

    @Override // X.F64
    public final Object getParameter(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A02.A00.A05.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r6.containsKey(r10) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object A00(X.FCA r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.A0B
            boolean r0 = r6.containsKey(r10)
            if (r0 != 0) goto L59
            X.FA3 r0 = r8.A02
            X.FCO r0 = r0.A04
            boolean r0 = r0.A02
            if (r0 == 0) goto L5e
            X.FCH r0 = r9.A03
            java.util.Map<java.lang.String, X.FAU> r0 = r0.A03
            java.lang.Object r8 = r0.get(r10)
            r1 = 0
            if (r8 != 0) goto L27
            X.FCH r0 = r9.A04
            if (r0 == 0) goto L2a
            java.util.Map<java.lang.String, X.FAU> r0 = r0.A03
            java.lang.Object r8 = r0.get(r10)
            X.FAU r8 = (X.FAU) r8
        L27:
            if (r8 == 0) goto L5e
            goto L2c
        L2a:
            r8 = r1
            goto L27
        L2c:
            X.FCN r7 = X.AbstractC7757FDj.A00()     // Catch: java.lang.Throwable -> L51
            X.AIr r5 = r7.A02     // Catch: java.lang.Throwable -> L51
            r7.A02 = r1     // Catch: java.lang.Throwable -> L51
            r1 = r8
            X.FAU r1 = (X.FAU) r1     // Catch: java.lang.Throwable -> L4d
            X.FDW r0 = r1.A01     // Catch: java.lang.Throwable -> L4d
            int r0 = r0.A04     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.A00     // Catch: java.lang.Throwable -> L4d
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L4d
            r0 = 27
            long r3 = r3 << r0
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 | r0
            long r1 = (long) r2     // Catch: java.lang.Throwable -> L4d
            long r1 = r1 | r3
            r0 = 0
            X.FCA.A01(r9, r0, r8, r1)     // Catch: java.lang.Throwable -> L4d
            r7.A02 = r5     // Catch: java.lang.Throwable -> L51
            goto L53
        L4d:
            r0 = move-exception
            r7.A02 = r5     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            throw r0
        L53:
            boolean r0 = r6.containsKey(r10)
            if (r0 == 0) goto L5e
        L59:
            java.lang.Object r0 = r6.get(r10)
            return r0
        L5e:
            java.lang.Object r0 = X.AbstractC7685FAe.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FA0.A00(X.FCA, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.FAU r17, X.FCJ r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FA0.A01(X.FAU, X.FCJ):void");
    }

    @Override // X.InterfaceC7626F7i
    public final long A5G() {
        return C3cG.A05(this.A08.getValue());
    }

    @Override // X.F64
    public final F9X AM4() {
        return this.A02.A00;
    }

    public FA0(FA3 fa3, FCA fca) {
        this.A02 = fa3;
        this.A0A = fca;
        FCH fch = fca.A03;
        this.A05 = fch;
        this.A0B = fch.A02;
        this.A0C = fch.A04;
        this.A07 = new AGY();
        FCH fch2 = fca.A04;
        this.A06 = fch2 != null ? fch2.A04 : null;
        this.A09 = AbstractC7607F5u.A1A(null, C8472Feb.A00(45));
        this.A08 = AbstractC7607F5u.A1A(null, C8472Feb.A00(44));
        this.A03 = fa3.A02;
        this.A01 = fa3.A01;
        this.A00 = fa3.A00;
        this.A04 = fa3.A03;
    }

    @Override // X.F64
    public final Object A6l(F6D f6d, F8L f8l) {
        AnonymousClass003.A0u(f8l, f6d);
        Map<String, F8J> map = this.A07;
        String strA01 = F8J.A01(f8l, ((F6L) f6d).A02);
        F8J f8jA00 = map.get(strA01);
        if (f8jA00 == null) {
            f8jA00 = F8J.A00(f6d, f8l);
            map.put(strA01, f8jA00);
        }
        return f8jA00.A02(f6d, strA01);
    }
}
