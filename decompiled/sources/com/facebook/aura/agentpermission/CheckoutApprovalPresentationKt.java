package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C0881AGi;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.agentpermission.CheckoutLegalPresentation;
import com.facebook.aura.gateway.CheckoutLodging;
import com.facebook.aura.gateway.CheckoutLodgingInstallment;
import com.facebook.aura.gateway.CheckoutLodgingMoney;
import com.facebook.aura.gateway.CheckoutLodgingPayment;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.hotels.HotelBookingModelsJsonKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class CheckoutApprovalPresentationKt {
    public static final Set<String> KNOWN_LODGING_TOTALS = BFI.A0H(new String[]{"total", "base_rate", HotelBookingModelsJsonKt.TAXES_AND_FEES_KIND, "pay_now", "expedia_collected_total", "due_at_property"});

    public static final String lodgingPriceLines$amount(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal) {
        if (checkoutTotal == null) {
            return null;
        }
        String str = checkoutTotal.amount;
        String str2 = checkoutTotal.currency;
        if (str2 == null) {
            str2 = shopifyCheckoutApproval.currency;
        }
        return C3cI.A0b(str, str2);
    }

    public static final LodgingPriceLine lodgingPriceLines$line(LodgingPriceLabel lodgingPriceLabel, String str, LodgingPriceStyle lodgingPriceStyle) {
        if (str == null || HotelCheckoutFormattingKt.isZeroAmount(str)) {
            return null;
        }
        return new LodgingPriceLine(lodgingPriceLabel, str, lodgingPriceStyle, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[PHI: r3
  0x0011: PHI (r3v4 java.util.List) = (r3v0 java.util.List), (r3v5 java.util.List) binds: [B:9:0x000f, B:7:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[PHI: r3
  0x0019: PHI (r3v1 java.util.List) = (r3v0 java.util.List), (r3v4 java.util.List), (r3v4 java.util.List) binds: [B:9:0x000f, B:11:0x0013, B:13:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.agentpermission.CheckoutSummaryPresentation lodgingSummary(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.CheckoutTotal> r18, java.lang.String r19, com.facebook.aura.gateway.CheckoutLodging r20) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutApprovalPresentationKt.lodgingSummary(java.util.List, java.lang.String, com.facebook.aura.gateway.CheckoutLodging):com.facebook.aura.agentpermission.CheckoutSummaryPresentation");
    }

    public static final CheckoutAmountPresentation lodgingSummary$row(String str, CheckoutAmountLabel checkoutAmountLabel, HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal, boolean z, List<CheckoutAmountPresentation> list) {
        String str2;
        if (checkoutTotal == null || (checkoutAmountLabel == CheckoutAmountLabel.PROVIDED && ((str2 = checkoutTotal.displayText) == null || C7BY.A0j(str2)))) {
            return null;
        }
        String str3 = checkoutTotal.displayText;
        String str4 = checkoutTotal.amount;
        String strTrimToNonEmpty = str4 != null ? CheckoutRowPrimitivesKt.trimToNonEmpty(str4) : null;
        String str5 = checkoutTotal.currency;
        if (str5 == null) {
            str5 = str;
        }
        return lodgingAmount(checkoutAmountLabel, str3, strTrimToNonEmpty, str5, z, list);
    }

    public static final CheckoutLegalPresentation merchantCheckoutLegalPresentation(String str, List<HatchAgentPermissionsRepository.CheckoutLegalLink> list) {
        C7384Etj.A0Y(list, 1);
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchAgentPermissionsRepository.CheckoutLegalLink checkoutLegalLink : list) {
            String strA0a = C3cI.A0a(checkoutLegalLink.label);
            String strA0a2 = C3cI.A0a(checkoutLegalLink.url);
            if (strA0a != null && strA0a2 != null) {
                arrayListA0h.add(new LegalLink(strA0a, strA0a2));
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new CheckoutLegalPresentation.Merchant(str, arrayListA0h);
    }

    public static final CheckoutPresentationKind presentationKind(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval) {
        C7384Etj.A0Y(shopifyCheckoutApproval, 0);
        return "expedia".equals(shopifyCheckoutApproval.checkoutProvider) ? CheckoutPresentationKind.LODGING : CheckoutPresentationKind.RETAIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[PHI: r5
  0x0087: PHI (r5v15 java.lang.String) = (r5v14 java.lang.String), (r5v17 java.lang.String) binds: [B:40:0x0082, B:42:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.agentpermission.CheckoutApprovalPresentation toCheckoutPresentation(com.facebook.aura.gateway.HatchAgentPermissionsRepository.ShopifyCheckoutApproval r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutApprovalPresentationKt.toCheckoutPresentation(com.facebook.aura.gateway.HatchAgentPermissionsRepository$ShopifyCheckoutApproval, java.lang.String):com.facebook.aura.agentpermission.CheckoutApprovalPresentation");
    }

    public static final CheckoutSummaryPresentation toCheckoutSummaryPresentation(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval) {
        C7384Etj.A0Y(shopifyCheckoutApproval, 0);
        return presentationKind(shopifyCheckoutApproval) == CheckoutPresentationKind.LODGING ? lodgingSummary(shopifyCheckoutApproval.totals, shopifyCheckoutApproval.currency, shopifyCheckoutApproval.lodging) : retailCheckoutSummary(shopifyCheckoutApproval.totals);
    }

    public static final String kind(HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal) {
        String strA0l;
        String str = checkoutTotal.type;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        return strA0l.toLowerCase(locale);
    }

    public static final CheckoutLegalPresentation legalPresentation(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, CheckoutPresentationKind checkoutPresentationKind) {
        String strTrimToNonEmpty;
        HatchAgentPermissionsRepository.CheckoutLegalLink next;
        HatchAgentPermissionsRepository.CheckoutLegalLink next2;
        HatchAgentPermissionsRepository.CheckoutLegalLink next3;
        String str;
        String str2;
        String str3;
        if (checkoutPresentationKind == CheckoutPresentationKind.LODGING) {
            Iterator<HatchAgentPermissionsRepository.CheckoutLegalLink> it = shopifyCheckoutApproval.legalLinks.iterator();
            while (true) {
                strTrimToNonEmpty = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.role == HatchAgentPermissionsRepository.CheckoutLegalLinkRole.PRIVACY_STATEMENT) {
                    break;
                }
            }
            HatchAgentPermissionsRepository.CheckoutLegalLink checkoutLegalLink = next;
            String strTrimToNonEmpty2 = (checkoutLegalLink == null || (str3 = checkoutLegalLink.url) == null) ? null : CheckoutRowPrimitivesKt.trimToNonEmpty(str3);
            Iterator<HatchAgentPermissionsRepository.CheckoutLegalLink> it2 = shopifyCheckoutApproval.legalLinks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (next2.role == HatchAgentPermissionsRepository.CheckoutLegalLinkRole.TERMS_OF_SERVICE) {
                    break;
                }
            }
            HatchAgentPermissionsRepository.CheckoutLegalLink checkoutLegalLink2 = next2;
            String strTrimToNonEmpty3 = (checkoutLegalLink2 == null || (str2 = checkoutLegalLink2.url) == null) ? null : CheckoutRowPrimitivesKt.trimToNonEmpty(str2);
            Iterator<HatchAgentPermissionsRepository.CheckoutLegalLink> it3 = shopifyCheckoutApproval.legalLinks.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (next3.role == HatchAgentPermissionsRepository.CheckoutLegalLinkRole.PROPERTY_DETAILS_AND_RESTRICTIONS) {
                    break;
                }
            }
            HatchAgentPermissionsRepository.CheckoutLegalLink checkoutLegalLink3 = next3;
            if (checkoutLegalLink3 != null && (str = checkoutLegalLink3.url) != null) {
                strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str);
            }
            if (strTrimToNonEmpty2 != null && strTrimToNonEmpty3 != null && strTrimToNonEmpty != null) {
                return new CheckoutLegalPresentation.Booking(strTrimToNonEmpty2, strTrimToNonEmpty3, strTrimToNonEmpty);
            }
        }
        return merchantCheckoutLegalPresentation(shopifyCheckoutApproval.getMerchantDisplayName(), shopifyCheckoutApproval.legalLinks);
    }

    public static final CheckoutAmountPresentation lodgingAmount(CheckoutAmountLabel checkoutAmountLabel, String str, String str2, String str3, boolean z, List<CheckoutAmountPresentation> list) {
        return new CheckoutAmountPresentation(checkoutAmountLabel, str, str2, str3, AnonymousClass002.A1Z(checkoutAmountLabel, CheckoutAmountLabel.STAY_TOTAL), CheckoutAmountLayout.WRAPPING, true, z, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[PHI: r3
  0x0031: PHI (r3v8 java.util.List) = (r3v0 java.util.List), (r3v9 java.util.List) binds: [B:18:0x002f, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[PHI: r3
  0x0093: PHI (r3v1 java.util.List) = (r3v0 java.util.List), (r3v8 java.util.List), (r3v8 java.util.List) binds: [B:18:0x002f, B:20:0x0033, B:22:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.agentpermission.LodgingPriceLine> lodgingPriceLines(com.facebook.aura.gateway.HatchAgentPermissionsRepository.ShopifyCheckoutApproval r11) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutApprovalPresentationKt.lodgingPriceLines(com.facebook.aura.gateway.HatchAgentPermissionsRepository$ShopifyCheckoutApproval):java.util.List");
    }

    public static final HatchAgentPermissionsRepository.CheckoutTotal lodgingPriceLines$first(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, String str) {
        HatchAgentPermissionsRepository.CheckoutTotal next;
        Iterator<HatchAgentPermissionsRepository.CheckoutTotal> it = shopifyCheckoutApproval.totals.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(kind(next), str)) {
                break;
            }
        }
        return next;
    }

    public static final CheckoutAmountPresentation retailCheckoutSummary$row(HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal) {
        String strA0l;
        CheckoutAmountLabel checkoutAmountLabel = CheckoutAmountLabel.PROVIDED;
        String str = checkoutTotal.displayText;
        String str2 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && !C7BY.A0j(strA0l)) {
            str2 = strA0l;
        }
        return new CheckoutAmountPresentation(checkoutAmountLabel, str2, CheckoutApprovalSharedKt.checkoutFormattedAmount(checkoutTotal.amount, checkoutTotal.currency), checkoutTotal.currency, "total".equals(kind(checkoutTotal)), CheckoutAmountLayout.SUMMARY, false, false, C0881AGi.A00);
    }

    public static /* synthetic */ CheckoutAmountPresentation lodgingAmount$default(CheckoutAmountLabel checkoutAmountLabel, String str, String str2, String str3, boolean z, List list, int i, Object obj) {
        String strA0s = AnonymousClass006.A0s(i, str);
        boolean zA1Q = AnonymousClass005.A1Q(i, z);
        if ((i & 32) != 0) {
            list = C0881AGi.A00;
        }
        return lodgingAmount(checkoutAmountLabel, strA0s, str2, str3, zA1Q, list);
    }

    public static final CheckoutAmountPresentation lodgingSummary$dueAtPropertyRow(List<CheckoutLodgingInstallment> list, CheckoutLodging checkoutLodging, List<HatchAgentPermissionsRepository.CheckoutTotal> list2, String str, CheckoutAmountLabel checkoutAmountLabel, boolean z) {
        CheckoutLodgingPayment checkoutLodgingPayment;
        CheckoutLodgingMoney checkoutLodgingMoney;
        if (list.isEmpty()) {
            return lodgingSummary$row(str, checkoutAmountLabel, lodgingSummary$first(list2, "due_at_property"), z, C0881AGi.A00);
        }
        if (checkoutLodging == null || (checkoutLodgingPayment = checkoutLodging.payment) == null || (checkoutLodgingMoney = checkoutLodgingPayment.dueAtProperty) == null) {
            return null;
        }
        return lodgingAmount(checkoutAmountLabel, null, C3cI.A0b(checkoutLodgingMoney.amount, checkoutLodgingMoney.currency), checkoutLodgingMoney.currency, z, C0881AGi.A00);
    }

    public static final HatchAgentPermissionsRepository.CheckoutTotal lodgingSummary$first(List<HatchAgentPermissionsRepository.CheckoutTotal> list, String str) {
        HatchAgentPermissionsRepository.CheckoutTotal next;
        Iterator<HatchAgentPermissionsRepository.CheckoutTotal> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(kind(next), str)) {
                break;
            }
        }
        return next;
    }

    public static /* synthetic */ CheckoutAmountPresentation lodgingSummary$row$default(String str, CheckoutAmountLabel checkoutAmountLabel, HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal, boolean z, List list, int i, Object obj) {
        boolean zA1P = AnonymousClass005.A1P(i, z);
        if ((i & 16) != 0) {
            list = C0881AGi.A00;
        }
        return lodgingSummary$row(str, checkoutAmountLabel, checkoutTotal, zA1P, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    public static final CheckoutSummaryPresentation retailCheckoutSummary(List<HatchAgentPermissionsRepository.CheckoutTotal> list) {
        ArrayList arrayListA0d;
        ArrayList arrayListA0y = C3cI.A0y(list);
        for (HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal : list) {
            if (CheckoutRowPrimitivesKt.isRenderable(checkoutTotal)) {
                arrayListA0y.add(checkoutTotal);
            }
        }
        HatchAgentPermissionsRepository.CheckoutTotal checkoutTotal2 = (HatchAgentPermissionsRepository.CheckoutTotal) AbstractC0878AGe.A0I(arrayListA0y);
        if (checkoutTotal2 == null || arrayListA0y.size() <= 1 || !"total".equals(kind(checkoutTotal2))) {
            checkoutTotal2 = null;
            arrayListA0d = arrayListA0y;
        } else {
            arrayListA0d = AbstractC0878AGe.A0d(arrayListA0y, 1);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        if (!arrayListA0d.isEmpty()) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0d);
            Iterator it = arrayListA0d.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(retailCheckoutSummary$row((HatchAgentPermissionsRepository.CheckoutTotal) it.next()));
            }
            arrayListA0h.add(arrayListA0i);
        }
        if (checkoutTotal2 != null) {
            arrayListA0h.add(Collections.singletonList(retailCheckoutSummary$row(checkoutTotal2)));
        }
        return new CheckoutSummaryPresentation(CheckoutPresentationKind.RETAIL, arrayListA0h, null);
    }
}
