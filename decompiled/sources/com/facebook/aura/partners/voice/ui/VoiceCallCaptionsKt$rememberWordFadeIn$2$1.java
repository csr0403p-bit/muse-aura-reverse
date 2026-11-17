package com.facebook.aura.partners.voice.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.markdown.render.reveal.WordRevealController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$rememberWordFadeIn$2$1", f = "VoiceCallCaptions.kt", l = {244}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$rememberWordFadeIn$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ WordRevealController $controller;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$rememberWordFadeIn$2$1(WordRevealController wordRevealController, HtJ<? super VoiceCallCaptionsKt$rememberWordFadeIn$2$1> htJ) {
        super(2, htJ);
        this.$controller = wordRevealController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCallCaptionsKt$rememberWordFadeIn$2$1(this.$controller, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            WordRevealController wordRevealController = this.$controller;
            ParcelableSnapshotMutableState parcelableSnapshotMutableStateA0P = AnonymousClass002.A0P(true);
            this.label = 1;
            if (wordRevealController.run(parcelableSnapshotMutableStateA0P, this) == enumC10460Hji) {
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
        return new VoiceCallCaptionsKt$rememberWordFadeIn$2$1(this.$controller, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
