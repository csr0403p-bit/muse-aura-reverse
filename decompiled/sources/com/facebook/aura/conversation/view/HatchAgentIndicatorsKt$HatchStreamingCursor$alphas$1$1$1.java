package com.facebook.aura.conversation.view;

import X.Aab;
import X.AbstractC7559F3s;
import X.C1115Aae;
import X.C28s;
import X.C2HU;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchAgentIndicatorsKt$HatchStreamingCursor$alphas$1$1$1 extends AbstractC7559F3s implements G0U<C1115Aae<Float>, Unit> {
    public final /* synthetic */ int $pulseEnd;
    public final /* synthetic */ int $pulseMid;
    public final /* synthetic */ int $pulseStart;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1115Aae<Float> c1115Aae) {
        C7384Etj.A0Y(c1115Aae, 0);
        c1115Aae.A00 = HatchAgentIndicatorsKt.CYCLE_MS;
        Float fA0t = C8j3.A0t();
        Aab<Float> aabA00 = c1115Aae.A00(fA0t, this.$pulseStart);
        C28s c28s = C2HU.A02;
        aabA00.A00 = c28s;
        c1115Aae.A00(Float.valueOf(0.3f), this.$pulseMid).A00 = c28s;
        c1115Aae.A00(fA0t, this.$pulseEnd).A00 = c28s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentIndicatorsKt$HatchStreamingCursor$alphas$1$1$1(int i, int i2, int i3) {
        super(1);
        this.$pulseStart = i;
        this.$pulseMid = i2;
        this.$pulseEnd = i3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1115Aae<Float> c1115Aae) {
        invoke2(c1115Aae);
        return Unit.INSTANCE;
    }
}
