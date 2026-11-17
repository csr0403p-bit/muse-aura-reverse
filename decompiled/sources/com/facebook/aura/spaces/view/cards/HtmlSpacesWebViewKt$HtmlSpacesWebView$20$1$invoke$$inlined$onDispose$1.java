package com.facebook.aura.spaces.view.cards;

import X.C78g;
import X.C8117FUh;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$20$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ C8117FUh $swipeRefreshLayout$inlined;

    public HtmlSpacesWebViewKt$HtmlSpacesWebView$20$1$invoke$$inlined$onDispose$1(C8117FUh c8117FUh) {
        this.$swipeRefreshLayout$inlined = c8117FUh;
    }

    @Override // X.C78g
    public void dispose() {
        C8117FUh c8117FUh = this.$swipeRefreshLayout$inlined;
        if (c8117FUh != null) {
            c8117FUh.setRefreshing(false);
        }
    }
}
