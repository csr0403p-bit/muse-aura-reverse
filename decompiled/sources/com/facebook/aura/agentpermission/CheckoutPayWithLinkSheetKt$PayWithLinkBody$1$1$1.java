package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFM;
import X.C07C;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ PayWithLinkDetails $details;
    public final /* synthetic */ CardExpiry $expiry;

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ CardExpiry $expiry;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            Integer numValueOf = Integer.valueOf(R.drawable.credit_card_outline_24);
            CardExpiry cardExpiry = this.$expiry;
            CheckoutPayWithLinkSheetKt.m187InfoRow88mDfTA(c07c, numValueOf, null, AnonymousClass007.A0Y(cardExpiry.amount, bfm, cardExpiry.pluralRes), null, null, 0, 0L, bfm, (iA0d & 14) | RuntimeInternals.IOPRIO_BACKGROUND, 114);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CardExpiry cardExpiry) {
            super(3);
            this.$expiry = cardExpiry;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ PayWithLinkDetails $details;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            Integer numValueOf = Integer.valueOf(R.drawable.currency_bill);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120092);
            PayWithLinkDetails payWithLinkDetails = this.$details;
            CheckoutPayWithLinkSheetKt.m187InfoRow88mDfTA(c07c, numValueOf, null, strA01, CheckoutApprovalSharedKt.checkoutFormattedAmount(payWithLinkDetails.amount, payWithLinkDetails.currency), null, 0, C3cH.A0W(bfm).secondaryText, bfm, iA0d & 14, 50);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PayWithLinkDetails payWithLinkDetails) {
            super(3);
            this.$details = payWithLinkDetails;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$expiry), 2076027657);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$details), -2074830414);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$1$1(CardExpiry cardExpiry, PayWithLinkDetails payWithLinkDetails) {
        super(1);
        this.$expiry = cardExpiry;
        this.$details = payWithLinkDetails;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
