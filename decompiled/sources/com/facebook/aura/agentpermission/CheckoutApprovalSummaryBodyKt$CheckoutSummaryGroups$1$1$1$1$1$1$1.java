package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$1$1$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ CheckoutAmountPresentation $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$1$1$1$1$1$1$1(CheckoutAmountPresentation checkoutAmountPresentation) {
        super(3);
        this.$row = checkoutAmountPresentation;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            CheckoutAmountRowKt.CheckoutAmountRow(this.$row, null, null, null, null, bfm, CheckoutAmountPresentation.$stable, 30);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
