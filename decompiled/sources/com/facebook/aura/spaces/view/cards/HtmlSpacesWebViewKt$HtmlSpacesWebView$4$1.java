package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C6t6;
import X.C78g;
import X.G0U;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$4$1(C6t6 c6t6) {
        super(1);
        this.$webView = c6t6;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HtmlSpacesWebViewKt.resumeSpacesMedia(this.$webView);
        final C6t6 c6t6 = this.$webView;
        return new C78g() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HtmlSpacesWebViewKt.pauseSpacesMedia(c6t6);
            }
        };
    }
}
