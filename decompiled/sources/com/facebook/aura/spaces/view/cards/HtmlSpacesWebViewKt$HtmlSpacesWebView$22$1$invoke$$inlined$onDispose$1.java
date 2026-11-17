package com.facebook.aura.spaces.view.cards;

import X.C78g;
import com.facebook.aura.spaces.preload.SpacesTtsBridge;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$22$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ SpacesTtsBridge $ttsBridge$inlined;

    public HtmlSpacesWebViewKt$HtmlSpacesWebView$22$1$invoke$$inlined$onDispose$1(SpacesTtsBridge spacesTtsBridge) {
        this.$ttsBridge$inlined = spacesTtsBridge;
    }

    @Override // X.C78g
    public void dispose() {
        this.$ttsBridge$inlined.close();
    }
}
