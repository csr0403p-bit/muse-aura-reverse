package androidx.compose.foundation.gestures;

import X.AOW;
import X.AOc;
import X.AVd;
import X.InterfaceC0999AOh;

/* loaded from: classes4.dex */
public final class UpdatableAnimationState {
    public static final AOW A05 = AOW.A00(0.0f);
    public float A00;
    public long A01 = Long.MIN_VALUE;
    public AOW A02 = A05;
    public boolean A03;
    public final InterfaceC0999AOh<AOW> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x00c4, PHI: r8 r12 r13
  0x0068: PHI (r8v4 float) = (r8v2 float), (r8v5 float) binds: [B:25:0x0062, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r12v2 kotlin.jvm.functions.Function0) = (r12v0 kotlin.jvm.functions.Function0), (r12v3 kotlin.jvm.functions.Function0) binds: [B:25:0x0062, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r13v2 java.lang.Object) = (r13v7 java.lang.Object), (r13v8 java.lang.Object) binds: [B:25:0x0062, B:34:0x0091] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:42:0x00b3, B:43:0x00b6, B:32:0x0089, B:33:0x008c, B:27:0x0068, B:29:0x0075, B:37:0x0095, B:39:0x009f), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:42:0x00b3, B:43:0x00b6, B:32:0x0089, B:33:0x008c, B:27:0x0068, B:29:0x0075, B:37:0x0095, B:39:0x009f), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:42:0x00b3, B:43:0x00b6, B:32:0x0089, B:33:0x008c, B:27:0x0068, B:29:0x0075, B:37:0x0095, B:39:0x009f), top: B:49:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0086 -> B:33:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(kotlin.jvm.functions.Function0 r12, X.G0U r13, X.HtJ r14) {
        /*
            r11 = this;
            r1 = 1
            boolean r0 = r14 instanceof X.C2315BTp
            if (r0 == 0) goto L2e
            r6 = r14
            X.BTp r6 = (X.C2315BTp) r6
            int r0 = r6.$t
            if (r0 != r1) goto L2e
            int r3 = r6.A01
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L2e
            int r3 = r3 - r2
            r6.A01 = r3
        L17:
            java.lang.Object r9 = r6.A04
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A01
            r10 = 0
            r4 = 0
            r2 = -9223372036854775808
            r7 = 2
            if (r0 == 0) goto L42
            if (r0 == r1) goto L39
            if (r0 != r7) goto L34
            java.lang.Object r12 = r6.A02
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            goto Lb3
        L2e:
            X.BTp r6 = new X.BTp
            r6.<init>(r11, r14, r1)
            goto L17
        L34:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L39:
            float r8 = r6.A00
            java.lang.Object r12 = r6.A03
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            java.lang.Object r13 = r6.A02
            goto L89
        L42:
            X.Hwg.A00(r9)
            boolean r0 = r11.A03
            if (r0 == 0) goto L50
            java.lang.String r0 = "animateToZero called while previous animation is running"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L50:
            X.78T r8 = r6.getContext()
            X.ATL r0 = X.ATK.A00
            X.78X r0 = r8.get(r0)
            X.ATK r0 = (X.ATK) r0
            if (r0 == 0) goto L65
            float r8 = r0.AJx()
        L62:
            r11.A03 = r1
            goto L68
        L65:
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L62
        L68:
            float r0 = r11.A00     // Catch: java.lang.Throwable -> Lc4
            float r9 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> Lc4
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L95
            X.BTE r0 = new X.BTE     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r13, r11, r8, r4)     // Catch: java.lang.Throwable -> Lc4
            r6.A02 = r13     // Catch: java.lang.Throwable -> Lc4
            r6.A03 = r12     // Catch: java.lang.Throwable -> Lc4
            r6.A00 = r8     // Catch: java.lang.Throwable -> Lc4
            r6.A01 = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r0 = X.AvW.A01(r0, r6)     // Catch: java.lang.Throwable -> Lc4
            if (r0 != r5) goto L8c
            goto L94
        L89:
            X.Hwg.A00(r9)     // Catch: java.lang.Throwable -> Lc4
        L8c:
            r12.invoke()     // Catch: java.lang.Throwable -> Lc4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L68
            goto L95
        L94:
            return r5
        L95:
            float r0 = r11.A00     // Catch: java.lang.Throwable -> Lc4
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> Lc4
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto Lb9
            r0 = 20
            X.BTA r1 = X.BTA.A01(r13, r11, r0)     // Catch: java.lang.Throwable -> Lc4
            r6.A02 = r12     // Catch: java.lang.Throwable -> Lc4
            r0 = 0
            r6.A03 = r0     // Catch: java.lang.Throwable -> Lc4
            r6.A01 = r7     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r0 = X.AvW.A01(r1, r6)     // Catch: java.lang.Throwable -> Lc4
            if (r0 != r5) goto Lb6
            return r5
        Lb3:
            X.Hwg.A00(r9)     // Catch: java.lang.Throwable -> Lc4
        Lb6:
            r12.invoke()     // Catch: java.lang.Throwable -> Lc4
        Lb9:
            r11.A01 = r2
            X.AOW r0 = androidx.compose.foundation.gestures.UpdatableAnimationState.A05
            r11.A02 = r0
            r11.A03 = r4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lc4:
            r1 = move-exception
            r11.A01 = r2
            X.AOW r0 = androidx.compose.foundation.gestures.UpdatableAnimationState.A05
            r11.A02 = r0
            r11.A03 = r4
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.A00(kotlin.jvm.functions.Function0, X.G0U, X.HtJ):java.lang.Object");
    }

    public UpdatableAnimationState(AOc<Float> aOc) {
        this.A04 = aOc.vectorize(AVd.A02);
    }
}
