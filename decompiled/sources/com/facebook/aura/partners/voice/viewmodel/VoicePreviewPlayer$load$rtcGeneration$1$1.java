package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.api.PlayoutInjection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$load$rtcGeneration$1$1", f = "VoicePreviewPlayer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoicePreviewPlayer$load$rtcGeneration$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PlayoutInjection>, Object> {
    public final /* synthetic */ long $it;
    public int label;
    public final /* synthetic */ VoicePreviewPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePreviewPlayer$load$rtcGeneration$1$1(VoicePreviewPlayer voicePreviewPlayer, long j, HtJ<? super VoicePreviewPlayer$load$rtcGeneration$1$1> htJ) {
        super(2, htJ);
        this.this$0 = voicePreviewPlayer;
        this.$it = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoicePreviewPlayer$load$rtcGeneration$1$1(this.this$0, this.$it, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.this$0.injectRtc(this.$it, new short[480]);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PlayoutInjection> htJ) {
        return ((VoicePreviewPlayer$load$rtcGeneration$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
