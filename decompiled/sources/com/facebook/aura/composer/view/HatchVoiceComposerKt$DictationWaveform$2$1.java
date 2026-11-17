package com.facebook.aura.composer.view;

import X.AOW;
import X.AT3;
import X.AT5;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchVoiceComposerKt$DictationWaveform$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $animatedCount;
    public final /* synthetic */ long $barColor;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(2.0f);
        float fAh42 = fAh4 + at3.Ah4(2.0f);
        long jAKb = at3.AKb();
        int iA00 = (int) (AnonymousClass001.A00(jAKb) / fAh42);
        float fA01 = AnonymousClass001.A01(jAKb, 4294967295L);
        float f = fA01 / 2.0f;
        float f2 = fA01 * 0.9f;
        float fAh43 = at3.Ah4(2.0f);
        if (MutableState.A0A(this.$waveformBuffer.isProcessing$delegate)) {
            return;
        }
        float fA00 = MutableState.A00(this.$animatedCount);
        float f3 = this.$waveformBuffer.sampleCount;
        if (fA00 > f3) {
            fA00 = f3;
        }
        int i = (int) fA00;
        float f4 = fA00 - i;
        if (iA00 < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i - i2;
            if (i3 < 0) {
                return;
            }
            float fA002 = AnonymousClass001.A00(at3.AKb()) - ((i2 + f4) * fAh42);
            float f5 = fAh43 + (this.$waveformBuffer.get(i3) * f2);
            if (f5 > f2) {
                f5 = f2;
            }
            long j = this.$barColor;
            long jA0L = AnonymousClass005.A0L(fA002, f - (f5 / 2.0f));
            long jA0M = AnonymousClass005.A0M(fAh4, f5);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fAh4 / 2.0f);
            at3.A9j(null, C16a.A00, 1.0f, 3, j, jA0L, jA0M, (jFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits << 32));
            if (i2 == iA00) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceComposerKt$DictationWaveform$2$1(WaveformBuffer waveformBuffer, AT5<Float, AOW> at5, long j) {
        super(1);
        this.$waveformBuffer = waveformBuffer;
        this.$animatedCount = at5;
        this.$barColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
