package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.api.CallVoicePreviewResult;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.intf.ActiveAppAudioCall;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$result$1", f = "VoicePreviewPlayer.kt", l = {371}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$playOnCall$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super CallVoicePreviewResult>, Object> {
    public final /* synthetic */ VoicePreviewPlayer.ActivePreview $preview;
    public int label;
    public final /* synthetic */ VoicePreviewPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewPlayer$playOnCall$result$1(VoicePreviewPlayer voicePreviewPlayer, VoicePreviewPlayer.ActivePreview activePreview, HtJ<? super VoicePreviewPlayer$playOnCall$result$1> htJ) {
        super(2, htJ);
        this.this$0 = voicePreviewPlayer;
        this.$preview = activePreview;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewPlayer$playOnCall$result$1(this.this$0, this.$preview, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoicePreviewPlayer voicePreviewPlayer = this.this$0;
            VoiceCatalogRepository voiceCatalogRepository = voicePreviewPlayer.repository;
            AbstractC3358CGz abstractC3358CGz = voicePreviewPlayer.userSession;
            String str = this.$preview.request.key.voiceId;
            ActiveAppAudioCall value = voicePreviewPlayer.voiceCallStateHolder.activeAppAudioCall.getValue();
            String str2 = value != null ? value.callId : null;
            this.label = 1;
            obj = voiceCatalogRepository.speakPreviewOnCall(abstractC3358CGz, str, str2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super CallVoicePreviewResult> htJ) {
        return ((VoicePreviewPlayer$playOnCall$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
