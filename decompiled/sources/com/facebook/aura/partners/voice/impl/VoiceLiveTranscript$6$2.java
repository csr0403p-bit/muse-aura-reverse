package com.facebook.aura.partners.voice.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.livesession.api.LiveConversationReplies;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.impl.VoiceLiveTranscript$6$2", f = "VoiceLiveTranscript.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class VoiceLiveTranscript$6$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C20Q<LiveConversationReplies> $replies;
    public int label;
    public final /* synthetic */ VoiceLiveTranscript this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceLiveTranscript$6$2(VoiceLiveTranscript voiceLiveTranscript, C20Q<? extends LiveConversationReplies> c20q, HtJ<? super VoiceLiveTranscript$6$2> htJ) {
        super(2, htJ);
        this.this$0 = voiceLiveTranscript;
        this.$replies = c20q;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceLiveTranscript$6$2(this.this$0, this.$replies, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceLiveTranscript voiceLiveTranscript = this.this$0;
            C20Q<LiveConversationReplies> c20q = this.$replies;
            this.label = 1;
            if (voiceLiveTranscript.publishReplyCaptions(c20q, this) == enumC10460Hji) {
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
        return ((VoiceLiveTranscript$6$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
