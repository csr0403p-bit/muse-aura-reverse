package com.facebook.aura.vmbrowser.runtime;

import X.C78g;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;

/* loaded from: classes2.dex */
public final class AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$4$0$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ BrowserViewerSession.Host $host$inlined;

    public AgentBrowserLiveViewerKt$AgentBrowserLiveViewer_0vH8DBg$lambda$4$0$$inlined$onDispose$1(BrowserViewerSession.Host host) {
        this.$host$inlined = host;
    }

    @Override // X.C78g
    public void dispose() {
        this.$host$inlined.close();
    }
}
