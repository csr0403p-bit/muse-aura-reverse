package com.facebook.aura.spaces.view.cards;

import X.C78g;
import com.facebook.aura.spaces.preload.SpacesActionResponseBridge;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$21$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ SpacesActionResponseBridge $actionBridge$inlined;

    public HtmlSpacesWebViewKt$HtmlSpacesWebView$21$1$invoke$$inlined$onDispose$1(SpacesActionResponseBridge spacesActionResponseBridge) {
        this.$actionBridge$inlined = spacesActionResponseBridge;
    }

    @Override // X.C78g
    public void dispose() {
        this.$actionBridge$inlined.close();
    }
}
