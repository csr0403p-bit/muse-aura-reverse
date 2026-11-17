package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.api.PlayoutInjection;

/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$playAudio$framer$1 extends AbstractC7559F3s implements G0U<short[], PlayoutInjection> {
    public final /* synthetic */ Long $rtcGeneration;
    public final /* synthetic */ VoicePreviewPlayer this$0;

    @Override // X.G0U
    public final PlayoutInjection invoke(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        return this.this$0.injectRtc(this.$rtcGeneration.longValue(), sArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewPlayer$playAudio$framer$1(VoicePreviewPlayer voicePreviewPlayer, Long l) {
        super(1);
        this.this$0 = voicePreviewPlayer;
        this.$rtcGeneration = l;
    }
}
