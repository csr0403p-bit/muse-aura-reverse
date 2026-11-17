package com.facebook.aura.conversation.view;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCompactAudioPlayerKt$CompactAudioWaveformBars$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ Function0<Float> $drawProgress;
    public final /* synthetic */ WaveformLevels $levels;
    public final /* synthetic */ long $playedColor;
    public final /* synthetic */ long $remainingColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(HatchCompactAudioPlayerKt.WaveformBarWidth);
        float fAh42 = fAh4 + at3.Ah4(HatchCompactAudioPlayerKt.WaveformBarGap);
        long jAKb = at3.AKb();
        int iA00 = (int) (AnonymousClass001.A00(jAKb) / fAh42);
        if (iA00 > 0) {
            float fA01 = AnonymousClass001.A01(jAKb, 4294967295L) / 2.0f;
            float fAh43 = at3.Ah4(HatchCompactAudioPlayerKt.WaveformHeight);
            float fA04 = AnonymousClass003.A04(this.$drawProgress) * iA00;
            int i = 0;
            do {
                float[] fArr = this.$levels.values;
                float f = fAh4 + (fArr[i % fArr.length] * fAh43);
                if (f > fAh43) {
                    f = fAh43;
                }
                float f2 = i;
                long j = f2 < fA04 ? this.$playedColor : this.$remainingColor;
                long jA0L = AnonymousClass005.A0L(f2 * fAh42, fA01 - (f / 2.0f));
                long jA0M = AnonymousClass005.A0M(fAh4, f);
                long jFloatToRawIntBits = Float.floatToRawIntBits(fAh4 / 2.0f);
                at3.A9j(null, C16a.A00, 1.0f, 3, j, jA0L, jA0M, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L));
                i++;
            } while (i < iA00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCompactAudioPlayerKt$CompactAudioWaveformBars$2$1(Function0<Float> function0, WaveformLevels waveformLevels, long j, long j2) {
        super(1);
        this.$drawProgress = function0;
        this.$levels = waveformLevels;
        this.$playedColor = j;
        this.$remainingColor = j2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
