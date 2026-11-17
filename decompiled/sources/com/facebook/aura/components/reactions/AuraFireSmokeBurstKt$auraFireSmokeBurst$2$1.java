package com.facebook.aura.components.reactions;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C16Z;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraFireSmokeBurstKt$auraFireSmokeBurst$2$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        boolean z;
        C7384Etj.A0Y(c16z, 0);
        float fA00 = MutableState.A00(this.$progress);
        float f = 1530.0f * fA00;
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            z = false;
        } else {
            z = true;
            AuraFireSmokeBurstKt.drawSmoke(c16z, f, c16z);
        }
        c16z.A9O();
        if (z) {
            AuraFireSmokeBurstKt.drawEmbers(c16z, f, c16z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFireSmokeBurstKt$auraFireSmokeBurst$2$1(AT5<Float, AOW> at5) {
        super(1);
        this.$progress = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
