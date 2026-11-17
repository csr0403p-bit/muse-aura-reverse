package com.facebook.aura.components.reactions;

import X.AHD;
import X.AT5;
import X.AbstractC7559F3s;
import X.B6A;
import X.C16Z;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraRibbonArcKt$auraRibbonArc$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AHD<B6A> $palette;
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRibbonArcKt$auraRibbonArc$1$1(AT5<Float, ?> at5, AHD<B6A> ahd, InterfaceC1068ATy interfaceC1068ATy) {
        super(1);
        this.$progress = at5;
        this.$palette = ahd;
        this.$path = interfaceC1068ATy;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || this.$palette.isEmpty()) {
            return;
        }
        float f = fA00 * 1040.0f;
        AuraRibbonArcKt.drawRibbonBands(c16z, this.$path, f, this.$palette);
        AuraRibbonArcKt.drawRibbonMotes(c16z, f, this.$palette);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
