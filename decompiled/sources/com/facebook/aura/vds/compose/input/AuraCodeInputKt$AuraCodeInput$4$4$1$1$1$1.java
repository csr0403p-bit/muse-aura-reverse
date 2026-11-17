package com.facebook.aura.vds.compose.input;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$4$4$1$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ AT5<Float, AOW> $shakeOffset;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Af5(MutableState.A00(this.$shakeOffset));
        c2av.Acj(this.$enabled ? 1.0f : 0.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCodeInputKt$AuraCodeInput$4$4$1$1$1$1(AT5<Float, AOW> at5, boolean z) {
        super(1);
        this.$shakeOffset = at5;
        this.$enabled = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
