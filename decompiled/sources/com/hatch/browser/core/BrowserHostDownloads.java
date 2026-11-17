package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.NativeDownloadPublishRequest;

/* loaded from: classes6.dex */
public interface BrowserHostDownloads {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object publish(NativeDownloadPublishRequest nativeDownloadPublishRequest, byte[] bArr, HtJ<? super NativeDownloadPublishResult> htJ);
}
