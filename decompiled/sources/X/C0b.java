package X;

import com.facebook.debug.tracer.Tracer;

/* loaded from: classes5.dex */
public final class C0b implements C0S {
    public static C0b A05;
    public C3155C0d A00;
    public C3164C0p A01;
    public String A02;
    public G0U<? super C0J, Boolean> A03;
    public boolean A04;

    @Override // X.C0S
    public final void AS3() {
    }

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
    }

    @Override // X.C0R
    public final void AW5(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, C0J c0j2, Integer num) {
        AnonymousClass002.A1B(c0j2, 2, num);
        Tracer.A01("CacheInstrumentationListener.onSpanTouched");
        try {
            C3164C0p c3164C0p = this.A01;
            if (c3164C0p != null && c0j != null && num != C79.A0K && num != C79.A0T) {
                String str = this.A02;
                if (str == null) {
                    str = "";
                }
                c3164C0p.A01.add(new BYO(BYR.SPAN_TOUCHED, null, str, null, null, null, null, c0j.A06, null, null, null, null, null, null, c0j.A04, c0j.A03, c0j2.A04, c0j2.A03, false));
            }
        } finally {
            Tracer.A00();
        }
    }

    @Override // X.C0S
    public final void AWA(InterfaceC3158C0g interfaceC3158C0g, String str, long j, long j2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:11:0x001b, B:12:0x001d, B:14:0x0021, B:17:0x002d, B:18:0x005b, B:21:0x0061, B:30:0x0076, B:24:0x0068, B:25:0x006b, B:27:0x006f, B:29:0x0073), top: B:36:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:11:0x001b, B:12:0x001d, B:14:0x0021, B:17:0x002d, B:18:0x005b, B:21:0x0061, B:30:0x0076, B:24:0x0068, B:25:0x006b, B:27:0x006f, B:29:0x0073), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C3154C0c r29) {
        /*
            r28 = this;
            r27 = 0
            java.lang.String r0 = "CacheInstrumentationListener.onRequestComplete"
            com.facebook.debug.tracer.Tracer.A01(r0)
            r3 = r28
            X.C0p r2 = r3.A01     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L79
            r4 = r29
            boolean r0 = r4.A08     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L79
            boolean r0 = r4.A09     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L6b
            int r1 = r4.A01     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L5b
            X.BYR r5 = X.BYR.CACHE_HIT     // Catch: java.lang.Throwable -> L7d
        L1d:
            boolean r0 = r3.A04     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L79
            X.C0h r3 = r4.A0A     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r3.A04     // Catch: java.lang.Throwable -> L7d
            java.lang.String r12 = r4.A07     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = r3.A02     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L2d
            java.lang.String r8 = ""
        L2d:
            X.C1U r0 = r3.A00     // Catch: java.lang.Throwable -> L7d
            java.lang.String r10 = r0.name()     // Catch: java.lang.Throwable -> L7d
            X.BY2 r0 = r3.A01     // Catch: java.lang.Throwable -> L7d
            java.lang.String r17 = r0.name()     // Catch: java.lang.Throwable -> L7d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r27)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = ""
            r9 = 0
            r19 = 0
            X.BYO r4 = new X.BYO     // Catch: java.lang.Throwable -> L7d
            r11 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r18 = r1
            r21 = r19
            r23 = r19
            r25 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r27)     // Catch: java.lang.Throwable -> L7d
            java.util.List<X.BYO> r0 = r2.A01     // Catch: java.lang.Throwable -> L7d
            r0.add(r4)     // Catch: java.lang.Throwable -> L7d
            goto L79
        L5b:
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L64
            if (r1 <= 0) goto L76
            X.BYR r5 = X.BYR.CACHE_PARTIAL_MISS     // Catch: java.lang.Throwable -> L7d
            goto L1d
        L64:
            if (r0 <= 0) goto L76
            if (r1 <= 0) goto L76
            X.BYR r5 = X.BYR.CACHE_PARTIAL_HIT     // Catch: java.lang.Throwable -> L7d
            goto L1d
        L6b:
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L76
            int r0 = r4.A01     // Catch: java.lang.Throwable -> L7d
            if (r0 <= 0) goto L76
            X.BYR r5 = X.BYR.CACHE_MISS     // Catch: java.lang.Throwable -> L7d
            goto L1d
        L76:
            X.BYR r5 = X.BYR.CACHE_UNKNOWN     // Catch: java.lang.Throwable -> L7d
            goto L1d
        L79:
            com.facebook.debug.tracer.Tracer.A00()
            return
        L7d:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0b.A00(X.C0c):void");
    }

    @Override // X.C0R
    public final void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        String str;
        C3156C0e c3156C0e;
        String str2;
        String str3;
        String str4;
        String str5;
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        Tracer.A01("CacheInstrumentationListener.onSpanAdded");
        try {
            if (this.A01 != null && (str = c0j.A06) != null) {
                String strName = "UNKNOWN";
                C3155C0d c3155C0d = this.A00;
                String strName2 = null;
                if (c3155C0d != null) {
                    synchronized (c3155C0d) {
                        c3156C0e = c3155C0d.A00.get(c3155C0d.A01.floor(c0j));
                    }
                } else {
                    c3156C0e = null;
                }
                String str6 = "unknown";
                if (c3156C0e != null) {
                    C3159C0h c3159C0h = c3156C0e.A00;
                    str4 = c3159C0h.A02;
                    if (str4 == null) {
                        str4 = "";
                    }
                    str5 = c3159C0h.A03;
                    if (str5 == null) {
                        str5 = "unknown";
                    }
                    strName = c3159C0h.A00.name();
                    str3 = c3156C0e.A02;
                    if (str3 == null) {
                        str3 = "";
                    }
                    str6 = c3156C0e.A01;
                    if (str6 == null) {
                        str6 = "";
                    }
                    strName2 = c3159C0h.A01.name();
                    str2 = c3159C0h.A04;
                } else {
                    str2 = null;
                    str3 = "";
                    str4 = "unknown";
                    str5 = "unknown";
                }
                C3164C0p c3164C0p = this.A01;
                if (c3164C0p != null) {
                    String str7 = this.A02;
                    String str8 = str7 != null ? str7 : "";
                    long j = c0j.A04;
                    long j2 = c0j.A03;
                    G0U<? super C0J, Boolean> g0u = this.A03;
                    c3164C0p.A01.add(new BYO(BYR.SPAN_ADDED, null, str8, str4, str5, strName, str6, str, str3, null, "unknown", "unknown", strName2, str2, j, j2, 0L, 0L, g0u != null ? AnonymousClass003.A1X(c0j, g0u) : false));
                }
            }
        } finally {
            Tracer.A00();
        }
    }

    @Override // X.C0R
    public final void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        Tracer.A01("CacheInstrumentationListener.onSpanRemoved");
        Tracer.A00();
    }

    @Override // X.C0S
    public final boolean AbD() {
        return false;
    }

    @Override // X.C0S
    public final /* synthetic */ void Acy(String str) {
    }
}
