package androidx.compose.ui.scrollcapture;

import X.G0V;
import X.HtJ;

/* loaded from: classes4.dex */
public final class RelativeScroller {
    public float A00;
    public final int A01;
    public final G0V<Float, HtJ<? super Float>, Object> A02;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.ui.scrollcapture.RelativeScroller r5, X.HtJ r6, float r7) {
        /*
            r3 = 26
            boolean r0 = r6 instanceof X.C2310BTk
            if (r0 == 0) goto L44
            r4 = r6
            X.BTk r4 = (X.C2310BTk) r4
            int r0 = r4.$t
            if (r0 != r3) goto L44
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r1 = r4.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L4a
            X.Hwg.A00(r1)
        L26:
            float r1 = X.AnonymousClass001.A02(r1)
            float r0 = r5.A00
            float r0 = r0 + r1
            r5.A00 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L32:
            X.Hwg.A00(r1)
            X.G0V<java.lang.Float, X.HtJ<? super java.lang.Float>, java.lang.Object> r1 = r5.A02
            java.lang.Float r0 = X.C8j3.A0u(r7)
            r4.A00 = r2
            java.lang.Object r1 = r1.invoke(r0, r4)
            if (r1 != r3) goto L26
            return r3
        L44:
            X.BTk r4 = new X.BTk
            r4.<init>(r5, r6, r3)
            goto L18
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.A00(androidx.compose.ui.scrollcapture.RelativeScroller, X.HtJ, float):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i, G0V<? super Float, ? super HtJ<? super Float>, ? extends Object> g0v) {
        this.A01 = i;
        this.A02 = g0v;
    }
}
