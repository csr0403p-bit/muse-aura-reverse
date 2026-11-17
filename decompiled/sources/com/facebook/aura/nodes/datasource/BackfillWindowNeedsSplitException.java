package com.facebook.aura.nodes.datasource;

import X.C06H;

/* loaded from: classes6.dex */
public final class BackfillWindowNeedsSplitException extends Exception {
    public BackfillWindowNeedsSplitException() {
        super((Throwable) null);
    }

    public /* synthetic */ BackfillWindowNeedsSplitException(Throwable th, int i, C06H c06h) {
        super((i & 1) != 0 ? null : th);
    }

    public BackfillWindowNeedsSplitException(Throwable th) {
        super(th);
    }
}
