package com.facebook.aura.composer.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchVoiceComposerKt$DictationWaveform$1$1", f = "HatchVoiceComposer.kt", l = {94}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchVoiceComposerKt$DictationWaveform$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $animatedCount;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceComposerKt$DictationWaveform$1$1(AT5<Float, AOW> at5, HtJ<? super HatchVoiceComposerKt$DictationWaveform$1$1> htJ) {
        super(2, htJ);
        this.$animatedCount = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVoiceComposerKt$DictationWaveform$1$1(this.$animatedCount, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$animatedCount;
            Float f = new Float(Float.MAX_VALUE);
            ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, Integer.MAX_VALUE);
            this.label = 1;
            if (AnonymousClass002.A0i(at5, aSjA0J, f, this, null) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchVoiceComposerKt$DictationWaveform$1$1(this.$animatedCount, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
