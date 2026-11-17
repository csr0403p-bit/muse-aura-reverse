package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C00q;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$displaySeconds$1$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ int $durationMs;
    public final /* synthetic */ C1BO<Integer> $positionState;
    public final /* synthetic */ C00q $scrubFraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$displaySeconds$1$1(C00q c00q, int i, C1BO<Integer> c1bo) {
        super(0);
        this.$scrubFraction = c00q;
        this.$durationMs = i;
        this.$positionState = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        float fAFn = this.$scrubFraction.AFn();
        return Integer.valueOf((fAFn >= 0.0f ? (int) (fAFn * this.$durationMs) : C1BO.A02(this.$positionState)) / 1000);
    }
}
