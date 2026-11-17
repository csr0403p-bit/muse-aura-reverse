package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C60O;
import X.C60P;
import X.C6t6;
import X.CFK;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$2$1", f = "HtmlSpacesWebView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $htmlContent;
    public final /* synthetic */ boolean $rendersFromShare;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ String $sourceUrl;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$2$1(C6t6 c6t6, boolean z, HtmlSpacesWebViewSession htmlSpacesWebViewSession, String str, String str2, HtJ<? super HtmlSpacesWebViewKt$HtmlSpacesWebView$2$1> htJ) {
        super(2, htJ);
        this.$webView = c6t6;
        this.$rendersFromShare = z;
        this.$session = htmlSpacesWebViewSession;
        this.$sourceUrl = str;
        this.$htmlContent = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$2$1(this.$webView, this.$rendersFromShare, this.$session, this.$sourceUrl, this.$htmlContent, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        int iIdentityHashCode = System.identityHashCode(this.$webView);
        boolean z = this.$rendersFromShare;
        boolean z2 = this.$session.isSavedSpace;
        boolean zA1X = AnonymousClass002.A1X(this.$sourceUrl);
        boolean z3 = this.$htmlContent != null;
        StringBuilder sbA0y = C60O.A0y("view=", iIdentityHashCode);
        sbA0y.append(" event=viewer_bound shared=");
        sbA0y.append(z);
        sbA0y.append(" factoryShared=");
        sbA0y.append(z2);
        sbA0y.append(" hasSource=");
        sbA0y.append(zA1X);
        CFK.A05("SavedSpaceViewer", C60P.A1P(" hasHtml=", sbA0y, z3));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HtmlSpacesWebViewKt$HtmlSpacesWebView$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
