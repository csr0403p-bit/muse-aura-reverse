package com.facebook.aura.vmbrowser.runtime;

import X.C7438Evz;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$9$1$registration$3 extends C7438Evz implements Function0<Function0<? extends Boolean>> {
    public AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$9$1$registration$3(Object obj) {
        super(0, obj, BrowserViewerSession.class, "captureClipboardMenuContext", "captureClipboardMenuContext()Lkotlin/jvm/functions/Function0;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function0<? extends Boolean> invoke() {
        return ((BrowserViewerSession) this.receiver).captureClipboardMenuContext();
    }
}
