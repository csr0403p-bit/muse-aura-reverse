package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.C18j;
import X.C3UX;
import X.C6837Eap;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimation$1$1", f = "HatchSetupAnimationHost.kt", l = {260, 264}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimation$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C6837Eap $composition;
    public final /* synthetic */ boolean $isMotionEnabled;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ C18j $lottie;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSetupAnimationHostKt$HatchSetupAnimation$1$1(boolean z, boolean z2, C18j c18j, C6837Eap c6837Eap, HtJ<? super HatchSetupAnimationHostKt$HatchSetupAnimation$1$1> htJ) {
        super(2, htJ);
        this.$isMotionEnabled = z;
        this.$isPlaying = z2;
        this.$lottie = c18j;
        this.$composition = c6837Eap;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSetupAnimationHostKt$HatchSetupAnimation$1$1(this.$isMotionEnabled, this.$isPlaying, this.$lottie, this.$composition, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.Hji r1 = X.EnumC10460Hji.A02
            r0 = r17
            int r4 = r0.label
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 2
            r5 = 1
            if (r4 == 0) goto L16
            if (r4 == r5) goto L66
            if (r4 != r3) goto Lae
            X.Hwg.A00(r18)
        L13:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L16:
            X.Hwg.A00(r18)
            boolean r4 = r0.$isMotionEnabled
            if (r4 == 0) goto L13
            boolean r4 = r0.$isPlaying
            if (r4 == 0) goto L13
            X.18j r8 = r0.$lottie
            X.Eap r7 = r0.$composition
            r4 = 0
            X.B39 r10 = new X.B39
            r10.<init>(r4, r2)
            r0.label = r5
            r11 = 0
            X.B33 r8 = (X.B33) r8
            androidx.compose.runtime.MutableState r4 = r8.A04
            int r14 = androidx.compose.runtime.MutableState.A02(r4)
            androidx.compose.runtime.MutableState r4 = r8.A05
            int r15 = androidx.compose.runtime.MutableState.A02(r4)
            androidx.compose.runtime.MutableState r4 = r8.A09
            boolean r16 = androidx.compose.runtime.MutableState.A0A(r4)
            androidx.compose.runtime.MutableState r4 = r8.A0A
            float r12 = X.C8j3.A06(r4)
            float r13 = X.B36.A00(r7, r10, r12)
            r17 = 0
            X.AYl r9 = X.EnumC1100AYl.Immediately
            X.5WW r4 = r8.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 r6 = new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2
            r18 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.3UY r5 = X.C3UY.A02
            java.lang.Object r4 = r4.A01(r5, r0, r6)
            if (r4 == r1) goto L63
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L63:
            if (r4 != r1) goto L69
            return r1
        L66:
            X.Hwg.A00(r18)
        L69:
            r4 = 1065353216(0x3f800000, float:1.0)
            X.B39 r8 = new X.B39
            r8.<init>(r2, r4)
            X.18j r6 = r0.$lottie
            X.Eap r5 = r0.$composition
            r0.label = r3
            r9 = 0
            r2 = r6
            X.B33 r2 = (X.B33) r2
            androidx.compose.runtime.MutableState r2 = r2.A04
            int r12 = androidx.compose.runtime.MutableState.A02(r2)
            r13 = 2147483647(0x7fffffff, float:NaN)
            X.B33 r6 = (X.B33) r6
            androidx.compose.runtime.MutableState r2 = r6.A09
            boolean r14 = androidx.compose.runtime.MutableState.A0A(r2)
            androidx.compose.runtime.MutableState r2 = r6.A0A
            float r10 = X.C8j3.A06(r2)
            float r11 = X.B36.A00(r5, r8, r10)
            r15 = 0
            X.AYl r7 = X.EnumC1100AYl.Immediately
            X.5WW r3 = r6.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 r4 = new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2
            r16 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.3UY r2 = X.C3UY.A02
            java.lang.Object r0 = r3.A01(r2, r0, r4)
            if (r0 == r1) goto Lab
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        Lab:
            if (r0 != r1) goto L13
            return r1
        Lae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSetupAnimationHostKt$HatchSetupAnimation$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
