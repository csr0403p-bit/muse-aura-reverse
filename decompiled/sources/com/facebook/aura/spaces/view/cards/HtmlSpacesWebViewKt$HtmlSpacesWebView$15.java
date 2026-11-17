package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B81;
import X.BFM;
import X.C1BO;
import X.C6t6;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$15 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1BO<Boolean> $canGoBack$delegate;
    public final /* synthetic */ C6t6 $webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$15(C6t6 c6t6, C1BO<Boolean> c1bo) {
        super(2);
        this.$webView = c6t6;
        this.$canGoBack$delegate = c1bo;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            bfm.Afo();
            return;
        }
        boolean zA0F = C1BO.A0F(this.$canGoBack$delegate);
        boolean zA67 = bfm.A67(this.$webView);
        C6t6 c6t6 = this.$webView;
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new HtmlSpacesWebViewKt$HtmlSpacesWebView$15$1$1(c6t6);
            bfm.Ai0(objAaT);
        }
        B81.A00(zA0F, (Function0) objAaT, bfm, 0, 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
