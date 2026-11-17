package com.meta.health.core;

import X.C3UX;
import X.C3cG;
import X.C8964Fuh;
import X.C8969FvH;
import X.C9258GBl;
import X.HoC;
import X.HxO;
import X.InterfaceC2261BLa;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ObserverBuffer {
    public HoC A00;
    public final ObserverAnchorManager A02;
    public final C3UX A06;
    public final HxO<C8969FvH> A07;
    public final long A01 = Math.min(0L, 5000L);
    public final InterfaceC2261BLa A09 = new C9258GBl();
    public final InterfaceC2261BLa A08 = new C9258GBl();
    public final List<C8964Fuh> A03 = C3cG.A0h();
    public final List<String> A04 = C3cG.A0h();
    public final Map<String, String> A05 = C3cG.A0j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.util.List<X.C8964Fuh> r8, java.util.List<java.lang.String> r9, java.util.Map<java.lang.String, java.lang.String> r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            r3 = 4
            boolean r0 = r11 instanceof X.C8908FtQ
            if (r0 == 0) goto L37
            r6 = r11
            X.FtQ r6 = (X.C8908FtQ) r6
            int r0 = r6.$t
            if (r0 != r3) goto L37
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r5 = r6.A05
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r6.A00
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 != r0) goto L3d
            java.lang.Object r3 = r6.A04
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r10 = r6.A03
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r9 = r6.A02
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r8 = r6.A01
            java.util.Collection r8 = (java.util.Collection) r8
            X.Hwg.A00(r5)
            goto L58
        L37:
            X.FtQ r6 = new X.FtQ
            r6.<init>(r7, r11, r3)
            goto L17
        L3d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L42:
            X.Hwg.A00(r5)
            X.BLa r3 = r7.A09
            r6.A01 = r8
            r6.A02 = r9
            r6.A03 = r10
            r6.A04 = r3
            r6.A00 = r0
            java.lang.Object r0 = r3.APs(r4, r6)
            if (r0 != r2) goto L58
            return r2
        L58:
            java.util.List<X.Fuh> r0 = r7.A03     // Catch: java.lang.Throwable -> L83
            r0.addAll(r8)     // Catch: java.lang.Throwable -> L83
            java.util.List<java.lang.String> r0 = r7.A04     // Catch: java.lang.Throwable -> L83
            r0.addAll(r9)     // Catch: java.lang.Throwable -> L83
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.A05     // Catch: java.lang.Throwable -> L83
            r0.putAll(r10)     // Catch: java.lang.Throwable -> L83
            X.HoC r0 = r7.A00     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L6e
            r0.A5w(r4)     // Catch: java.lang.Throwable -> L83
        L6e:
            X.3UX r2 = r7.A06     // Catch: java.lang.Throwable -> L83
            r1 = 15
            X.FtJ r0 = new X.FtJ     // Catch: java.lang.Throwable -> L83
            r0.<init>(r7, r4, r1)     // Catch: java.lang.Throwable -> L83
            X.Hqc r0 = X.AnonymousClass001.A11(r0, r2)     // Catch: java.lang.Throwable -> L83
            r7.A00 = r0     // Catch: java.lang.Throwable -> L83
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L83
            r3.Ahe(r4)
            return r2
        L83:
            r0 = move-exception
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.ObserverBuffer.A00(java.util.List, java.util.List, java.util.Map, X.HtJ):java.lang.Object");
    }

    public ObserverBuffer(ObserverAnchorManager observerAnchorManager, C3UX c3ux, HxO hxO) {
        this.A07 = hxO;
        this.A02 = observerAnchorManager;
        this.A06 = c3ux;
    }
}
