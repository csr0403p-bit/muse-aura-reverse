package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.ShutdownReceipt;

/* loaded from: classes6.dex */
public interface PendingShutdownInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object awaitSettlement(HtJ<? super ShutdownReceipt> htJ);
}
