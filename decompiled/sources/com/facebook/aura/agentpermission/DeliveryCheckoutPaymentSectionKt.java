package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C3U4;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.DeliveryCheckoutPayment;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class DeliveryCheckoutPaymentSectionKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutPaymentSectionKt$DeliveryCheckoutPaymentSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ DeliveryCheckoutPayment $payment;
        public final /* synthetic */ String $providerName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DeliveryCheckoutPayment deliveryCheckoutPayment, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$payment = deliveryCheckoutPayment;
            this.$providerName = str;
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
            DeliveryCheckoutPaymentSectionKt.DeliveryCheckoutPaymentSection(this.$payment, this.$providerName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DeliveryCheckoutPaymentSection(DeliveryCheckoutPayment deliveryCheckoutPayment, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(deliveryCheckoutPayment, str);
        bfm.AgG(77592812);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(deliveryCheckoutPayment, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            if (deliveryCheckoutPayment.savedFromProvider) {
                bfm.AgE(107516703);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f1200ae), C3U4.A07(BRg.A00, AuraDimensKt.SpacingMedium), C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(107873420);
            }
            BBI.A0R(bbi, false);
            CheckoutRowPrimitivesKt.CheckoutIconRow(R.drawable.credit_card_outline_24, CheckoutApprovalSharedKt.checkoutPaymentMethodLabel(deliveryCheckoutPayment.displayName, deliveryCheckoutPayment.cardLast4, bfm, 0), null, C1b8.A01(C11U.A03(BRg.A00, CheckoutRowPrimitivesKt.CheckoutSectionShape), AnonymousClass002.A0c(bfm).secondaryButtonBackground), null, null, bfm, 384, 48);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(deliveryCheckoutPayment, str, bRg2, i, i2);
        }
    }
}
