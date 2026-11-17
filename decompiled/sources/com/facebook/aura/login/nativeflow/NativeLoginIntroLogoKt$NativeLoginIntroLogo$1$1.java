package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.B3D;
import X.C18j;
import X.C1BO;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1", f = "NativeLoginIntroLogo.kt", l = {58, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $animatorDurationScale;
    public final /* synthetic */ B3D $compositionResult;
    public final /* synthetic */ C1BO<Function0<NativeLoginInitialDestination>> $currentDestination$delegate;
    public final /* synthetic */ C1BO<G0U<NativeLoginInitialDestination, Unit>> $currentOnFinished$delegate;
    public final /* synthetic */ C18j $lottie;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1(float f, C18j c18j, B3D b3d, C1BO<? extends G0U<? super NativeLoginInitialDestination, Unit>> c1bo, C1BO<? extends Function0<? extends NativeLoginInitialDestination>> c1bo2, HtJ<? super NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1> htJ) {
        super(2, htJ);
        this.$animatorDurationScale = f;
        this.$lottie = c18j;
        this.$compositionResult = b3d;
        this.$currentOnFinished$delegate = c1bo;
        this.$currentDestination$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1(this.$animatorDurationScale, this.$lottie, this.$compositionResult, this.$currentOnFinished$delegate, this.$currentDestination$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r17
            X.Hji r1 = X.EnumC10460Hji.A02
            r2 = r16
            int r0 = r2.label
            r5 = 2
            r14 = 1
            if (r0 == 0) goto L2d
            if (r0 == r14) goto L4a
            if (r0 != r5) goto L95
            X.Hwg.A00(r6)
        L13:
            X.1BO<X.G0U<com.facebook.aura.login.nativeflow.NativeLoginInitialDestination, kotlin.Unit>> r0 = r2.$currentOnFinished$delegate
            X.G0U r1 = X.C1BO.A0B(r0)
            X.1BO<kotlin.jvm.functions.Function0<com.facebook.aura.login.nativeflow.NativeLoginInitialDestination>> r0 = r2.$currentDestination$delegate
            kotlin.jvm.functions.Function0 r0 = X.C1BO.A0A(r0)
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L27
            com.facebook.aura.login.nativeflow.NativeLoginInitialDestination r0 = com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt.DESTINATION_FALLBACK
        L27:
            r1.invoke(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L2d:
            X.Hwg.A00(r6)
            float r3 = r2.$animatorDurationScale
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L13
            X.B3D r4 = r2.$compositionResult
            r3 = 0
            com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1
            r0.<init>(r4, r3)
            r2.label = r14
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = X.GAX.A01(r2, r0, r3)
            if (r6 != r1) goto L4d
            return r1
        L4a:
            X.Hwg.A00(r6)
        L4d:
            X.Eap r6 = (X.C6837Eap) r6
            if (r6 == 0) goto L13
            X.18j r7 = r2.$lottie
            r10 = 0
            r2.L$0 = r10
            r2.label = r5
            r0 = r7
            X.B33 r0 = (X.B33) r0
            androidx.compose.runtime.MutableState r0 = r0.A04
            int r13 = androidx.compose.runtime.MutableState.A02(r0)
            X.B33 r7 = (X.B33) r7
            androidx.compose.runtime.MutableState r0 = r7.A09
            boolean r15 = androidx.compose.runtime.MutableState.A0A(r0)
            r11 = 1061158912(0x3f400000, float:0.75)
            androidx.compose.runtime.MutableState r0 = r7.A01
            java.lang.Object r9 = r0.getValue()
            X.B3E r9 = (X.B3E) r9
            r12 = 0
            if (r9 == 0) goto L7b
            r0 = r9
            X.B39 r0 = (X.B39) r0
            float r12 = r0.A01
        L7b:
            r16 = 0
            X.AYl r8 = X.EnumC1100AYl.Immediately
            X.5WW r3 = r7.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 r5 = new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2
            r17 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.3UY r0 = X.C3UY.A02
            java.lang.Object r0 = r3.A01(r0, r2, r5)
            if (r0 == r1) goto L92
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L92:
            if (r0 != r1) goto L13
            return r1
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
