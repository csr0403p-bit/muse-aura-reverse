package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC07127nr;
import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.C3UX;
import X.C8j3;
import X.C9591GQq;
import X.FZW;
import X.G0V;
import X.GR9;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1", f = "MetaAiRsysSdkRealTimeSession.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $event;
    public int label;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession;ILX/HtJ<-Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1;>;)V */
    public MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HtJ htJ, int i) {
        super(2, htJ);
        this.this$0 = metaAiRsysSdkRealTimeSession;
        this.$event = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1(this.this$0, htJ, this.$event);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C9591GQq c9591GQq = this.this$0.A0C;
        FZW fzw = new FZW(this.$event);
        GR9 gr9 = c9591GQq.A0C;
        if (gr9 != null) {
            fzw.invoke(gr9);
        } else {
            AbstractC7608F5v.A1L("SendVoiceStateEvent called before call object is available. Caching the action to execute later");
            c9591GQq.A01.A01.add(fzw);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MetaAiRsysSdkRealTimeSession$sendVoiceStateEvent$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
