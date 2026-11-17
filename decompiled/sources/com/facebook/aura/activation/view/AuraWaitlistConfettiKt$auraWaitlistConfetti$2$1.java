package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.BLU;
import X.C16Z;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraWaitlistConfettiKt$auraWaitlistConfetti$2$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AuraWaitlistCelebrationState $celebrationState;
    public final /* synthetic */ Function0<BLU> $ctaBoundsInRoot;
    public final /* synthetic */ MutableState<BLU> $surfaceBoundsInRoot$delegate;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(X.C16Z r6) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r0 = r5.$celebrationState
            X.AT5<java.lang.Float, X.AOW> r0 = r0.confettiElapsedMs
            float r4 = androidx.compose.runtime.MutableState.A00(r0)
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r0 = r5.$celebrationState
            com.facebook.aura.activation.view.AuraConfettiDensity r0 = r0.density
            com.facebook.aura.activation.view.ConfettiBurst r3 = com.facebook.aura.activation.view.AuraWaitlistConfettiKt.getBurst(r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            int r0 = r3.durationMs
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L22
        L21:
            r2 = 0
        L22:
            androidx.compose.runtime.MutableState<X.BLU> r0 = r5.$surfaceBoundsInRoot$delegate
            java.lang.Object r1 = r0.getValue()
            X.BLU r1 = (X.BLU) r1
            kotlin.jvm.functions.Function0<X.BLU> r0 = r5.$ctaBoundsInRoot
            java.lang.Object r0 = r0.invoke()
            X.BLU r0 = (X.BLU) r0
            X.AaC r1 = com.facebook.aura.activation.view.AuraWaitlistConfettiKt.localSuccessFrame(r1, r0)
            if (r2 == 0) goto L3d
            com.facebook.aura.activation.view.ConfettiDepth r0 = com.facebook.aura.activation.view.ConfettiDepth.BACKGROUND
            com.facebook.aura.activation.view.AuraWaitlistConfettiKt.drawConfettiLayer(r6, r3, r0, r4, r1)
        L3d:
            r6.A9O()
            if (r2 == 0) goto L47
            com.facebook.aura.activation.view.ConfettiDepth r0 = com.facebook.aura.activation.view.ConfettiDepth.FOREGROUND
            com.facebook.aura.activation.view.AuraWaitlistConfettiKt.drawConfettiLayer(r6, r3, r0, r4, r1)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraWaitlistConfettiKt$auraWaitlistConfetti$2$1.invoke2(X.16Z):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistConfettiKt$auraWaitlistConfetti$2$1(AuraWaitlistCelebrationState auraWaitlistCelebrationState, Function0<BLU> function0, MutableState<BLU> mutableState) {
        super(1);
        this.$celebrationState = auraWaitlistCelebrationState;
        this.$ctaBoundsInRoot = function0;
        this.$surfaceBoundsInRoot$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
