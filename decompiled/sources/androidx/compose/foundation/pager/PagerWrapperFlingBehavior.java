package androidx.compose.foundation.pager;

import X.BLD;
import X.InterfaceC05343Un;

/* loaded from: classes4.dex */
public final class PagerWrapperFlingBehavior implements BLD {
    public final PagerState A00;
    public final InterfaceC05343Un A01;

    /* JADX WARN: Incorrect types in method signature: (LX/3Q0;FLX/HtJ<-Ljava/lang/Float;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @Override // X.BLD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AXo(X.C3Q0 r7, X.HtJ r8, float r9) {
        /*
            r6 = this;
            r4 = 15
            boolean r0 = r8 instanceof X.C2310BTk
            if (r0 == 0) goto L8b
            r3 = r8
            X.BTk r3 = (X.C2310BTk) r3
            int r0 = r3.$t
            if (r0 != r4) goto L8b
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r1 = r3.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L77
            if (r0 != r4) goto L91
            X.Hwg.A00(r1)
        L26:
            float r9 = X.AnonymousClass001.A02(r1)
            androidx.compose.foundation.pager.PagerState r6 = r6.A00
            X.Abq r0 = r6.A0L
            X.00q r3 = r0.A04
            float r0 = r3.AFn()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L73
            float r0 = r3.AFn()
            float r0 = java.lang.Math.abs(r0)
            double r7 = (double) r0
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L73
            int r3 = r6.A07()
            X.Adj r0 = r6.A0E
            boolean r0 = r0.AOz()
            if (r0 == 0) goto L6a
            androidx.compose.runtime.MutableState<X.Abh> r0 = r6.A0A
            java.lang.Object r0 = r0.getValue()
            X.Abh r0 = (X.C1133Abh) r0
            X.3UX r2 = r0.A0I
            r1 = 0
            X.3bi r0 = new X.3bi
            r0.<init>(r6, r1, r4)
            X.AnonymousClass001.A1J(r0, r2)
        L6a:
            r0 = 0
            r6.A0A(r3, r5, r0)
        L6e:
            java.lang.Float r0 = X.C8j3.A0u(r9)
            return r0
        L73:
            r3.AFn()
            goto L6e
        L77:
            X.Hwg.A00(r1)
            X.3Un r1 = r6.A01
            r0 = 38
            X.BTA r0 = X.BTA.A01(r7, r6, r0)
            r3.A00 = r4
            java.lang.Object r1 = r1.AXp(r7, r3, r0, r9)
            if (r1 != r2) goto L26
            return r2
        L8b:
            X.BTk r3 = new X.BTk
            r3.<init>(r6, r8, r4)
            goto L18
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.AXo(X.3Q0, X.HtJ, float):java.lang.Object");
    }

    public PagerWrapperFlingBehavior(InterfaceC05343Un interfaceC05343Un, PagerState pagerState) {
        this.A01 = interfaceC05343Un;
        this.A00 = pagerState;
    }
}
