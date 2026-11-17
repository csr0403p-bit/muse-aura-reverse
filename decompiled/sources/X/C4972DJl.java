package X;

import com.facebook.aura.analytics.impl.QplConfigInstance;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.logginginfra.falco.Identity;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DJl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4972DJl extends AbstractC4980DJx implements DIF {
    public final QplConfigInstance.AnonymousClass8 A00;
    public final AwakeTimeSinceBootClock A01;
    public final DKG A02;
    public final DGY A03;
    public final InterfaceC4945DGj A04;
    public final AtomicReference<C4971DJk> A05 = BV4.A15();
    public final F18 A06;
    public final F18 A07;
    public final C0V A08;
    public final Random A09;
    public final F18<AbstractC4968DJc> A0A;
    public final F18<DGm> A0B;
    public final F18<DGl> A0C;
    public final F18<InterfaceC4946DGk> A0D;
    public volatile Callable<Void> A0E;
    public volatile DGm A0F;
    public volatile AbstractC4968DJc A0G;
    public volatile DGl A0H;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(com.facebook.logginginfra.falco.Identity r5, com.facebook.logginginfra.falco.Identity r6) {
        /*
            r4 = 1
            r3 = 0
            if (r5 != 0) goto L7
            if (r6 != 0) goto L76
        L6:
            return r4
        L7:
            if (r6 == 0) goto L76
            java.lang.Object r1 = r5.A00(r4)
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            if (r1 == 0) goto L43
            java.lang.Object r0 = r6.A00(r4)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            if (r0 == 0) goto L76
            java.lang.Object r1 = r1.A00(r3)
            java.lang.Object r0 = r0.A00(r3)
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 != 0) goto L6
            java.lang.Object r0 = r5.A00(r4)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            r2 = 2
            java.lang.Object r1 = r0.A00(r2)
            java.lang.Object r0 = r6.A00(r4)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            java.lang.Object r0 = r0.A00(r2)
        L3c:
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 == 0) goto L76
            return r4
        L43:
            java.lang.Object r1 = r5.A00(r3)
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            if (r1 == 0) goto L76
            java.lang.Object r0 = r6.A00(r3)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            if (r0 == 0) goto L76
            java.lang.Object r1 = r1.A00(r3)
            java.lang.Object r0 = r0.A00(r3)
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 == 0) goto L76
            java.lang.Object r0 = r5.A00(r3)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            java.lang.Object r1 = r0.A00(r4)
            java.lang.Object r0 = r6.A00(r3)
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            java.lang.Object r0 = r0.A00(r4)
            goto L3c
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4972DJl.A01(com.facebook.logginginfra.falco.Identity, com.facebook.logginginfra.falco.Identity):boolean");
    }

    public static void A00(C4972DJl c4972DJl) {
        Callable<Void> callable;
        if (c4972DJl.A05.get() != null) {
            synchronized (c4972DJl) {
                callable = c4972DJl.A0E;
                c4972DJl.A0E = null;
            }
            if (callable != null) {
                callable.call();
            }
        }
    }

    @Override // X.AbstractC4980DJx, X.DIF
    public final DJL getCrashResiliencyConfig() {
        C4971DJk c4971DJk = this.A05.get();
        return c4971DJk != null ? c4971DJk.A06 : DKC.A00;
    }

    @Override // X.AbstractC4980DJx, X.DIF
    public final boolean isMarkerBlocked(int i) {
        InterfaceC4978DJv<DKD> interfaceC4978DJv;
        int iIndexOfKey;
        C4971DJk c4971DJk = this.A05.get();
        if (c4971DJk != null) {
            return ((this.A08 == null || !C0V.A01.getValue().booleanValue()) && c4971DJk.A04.A00.indexOfKey(i) < 0) || ((iIndexOfKey = (interfaceC4978DJv = c4971DJk.A02.A00).indexOfKey(i)) >= 0 && (interfaceC4978DJv.valueAt(iIndexOfKey).AOl(this.A0D.AMN().getConsentState()) ^ true));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // X.AbstractC4980DJx, X.DIF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean notifyFallbackSamplingUsed(int r6) {
        /*
            r5 = this;
            X.C0V r0 = r5.A08
            if (r0 == 0) goto L2c
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Short> r5 = r0.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Number r3 = X.BV6.A0j(r4, r5)
            if (r3 == 0) goto L18
            short r2 = r3.shortValue()
            r0 = 2
            r1 = 0
            if (r2 >= r0) goto L29
        L18:
            r1 = 1
            if (r3 == 0) goto L2a
            short r0 = r3.shortValue()
            int r0 = r0 + 1
            short r0 = (short) r0
        L22:
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r5.put(r4, r0)
        L29:
            return r1
        L2a:
            r0 = 1
            goto L22
        L2c:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4972DJl.notifyFallbackSamplingUsed(int):boolean");
    }

    @Override // X.DIF
    public final int randomlySample(int i) {
        Random random = this.A09;
        C7384Etj.A0Y(random, 1);
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        if (i == 1) {
            return 1;
        }
        if (random.nextInt(i) != 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    @Override // X.AbstractC4980DJx, X.DIF
    public final int resolvePivotMarker(int i, String str) {
        C7515Eyg c7515Eyg;
        Number numberA0j;
        C4971DJk c4971DJk = this.A05.get();
        return (c4971DJk == null || (c7515Eyg = c4971DJk.A05.A00.get(i)) == null || (numberA0j = BV6.A0j(str, c7515Eyg)) == null) ? i : numberA0j.intValue();
    }

    public C4972DJl(QplConfigInstance.AnonymousClass8 anonymousClass8, AwakeTimeSinceBootClock awakeTimeSinceBootClock, DKG dkg, DGY dgy, C0V c0v, InterfaceC4945DGj interfaceC4945DGj, Random random, F18 f18, F18 f182, F18 f183, F18 f184, F18 f185, F18 f186) {
        this.A03 = dgy;
        this.A06 = f18;
        this.A0A = f182;
        this.A0C = f183;
        this.A0B = f184;
        this.A07 = f185;
        this.A0D = f186;
        this.A00 = anonymousClass8;
        this.A04 = interfaceC4945DGj;
        this.A09 = random;
        this.A01 = awakeTimeSinceBootClock;
        this.A02 = dkg;
        this.A08 = c0v;
        dgy.execute(new Runnable() { // from class: X.DJn
            public static final String __redex_internal_original_name = "QPLConfigManager$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C4972DJl c4972DJl = this.A00;
                AwakeTimeSinceBootClock awakeTimeSinceBootClock2 = c4972DJl.A01;
                awakeTimeSinceBootClock2.nowNanos();
                try {
                    AtomicReference<C4971DJk> atomicReference = c4972DJl.A05;
                    C14 c14 = (C14) c4972DJl.A06.AMN();
                    Identity identity = c4972DJl.A00.get();
                    InterfaceC4945DGj interfaceC4945DGj2 = c4972DJl.A04;
                    DKG dkg2 = c4972DJl.A02;
                    if (identity != null) {
                        try {
                            C4971DJk c4971DJkA00 = C4971DJk.A00(dkg2, identity, c14, interfaceC4945DGj2, atomicReference);
                            if (c4971DJkA00 != null) {
                                Bs8.A00(null, c4971DJkA00, atomicReference);
                                c4971DJkA00.A04.A00.size();
                                DK2 dk2 = c4971DJkA00.A03.A00;
                                if (dk2 != null) {
                                    dk2.size();
                                }
                                C4972DJl.A00(c4972DJl);
                            }
                        } catch (IOException e) {
                            CFK.A0A("QPLConfig", "failed to load config", e);
                        }
                    }
                } catch (Exception unused) {
                    c4972DJl.A07.AMN();
                }
                awakeTimeSinceBootClock2.nowNanos();
            }
        });
    }

    @Override // X.DIF
    public final long getMetadataConfigForMarker(int i) {
        int iIndexOfKey;
        if (i == 36322981) {
            return -1L;
        }
        C4971DJk c4971DJk = this.A05.get();
        if (this.A0H == null) {
            this.A0H = this.A0C.AMN();
        }
        if (c4971DJk == null) {
            if (this.A0G == null) {
                this.A0G = this.A0A.AMN();
            }
            return this.A0G.A00(i);
        }
        DK2 dk2 = c4971DJk.A03.A00;
        if (dk2 == null || (iIndexOfKey = dk2.indexOfKey(i)) < 0) {
            return 0L;
        }
        return dk2.valueAt(iIndexOfKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[PHI: r0
  0x005e: PHI (r0v38 int) = (r0v37 int), (r0v39 int) binds: [B:21:0x0054, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.DIF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getSamplingSpecForMarker(int r8) {
        /*
            r7 = this;
            r0 = 27792138(0x1a8130a, float:6.1740773E-38)
            r3 = 3
            r2 = 1
            if (r8 != r0) goto Lc
            long r0 = X.DJP.A00(r2, r3, r2)
            return r0
        Lc:
            boolean r0 = r7.isMarkerBlocked(r8)
            r4 = 19
            if (r0 == 0) goto L1c
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = X.DJP.A00(r0, r4, r2)
            return r0
        L1c:
            java.util.concurrent.atomic.AtomicReference<X.DJk> r6 = r7.A05
            java.lang.Object r0 = r6.get()
            X.DJk r0 = (X.C4971DJk) r0
            r1 = -1
            if (r0 == 0) goto La0
            X.DJu r0 = r0.A04
            X.DK4 r0 = r0.A00
            int r5 = r0.get(r8, r1)
            if (r5 == r1) goto L60
            r4 = 6
            java.lang.Object r0 = r6.get()
            X.DJk r0 = (X.C4971DJk) r0
            if (r0 == 0) goto L59
            X.DJu r0 = r0.A04
            X.DJv<com.facebook.logginginfra.falco.QPLSamplingMethod> r0 = r0.A01
            java.lang.Object r1 = r0.get(r8)
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            if (r1 == 0) goto L59
            r0 = 0
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L59
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L5e
            r0 = 3
            if (r1 == r3) goto L5e
        L59:
            long r0 = X.DJP.A00(r5, r4, r2)
            return r0
        L5e:
            r2 = r0
            goto L59
        L60:
            X.C0V r3 = r7.A08
            if (r3 == 0) goto L93
            X.F0C<java.lang.Boolean> r1 = X.C0V.A01
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L93
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Short> r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L99
            short r1 = r0.shortValue()
            r0 = 2
            if (r1 < r0) goto L99
        L93:
            r0 = 0
            long r0 = X.DJP.A00(r0, r4, r2)
            return r0
        L99:
            r0 = 11
            long r0 = X.DJP.A00(r2, r0, r2)
            return r0
        La0:
            X.DGm r0 = r7.A0F
            if (r0 != 0) goto Lae
            X.F18<X.DGm> r0 = r7.A0B
            java.lang.Object r0 = r0.AMN()
            X.DGm r0 = (X.DGm) r0
            r7.A0F = r0
        Lae:
            X.DGm r0 = r7.A0F
            if (r0 == 0) goto Lb8
            r0 = 0
            long r0 = X.DJP.A00(r0, r3, r2)
            return r0
        Lb8:
            r0 = 5
            long r0 = X.DJP.A00(r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4972DJl.getSamplingSpecForMarker(int):long");
    }
}
