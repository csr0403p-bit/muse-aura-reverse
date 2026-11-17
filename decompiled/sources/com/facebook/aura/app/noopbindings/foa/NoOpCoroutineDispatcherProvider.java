package com.facebook.aura.app.noopbindings.foa;

import X.AbstractC7429Evm;
import X.AbstractC9266GBt;
import X.C0aK;
import X.C78T;
import X.GBK;
import X.HlU;

/* loaded from: classes3.dex */
public final class NoOpCoroutineDispatcherProvider {
    public static final NoOpCoroutineDispatcherProvider INSTANCE = new NoOpCoroutineDispatcherProvider();

    public C78T background(C0aK c0aK) {
        return AbstractC9266GBt.A00;
    }

    public C78T io(C0aK c0aK) {
        GBK gbk = AbstractC9266GBt.A00;
        return HlU.A01;
    }

    public C78T main() {
        GBK gbk = AbstractC9266GBt.A00;
        return AbstractC7429Evm.A00;
    }
}
