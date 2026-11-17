package com.facebook.aura.conversation.view.richcontent;

import X.C7384Etj;
import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class WidgetHeightOnlyBridge {
    public final WidgetJsBridge bridge;

    public WidgetHeightOnlyBridge(WidgetJsBridge widgetJsBridge) {
        C7384Etj.A0Y(widgetJsBridge, 0);
        this.bridge = widgetJsBridge;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        C7384Etj.A0Y(str, 0);
        this.bridge.onMessage(str, false);
    }
}
