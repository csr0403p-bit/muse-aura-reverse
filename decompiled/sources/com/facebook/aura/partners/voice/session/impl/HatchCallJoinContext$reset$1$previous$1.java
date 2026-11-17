package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;

/* loaded from: classes6.dex */
public final class HatchCallJoinContext$reset$1$previous$1 extends AbstractC7559F3s implements G0U<HatchCallJoinContext.State, HatchCallJoinContext.State> {
    public static final HatchCallJoinContext$reset$1$previous$1 INSTANCE = new HatchCallJoinContext$reset$1$previous$1();

    public HatchCallJoinContext$reset$1$previous$1() {
        super(1);
    }

    @Override // X.G0U
    public final HatchCallJoinContext.State invoke(HatchCallJoinContext.State state) {
        C7384Etj.A0Y(state, 0);
        return new HatchCallJoinContext.State(state.generation + 1, null, null, false);
    }
}
