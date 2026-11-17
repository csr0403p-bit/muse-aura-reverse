package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.NativePageCloseRequest;

/* loaded from: classes6.dex */
public interface BrowserHostPageClose {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object closePage(NativePageCloseRequest nativePageCloseRequest, HtJ<? super NativePageCloseResult> htJ);
}
