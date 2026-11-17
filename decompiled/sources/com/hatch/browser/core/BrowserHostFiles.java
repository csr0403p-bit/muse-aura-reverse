package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.NativeFileReadRequest;
import com.hatch.browser.protocol.NativeFileStageRequest;

/* loaded from: classes6.dex */
public interface BrowserHostFiles {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object read(NativeFileReadRequest nativeFileReadRequest, HtJ<? super NativeFileReadResult> htJ);

    void release(String str);

    Object stage(NativeFileStageRequest nativeFileStageRequest, HtJ<? super NativeFileStageResult> htJ);
}
