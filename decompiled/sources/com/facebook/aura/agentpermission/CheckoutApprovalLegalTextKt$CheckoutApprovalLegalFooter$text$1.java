package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutApprovalLegalTextKt$CheckoutApprovalLegalFooter$text$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ CheckoutLegalPresentation $data;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutApprovalLegalTextKt$CheckoutApprovalLegalFooter$text$1(CheckoutLegalPresentation checkoutLegalPresentation, BRg bRg, int i, int i2) {
        super(2);
        this.$data = checkoutLegalPresentation;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        CheckoutApprovalLegalTextKt.CheckoutApprovalLegalFooter(this.$data, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
