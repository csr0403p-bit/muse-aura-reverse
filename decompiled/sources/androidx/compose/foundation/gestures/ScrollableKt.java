package androidx.compose.foundation.gestures;

import X.ASV;
import X.ATK;
import X.AXN;
import X.BKi;
import X.C1253Afn;
import X.C1312Agx;
import X.C2278BSe;
import X.C3Q0;
import X.G0U;

/* loaded from: classes4.dex */
public abstract class ScrollableKt {
    public static final G0U<C1312Agx, Boolean> A03 = C2278BSe.A00(34);
    public static final C3Q0 A00 = new C1253Afn();
    public static final ATK A01 = new BKi();
    public static final AXN A02 = new ASV();

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/ScrollingLogic;JLX/HtJ<-LX/AWx;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.foundation.gestures.ScrollingLogic r9, X.HtJ r10, long r11) {
        /*
            r5 = r9
            r4 = 8
            boolean r0 = r10 instanceof X.C2312BTm
            if (r0 == 0) goto L58
            r3 = r10
            X.BTm r3 = (X.C2312BTm) r3
            int r0 = r3.$t
            if (r0 != r4) goto L58
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r3.A00 = r2
        L19:
            java.lang.Object r2 = r3.A03
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r8 = 1
            if (r0 == 0) goto L3a
            if (r0 != r8) goto L5e
            java.lang.Object r6 = r3.A02
            X.ASv r6 = (X.C1051ASv) r6
            java.lang.Object r5 = r3.A01
            androidx.compose.foundation.gestures.ScrollingLogic r5 = (androidx.compose.foundation.gestures.ScrollingLogic) r5
            X.Hwg.A00(r2)
        L2f:
            float r0 = r6.element
            long r0 = r5.A04(r0)
            X.AWx r1 = X.AWx.A0B(r0)
            return r1
        L3a:
            X.Hwg.A00(r2)
            X.ASv r6 = new X.ASv
            r6.<init>()
            X.3UY r0 = X.C3UY.A02
            r7 = 0
            X.BUD r4 = new X.BUD
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A01 = r5
            r3.A02 = r6
            r3.A00 = r8
            java.lang.Object r0 = r5.A07(r0, r3, r4)
            if (r0 != r1) goto L2f
            return r1
        L58:
            X.BTm r3 = new X.BTm
            r3.<init>(r4, r10)
            goto L19
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.A00(androidx.compose.foundation.gestures.ScrollingLogic, X.HtJ, long):java.lang.Object");
    }
}
