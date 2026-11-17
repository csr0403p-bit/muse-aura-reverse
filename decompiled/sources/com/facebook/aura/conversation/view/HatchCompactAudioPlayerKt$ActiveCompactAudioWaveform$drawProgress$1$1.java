package com.facebook.aura.conversation.view;

import X.ATD;
import X.AbstractC7559F3s;
import X.C00q;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$drawProgress$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ int $durationMs;
    public final /* synthetic */ C1BO<Integer> $positionState;
    public final /* synthetic */ C00q $scrubFraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$drawProgress$1$1(C00q c00q, C1BO<Integer> c1bo, int i) {
        super(0);
        this.$scrubFraction = c00q;
        this.$positionState = c1bo;
        this.$durationMs = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float fAFn = this.$scrubFraction.AFn();
        if (fAFn < 0.0f) {
            fAFn = ATD.A03(C1BO.A02(this.$positionState) / this.$durationMs, 0.0f, 1.0f);
        }
        return Float.valueOf(fAFn);
    }
}
