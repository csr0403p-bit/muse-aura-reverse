package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.PageReference;

/* loaded from: classes6.dex */
public interface PendingPageConnectionInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object awaitReference(HtJ<? super PageReference> htJ);
}
