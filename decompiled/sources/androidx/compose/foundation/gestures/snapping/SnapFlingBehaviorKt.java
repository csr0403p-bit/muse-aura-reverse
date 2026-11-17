package androidx.compose.foundation.gestures.snapping;

/* loaded from: classes4.dex */
public abstract class SnapFlingBehaviorKt {
    /* JADX WARN: Incorrect types in method signature: (LX/3Q0;FLX/AT7<Ljava/lang/Float;LX/AOW;>;LX/1YC<Ljava/lang/Float;>;LX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-LX/ATf<Ljava/lang/Float;LX/AOW;>;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.AT7 r10, X.C1YC r11, X.C3Q0 r12, X.HtJ r13, X.G0U r14, float r15) {
        /*
            r8 = r15
            boolean r0 = r13 instanceof X.AcC
            if (r0 == 0) goto L63
            r3 = r13
            X.AcC r3 = (X.AcC) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r3.label = r2
        L13:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r9 = 1
            if (r0 == 0) goto L38
            if (r0 != r9) goto L69
            float r8 = r3.F$0
            java.lang.Object r6 = r3.L$1
            X.ASv r6 = (X.C1051ASv) r6
            java.lang.Object r10 = r3.L$0
            X.AT7 r10 = (X.AT7) r10
            X.Hwg.A00(r1)
        L2b:
            float r0 = r6.element
            float r8 = r8 - r0
            java.lang.Float r1 = X.C8j3.A0u(r8)
            X.ATf r0 = new X.ATf
            r0.<init>(r10, r1)
            return r0
        L38:
            X.Hwg.A00(r1)
            X.ASv r6 = new X.ASv
            r6.<init>()
            float r1 = X.AT7.A00(r10)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r0 = r0 ^ 1
            X.BTO r4 = new X.BTO
            r5 = r12
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r3.L$0 = r10
            r3.L$1 = r6
            r3.F$0 = r15
            r3.label = r9
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A04(r10, r11, r3, r4, r0)
            if (r0 != r2) goto L2b
            return r2
        L63:
            X.AcC r3 = new X.AcC
            r3.<init>(r13)
            goto L13
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A01(X.AT7, X.1YC, X.3Q0, X.HtJ, X.G0U, float):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3Q0;FFLX/AT7<Ljava/lang/Float;LX/AOW;>;LX/AOc<Ljava/lang/Float;>;LX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/HtJ<-LX/ATf<Ljava/lang/Float;LX/AOW;>;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AOc r15, X.AT7 r16, X.C3Q0 r17, X.HtJ r18, X.G0U r19, float r20, float r21) {
        /*
            r4 = r18
            r3 = r20
            r12 = r16
            boolean r0 = r4 instanceof X.AcB
            if (r0 == 0) goto L9a
            r14 = r4
            X.AcB r14 = (X.AcB) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r14.label = r2
        L18:
            java.lang.Object r1 = r14.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r5 = 1
            if (r0 == 0) goto L5e
            if (r0 != r5) goto La1
            float r2 = r14.F$1
            float r3 = r14.F$0
            java.lang.Object r8 = r14.L$1
            X.ASv r8 = (X.C1051ASv) r8
            java.lang.Object r12 = r14.L$0
            X.AT7 r12 = (X.AT7) r12
            X.Hwg.A00(r1)
        L32:
            float r5 = X.AT7.A00(r12)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L4f
            r5 = 0
        L3c:
            float r0 = r8.element
            float r3 = r3 - r0
            java.lang.Float r1 = X.C8j3.A0u(r3)
            r0 = 29
            X.AT7 r0 = X.ATB.A01(r12, r4, r5, r0)
            X.ATf r4 = new X.ATf
            r4.<init>(r0, r1)
            return r4
        L4f:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L59
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L57:
            r5 = r2
            goto L3c
        L59:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3c
            goto L57
        L5e:
            X.Hwg.A00(r1)
            X.ASv r8 = new X.ASv
            r8.<init>()
            float r2 = X.AT7.A00(r12)
            java.lang.Float r13 = X.C8j3.A0u(r3)
            float r1 = X.AT7.A00(r12)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r16 = r0 ^ 1
            r11 = 2
            X.BTO r6 = new X.BTO
            r7 = r17
            r9 = r19
            r10 = r21
            r6.<init>(r7, r8, r9, r10, r11)
            r14.L$0 = r12
            r14.L$1 = r8
            r14.F$0 = r3
            r14.F$1 = r2
            r14.label = r5
            r11 = r15
            r15 = r6
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A02(r11, r12, r13, r14, r15, r16)
            if (r0 != r4) goto L32
            return r4
        L9a:
            X.AcB r14 = new X.AcB
            r14.<init>(r4)
            goto L18
        La1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A00(X.AOc, X.AT7, X.3Q0, X.HtJ, X.G0U, float, float):java.lang.Object");
    }
}
