package com.facebook.aura.shopping.repo;

import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFI;
import X.C31u;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7462Ewq;
import X.C8j3;
import X.Ey9;
import X.HxE;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.repo.MC;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class HatchProductDetailsHydrationKt {
    public static final String BROWSER_PRODUCT_DETAILS_REQUEST_TYPE = "browser_product_details";
    public static final String LISTING_DETAILS_REQUEST_TYPE = "listing_details";
    public static final String PDP_V1_VERSION = "pdp_v1";
    public static final String PRODUCT_DETAILS_REQUEST_TYPE = "product_details";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchProductDetailsHydrationKt.class, "marketplaceHydrationEnabled", "getMarketplaceHydrationEnabled()Z", 1), new C7462Ewq(HatchProductDetailsHydrationKt.class, "marketplaceEnrichmentEnabled", "getMarketplaceEnrichmentEnabled()Z", 1)};
    public static final C31u marketplaceHydrationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp_marketplace_hydration);
    public static final C31u marketplaceEnrichmentEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp_marketplace_enrichment);

    public static final String getDetailsRequestType(ShoppingProductType shoppingProductType) {
        C7384Etj.A0Y(shoppingProductType, 0);
        String hydratableRequestType = getHydratableRequestType(shoppingProductType);
        if (hydratableRequestType == null || (hydratableRequestType.equals(LISTING_DETAILS_REQUEST_TYPE) && !getMarketplaceHydrationEnabled())) {
            return null;
        }
        return hydratableRequestType;
    }

    public static final boolean getHydratesDetails(ProductDetailsHydrationTarget productDetailsHydrationTarget) {
        C7384Etj.A0Y(productDetailsHydrationTarget, 0);
        return (productDetailsHydrationTarget.connectorId == null && productDetailsHydrationTarget.productType == ShoppingProductType.BROWSER) ? false : true;
    }

    public static final ProductDetailsHydrationTarget getHydrationTarget(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.productId);
        if (strTrimToNonEmpty != null) {
            if (shoppingResultProduct.provider != null) {
                String productDetailsConnectorId = ShoppingResultsPresentationKt.getProductDetailsConnectorId(shoppingResultProduct);
                if (productDetailsConnectorId != null) {
                    return new ProductDetailsHydrationTarget(strTrimToNonEmpty, shoppingResultProduct.type, null, null, productDetailsConnectorId);
                }
            } else if (getHydratableRequestType(shoppingResultProduct.type) != null) {
                return new ProductDetailsHydrationTarget(strTrimToNonEmpty, shoppingResultProduct.type, ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.priceCurrency), null, null);
            }
        }
        return null;
    }

    public static final ProductDetailsHydrationTarget getPrefetchTarget(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        ProductDetailsHydrationTarget hydrationTarget = getHydrationTarget(shoppingResultProduct);
        if (hydrationTarget != null && hydrationTarget.connectorId == null && hydrationTarget.productType == ShoppingProductType.MARKETPLACE) {
            return hydrationTarget;
        }
        return null;
    }

    public static final boolean isCatalog(ProductDetailsHydrationTarget productDetailsHydrationTarget) {
        C7384Etj.A0Y(productDetailsHydrationTarget, 0);
        return productDetailsHydrationTarget.connectorId == null && productDetailsHydrationTarget.productType == ShoppingProductType.CATALOG;
    }

    public static final ProductDetailsHydrationTarget shoppingProductDetailsHydrationTarget(ShoppingProductType shoppingProductType, String str, String str2, String str3, String str4, String str5) {
        C7384Etj.A0Y(shoppingProductType, 0);
        if (str5 != null) {
            String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
            if (strTrimToNonEmpty != null) {
                return new ProductDetailsHydrationTarget(strTrimToNonEmpty, shoppingProductType, null, str3, str5);
            }
            return null;
        }
        if (shoppingProductType == ShoppingProductType.BROWSER) {
            str = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        }
        if (str != null) {
            ProductDetailsHydrationTarget productDetailsHydrationTarget = new ProductDetailsHydrationTarget(str, shoppingProductType, str4, str3, null);
            if (getDetailsRequestType(productDetailsHydrationTarget.productType) != null) {
                return productDetailsHydrationTarget;
            }
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingProductType.values().length];
            try {
                AnonymousClass002.A13(ShoppingProductType.CATALOG, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShoppingProductType.MARKETPLACE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ShoppingProductType.BROWSER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ShoppingProductType.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getHydratableRequestType(ShoppingProductType shoppingProductType) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingProductType.ordinal();
        if (iOrdinal == 0) {
            return PRODUCT_DETAILS_REQUEST_TYPE;
        }
        if (iOrdinal == 1) {
            return LISTING_DETAILS_REQUEST_TYPE;
        }
        if (iOrdinal == 2) {
            return BROWSER_PRODUCT_DETAILS_REQUEST_TYPE;
        }
        if (iOrdinal == 3) {
            return null;
        }
        throw C3cG.A0q();
    }

    public static final boolean getMarketplaceEnrichmentEnabled() {
        return AnonymousClass001.A1X(marketplaceEnrichmentEnabled$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final boolean getMarketplaceHydrationEnabled() {
        return AnonymousClass001.A1X(C31u.A00(marketplaceHydrationEnabled$delegate, $$delegatedProperties));
    }

    public static /* synthetic */ ProductDetailsHydrationTarget shoppingProductDetailsHydrationTarget$default(ShoppingProductType shoppingProductType, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 32) != 0) {
            str5 = null;
        }
        return shoppingProductDetailsHydrationTarget(shoppingProductType, str, str2, str3, str4, str5);
    }

    public static final HxE<String, Object>[] browserProductDetailsQueryParams(String str, String str2, String str3) {
        AnonymousClass004.A1b(str, str2);
        HxE hxEA0r = C3cG.A0r("type", BROWSER_PRODUCT_DETAILS_REQUEST_TYPE);
        HxE hxEA0r2 = C3cG.A0r("product_id", str);
        HxE hxEA0r3 = C3cG.A0r("product_name", str2);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str3);
        return C8j3.A1b(BFI.A0F(new HxE[]{hxEA0r, hxEA0r2, hxEA0r3, strTrimToNonEmpty != null ? C3cG.A0r("brand", strTrimToNonEmpty) : null}));
    }

    public static final HxE<String, Object>[] connectorDetailsQueryParams(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HxE[]{C3cG.A0r("type", PRODUCT_DETAILS_REQUEST_TYPE), C3cG.A0r(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, str), C3cG.A0r("product_id", str2)};
    }

    public static final HxE<String, Object>[] detailsQueryParams(ShoppingProductType shoppingProductType, String str, String str2, boolean z, String str3, Set<? extends ProductDetailsActionButton> set) {
        AnonymousClass004.A1b(shoppingProductType, str);
        C7384Etj.A0Y(set, 5);
        String detailsRequestType = getDetailsRequestType(shoppingProductType);
        if (detailsRequestType == null) {
            return null;
        }
        String str4 = (!z && detailsRequestType.equals(LISTING_DETAILS_REQUEST_TYPE) && getMarketplaceEnrichmentEnabled()) ? PDP_V1_VERSION : null;
        Ey9<ProductDetailsActionButton> entries = ProductDetailsActionButton.getEntries();
        ArrayList arrayListA0h = C3cG.A0h();
        for (ProductDetailsActionButton productDetailsActionButton : entries) {
            if (set.contains(productDetailsActionButton)) {
                arrayListA0h.add(productDetailsActionButton);
            }
        }
        String strA01 = (arrayListA0h.isEmpty() || !detailsRequestType.equals(PRODUCT_DETAILS_REQUEST_TYPE)) ? null : AbstractC06907md.A01(",", arrayListA0h, HatchProductDetailsHydrationKt$detailsQueryParams$buttons$3.INSTANCE);
        HxE hxEA0r = C3cG.A0r("type", detailsRequestType);
        HxE hxEA0r2 = C3cG.A0r("product_id", str);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        HxE hxEA0r3 = (strTrimToNonEmpty == null || shoppingProductType == ShoppingProductType.MARKETPLACE) ? null : C3cG.A0r("currency", strTrimToNonEmpty);
        HxE hxEA0r4 = C3cH.A0r("insert_developer_message", z);
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(str3);
        return C8j3.A1b(BFI.A0F(new HxE[]{hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, (strTrimToNonEmpty2 == null || shoppingProductType != ShoppingProductType.BROWSER) ? null : C3cG.A0r("product_name", strTrimToNonEmpty2), str4 != null ? C3cG.A0r("version", str4) : null, strA01 != null ? C3cG.A0r("action_buttons", strA01) : null}));
    }

    public static /* synthetic */ HxE[] detailsQueryParams$default(ShoppingProductType shoppingProductType, String str, String str2, boolean z, String str3, Set set, int i, Object obj) {
        String strA0u = AnonymousClass006.A0u(i, str3);
        if ((i & 16) != 0) {
            set = AbstractC0878AGe.A0g(ProductDetailsActionButton.getEntries());
        }
        return detailsQueryParams(shoppingProductType, str, str2, z, strA0u, set);
    }
}
