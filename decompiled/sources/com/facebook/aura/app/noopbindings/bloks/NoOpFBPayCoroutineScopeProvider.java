package com.facebook.aura.app.noopbindings.bloks;

import X.AbstractC7429Evm;
import X.AbstractC9266GBt;
import X.C3UX;
import X.C78W;
import X.C8eO;
import X.GBK;
import X.HlU;

/* loaded from: classes3.dex */
public final class NoOpFBPayCoroutineScopeProvider {
    public static final NoOpFBPayCoroutineScopeProvider INSTANCE = new NoOpFBPayCoroutineScopeProvider();

    public C3UX getDefaultScope() {
        return C78W.A05(new C8eO(null), AbstractC9266GBt.A00);
    }

    public C3UX getIOScope() {
        C8eO c8eO = new C8eO(null);
        GBK gbk = AbstractC9266GBt.A00;
        return C78W.A05(c8eO, HlU.A01);
    }

    public C3UX getMainScope() {
        C8eO c8eO = new C8eO(null);
        GBK gbk = AbstractC9266GBt.A00;
        return C78W.A05(c8eO, AbstractC7429Evm.A00);
    }
}
