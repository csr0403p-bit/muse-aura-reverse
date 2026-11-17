package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.C6t6;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$9$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$9$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, C6t6 c6t6) {
        super(0);
        this.$session = htmlSpacesWebViewSession;
        this.$webView = c6t6;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r6 = this;
            com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r6.$session
            X.BLG<java.lang.Boolean> r0 = r0.isLoading
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto L29
            com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r6.$session
            X.BLG<java.lang.Boolean> r0 = r0.showError
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto L29
            X.6t6 r1 = r6.$webView
            boolean r0 = r1 instanceof com.facebook.aura.spaces.preload.SpacesSecureWebView
            if (r0 == 0) goto L2f
            com.facebook.aura.spaces.preload.SpacesSecureWebView r1 = (com.facebook.aura.spaces.preload.SpacesSecureWebView) r1
            if (r1 == 0) goto L2f
            long r4 = r1.lastTouchDownAtMs
        L20:
            com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r6.$session
            long r2 = r0.lastLoadCompletedAtMs
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            r4 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$9$1.invoke():java.lang.Boolean");
    }
}
