package com.facebook.aura.shopping.viewmodel;

import X.A3q;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHG;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BGK;
import X.BLW;
import X.C0881AGi;
import X.C27k;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C7462Ewq;
import X.C8j5;
import X.C9jH;
import X.C9tJ;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.InterfaceC0962AJp;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.shopping.model.PdpAction;
import com.facebook.aura.shopping.model.PdpActionIntent;
import com.facebook.aura.shopping.model.PdpCouponPrice;
import com.facebook.aura.shopping.model.PdpHeader;
import com.facebook.aura.shopping.model.PdpImage;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.PdpProductInfo;
import com.facebook.aura.shopping.model.PdpVariantDimensionKind;
import com.facebook.aura.shopping.model.PdpVariantGroup;
import com.facebook.aura.shopping.model.PdpVariantOption;
import com.facebook.aura.shopping.model.PdpVariantPricing;
import com.facebook.aura.shopping.model.PdpVariantSwatch;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingCouponPriceKey;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingPrimaryAction;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.repo.ProductDetailsActionButton;
import com.facebook.aura.shopping.viewmodel.MC;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCouponTag;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public abstract class ShoppingProductDetailsViewModelKt {
    public static final long RENDER_BUDGET_MS = 8000;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(ShoppingProductDetailsViewModelKt.class, "shoppingResultPdpBuyButtonEnabled", "getShoppingResultPdpBuyButtonEnabled()Z", 1), new C7462Ewq(ShoppingProductDetailsViewModelKt.class, "shoppingResultPdpBuyButtonForBrowserEnabled", "getShoppingResultPdpBuyButtonForBrowserEnabled()Z", 1), new C7462Ewq(ShoppingProductDetailsViewModelKt.class, "shoppingResultPdpBuyButtonImageColorEnabled", "getShoppingResultPdpBuyButtonImageColorEnabled()Z", 1)};
    public static final C31u shoppingResultPdpBuyButtonEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp_buy_button);
    public static final C31u shoppingResultPdpBuyButtonForBrowserEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp_buy_button_for_browser);
    public static final C31u shoppingResultPdpBuyButtonImageColorEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_shopping.enable_pdp_buy_button_image_color);

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModelKt$awaitWithin$2", f = "ShoppingProductDetailsViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModelKt$awaitWithin$2, reason: invalid class name */
    public final class AnonymousClass2<T> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super T>, Object> {
        public final /* synthetic */ C27k<T> $deferred;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C27k<? extends T> c27k, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$deferred = c27k;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$deferred, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super T> htJ) {
            return new AnonymousClass2(this.$deferred, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C27k<T> c27k = this.$deferred;
                this.label = 1;
                obj = C3cG.A0W(c27k, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    public static final ShoppingProductDetailsPriceRow pendingPriceRow(ProductDetailsPresentation productDetailsPresentation, PdpCouponPrice pdpCouponPrice, String str) {
        if (pdpCouponPrice != null) {
            return new ShoppingProductDetailsPriceRow(pdpCouponPrice.price, pdpCouponPrice.originalPrice, null, couponTag(pdpCouponPrice));
        }
        PdpPrice pdpPriceEffectiveCurrentPrice = productDetailsPresentation.effectiveCurrentPrice(str);
        if (pdpPriceEffectiveCurrentPrice != null) {
            return new ShoppingProductDetailsPriceRow(pdpPriceEffectiveCurrentPrice, productDetailsPresentation.effectiveOriginalPrice(str), productDetailsPresentation.effectivePricePercentOff(str), null);
        }
        return null;
    }

    public static final ShoppingProductDetailsCouponTag couponTag(PdpCouponPrice pdpCouponPrice) {
        BigDecimal bigDecimalA0x;
        String price;
        Double d = pdpCouponPrice.percentOff;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            NumberFormat percentInstance = NumberFormat.getPercentInstance(Locale.getDefault());
            percentInstance.setMaximumFractionDigits(2);
            price = percentInstance.format((-dDoubleValue) / 100.0d);
            C7384Etj.A0U(price);
        } else {
            PdpPrice pdpPrice = pdpCouponPrice.savings;
            if (pdpPrice == null || (bigDecimalA0x = C9tJ.A0x(pdpPrice.value)) == null) {
                return null;
            }
            String plainString = bigDecimalA0x.negate().toPlainString();
            C7384Etj.A0U(plainString);
            price = ProductDetailsPresentationKt.formatPrice(new PdpPrice(plainString, pdpPrice.currency), C60Q.A0w());
        }
        return new ShoppingProductDetailsCouponTag.Discount(price);
    }

    public static final String getDisplayedProductId(ShoppingProductDetailsUiState shoppingProductDetailsUiState) {
        String str = shoppingProductDetailsUiState.display.displayProductId;
        return str == null ? shoppingProductDetailsUiState.presentation.productId : str;
    }

    public static final boolean getShoppingResultPdpBuyButtonEnabled() {
        return AnonymousClass001.A1X(C31u.A00(shoppingResultPdpBuyButtonEnabled$delegate, $$delegatedProperties));
    }

    public static final boolean getShoppingResultPdpBuyButtonForBrowserEnabled() {
        return AnonymousClass001.A1X(shoppingResultPdpBuyButtonForBrowserEnabled$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final boolean getShoppingResultPdpBuyButtonImageColorEnabled() {
        return AnonymousClass001.A1X(shoppingResultPdpBuyButtonImageColorEnabled$delegate.getValue(null, $$delegatedProperties[2]));
    }

    public static final boolean isPrimaryCta(PdpActionIntent pdpActionIntent) {
        return (pdpActionIntent instanceof PdpActionIntent.BuyNow) || (pdpActionIntent instanceof PdpActionIntent.AddToCart);
    }

    public static final boolean isValidatedOnline(AuraNetworkState auraNetworkState) {
        return (auraNetworkState instanceof AuraNetworkState.Online) && ((AuraNetworkState.Online) auraNetworkState).isValidated;
    }

    public static final ProductDetailsPresentation placeholderPresentation(String str, PdpHeader pdpHeader, ShoppingProductType shoppingProductType, boolean z, String str2, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction) {
        int i = PdpProductInfo.$stable;
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        C0881AGi c0881AGi = C0881AGi.A00;
        PdpProductInfo pdpProductInfo = new PdpProductInfo("", null, strTrimToNonEmpty, null, null, null, null, c0881AGi);
        A3q a3q = A3q.A00;
        C9jH c9jH = C9jH.A00;
        return new ProductDetailsPresentation(str, pdpHeader, pdpProductInfo, null, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, shoppingProductType, z, shoppingPrimaryAction, shoppingSecondaryAction, null, c0881AGi, c0881AGi, null, null, null, null, null, null, null, c0881AGi, a3q, c9jH, false, c9jH, a3q, null);
    }

    public static final Set<ProductDetailsActionButton> renderedActionButtons(List<PdpAction> list) {
        boolean z;
        boolean z2;
        boolean z3 = list instanceof Collection;
        if (z3 && list.isEmpty()) {
            z = false;
        } else {
            Iterator<PdpAction> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().intent instanceof PdpActionIntent.BuyNow) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z3 && list.isEmpty()) {
            z2 = false;
        } else {
            Iterator<PdpAction> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().followsProductWebsite) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        ProductDetailsActionButton productDetailsActionButton = ProductDetailsActionButton.BUY;
        if (!z) {
            productDetailsActionButton = null;
        }
        return BLW.A05(productDetailsActionButton, z2 ? ProductDetailsActionButton.WEBSITE : null);
    }

    public static final ProductDetailsPresentation retainingLiveOwnCouponPrices(ProductDetailsPresentation productDetailsPresentation, ProductDetailsPresentation productDetailsPresentation2, double d) {
        Set<String> set = productDetailsPresentation2.ownCouponPriceIds;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : set) {
            if (!C7384Etj.areEqual(str, productDetailsPresentation.productId)) {
                arrayListA0h.add(str);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            PdpCouponPrice pdpCouponPrice = productDetailsPresentation2.couponPrices.get(obj);
            if (pdpCouponPrice != null && pdpCouponPrice.expiresAt > d) {
                AnonymousClass002.A1J(obj, pdpCouponPrice, arrayListA0h2);
            }
        }
        Map mapA06 = AGH.A06(arrayListA0h2);
        if (mapA06.isEmpty()) {
            return productDetailsPresentation;
        }
        return ProductDetailsPresentation.copy$default(productDetailsPresentation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, AGH.A02(productDetailsPresentation.couponPrices, mapA06), BGK.A01(mapA06.keySet(), productDetailsPresentation.ownCouponPriceIds), null, 1342177279, null);
    }

    public static /* synthetic */ ProductDetailsPresentation retainingLiveOwnCouponPrices$default(ProductDetailsPresentation productDetailsPresentation, ProductDetailsPresentation productDetailsPresentation2, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = C8j5.A00();
        }
        return retainingLiveOwnCouponPrices(productDetailsPresentation, productDetailsPresentation2, d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[PHI: r13
  0x0126: PHI (r13v2 com.facebook.aura.shopping.model.PdpPrice) = (r13v0 com.facebook.aura.shopping.model.PdpPrice), (r13v3 com.facebook.aura.shopping.model.PdpPrice) binds: [B:39:0x0090, B:37:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsDisplayState toDisplayState(com.facebook.aura.shopping.model.ProductDetailsPresentation r26, java.util.Map<java.lang.String, java.lang.String> r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, java.util.Set<java.lang.String> r32, java.util.Set<java.lang.String> r33, java.util.Set<java.lang.String> r34, boolean r35, com.facebook.aura.shopping.model.ShoppingCouponPrices r36, java.lang.String r37, double r38) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModelKt.toDisplayState(com.facebook.aura.shopping.model.ProductDetailsPresentation, java.util.Map, java.lang.String, boolean, boolean, boolean, java.util.Set, java.util.Set, java.util.Set, boolean, com.facebook.aura.shopping.model.ShoppingCouponPrices, java.lang.String, double):com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsDisplayState");
    }

    public static /* synthetic */ ShoppingProductDetailsDisplayState toDisplayState$default(ProductDetailsPresentation productDetailsPresentation, Map map, String str, boolean z, boolean z2, boolean z3, Set set, Set set2, Set set3, boolean z4, ShoppingCouponPrices shoppingCouponPrices, String str2, double d, int i, Object obj) {
        boolean zA1K = C3cG.A1K(i & 4, z);
        boolean zA1K2 = C3cG.A1K(i & 8, z2);
        boolean zA1S = C3cI.A1S(i, z3);
        if ((i & 32) != 0) {
            set = A3q.A00;
        }
        if ((i & 64) != 0) {
            set2 = A3q.A00;
        }
        if ((i & 128) != 0) {
            set3 = A3q.A00;
        }
        boolean zA1K3 = C3cG.A1K(i & 256, z4);
        if ((i & 512) != 0) {
            shoppingCouponPrices = new ShoppingCouponPrices(C9jH.A00);
        }
        if ((i & 1024) != 0) {
            str2 = null;
        }
        if ((i & 2048) != 0) {
            d = C8j5.A00();
        }
        return toDisplayState(productDetailsPresentation, map, str, zA1K, zA1K2, zA1S, set, set2, set3, zA1K3, shoppingCouponPrices, str2, d);
    }

    public static final ProductDetailsPresentation withVariantRecord(ProductDetailsPresentation productDetailsPresentation, String str, ProductDetailsPresentation productDetailsPresentation2) {
        ProductDetailsPresentation productDetailsPresentationWithVariantDetails = productDetailsPresentation.withVariantDetails(str, productDetailsPresentation2.product);
        if (!C7384Etj.areEqual(productDetailsPresentation2.productId, str)) {
            return productDetailsPresentationWithVariantDetails;
        }
        PdpCouponPrice pdpCouponPrice = productDetailsPresentation2.couponPrices.get(str);
        Map<String, PdpCouponPrice> map = productDetailsPresentationWithVariantDetails.couponPrices;
        Map mapA11 = pdpCouponPrice != null ? AnonymousClass006.A11(str, pdpCouponPrice, map) : AGH.A09(str, map);
        Set<String> set = productDetailsPresentationWithVariantDetails.ownCouponPriceIds;
        Set setA02 = pdpCouponPrice != null ? BGK.A02(str, set) : BGK.A04(str, set);
        List<PdpVariantPricing> list = productDetailsPresentationWithVariantDetails.variantPricing;
        ArrayList arrayListA0h = C3cG.A0h();
        for (PdpVariantPricing pdpVariantPricing : list) {
            AnonymousClass006.A1O(pdpVariantPricing.productId, str, pdpVariantPricing, arrayListA0h);
        }
        PdpProductInfo pdpProductInfo = productDetailsPresentation2.product;
        return ProductDetailsPresentation.copy$default(productDetailsPresentationWithVariantDetails, null, null, null, null, null, null, AbstractC0878AGe.A0Q(new PdpVariantPricing(str, pdpProductInfo.currentPrice, pdpProductInfo.originalPrice, pdpProductInfo.pricePercentOff), arrayListA0h), null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, mapA11, setA02, null, 1342177215, null);
    }

    public static final ShoppingProductDetailsUiState withVariants(ShoppingProductDetailsUiState shoppingProductDetailsUiState, ProductDetailsPresentation productDetailsPresentation, InterfaceC0962AJp<String, String> interfaceC0962AJp, boolean z, boolean z2, boolean z3, AHG<String> ahg, AHG<String> ahg2, AHG<String> ahg3, boolean z4, ShoppingCouponPrices shoppingCouponPrices, String str) {
        return ShoppingProductDetailsUiState.copy$default(shoppingProductDetailsUiState, productDetailsPresentation, toDisplayState$default(productDetailsPresentation, interfaceC0962AJp, shoppingProductDetailsUiState.display.leadingHeroImageUrl, z, z2, z3, ahg, ahg2, ahg3, z4, shoppingCouponPrices, str, 0.0d, 2048, null), interfaceC0962AJp, null, false, false, false, false, false, false, z4, null, z, z2, ahg, ahg2, ahg3, 3064, null);
    }

    public static /* synthetic */ ShoppingProductDetailsUiState withVariants$default(ShoppingProductDetailsUiState shoppingProductDetailsUiState, ProductDetailsPresentation productDetailsPresentation, InterfaceC0962AJp interfaceC0962AJp, boolean z, boolean z2, boolean z3, AHG ahg, AHG ahg2, AHG ahg3, boolean z4, ShoppingCouponPrices shoppingCouponPrices, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productDetailsPresentation = shoppingProductDetailsUiState.presentation;
        }
        if ((i & 2) != 0) {
            interfaceC0962AJp = shoppingProductDetailsUiState.selections;
        }
        if ((i & 4) != 0) {
            z = shoppingProductDetailsUiState.commercialContentPending;
        }
        if ((i & 8) != 0) {
            z2 = shoppingProductDetailsUiState.hydrationPending;
        }
        if ((i & 16) != 0) {
            z3 = shoppingProductDetailsUiState.display.galleryContentPending;
        }
        if ((i & 32) != 0) {
            ahg = shoppingProductDetailsUiState.refreshingPriceIds;
        }
        if ((i & 64) != 0) {
            ahg2 = shoppingProductDetailsUiState.unconfirmedPriceIds;
        }
        if ((i & 128) != 0) {
            ahg3 = shoppingProductDetailsUiState.unavailablePriceIds;
        }
        if ((i & 256) != 0) {
            z4 = shoppingProductDetailsUiState.hasHydrationFailure;
        }
        if ((i & 512) != 0) {
            shoppingCouponPrices = new ShoppingCouponPrices(C9jH.A00);
        }
        if ((i & 1024) != 0) {
            str = null;
        }
        return withVariants(shoppingProductDetailsUiState, productDetailsPresentation, interfaceC0962AJp, z, z2, z3, ahg, ahg2, ahg3, z4, shoppingCouponPrices, str);
    }

    public static final <T> Object awaitWithin(SelectionBudget selectionBudget, C27k<? extends T> c27k, HtJ<? super T> htJ) {
        long remainingMs = selectionBudget.getRemainingMs();
        if (remainingMs > 0) {
            return GAX.A01(htJ, new AnonymousClass2(c27k, null), remainingMs);
        }
        return null;
    }

    public static final PdpCouponPrice exactCouponPrice(ProductDetailsPresentation productDetailsPresentation, Map<String, String> map, String str, ShoppingCouponPrices shoppingCouponPrices, String str2) {
        String strResolvedProductId = productDetailsPresentation.resolvedProductId(map);
        if (strResolvedProductId == null) {
            strResolvedProductId = productDetailsPresentation.productId;
            if (!productDetailsPresentation.getRenderedVariantGroups().isEmpty()) {
                strResolvedProductId = null;
            }
        }
        if (C7384Etj.areEqual(strResolvedProductId, str)) {
            return shoppingCouponPrices.prices.get(new ShoppingCouponPriceKey(str, str2));
        }
        return null;
    }

    public static final boolean galleryChangesFor(ProductDetailsPresentation productDetailsPresentation, InterfaceC0962AJp<String, String> interfaceC0962AJp, List<String> list) {
        List<PdpImage> listEffectiveImages = productDetailsPresentation.effectiveImages(interfaceC0962AJp);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listEffectiveImages);
        Iterator<PdpImage> it = listEffectiveImages.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().url);
        }
        return !arrayListA0i.equals(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState toCtaState(java.util.List<com.facebook.aura.shopping.model.PdpAction> r9, com.facebook.aura.shopping.model.ShoppingProductType r10) {
        /*
            java.util.Iterator r1 = r9.iterator()
        L4:
            boolean r0 = r1.hasNext()
            r6 = 0
            if (r0 == 0) goto L6e
            java.lang.Object r4 = r1.next()
            r0 = r4
            com.facebook.aura.shopping.model.PdpAction r0 = (com.facebook.aura.shopping.model.PdpAction) r0
            com.facebook.aura.shopping.model.PdpActionIntent r0 = r0.intent
            boolean r0 = isPrimaryCta(r0)
            if (r0 == 0) goto L4
        L1a:
            com.facebook.aura.shopping.model.PdpAction r4 = (com.facebook.aura.shopping.model.PdpAction) r4
            if (r4 != 0) goto L4a
            r2 = r6
        L1f:
            r1 = r6
        L20:
            boolean r0 = r1 instanceof com.facebook.aura.shopping.model.PdpActionIntent.OpenUrl
            if (r0 == 0) goto L48
            com.facebook.aura.shopping.model.PdpActionIntent$OpenUrl r1 = (com.facebook.aura.shopping.model.PdpActionIntent.OpenUrl) r1
            if (r1 == 0) goto L48
            java.lang.String r5 = r1.url
        L2a:
            if (r2 == 0) goto L2e
            java.lang.String r6 = r2.label
        L2e:
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r1 = r9.iterator()
        L36:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.next()
            if (r0 == r4) goto L36
            if (r0 == r2) goto L36
            r3.add(r0)
            goto L36
        L48:
            r5 = r6
            goto L2a
        L4a:
            java.util.Iterator r3 = r9.iterator()
        L4e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebook.aura.shopping.model.PdpAction r1 = (com.facebook.aura.shopping.model.PdpAction) r1
            boolean r0 = r1.followsProductWebsite
            if (r0 == 0) goto L4e
            com.facebook.aura.shopping.model.PdpActionIntent r0 = r1.intent
            boolean r0 = r0 instanceof com.facebook.aura.shopping.model.PdpActionIntent.OpenUrl
            if (r0 == 0) goto L4e
        L65:
            com.facebook.aura.shopping.model.PdpAction r2 = (com.facebook.aura.shopping.model.PdpAction) r2
            if (r2 == 0) goto L1f
            com.facebook.aura.shopping.model.PdpActionIntent r1 = r2.intent
            goto L20
        L6c:
            r2 = r6
            goto L65
        L6e:
            r4 = r6
            goto L1a
        L70:
            X.AHD r7 = X.AGI.A07(r3)
            com.facebook.aura.shopping.model.ShoppingProductType r0 = com.facebook.aura.shopping.model.ShoppingProductType.MARKETPLACE
            if (r10 == r0) goto L7b
            r8 = 0
            if (r4 != 0) goto L7c
        L7b:
            r8 = 1
        L7c:
            boolean r0 = r9.isEmpty()
            r9 = r0 ^ 1
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState r3 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModelKt.toCtaState(java.util.List, com.facebook.aura.shopping.model.ShoppingProductType):com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState");
    }

    public static final ShoppingProductDetailsVariantGroupState toVariantGroupState(ProductDetailsPresentation productDetailsPresentation, PdpVariantGroup pdpVariantGroup, Map<String, String> map) {
        Map<String, PdpVariantSwatch> mapColorSwatches = pdpVariantGroup.getKind() == PdpVariantDimensionKind.COLOR ? productDetailsPresentation.colorSwatches() : null;
        String str = pdpVariantGroup.dimension;
        String str2 = pdpVariantGroup.displayName;
        PdpVariantDimensionKind kind = pdpVariantGroup.getKind();
        List<PdpVariantOption> list = pdpVariantGroup.options;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (PdpVariantOption pdpVariantOption : list) {
            String str3 = pdpVariantOption.id;
            arrayListA0i.add(new ShoppingProductDetailsVariantOptionState(str3, pdpVariantOption.label, mapColorSwatches != null ? mapColorSwatches.get(str3) : null));
        }
        AHD ahdA07 = AGI.A07(arrayListA0i);
        String str4 = map.get(pdpVariantGroup.dimension);
        List<PdpVariantOption> list2 = pdpVariantGroup.options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<PdpVariantOption> it = list2.iterator();
        while (it.hasNext()) {
            String str5 = it.next().id;
            if (productDetailsPresentation.isOptionAvailable(pdpVariantGroup.dimension, str5, map) && str5 != null) {
                arrayListA0h.add(str5);
            }
        }
        return new ShoppingProductDetailsVariantGroupState(str, str2, kind, ahdA07, str4, AGI.A09(arrayListA0h));
    }
}
