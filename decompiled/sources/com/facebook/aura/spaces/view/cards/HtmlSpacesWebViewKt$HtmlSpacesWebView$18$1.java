package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C8117FUh;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt$HtmlSpacesWebView$18$1", f = "HtmlSpacesWebView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$18$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $isLoading$delegate;
    public final /* synthetic */ C8117FUh $swipeRefreshLayout;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$18$1(C8117FUh c8117FUh, C1BO<Boolean> c1bo, HtJ<? super HtmlSpacesWebViewKt$HtmlSpacesWebView$18$1> htJ) {
        super(2, htJ);
        this.$swipeRefreshLayout = c8117FUh;
        this.$isLoading$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlSpacesWebViewKt$HtmlSpacesWebView$18$1(this.$swipeRefreshLayout, this.$isLoading$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C8117FUh c8117FUh;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!C1BO.A0F(this.$isLoading$delegate) && (c8117FUh = this.$swipeRefreshLayout) != null) {
            c8117FUh.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HtmlSpacesWebViewKt$HtmlSpacesWebView$18$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
