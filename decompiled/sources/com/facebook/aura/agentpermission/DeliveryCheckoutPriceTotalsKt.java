package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.gateway.DeliveryCheckoutMoney;
import com.facebook.aura.gateway.DeliveryCheckoutPriceItem;
import com.facebook.aura.gateway.DeliveryCheckoutPriceKind;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutPriceTotalsKt {
    public static final List<HatchAgentPermissionsRepository.CheckoutTotal> deliveryCheckoutTotals(List<DeliveryCheckoutPriceItem> list, DeliveryCheckoutMoney deliveryCheckoutMoney, BFM bfm, int i) {
        C7384Etj.A0Y(list, 0);
        C7384Etj.A0Y(deliveryCheckoutMoney, 1);
        bfm.AgE(-690269324);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (DeliveryCheckoutPriceItem deliveryCheckoutPriceItem : list) {
            arrayListA0i.add(new HatchAgentPermissionsRepository.CheckoutTotal(null, AbstractC2271BQs.A01(bfm, deliveryPriceLabelRes(deliveryCheckoutPriceItem.kind)), DeliveryCheckoutFormattingKt.deliveryCheckoutAmount(deliveryCheckoutPriceItem.money), null));
        }
        AnonymousClass001.A1D(bfm);
        return AbstractC0878AGe.A0Q(new HatchAgentPermissionsRepository.CheckoutTotal("total", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120099), DeliveryCheckoutFormattingKt.deliveryCheckoutAmount(deliveryCheckoutMoney), null), arrayListA0i);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryCheckoutPriceKind.values().length];
            try {
                AnonymousClass002.A13(DeliveryCheckoutPriceKind.DELIVERY_FARE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DeliveryCheckoutPriceKind.TAX, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DeliveryCheckoutPriceKind.FEE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(DeliveryCheckoutPriceKind.TIP, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int deliveryPriceLabelRes(DeliveryCheckoutPriceKind deliveryCheckoutPriceKind) {
        int iOrdinal = deliveryCheckoutPriceKind.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f1200ac;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f1200bb;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f1200ad;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f1200bd;
        }
        throw C3cG.A0q();
    }
}
