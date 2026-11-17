package com.facebook.aura.partners.voice.screen;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceCallCurrentCaptionKt$CaptionHandover$1$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $entryAnimation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA00 = MutableState.A00(this.$entryAnimation) / 0.6f;
        if (fA00 > 1.0f) {
            fA00 = 1.0f;
        }
        c2av.Acj(1.0f - fA00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCurrentCaptionKt$CaptionHandover$1$2$1(AT5<Float, AOW> at5) {
        super(1);
        this.$entryAnimation = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
