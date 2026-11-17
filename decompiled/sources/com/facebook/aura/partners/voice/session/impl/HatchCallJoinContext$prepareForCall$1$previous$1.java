package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.GAt;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;

/* loaded from: classes6.dex */
public final class HatchCallJoinContext$prepareForCall$1$previous$1 extends AbstractC7559F3s implements G0U<HatchCallJoinContext.State, HatchCallJoinContext.State> {
    public final /* synthetic */ HatchCallJoinContext.JoinSendContext $context;

    @Override // X.G0U
    public final HatchCallJoinContext.State invoke(HatchCallJoinContext.State state) {
        HatchCallJoinContext.JoinSendContext joinSendContextCopy$default;
        C7384Etj.A0Y(state, 0);
        long j = state.generation + 1;
        HatchCallJoinContext.JoinSendContext joinSendContext = this.$context;
        return (joinSendContext == null || (joinSendContextCopy$default = HatchCallJoinContext.JoinSendContext.copy$default(joinSendContext, null, null, null, null, null, null, null, null, null, false, j, null, null, false, null, null, false, 130047, null)) == null) ? new HatchCallJoinContext.State(j, null, null, false) : new HatchCallJoinContext.State(j, joinSendContextCopy$default, new HatchCallJoinContext.PendingBind(joinSendContextCopy$default.callId, j, new GAt(null), new GAt(null)), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCallJoinContext$prepareForCall$1$previous$1(HatchCallJoinContext.JoinSendContext joinSendContext) {
        super(1);
        this.$context = joinSendContext;
    }
}
