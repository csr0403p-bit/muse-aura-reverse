package com.facebook.aura.components.confetti;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C16Z;
import X.C8j3;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraConfettiBurstKt$auraConfettiBurst$2$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ MutableState<List<ConfettiParticle>> $particles$delegate;
    public final /* synthetic */ AT5<Float, AOW> $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraConfettiBurstKt$auraConfettiBurst$2$1(AT5<Float, AOW> at5, MutableState<List<ConfettiParticle>> mutableState) {
        super(1);
        this.$progress = at5;
        this.$particles$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f || C8j3.A1C(this.$particles$delegate).isEmpty()) {
            return;
        }
        AuraConfettiBurstKt.drawConfetti(c16z, C8j3.A1C(this.$particles$delegate), fA00);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
