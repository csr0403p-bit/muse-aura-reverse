package com.facebook.aura.assist;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.assist.HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1", f = "HatchAssistLaunchGlow.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $alpha;
    public final /* synthetic */ MutableState<Boolean> $finished$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1(AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1> htJ) {
        super(2, htJ);
        this.$alpha = at5;
        this.$finished$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1(this.$alpha, this.$finished$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r7 = 0
            r5 = 3
            r4 = 1
            r8 = 2
            if (r0 == 0) goto L1b
            if (r0 == r4) goto L35
            if (r0 == r8) goto L43
            if (r0 != r5) goto L5d
            X.Hwg.A00(r10)
        L13:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r9.$finished$delegate
            androidx.compose.runtime.MutableState.A09(r4, r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L1b:
            X.Hwg.A00(r10)
            X.AT5<java.lang.Float, X.AOW> r3 = r9.$alpha
            java.lang.Float r2 = X.AnonymousClass001.A0m()
            X.28s r1 = X.C2HU.A01
            r0 = 450(0x1c2, float:6.3E-43)
            X.ASj r0 = X.AnonymousClass002.A0J(r1, r0)
            r9.label = r4
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r0, r2, r9, r7)
            if (r0 != r6) goto L38
            return r6
        L35:
            X.Hwg.A00(r10)
        L38:
            r9.label = r8
            r0 = 800(0x320, double:3.953E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r9)
            if (r0 != r6) goto L46
            return r6
        L43:
            X.Hwg.A00(r10)
        L46:
            X.AT5<java.lang.Float, X.AOW> r3 = r9.$alpha
            java.lang.Float r2 = X.AnonymousClass001.A0l()
            X.28s r1 = X.C2HU.A01
            r0 = 2200(0x898, float:3.083E-42)
            X.ASj r0 = X.AnonymousClass002.A0J(r1, r0)
            r9.label = r5
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r0, r2, r9, r7)
            if (r0 != r6) goto L13
            return r6
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAssistLaunchGlowKt$HatchAssistLaunchGlow$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
