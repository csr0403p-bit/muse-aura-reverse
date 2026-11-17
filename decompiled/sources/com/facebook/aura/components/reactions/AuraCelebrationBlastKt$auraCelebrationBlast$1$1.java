package com.facebook.aura.components.reactions;

import X.AT5;
import X.AWx;
import X.AXN;
import X.AbstractC7559F3s;
import X.C16Z;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraCelebrationBlastKt$auraCelebrationBlast$1$1 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ AT5<Float, ?> $progress;
    public final /* synthetic */ List<InterfaceC1068ATy> $shapes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCelebrationBlastKt$auraCelebrationBlast$1$1(AT5<Float, ?> at5, List<? extends InterfaceC1068ATy> list) {
        super(1);
        this.$progress = at5;
        this.$shapes = list;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C16Z.A00(c16z);
        float fA00 = MutableState.A00(this.$progress);
        if (fA00 <= 0.0f || fA00 >= 1.0f) {
            return;
        }
        float f = fA00 * 1230.0f;
        long jA03 = AWx.A03(AuraCelebrationBlastKt.PopperTip, AXN.A00(c16z), c16z.ADU());
        AuraCelebrationBlastKt.m387drawMuzzleFlash0AR0LA0(c16z, f, jA03);
        AuraCelebrationBlastKt.m386drawDebrisRg1IO4c(c16z, f, jA03, this.$shapes);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
