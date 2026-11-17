package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C6t6;
import X.C78g;
import X.G0U;
import com.facebook.aura.spaces.preload.SpacesShareBridge;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ SpacesShareBridge $shareBridge;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, SpacesShareBridge spacesShareBridge, C6t6 c6t6) {
        super(1);
        this.$session = htmlSpacesWebViewSession;
        this.$shareBridge = spacesShareBridge;
        this.$webView = c6t6;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1 htmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1;
        if (this.$session.authToken != null) {
            SpacesShareBridge spacesShareBridge = this.$shareBridge;
            htmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1 = new HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1(spacesShareBridge);
            spacesShareBridge.secureWebView = this.$webView;
            this.$session.shareHost = htmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1;
        } else {
            htmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1 = null;
        }
        final HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
        final SpacesShareBridge spacesShareBridge2 = this.$shareBridge;
        final C6t6 c6t6 = this.$webView;
        return new C78g() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (htmlSpacesWebViewSession.shareHost == htmlSpacesWebViewKt$SpacesShareBridgeEffect$2$1$shareHost$1) {
                    htmlSpacesWebViewSession.shareHost = null;
                }
                if (spacesShareBridge2.secureWebView == c6t6) {
                    spacesShareBridge2.secureWebView = null;
                }
            }
        };
    }
}
