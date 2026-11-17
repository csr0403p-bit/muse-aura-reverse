package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.CancelAck;
import com.hatch.browser.protocol.CommandRequest;
import com.hatch.browser.protocol.OperationId;
import com.hatch.browser.protocol.PageCloseRequest;
import com.hatch.browser.protocol.SdkIdentity;

/* loaded from: classes6.dex */
public interface BrowserCoreInterface {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    PageClosure beginClose(PageCloseRequest pageCloseRequest);

    PendingCommand beginExecute(CommandRequest commandRequest);

    PendingShutdown beginShutdown();

    byte[] blockedPolicyInventory();

    byte[] blockedPolicySite(String str);

    byte[] blocklistInfo();

    CancelAck cancel(OperationId operationId);

    void clearBlocklistFilter();

    TaskPageGroup createTaskPageGroup(BrowserTaskBinding browserTaskBinding);

    void enableBlockedPolicy(String str);

    void enableEnhancedPolicy(String str);

    void enableHeaderPolicy(String str);

    void enableNavigationConsent(String str);

    byte[] enhancedPolicyInventory();

    Boolean enhancedSiteAllowed(String str);

    byte[] headerPolicyInventory();

    byte[] headerPolicyRules();

    SdkIdentity identity();

    byte[] navigationInventory();

    String prescreenUrl(String str);

    byte[] requestHeaders(String str, boolean z);

    Object screenNavigation(String str, boolean z, HtJ<? super byte[]> htJ);

    byte[] setBlockedPolicy(byte[] bArr);

    byte[] setBlocklistFilter(byte[] bArr);

    byte[] setEnhancedPolicy(byte[] bArr);

    byte[] setHeaderPolicy(byte[] bArr);

    byte[] setNavigationPolicy(byte[] bArr);

    void useBlocklistFilter(BrowserBlocklistFilter browserBlocklistFilter);
}
