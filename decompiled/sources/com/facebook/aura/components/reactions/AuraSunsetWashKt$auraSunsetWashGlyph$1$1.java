package com.facebook.aura.components.reactions;

import X.AT5;
import X.AbstractC7559F3s;
import X.C16Z;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSunsetWashKt$auraSunsetWashGlyph$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ InterfaceC1068ATy $clip;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 > 0.0f && fA00 < 1.0f) {
            AuraSunsetWashKt.drawSunsetWash(c16z, fA00 * 1620.0f, this.$clip);
        }
        c16z.A9O();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSunsetWashKt$auraSunsetWashGlyph$1$1(AT5<Float, ?> at5, InterfaceC1068ATy interfaceC1068ATy) {
        super(1);
        this.$progress = at5;
        this.$clip = interfaceC1068ATy;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
