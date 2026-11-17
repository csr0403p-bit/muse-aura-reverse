package com.facebook.aura.components.reactions;

import X.AT5;
import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.C16Z;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraTearJewelKt$auraTearJewel$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 800.0f;
        AuraTearJewelKt.drawRoll(c16z, this.$path, f);
        AuraReactionMotionKt.m403drawReactionDiamondGlint6TbYsW0(c16z, this.$path, AWx.A03(AuraTearJewelKt.TearEnd, AXN.A00(c16z), c16z.ADU()), AuraTearJewelKt.TearColor, c16z.Ah4(AuraTearJewelKt.GlintSize), (f - 500.0f) / 280.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTearJewelKt$auraTearJewel$1$1(AT5<Float, ?> at5, InterfaceC1068ATy interfaceC1068ATy) {
        super(1);
        this.$progress = at5;
        this.$path = interfaceC1068ATy;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
