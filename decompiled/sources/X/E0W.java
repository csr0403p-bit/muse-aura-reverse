package X;

/* loaded from: classes5.dex */
public final class E0W implements E0V {
    public final E0Y A00 = new E0Y();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // X.E0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E09 A7j(X.C6154Dwx r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.A0b
            if (r4 == 0) goto Lb
            int r0 = r4.hashCode()
            switch(r0) {
                case 930165504: goto L1d;
                case 1566015601: goto L20;
                case 1566016562: goto L32;
                default: goto Lb;
            }
        Lb:
            X.E0Y r1 = r5.A00
            boolean r0 = r1.Agg(r6)
            if (r0 == 0) goto L44
            X.E0a r0 = r1.A7S(r6)
            X.E0g r3 = new X.E0g
            r3.<init>(r0)
            return r3
        L1d:
            java.lang.String r0 = "application/x-mp4-cea-608"
            goto L22
        L20:
            java.lang.String r0 = "application/cea-608"
        L22:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            int r2 = r6.A03
            r0 = 16000(0x3e80, double:7.905E-320)
            X.E0N r3 = new X.E0N
            r3.<init>(r4, r2, r0)
            return r3
        L32:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            int r1 = r6.A03
            java.util.List<byte[]> r0 = r6.A0c
            X.E1v r3 = new X.E1v
            r3.<init>(r1, r0)
            return r3
        L44:
            java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.IllegalArgumentException r0 = X.C60Q.A0U(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0W.A7j(X.Dwx):X.E09");
    }

    @Override // X.E0V
    public final boolean Agg(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        return this.A00.Agg(c6154Dwx) || C6xC.A00(str, "application/cea-608") || C6xC.A00(str, "application/x-mp4-cea-608") || C6xC.A00(str, "application/cea-708");
    }
}
