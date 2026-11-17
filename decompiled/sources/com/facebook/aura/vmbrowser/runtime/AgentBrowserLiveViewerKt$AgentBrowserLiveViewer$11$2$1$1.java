package com.facebook.aura.vmbrowser.runtime;

import X.C7438Evz;
import X.G0U;
import X.HtJ;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$11$2$1$1 extends C7438Evz implements G0U {
    public AgentBrowserLiveViewerKt$AgentBrowserLiveViewer$11$2$1$1(Object obj) {
        super(1, obj, BrowserViewerSession.Host.class, "prepareStream", "prepareStream(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super BrowserPresentResult> htJ) {
        return ((BrowserViewerSession.Host) this.receiver).prepareStream(htJ);
    }
}
