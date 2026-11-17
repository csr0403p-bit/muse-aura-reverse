package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.B6A;
import X.C16Z;
import X.C8j4;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraCrownDropKt$auraCrownDrop$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCrownDropKt$auraCrownDrop$1$1(AT5<Float, ?> at5, AHD<B6A> ahd, InterfaceC1068ATy interfaceC1068ATy) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
        this.$path = interfaceC1068ATy;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        boolean zA1X = C8j4.A1X(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 840.0f;
        float fA002 = AXN.A00(c16z);
        AuraReactionMotionKt.m405drawReactionSpecularSweepwnzZ9DU(c16z, AWx.A03(AuraCrownDropKt.SweepAt, fA002, c16z.ADU()), B6A.A08, c16z.Ah4(AuraCrownDropKt.SweepSize), c16z.Ah4(AuraCrownDropKt.SweepWidth), c16z.Ah4(AuraCrownDropKt.SweepTravel), 0.7f, (f - 340.0f) / 380.0f);
        AuraReactionMotionKt.m403drawReactionDiamondGlint6TbYsW0(c16z, this.$path, AWx.A03(AuraCrownDropKt.GlintAt, fA002, c16z.ADU()), C8j4.A0P(this.$palette, zA1X ? 1 : 0), c16z.Ah4(AuraCrownDropKt.GlintSize), (f - 550.0f) / 280.0f);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
