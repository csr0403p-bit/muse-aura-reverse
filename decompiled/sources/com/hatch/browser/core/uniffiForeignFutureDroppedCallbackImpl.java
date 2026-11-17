package com.hatch.browser.core;

import X.HoC;

/* loaded from: classes6.dex */
public final class uniffiForeignFutureDroppedCallbackImpl implements UniffiForeignFutureDroppedCallback {
    public static final int $stable = 0;
    public static final uniffiForeignFutureDroppedCallbackImpl INSTANCE = new uniffiForeignFutureDroppedCallbackImpl();

    @Override // com.hatch.browser.core.UniffiForeignFutureDroppedCallback
    public void callback(long j) throws InternalException {
        HoC hoCRemove = Hatch_browser_core_uniffiKt.uniffiForeignFutureHandleMap.remove(j);
        if (hoCRemove.AOG()) {
            return;
        }
        hoCRemove.A5w(null);
    }
}
