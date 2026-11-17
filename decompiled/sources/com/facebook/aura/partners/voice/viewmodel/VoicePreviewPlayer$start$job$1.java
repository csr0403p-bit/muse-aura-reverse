package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$start$job$1", f = "VoicePreviewPlayer.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$start$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C10543Hqv<VoicePreviewPlayer.ActivePreview> $preview;
    public int label;
    public final /* synthetic */ VoicePreviewPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewPlayer$start$job$1(VoicePreviewPlayer voicePreviewPlayer, C10543Hqv<VoicePreviewPlayer.ActivePreview> c10543Hqv, HtJ<? super VoicePreviewPlayer$start$job$1> htJ) {
        super(2, htJ);
        this.this$0 = voicePreviewPlayer;
        this.$preview = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewPlayer$start$job$1(this.this$0, this.$preview, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoicePreviewPlayer voicePreviewPlayer = this.this$0;
            VoicePreviewPlayer.ActivePreview activePreview = this.$preview.element;
            this.label = 1;
            if (voicePreviewPlayer.load(activePreview, this) == enumC10460Hji) {
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
        return ((VoicePreviewPlayer$start$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
