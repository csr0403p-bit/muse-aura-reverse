package com.meta.health.core;

import X.AnonymousClass005;
import X.C3UX;
import X.HoC;
import X.InterfaceC8971FvL;
import java.util.List;

/* loaded from: classes6.dex */
public final class MetaHealthQueryObservationSession {
    public final List<HoC> A00;
    public final List<InterfaceC8971FvL> A01;
    public final C3UX A02;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            r3 = 3
            boolean r0 = r8 instanceof X.C8908FtQ
            if (r0 == 0) goto L86
            r4 = r8
            X.FtQ r4 = (X.C8908FtQ) r4
            int r0 = r4.$t
            if (r0 != r3) goto L86
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A05
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L52
            if (r0 == r6) goto L4a
            if (r0 != r3) goto L8f
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.Hwg.A00(r1)
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r1 = r2.next()
            X.FvL r1 = (X.InterfaceC8971FvL) r1
            r0 = 0
            r4.A01 = r0
            r4.A02 = r2
            r4.A03 = r0
            r4.A04 = r0
            r4.A00 = r3
            java.lang.Object r0 = r1.AgQ(r4)
            if (r0 != r5) goto L2c
            return r5
        L4a:
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.Hwg.A00(r1)
            goto L61
        L52:
            X.Hwg.A00(r1)
            X.3UX r1 = r7.A02
            r0 = 0
            X.Hxb.A03(r0, r1)
            java.util.List<X.HoC> r0 = r7.A00
            java.util.Iterator r2 = r0.iterator()
        L61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r2.next()
            X.HoC r1 = (X.HoC) r1
            r0 = 0
            r4.A01 = r0
            r4.A02 = r2
            r4.A03 = r0
            r4.A04 = r0
            r4.A00 = r6
            java.lang.Object r0 = X.HzS.A00(r4, r1)
            if (r0 != r5) goto L61
            return r5
        L7f:
            java.util.List<X.FvL> r0 = r7.A01
            java.util.Iterator r2 = r0.iterator()
            goto L2c
        L86:
            X.FtQ r4 = new X.FtQ
            r4.<init>(r7, r8, r3)
            goto L17
        L8c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.core.MetaHealthQueryObservationSession.A00(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetaHealthQueryObservationSession(List<? extends InterfaceC8971FvL> list, List<? extends HoC> list2, C3UX c3ux) {
        AnonymousClass005.A0x(list, list2, c3ux);
        this.A01 = list;
        this.A00 = list2;
        this.A02 = c3ux;
    }
}
