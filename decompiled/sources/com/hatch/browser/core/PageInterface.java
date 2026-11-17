package com.hatch.browser.core;

import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.Budget;
import com.hatch.browser.protocol.NotificationAck;
import com.hatch.browser.protocol.PageCloseInvocation;
import com.hatch.browser.protocol.PageCommandInvocation;
import com.hatch.browser.protocol.PageReference;
import com.hatch.browser.protocol.PageStateChange;

/* loaded from: classes6.dex */
public interface PageInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    PageClosure beginClose(PageCloseInvocation pageCloseInvocation);

    PendingPageConnection beginConnect(Budget budget);

    PendingCommand beginExecute(PageCommandInvocation pageCommandInvocation);

    PendingPageConnection beginReconnect(PageAccess pageAccess, Budget budget);

    PageReference lifecycleReference();

    PageReference reference();

    PageRemoval remove();

    BrowserTaskBinding task();

    NotificationAck updateState(PageStateChange pageStateChange);
}
