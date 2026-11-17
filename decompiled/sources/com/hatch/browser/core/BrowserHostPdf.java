package com.hatch.browser.core;

import X.HtJ;
import com.hatch.browser.protocol.NativePdfPrintRequest;

/* loaded from: classes6.dex */
public interface BrowserHostPdf {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    Object print(NativePdfPrintRequest nativePdfPrintRequest, HtJ<? super NativePdfPrintResult> htJ);
}
