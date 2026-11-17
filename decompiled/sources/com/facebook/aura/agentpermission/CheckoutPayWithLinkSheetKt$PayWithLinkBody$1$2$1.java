package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.B1U;
import X.B1V;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ PayWithLinkDetails $details;

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ PayWithLinkDetails $details;

        /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00231 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ PayWithLinkDetails $details;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(PayWithLinkDetails payWithLinkDetails) {
                super(2);
                this.$details = payWithLinkDetails;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    CheckoutApprovalSharedKt.PaymentCardBrandLogo(this.$details.cardBrand, null, bfm, 0, 2);
                } else {
                    bfm.Afo();
                }
            }
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            B1U b1uA00 = B1V.A00(bfm, new C00231(this.$details), 1122621725);
            PayWithLinkDetails payWithLinkDetails = this.$details;
            String strCheckoutPaymentMethodLabel = CheckoutApprovalSharedKt.checkoutPaymentMethodLabel(payWithLinkDetails.paymentMethodLabel, payWithLinkDetails.cardLast4, bfm, 0);
            if (strCheckoutPaymentMethodLabel == null) {
                strCheckoutPaymentMethodLabel = "";
            }
            CheckoutPayWithLinkSheetKt.m187InfoRow88mDfTA(c07c, null, b1uA00, strCheckoutPaymentMethodLabel, null, null, 2, 0L, bfm, (iA0d & 14) | 1597824, 81);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PayWithLinkDetails payWithLinkDetails) {
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
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$details), -137609763);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$2$1(PayWithLinkDetails payWithLinkDetails) {
        super(1);
        this.$details = payWithLinkDetails;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
