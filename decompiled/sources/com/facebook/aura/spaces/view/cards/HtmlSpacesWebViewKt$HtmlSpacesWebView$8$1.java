package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.B6A;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<B6A, Unit>> $currentOnTopColorDetected$delegate;
    public final /* synthetic */ G0U<B6A, Unit> $onTopColorDetected;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1(G0U<? super B6A, Unit> g0u, HtmlSpacesWebViewSession htmlSpacesWebViewSession, C1BO<? extends G0U<? super B6A, Unit>> c1bo) {
        super(1);
        this.$onTopColorDetected = g0u;
        this.$session = htmlSpacesWebViewSession;
        this.$currentOnTopColorDetected$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1 htmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1 = this.$onTopColorDetected != null ? new HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1(this.$currentOnTopColorDetected$delegate) : null;
        this.$session.onTopColorDetected = htmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1;
        Integer num = this.$session.lastTopColor;
        if (num != null) {
            int iIntValue = num.intValue();
            if (htmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1 != null) {
                htmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1.invoke(Integer.valueOf(iIntValue));
            }
        }
        final HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
        return new C78g() { // from class: com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$8$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (htmlSpacesWebViewSession.onTopColorDetected == htmlSpacesWebViewKt$HtmlSpacesWebView$8$1$sessionCallback$1) {
                    htmlSpacesWebViewSession.onTopColorDetected = null;
                }
            }
        };
    }
}
