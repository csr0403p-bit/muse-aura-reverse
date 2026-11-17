package com.facebook.aura.components.reactions;

import X.AT5;
import X.AXN;
import X.AbstractC7559F3s;
import X.C16Z;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraBlessingBloomKt$auraBlessingBloom$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBlessingBloomKt$auraBlessingBloom$1$1(AT5<Float, ?> at5) {
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
        float f = fA00 * 1650.0f;
        AuraBlessingBloomKt.m382drawBlessingGlowd4ec7I(c16z, c16z.ADU(), f);
        AuraBlessingBloomKt.m383drawBlessingRaysubNVwUQ(c16z, c16z.ADU(), f, AXN.A00(c16z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
