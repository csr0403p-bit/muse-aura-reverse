package com.facebook.aura.spaces.view.cards;

import X.C78g;
import com.facebook.aura.spaces.preload.SpacesBlobViewerBridge;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$23$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ SpacesBlobViewerBridge $blobViewerBridge$inlined;

    public HtmlSpacesWebViewKt$HtmlSpacesWebView$23$1$invoke$$inlined$onDispose$1(SpacesBlobViewerBridge spacesBlobViewerBridge) {
        this.$blobViewerBridge$inlined = spacesBlobViewerBridge;
    }

    @Override // X.C78g
    public void dispose() {
        this.$blobViewerBridge$inlined.close();
    }
}
