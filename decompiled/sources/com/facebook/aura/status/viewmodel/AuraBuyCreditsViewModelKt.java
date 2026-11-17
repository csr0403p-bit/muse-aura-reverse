package com.facebook.aura.status.viewmodel;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC2258BHp;
import X.AnonymousClass003;
import X.C06827l3;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.iap.HatchTierPrice;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.subscription.repo.CurrencyAmount;
import com.facebook.aura.subscription.repo.TopUpPack;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AuraBuyCreditsViewModelKt {
    public static final long PLAY_PRICE_TIMEOUT_MS = 5000;
    public static final String TAG = "AuraBuyCreditsViewModel";
    public static final C06827l3 ZERO_CENTS_SUFFIX = C06827l3.A02("[.,]00(?=\\D*$)");

    public static final AuraBuyCreditsViewModel.PurchaseAction resolveTopUpPurchaseAction(CreditProduct creditProduct) {
        if (creditProduct == null) {
            return null;
        }
        return new AuraBuyCreditsViewModel.PurchaseAction(creditProduct.id, creditProduct.dcpProductId, creditProduct.productType);
    }

    public static final AHD<CreditProduct> toCreditProducts(List<TopUpPack> list, Map<String, PlayPackPrice> map) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        List<TopUpPack> listA0c = AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModelKt$toCreditProducts$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((TopUpPack) t).creditAmount).compareTo(Integer.valueOf(((TopUpPack) t2).creditAmount));
            }
        });
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
        for (TopUpPack topUpPack : listA0c) {
            String str = topUpPack.playProductId;
            C7384Etj.A0Y(map, 0);
            PlayPackPrice playPackPrice = (PlayPackPrice) AbstractC2258BHp.A0L(str, map);
            String str2 = playPackPrice.format();
            String str3 = topUpPack.playProductId;
            String str4 = topUpPack.dcpProductId;
            String str5 = numberInstance.format(Integer.valueOf(topUpPack.creditAmount));
            C7384Etj.A0U(str5);
            arrayListA0i.add(new CreditProduct(str3, str4, str2, str5, playPackPrice.forAnalytics(), str2, new CurrencyAmount(playPackPrice.currency.getCurrencyCode(), Integer.valueOf(playPackPrice.amountInHundredths)), topUpPack.productType, topUpPack.rowSubtitle));
        }
        return AGI.A07(arrayListA0i);
    }

    public static final PlayPackPrice toPlayPackPrice(HatchTierPrice hatchTierPrice) {
        Object objA0s;
        Integer num = hatchTierPrice.amountInHundredths;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        String str = hatchTierPrice.currencyCode;
        if (str == null) {
            return null;
        }
        try {
            objA0s = Currency.getInstance(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Currency currency = (Currency) objA0s;
        if (currency != null) {
            return new PlayPackPrice(hatchTierPrice.formattedPrice, iIntValue, currency);
        }
        return null;
    }
}
