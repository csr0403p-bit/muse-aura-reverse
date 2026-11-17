package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.composer.view.ComposerMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1$1$dictationStopButton$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ComposerMode $composerMode;
    public final /* synthetic */ Function0<Unit> $onDictationStop;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1$1$dictationStopButton$1(Function0<Unit> function0, ComposerMode composerMode, WaveformBuffer waveformBuffer) {
        super(2);
        this.$onDictationStop = function0;
        this.$composerMode = composerMode;
        this.$waveformBuffer = waveformBuffer;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            if (this.$onDictationStop != null && C7384Etj.areEqual(this.$composerMode, ComposerMode.TapDictation.INSTANCE)) {
                bfm.AgE(2007700052);
                TapDictationComposerKt.DictationStopButton(this.$waveformBuffer, this.$onDictationStop, null, bfm, WaveformBuffer.$stable, 4);
            } else {
                bfm.AgE(2007812489);
            }
            AnonymousClass002.A19(bfm);
            return;
        }
        bfm.Afo();
    }
}
