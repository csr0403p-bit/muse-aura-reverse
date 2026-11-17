package X;

/* renamed from: X.EbI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6860EbI implements InterfaceC6926EcZ {
    public final C6859EbH A00;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if (r11 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01(java.io.IOException r9, X.C6864EbM r10, boolean r11) {
        /*
            r8 = this;
            r8 = 0
            if (r11 == 0) goto L8
            boolean r0 = r9 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L8
        L7:
            return r8
        L8:
            boolean r0 = r9 instanceof java.net.ProtocolException
            if (r0 != 0) goto L7
            boolean r0 = r9 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L28
            boolean r0 = r9 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L7
            if (r11 != 0) goto L7
        L16:
            X.Ebu r7 = r10.A02
            X.C7384Etj.A0X(r7)
            int r2 = r7.A02
            if (r2 != 0) goto L3a
            int r0 = r7.A00
            if (r0 != 0) goto L3a
            int r0 = r7.A01
            if (r0 != 0) goto L3a
            return r8
        L28:
            boolean r0 = r9 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L35
            java.lang.Throwable r0 = r9.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L35
            return r8
        L35:
            boolean r0 = r9 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L16
            return r8
        L3a:
            X.Ec7 r0 = r7.A03
            r1 = 1
            if (r0 != 0) goto L88
            r6 = 0
            if (r2 > r1) goto L8a
            int r0 = r7.A00
            if (r0 > r1) goto L8a
            int r0 = r7.A01
            if (r0 > 0) goto L8a
            X.EbM r0 = r7.A08
            X.EbK r5 = r0.A03
            if (r5 == 0) goto L8a
            monitor-enter(r5)
            int r0 = r5.A02     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L83
            X.Ec7 r4 = r5.A0F     // Catch: java.lang.Throwable -> L7f
            X.EbE r0 = r4.A02     // Catch: java.lang.Throwable -> L7f
            X.EbC r3 = r0.A09     // Catch: java.lang.Throwable -> L7f
            X.EbE r0 = r7.A06     // Catch: java.lang.Throwable -> L7f
            X.EbC r2 = r0.A09     // Catch: java.lang.Throwable -> L7f
            byte[] r0 = X.AbstractC6843Eav.A06     // Catch: java.lang.Throwable -> L7f
            X.AnonymousClass002.A1a(r3, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r3.A02     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r2.A02     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L83
            int r1 = r3.A00     // Catch: java.lang.Throwable -> L7f
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L7f
            if (r1 != r0) goto L83
            java.lang.String r1 = r3.A03     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r2.A03     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L83
            goto L82
        L7f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L82:
            r6 = r4
        L83:
            monitor-exit(r5)
            if (r6 == 0) goto L8a
            r7.A03 = r6
        L88:
            r8 = 1
            return r8
        L8a:
            X.EcP r0 = r7.A04
            if (r0 == 0) goto L99
            int r1 = r0.A00
            java.util.List<X.Ec7> r0 = r0.A01
            int r0 = r0.size()
            if (r1 >= r0) goto L99
            goto L88
        L99:
            X.Ebh r0 = r7.A05
            if (r0 == 0) goto L88
            boolean r0 = r0.A00()
            if (r0 != 0) goto L88
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6860EbI.A01(java.io.IOException, X.EbM, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        throw X.C60Q.A0V("method ", r7, " must not have a request body.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        throw X.C60Q.A0V("method ", r7, " must have a request body.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4 A[Catch: all -> 0x02cf, TryCatch #5 {all -> 0x02cf, blocks: (B:19:0x007c, B:21:0x0080, B:23:0x008a, B:25:0x00a2, B:35:0x00c3, B:63:0x0138, B:26:0x00a8, B:28:0x00ae, B:30:0x00b2, B:31:0x00b4, B:92:0x01a4, B:95:0x01ab, B:97:0x01af, B:100:0x01b4, B:151:0x0290, B:153:0x0294, B:154:0x0297, B:157:0x02a3, B:120:0x0203, B:122:0x0210, B:136:0x0268, B:103:0x01bb, B:105:0x01bf, B:108:0x01c4, B:112:0x01d1, B:114:0x01eb, B:150:0x028f, B:123:0x021a, B:116:0x01ee, B:118:0x01f8, B:119:0x01fa, B:124:0x0224, B:126:0x0234, B:127:0x0238, B:71:0x0158, B:73:0x0167, B:75:0x016d, B:77:0x0177, B:135:0x0261, B:129:0x0246, B:131:0x024e, B:48:0x0100, B:52:0x010a, B:54:0x0112, B:56:0x011a, B:58:0x0122, B:60:0x012a, B:70:0x0149, B:62:0x0132, B:64:0x0139, B:66:0x013f, B:158:0x02b8, B:159:0x02c0, B:134:0x025b, B:47:0x00f9, B:37:0x00cb, B:39:0x00d5, B:40:0x00da, B:42:0x00df, B:44:0x00e7, B:46:0x00f3), top: B:180:0x007c, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ee A[Catch: all -> 0x02cf, TryCatch #5 {all -> 0x02cf, blocks: (B:19:0x007c, B:21:0x0080, B:23:0x008a, B:25:0x00a2, B:35:0x00c3, B:63:0x0138, B:26:0x00a8, B:28:0x00ae, B:30:0x00b2, B:31:0x00b4, B:92:0x01a4, B:95:0x01ab, B:97:0x01af, B:100:0x01b4, B:151:0x0290, B:153:0x0294, B:154:0x0297, B:157:0x02a3, B:120:0x0203, B:122:0x0210, B:136:0x0268, B:103:0x01bb, B:105:0x01bf, B:108:0x01c4, B:112:0x01d1, B:114:0x01eb, B:150:0x028f, B:123:0x021a, B:116:0x01ee, B:118:0x01f8, B:119:0x01fa, B:124:0x0224, B:126:0x0234, B:127:0x0238, B:71:0x0158, B:73:0x0167, B:75:0x016d, B:77:0x0177, B:135:0x0261, B:129:0x0246, B:131:0x024e, B:48:0x0100, B:52:0x010a, B:54:0x0112, B:56:0x011a, B:58:0x0122, B:60:0x012a, B:70:0x0149, B:62:0x0132, B:64:0x0139, B:66:0x013f, B:158:0x02b8, B:159:0x02c0, B:134:0x025b, B:47:0x00f9, B:37:0x00cb, B:39:0x00d5, B:40:0x00da, B:42:0x00df, B:44:0x00e7, B:46:0x00f3), top: B:180:0x007c, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027e A[Catch: all -> 0x0274, TryCatch #3 {all -> 0x0274, blocks: (B:137:0x0271, B:144:0x027e), top: B:176:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0288 A[PHI: r17
  0x0288: PHI (r17v2 boolean) = (r17v0 boolean), (r17v3 boolean) binds: [B:147:0x0286, B:143:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0294 A[Catch: all -> 0x02cf, TryCatch #5 {all -> 0x02cf, blocks: (B:19:0x007c, B:21:0x0080, B:23:0x008a, B:25:0x00a2, B:35:0x00c3, B:63:0x0138, B:26:0x00a8, B:28:0x00ae, B:30:0x00b2, B:31:0x00b4, B:92:0x01a4, B:95:0x01ab, B:97:0x01af, B:100:0x01b4, B:151:0x0290, B:153:0x0294, B:154:0x0297, B:157:0x02a3, B:120:0x0203, B:122:0x0210, B:136:0x0268, B:103:0x01bb, B:105:0x01bf, B:108:0x01c4, B:112:0x01d1, B:114:0x01eb, B:150:0x028f, B:123:0x021a, B:116:0x01ee, B:118:0x01f8, B:119:0x01fa, B:124:0x0224, B:126:0x0234, B:127:0x0238, B:71:0x0158, B:73:0x0167, B:75:0x016d, B:77:0x0177, B:135:0x0261, B:129:0x0246, B:131:0x024e, B:48:0x0100, B:52:0x010a, B:54:0x0112, B:56:0x011a, B:58:0x0122, B:60:0x012a, B:70:0x0149, B:62:0x0132, B:64:0x0139, B:66:0x013f, B:158:0x02b8, B:159:0x02c0, B:134:0x025b, B:47:0x00f9, B:37:0x00cb, B:39:0x00d5, B:40:0x00da, B:42:0x00df, B:44:0x00e7, B:46:0x00f3), top: B:180:0x007c, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [X.EbK] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.EbI] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // X.InterfaceC6926EcZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C6886Ebi ANq(X.C6875EbX r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6860EbI.ANq(X.EbX):X.Ebi");
    }

    public static final int A00(C6886Ebi c6886Ebi, int i) throws NumberFormatException {
        String strA00 = C6886Ebi.A00("Retry-After", c6886Ebi);
        if (strA00 == null) {
            return i;
        }
        if (!C06827l3.A02("\\d+").A08(strA00)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA00);
        C7384Etj.A0U(numValueOf);
        return numValueOf.intValue();
    }

    public C6860EbI(C6859EbH c6859EbH) {
        this.A00 = c6859EbH;
    }
}
