package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$CompactAudioWaveformBars$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<Float> $drawProgress;
    public final /* synthetic */ WaveformLevels $levels;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Float, Unit> $onScrub;
    public final /* synthetic */ G0U<Float, Unit> $onScrubFinished;
    public final /* synthetic */ long $playedColor;
    public final /* synthetic */ long $remainingColor;
    public final /* synthetic */ String $seekLabel;
    public final /* synthetic */ String $seekState;
    public final /* synthetic */ float $semanticsProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCompactAudioPlayerKt$CompactAudioWaveformBars$3(WaveformLevels waveformLevels, Function0<Float> function0, float f, long j, long j2, String str, String str2, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, BRg bRg, int i, int i2) {
        super(2);
        this.$levels = waveformLevels;
        this.$drawProgress = function0;
        this.$semanticsProgress = f;
        this.$playedColor = j;
        this.$remainingColor = j2;
        this.$seekLabel = str;
        this.$seekState = str2;
        this.$onScrub = g0u;
        this.$onScrubFinished = g0u2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchCompactAudioPlayerKt.m537CompactAudioWaveformBars0quPzfM(this.$levels, this.$drawProgress, this.$semanticsProgress, this.$playedColor, this.$remainingColor, this.$seekLabel, this.$seekState, this.$onScrub, this.$onScrubFinished, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
