package com.facebook.aura.vmbrowser.runtime;

import X.C7438Evz;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$11$2$1$2 extends C7438Evz implements Function0<Boolean> {
    public AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$11$2$1$2(Object obj) {
        super(0, obj, BrowserViewerSession.Host.class, "isActive", "isActive()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((BrowserViewerSession.Host) this.receiver).isActive());
    }
}
