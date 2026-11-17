package com.hatch.browser.core;

import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.NotificationAck;
import com.hatch.browser.protocol.PageStateChange;
import com.hatch.browser.protocol.TaskPageGroupControlChange;
import java.util.List;

/* loaded from: classes6.dex */
public interface TaskPageGroupInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Page addPage(PageAccess pageAccess, PageStateChange pageStateChange);

    byte[] decideSiteAccess(byte[] bArr);

    List<Page> pages();

    TaskPageGroupRetirement retire();

    BrowserTaskBinding task();

    NotificationAck updateControl(TaskPageGroupControlChange taskPageGroupControlChange);
}
