package com.facebook.aura.partners.voice.session.impl;

import X.HtJ;
import X.HzP;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$collectCaptions$2", f = "SessionController.kt", l = {6105}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$collectCaptions$2$emit$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SessionController.C132632<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionController$collectCaptions$2$emit$1(SessionController.C132632<? super T> c132632, HtJ<? super SessionController$collectCaptions$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = c132632;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((MetaAiVoiceState) null, (HtJ<? super Unit>) this);
    }
}
