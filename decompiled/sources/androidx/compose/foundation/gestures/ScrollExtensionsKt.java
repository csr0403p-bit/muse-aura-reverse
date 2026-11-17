package androidx.compose.foundation.gestures;

import X.BCL;
import X.C3UY;
import X.C3cG;
import X.HtJ;
import X.InterfaceC1180Adj;

/* loaded from: classes4.dex */
public abstract class ScrollExtensionsKt {
    /* JADX WARN: Incorrect types in method signature: (LX/Adj;FLX/AOc<Ljava/lang/Float;>;LX/HtJ<-Ljava/lang/Float;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AOc r6, X.InterfaceC1180Adj r7, X.HtJ r8, float r9) {
        /*
            r3 = 7
            boolean r0 = r8 instanceof X.C2310BTk
            if (r0 == 0) goto L4b
            r5 = r8
            X.BTk r5 = (X.C2310BTk) r5
            int r0 = r5.$t
            if (r0 != r3) goto L4b
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L51
            java.lang.Object r2 = r5.A01
            X.ASv r2 = (X.C1051ASv) r2
            X.Hwg.A00(r1)
        L29:
            float r0 = r2.element
            java.lang.Float r4 = X.C8j3.A0u(r0)
            return r4
        L30:
            X.Hwg.A00(r1)
            X.ASv r2 = new X.ASv
            r2.<init>()
            r0 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r1 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1.<init>(r6, r0, r2, r9)
            r5.A01 = r2
            r5.A00 = r3
            X.3UY r0 = X.C3UY.A02
            java.lang.Object r0 = r7.AcF(r0, r5, r1)
            if (r0 != r4) goto L29
            return r4
        L4b:
            X.BTk r5 = new X.BTk
            r5.<init>(r3, r8)
            goto L17
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.A00(X.AOc, X.Adj, X.HtJ, float):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Adj;LX/3UY;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A01(C3UY c3uy, InterfaceC1180Adj interfaceC1180Adj, HtJ htJ) {
        return C3cG.A0U(interfaceC1180Adj.AcF(c3uy, htJ, new BCL(0, null)));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Adj;FLX/HtJ<-Ljava/lang/Float;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.InterfaceC1180Adj r6, X.HtJ r7, float r8) {
        /*
            r3 = 8
            boolean r0 = r7 instanceof X.C2310BTk
            if (r0 == 0) goto L4c
            r5 = r7
            X.BTk r5 = (X.C2310BTk) r5
            int r0 = r5.$t
            if (r0 != r3) goto L4c
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r1 = r5.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L52
            java.lang.Object r2 = r5.A01
            X.ASv r2 = (X.C1051ASv) r2
            X.Hwg.A00(r1)
        L2a:
            float r0 = r2.element
            java.lang.Float r4 = X.C8j3.A0u(r0)
            return r4
        L31:
            X.Hwg.A00(r1)
            X.ASv r2 = new X.ASv
            r2.<init>()
            r0 = 0
            X.BU8 r1 = new X.BU8
            r1.<init>(r0, r2, r8)
            r5.A01 = r2
            r5.A00 = r3
            X.3UY r0 = X.C3UY.A02
            java.lang.Object r0 = r6.AcF(r0, r5, r1)
            if (r0 != r4) goto L2a
            return r4
        L4c:
            X.BTk r5 = new X.BTk
            r5.<init>(r3, r7)
            goto L18
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.A02(X.Adj, X.HtJ, float):java.lang.Object");
    }
}
