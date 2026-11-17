package com.facebook.aura.spaces.view.cards;

import X.C78g;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$12$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HtmlSpacesWebViewSession $session$inlined;

    public HtmlSpacesWebViewKt$HtmlSpacesWebView$12$1$invoke$$inlined$onDispose$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
        this.$session$inlined = htmlSpacesWebViewSession;
    }

    @Override // X.C78g
    public void dispose() {
        this.$session$inlined.clearHostReferences();
    }
}
