package com.hatch.browser.core;

import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.core.uniffiCallbackInterfaceBrowserHostFiles;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class uniffiCallbackInterfaceBrowserHostFiles$release$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ BrowserHostFiles f$0;
    public final /* synthetic */ RustBuffer.ByValue f$1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return uniffiCallbackInterfaceBrowserHostFiles.release.callback$lambda$0(this.f$0, this.f$1);
    }

    public /* synthetic */ uniffiCallbackInterfaceBrowserHostFiles$release$$ExternalSyntheticLambda0(BrowserHostFiles browserHostFiles, RustBuffer.ByValue byValue) {
        this.f$0 = browserHostFiles;
        this.f$1 = byValue;
    }
}
