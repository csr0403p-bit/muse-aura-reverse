package com.facebook.aura.components.reactions;

import X.AT5;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C16Z;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSingleTearKt$auraSingleTear$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ InterfaceC1068ATy $path;
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 1020.0f;
        long jLandingPoint = AuraSingleTearKt.landingPoint(c16z, AXN.A00(c16z));
        AuraSingleTearKt.m419drawFallingTearmoWRBKg(c16z, this.$path, f, jLandingPoint);
        AuraReactionStrokesKt.m411drawReactionWaterRipplehykp8_8(c16z, AnonymousClass005.A0M(AnonymousClass001.A00(jLandingPoint), AnonymousClass001.A01(jLandingPoint, 4294967295L) + c16z.Ah4(AuraSingleTearKt.RippleDrop)), AuraSingleTearKt.SingleTearColor, (f - 740.0f) / 280.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSingleTearKt$auraSingleTear$1$1(AT5<Float, ?> at5, InterfaceC1068ATy interfaceC1068ATy) {
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
