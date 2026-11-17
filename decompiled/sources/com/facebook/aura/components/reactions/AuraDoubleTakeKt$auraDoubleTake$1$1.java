package com.facebook.aura.components.reactions;

import X.AT5;
import X.AbstractC7559F3s;
import X.C16Z;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraDoubleTakeKt$auraDoubleTake$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDoubleTakeKt$auraDoubleTake$1$1(AT5<Float, ?> at5) {
        super(1);
        this.$progress = at5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 1600.0f;
        long jADU = c16z.ADU();
        float f2 = AuraReactionMotionKt.OneDp;
        AuraDoubleTakeKt.m394drawDoubleTakeRingsubNVwUQ(c16z, jADU, f, c16z.Ah4(f2));
        AuraDoubleTakeKt.m393drawDoubleTakeGlintsubNVwUQ(c16z, c16z.ADU(), f, c16z.Ah4(f2));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
