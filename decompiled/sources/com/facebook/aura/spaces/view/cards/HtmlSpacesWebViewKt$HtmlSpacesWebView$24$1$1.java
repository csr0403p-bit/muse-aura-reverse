package com.facebook.aura.spaces.view.cards;

import X.AbstractC1671Anw;
import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HtmlSpacesWebViewKt$HtmlSpacesWebView$24$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ C1BO<Boolean> $isLoading$delegate;
    public final /* synthetic */ boolean $rendersFromShare;
    public final /* synthetic */ C1BO<Boolean> $showError$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        if (C1BO.A0F(this.$showError$delegate) || (this.$rendersFromShare && C1BO.A0F(this.$isLoading$delegate))) {
            interfaceC0857A6e.Aca(AbstractC1671Anw.A0H, Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlSpacesWebViewKt$HtmlSpacesWebView$24$1$1(boolean z, C1BO<Boolean> c1bo, C1BO<Boolean> c1bo2) {
        super(1);
        this.$rendersFromShare = z;
        this.$showError$delegate = c1bo;
        this.$isLoading$delegate = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
