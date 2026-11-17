package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class DEM extends DEL {
    public long A01;
    public final InterfaceC5923DsA A02;
    public final VpsEventCallback A03;
    public final InterfaceC2361BVo A04;
    public final DEN A05;
    public final DEN A06;
    public final BVD A07;
    public final boolean A09;
    public final boolean A0A;
    public final C5622Dm5 A0B;
    public final DEO A0C;
    public long A00 = 0;
    public final AtomicInteger A08 = new AtomicInteger();

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // X.DEL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.lang.String r16, java.lang.String r17, int r18) {
        /*
            r15 = this;
            r2 = r15
            r3 = r17
            if (r17 == 0) goto Le
            java.lang.String r0 = r15.A01
            boolean r1 = r3.equals(r0)
            r0 = 1
            if (r1 == 0) goto Lf
        Le:
            r0 = 0
        Lf:
            r5 = r16
            r1 = r18
            super.A05(r5, r3, r1)
            if (r0 == 0) goto L70
            long r14 = java.lang.System.currentTimeMillis()
            java.util.HashMap r12 = X.BV4.A0u()
            java.lang.String r7 = ""
            java.lang.String r11 = "STREAM_INFO"
            java.lang.String r0 = X.DEG.A0A
            double r0 = java.lang.Math.random()
            r3 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            double r0 = r0 * r3
            long r3 = (long) r0
            r0 = 0
            r9 = 0
            X.DED r6 = new X.DED
            r6.<init>(r3, r0)
            r18 = 0
            X.DED[] r13 = new X.DED[]{r6}
            X.DEG r6 = new X.DEG
            r8 = r5
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L70
            r12 = 0
        L48:
            X.DED[] r0 = r6.A07
            int r0 = r0.length
            if (r12 >= r0) goto L70
            com.facebook.exoplayer.monitor.VpsEventCallback r3 = r2.A03
            long r14 = r2.A00
            r0 = 1
            long r0 = r0 + r14
            r2.A00 = r0
            java.lang.String r10 = r2.A01
            int r13 = r2.A00
            X.DER r7 = X.DER.A04
            X.CLe r0 = X.DEG.A09
            java.lang.String r8 = r0.A02
            long r0 = r6.A00
            X.DEQ r5 = new X.DEQ
            r11 = r9
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            r3.A5s(r5)
            int r12 = r12 + 1
            goto L48
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEM.A05(java.lang.String, java.lang.String, int):void");
    }

    @Override // X.DDj
    public final void ATL(DEK dek, long j, long j2, long j3) {
    }

    public static int A00(DEN den) {
        DmR dmR;
        if (den == null || (dmR = den.A01.A2f) == null || !C4904DDx.A00(dmR)) {
            return Integer.MIN_VALUE;
        }
        int iOrdinal = den.A02.A0K.ordinal();
        if (iOrdinal == 4) {
            return 0;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 1 ? -1 : 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap A01(DEM dem, int i) {
        int iA1N;
        DEN den = dem.A05;
        if (den == null || i == Integer.MIN_VALUE) {
            return null;
        }
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("latency_level", Integer.toString(i));
        Dlw dlw = den.A01;
        C5617Dly c5617Dly = dlw.A2i;
        if (c5617Dly != null) {
            C5437DiY c5437DiY = c5617Dly.A0W;
            iA1N = c5437DiY.A0O ? 2 : AnonymousClass002.A1N(c5437DiY.A0A.get());
        } else {
            iA1N = -1;
        }
        mapA0u.put("catch_up_strategy", Integer.toString(iA1N));
        mapA0u.put("playback_speed", Float.toString(den.A03.A0y));
        String string = Long.toString(dlw.A20);
        if (!string.isEmpty()) {
            mapA0u.put("session_id", string);
        }
        String str = dlw.A2n;
        if (!str.isEmpty()) {
            mapA0u.put("surface", str);
        }
        mapA0u.put("skip_count", Integer.toString(den.A00.A0A.get()));
        return mapA0u;
    }

    public static Map A02(DEG deg, DEM dem, Map map, Map map2) {
        if (!deg.A04.startsWith("moq://")) {
            return map;
        }
        HashMap mapA0w = map != null ? BV4.A0w(map) : BV4.A0u();
        if (map2 != null) {
            mapA0w.putAll(map2);
            DEO deo = dem.A0C;
            if (deo != null) {
                mapA0w.put("snapl_playback_session_id", Long.toString(deo.A00.A20));
            }
        }
        mapA0w.put("protocol", HeroExoPlayer2EventListener.MOQ_URI_SCHEME);
        return mapA0w;
    }

    public static void A03(DEG deg, DEM dem, long[] jArr, int i, int i2, long j, boolean z) {
        C5841DqX c5841DqX;
        String str = ((DEL) dem).A01;
        if (str != null) {
            boolean z2 = dem.A09;
            int i3 = ((DEL) dem).A00;
            if (z2) {
                c5841DqX = new C5841DqX(str, deg.A04.startsWith("moq://") ? HeroExoPlayer2EventListener.MOQ_URI_SCHEME : null, jArr, i, i3, i2, z ? 1 : 0, j);
            } else {
                c5841DqX = new C5841DqX(str, null, jArr, i, i3, Integer.MIN_VALUE, -1, j);
            }
            dem.A0B.ATs(c5841DqX);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C2358BVi r33) {
        /*
            r32 = this;
            r6 = r32
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L85
            long r23 = java.lang.System.currentTimeMillis()
            boolean r0 = r6.A0A
            r9 = r33
            if (r0 == 0) goto L1b
            int r2 = r9.A01
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A08
            int r0 = r0.get()
            r1 = 1
            if (r2 < r0) goto L1c
        L1b:
            r1 = 0
        L1c:
            boolean r0 = r9.A04
            if (r0 != 0) goto L24
            r25 = 0
            if (r1 == 0) goto L26
        L24:
            r25 = 1
        L26:
            X.DEN r1 = r6.A05
            int r8 = A00(r1)
            r30 = r8
            boolean r0 = r6.A09
            if (r0 != 0) goto L86
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
        L34:
            com.facebook.exoplayer.monitor.VpsEventCallback r5 = r6.A03
            X.DEG r13 = r9.A02
            int r4 = r9.A00
            long r0 = r6.A00
            r11 = 1
            r10 = 0
            long r2 = r0 + r11
            r6.A00 = r2
            java.lang.String r7 = r6.A01
            int r3 = r6.A00
            java.util.HashMap r8 = A01(r6, r8)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.A03
            java.util.Map r18 = A02(r13, r6, r8, r2)
            X.DER r14 = X.DER.A08
            X.CLe r2 = X.DEG.A09
            java.lang.String r15 = r2.A00
            java.lang.String r2 = r2.A02
            X.DEP r12 = new X.DEP
            r20 = r3
            r21 = r0
            r19 = r4
            r17 = r7
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25)
            r5.A5s(r12)
            X.DED[] r0 = r13.A07
            r0 = r0[r4]
            long r0 = r0.A01
            r3 = 1
            long[] r2 = new long[r3]
            r2[r10] = r0
            r26 = r13
            r27 = r6
            r28 = r2
            r29 = r3
            r31 = r23
            r33 = r25
            A03(r26, r27, r28, r29, r30, r31, r33)
        L85:
            return
        L86:
            X.DEN r0 = r6.A06
            if (r0 == r1) goto L34
            int r30 = A00(r0)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEM.A06(X.BVi):void");
    }

    public DEM(InterfaceC5923DsA interfaceC5923DsA, VpsEventCallback vpsEventCallback, InterfaceC2361BVo interfaceC2361BVo, C5622Dm5 c5622Dm5, DEO deo, DEN den, DEN den2, BVD bvd, boolean z, boolean z2) {
        this.A07 = bvd;
        this.A0C = deo;
        this.A03 = vpsEventCallback;
        this.A04 = interfaceC2361BVo;
        this.A02 = interfaceC5923DsA;
        this.A0B = c5622Dm5;
        this.A0A = z;
        this.A05 = den;
        this.A09 = z2;
        this.A06 = den2;
    }

    @Override // X.DDj
    public final void AWl(C1O c1o, DEK dek) {
        this.A01 = System.currentTimeMillis();
    }

    @Override // X.DDj
    public final void ATM(long j, long j2) {
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }
}
