package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.PageCloseReceipt;

/* loaded from: classes6.dex */
public interface PageClosureInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object awaitSettlement(HtJ<? super PageCloseReceipt> htJ);

    Object inspect(HtJ<? super PageCloseReceipt> htJ);
}
