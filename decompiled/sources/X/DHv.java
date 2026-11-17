package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class DHv {
    public C4955DHq A00;
    public final AwakeTimeSinceBootClock A01;
    public final DI3 A02;
    public final AtomicReference<QuickEventImpl> A03 = BV4.A15();
    public final QuickPerformanceLoggerGKs A04;
    public final InterfaceC4945DGj A05;
    public final DJe A06;

    public static long A01(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int A00(DI1 di1, QuickEventImpl quickEventImpl, String str, String str2, boolean z) {
        if (!z) {
            quickEventImpl.A0S.A01();
        }
        try {
            int iA0C = quickEventImpl.A0R.A0C(str, str2);
            if (!z) {
                di1.A01(quickEventImpl, iA0C);
                DHr.A00(quickEventImpl);
            }
            return iA0C;
        } catch (Throwable th) {
            if (!z) {
                DHr.A00(quickEventImpl);
            }
            throw th;
        }
    }

    public static C4979DJw A02(DHv dHv, int i, int i2, long j) {
        DI8.A01("qpl.markersManager.getStartMetadata");
        try {
            C4955DHq c4955DHq = dHv.A00;
            C4979DJw c4979DJw = null;
            if (c4955DHq != null && j != 0) {
                QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = dHv.A04;
                InterfaceC3173C1c metadataGKs = quickPerformanceLoggerGKs == null ? null : quickPerformanceLoggerGKs.getMetadataGKs();
                for (int i3 : c4955DHq.A00) {
                    if ((j & (1 << (i3 - 1))) != 0 && metadataGKs != null) {
                        DHp<?, ?> dHp = c4955DHq.A01[i3];
                        if (dHp == null) {
                            throw BV5.A0Q("Unknown provider with id = ", i3);
                        }
                        if (dHp.isEnabled(metadataGKs)) {
                            if (c4979DJw == null) {
                                c4979DJw = new C4979DJw();
                            }
                            c4979DJw.put(dHp.getProviderTypeId(), dHp.start(i, i2));
                        }
                    }
                }
            }
            return c4979DJw;
        } finally {
            DI8.A00();
        }
    }

    public static void A03(DHv dHv, InterfaceC4978DJv interfaceC4978DJv, long j) {
        DI8.A01("qpl.markersManager.stopDataProviders");
        try {
            C4955DHq c4955DHq = dHv.A00;
            if (c4955DHq != null && j != 0) {
                QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = dHv.A04;
                InterfaceC3173C1c metadataGKs = quickPerformanceLoggerGKs != null ? quickPerformanceLoggerGKs.getMetadataGKs() : null;
                for (int i : c4955DHq.A00) {
                    if (((1 << (i - 1)) & j) != 0 && metadataGKs != null) {
                        DHp<?, ?> dHp = c4955DHq.A01[i];
                        if (dHp == null) {
                            throw BV5.A0Q("Unknown provider with id = ", i);
                        }
                        if (dHp.isEnabled(metadataGKs)) {
                            int providerTypeId = dHp.getProviderTypeId();
                            if (interfaceC4978DJv != null) {
                                interfaceC4978DJv.get(providerTypeId);
                            }
                        }
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    public static void A04(QuickEventImpl quickEventImpl, TimeUnit timeUnit, long j, short s) {
        DHr dHr = quickEventImpl.A0S;
        dHr.A01();
        try {
            quickEventImpl.A05 = timeUnit.toNanos(j) - quickEventImpl.A07;
            quickEventImpl.A0J = s;
        } finally {
            dHr.A02();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A05(X.CPI r16, X.DI1 r17, com.facebook.quicklog.QuickEventImpl r18, java.lang.String r19, java.util.concurrent.TimeUnit r20, int r21, int r22, long r23, boolean r25, boolean r26) {
        /*
            r15 = this;
            r6 = r18
            if (r26 != 0) goto L9
            X.DHr r0 = r6.A0S
            r0.A01()
        L9:
            r2 = r20
            r0 = r23
            long r12 = r2.toNanos(r0)     // Catch: java.lang.Throwable -> L64
            long r0 = r6.A07     // Catch: java.lang.Throwable -> L64
            long r12 = r12 - r0
            long r0 = r6.A06     // Catch: java.lang.Throwable -> L64
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r7 = r16
            r3 = r17
            r9 = r19
            r11 = r21
            r14 = r25
            if (r2 == 0) goto L27
            goto L36
        L27:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L64
            r8 = 0
            int r5 = r6.A01(r7, r8, r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L64
            if (r26 != 0) goto L63
            r2 = 0
            r3.A04(r6, r5, r2)     // Catch: java.lang.Throwable -> L64
            r4 = 0
            goto L3c
        L36:
            if (r22 == 0) goto L27
            r5 = -1
            r4 = 1
            if (r26 != 0) goto L43
        L3c:
            X.DHr r2 = r6.A0S
            r2.A02()
            if (r4 == 0) goto L63
        L43:
            int r4 = r6.mMarkerId
            int r2 = r6.A02
            X.DJw r8 = r15.A07(r4, r2, r0)
            if (r26 != 0) goto L52
            X.DHr r0 = r6.A0S
            r0.A01()
        L52:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L64
            int r5 = r6.A01(r7, r8, r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L64
            if (r26 != 0) goto L63
            r0 = 0
            r3.A04(r6, r5, r0)     // Catch: java.lang.Throwable -> L64
            X.DHr r0 = r6.A0S
            r0.A02()
        L63:
            return r5
        L64:
            r1 = move-exception
            if (r26 != 0) goto L6c
            X.DHr r0 = r6.A0S
            r0.A02()
        L6c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHv.A05(X.CPI, X.DI1, com.facebook.quicklog.QuickEventImpl, java.lang.String, java.util.concurrent.TimeUnit, int, int, long, boolean, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4979DJw A07(int r16, int r17, long r18) {
        /*
            r15 = this;
            java.lang.String r0 = "qpl.markersManager.getStopMetadata"
            X.DI8.A01(r0)
            X.DHq r8 = r15.A00     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L78
            r13 = 0
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 == 0) goto L78
            java.lang.String r0 = "qpl.markersManager.getStopMetadata.buildStopData"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L7d
            X.DJw r7 = new X.DJw     // Catch: java.lang.Throwable -> L73
            r7.<init>()     // Catch: java.lang.Throwable -> L73
            int[] r6 = r8.A00     // Catch: java.lang.Throwable -> L73
            int r5 = r6.length     // Catch: java.lang.Throwable -> L73
            r4 = 0
        L1d:
            if (r4 >= r5) goto L6f
            r10 = r6[r4]     // Catch: java.lang.Throwable -> L73
            com.facebook.quicklog.QuickPerformanceLoggerGKs r0 = r15.A04     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L26
            goto L2b
        L26:
            X.C1c r9 = r0.getMetadataGKs()     // Catch: java.lang.Throwable -> L73
            goto L2c
        L2b:
            r9 = 0
        L2c:
            int r0 = r10 + (-1)
            r11 = 1
            long r11 = r11 << r0
            long r1 = r18 & r11
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L60
            if (r9 == 0) goto L60
            X.DHp<?, ?>[] r0 = r8.A01     // Catch: java.lang.Throwable -> L73
            r3 = r0[r10]     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L68
            boolean r0 = r3.isEnabled(r9)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L60
            int r2 = r3.getProviderTypeId()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "qpl.markersManager.getStopMetadata.providerSnapshot.%s"
            java.lang.String r0 = r3.getProviderName()     // Catch: java.lang.Throwable -> L73
            X.DI8.A02(r1, r0)     // Catch: java.lang.Throwable -> L73
            r1 = r16
            r0 = r17
            java.lang.Object r0 = r3.snapshot(r1, r0)     // Catch: java.lang.Throwable -> L63
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> L63
            X.DI8.A00()     // Catch: java.lang.Throwable -> L73
        L60:
            int r4 = r4 + 1
            goto L1d
        L63:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L73
            goto L6e
        L68:
            java.lang.String r0 = "Unknown provider with id = "
            java.lang.IllegalArgumentException r0 = X.BV5.A0Q(r0, r10)     // Catch: java.lang.Throwable -> L73
        L6e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L6f:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L7d
            goto L79
        L73:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L7d
            throw r0     // Catch: java.lang.Throwable -> L7d
        L78:
            r7 = 0
        L79:
            X.DI8.A00()
            return r7
        L7d:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHv.A07(int, int, long):X.DJw");
    }

    public final void A08(DI1 di1, int i, long j) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = this.A01;
        QuickEventImpl quickEventImplA00 = QuickEventImpl.A00(awakeTimeSinceBootClock, TimeUnit.NANOSECONDS, 36315086, 0, 0, 0, awakeTimeSinceBootClock.nowNanos(), j, true, false);
        quickEventImplA00.A0R.A0A("original_marker_id", i);
        DHr dHr = quickEventImplA00.A0S;
        dHr.A01();
        try {
            di1.A00(quickEventImplA00);
        } finally {
            dHr.A02();
        }
    }

    public DHv(AwakeTimeSinceBootClock awakeTimeSinceBootClock, DIG dig, QuickPerformanceLoggerGKs quickPerformanceLoggerGKs, InterfaceC4945DGj interfaceC4945DGj, DJe dJe) {
        this.A01 = awakeTimeSinceBootClock;
        this.A04 = quickPerformanceLoggerGKs;
        this.A06 = dJe;
        this.A05 = interfaceC4945DGj;
        this.A02 = new DI3(dig);
    }

    public final QuickEventImpl A06(DI1 di1, TimeUnit timeUnit, int i, int i2, long j) {
        QuickEventImpl quickEventImplA02 = this.A02.A02(A01(i, i2));
        if (quickEventImplA02 != null) {
            DHr dHr = quickEventImplA02.A0S;
            dHr.A01();
            try {
                quickEventImplA02.A05 = timeUnit.toNanos(j) - quickEventImplA02.A07;
                InterfaceC4978DJv<?> interfaceC4978DJv = quickEventImplA02.A0D;
                if (interfaceC4978DJv != null) {
                    A03(this, interfaceC4978DJv, quickEventImplA02.A06);
                }
                quickEventImplA02.A05 = timeUnit.toNanos(j) - quickEventImplA02.A07;
                C4956DHw c4956DHw = di1.A03;
                if (c4956DHw != null) {
                    C4956DHw.A00(quickEventImplA02, c4956DHw, null, null, 4, -1, 0);
                }
            } finally {
                dHr.A02();
            }
        }
        return quickEventImplA02;
    }

    public final void A09(DI1 di1, String str, int i, int i2) {
        QuickEventImpl quickEventImplA01;
        long jA01 = A01(i, i2);
        DI3 di3 = this.A02;
        if (!di3.A04(di1, jA01) || (quickEventImplA01 = di3.A01(jA01)) == null) {
            return;
        }
        try {
            DHr dHr = quickEventImplA01.A0S;
            dHr.A01();
            if (DI3.A00(di1, quickEventImplA01)) {
                quickEventImplA01.A0T.add(str);
            }
            dHr.A02();
        } catch (Throwable th) {
            DHr.A00(quickEventImplA01);
            throw th;
        }
    }

    public final void A0A(DI1 di1, String str, int i, int i2, int i3) {
        QuickEventImpl quickEventImplA01;
        long jA01 = A01(i, i2);
        DI3 di3 = this.A02;
        if (!di3.A04(di1, jA01) || (quickEventImplA01 = di3.A01(jA01)) == null) {
            return;
        }
        DHr dHr = quickEventImplA01.A0S;
        dHr.A01();
        try {
            if (DI3.A00(di1, quickEventImplA01)) {
                di1.A01(quickEventImplA01, quickEventImplA01.A0R.A0A(str, i3));
            }
        } finally {
            dHr.A02();
        }
    }

    public final void A0B(DI1 di1, String str, String str2, int i, int i2) {
        QuickEventImpl quickEventImplA01;
        long jA01 = A01(i, i2);
        DI3 di3 = this.A02;
        if (!di3.A04(di1, jA01) || (quickEventImplA01 = di3.A01(jA01)) == null) {
            return;
        }
        DHr dHr = quickEventImplA01.A0S;
        dHr.A01();
        try {
            if (DI3.A00(di1, quickEventImplA01)) {
                di1.A01(quickEventImplA01, quickEventImplA01.A0R.A0C(str, str2));
            }
        } finally {
            dHr.A02();
        }
    }
}
