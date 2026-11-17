package com.facebook.aura.spaces.view.cards;

import X.C78g;
import com.facebook.aura.spaces.preload.SpacesShareBridge;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$SpacesShareBridgeEffect$3$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ SpacesShareBridge $shareBridge$inlined;

    public HtmlSpacesWebViewKt$SpacesShareBridgeEffect$3$1$invoke$$inlined$onDispose$1(SpacesShareBridge spacesShareBridge) {
        this.$shareBridge$inlined = spacesShareBridge;
    }

    @Override // X.C78g
    public void dispose() {
        this.$shareBridge$inlined.close();
    }
}
