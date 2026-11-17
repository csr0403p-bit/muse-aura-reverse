package com.facebook.aura.shopping.model;

import X.A3q;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;

/* loaded from: classes4.dex */
public abstract class ShoppingResultsPresentationKt {
    public static final boolean getAllowsLinkPreviewImage(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        return shoppingResultProduct.type == ShoppingProductType.BROWSER;
    }

    public static final boolean getCanAttemptImage(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        return shoppingResultProduct.isImageAvailable || shoppingResultProduct.type == ShoppingProductType.BROWSER;
    }

    public static final boolean getCanOfferBuyNow(ShoppingResultProduct shoppingResultProduct) {
        String str;
        C7384Etj.A0Y(shoppingResultProduct, 0);
        ShoppingProductType shoppingProductType = shoppingResultProduct.type;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingProductType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    str = shoppingResultProduct.url;
                } else if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
            }
        }
        str = shoppingResultProduct.productId;
        return (str == null || C7BY.A0j(str)) ? false : true;
    }

    public static final String getLoggingValue(ShoppingProductType shoppingProductType) {
        C7384Etj.A0Y(shoppingProductType, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingProductType.ordinal();
        if (iOrdinal == 0) {
            return "catalog";
        }
        if (iOrdinal == 1) {
            return "marketplace";
        }
        if (iOrdinal == 2) {
            return "browser";
        }
        if (iOrdinal == 3) {
            return null;
        }
        throw C3cG.A0q();
    }

    public static final ShoppingConnector getMerchantConnector(ShoppingResultProduct shoppingResultProduct) {
        String strTrimToNonEmpty;
        C7384Etj.A0Y(shoppingResultProduct, 0);
        ShoppingConnector shoppingConnector = shoppingResultProduct.connector;
        if (shoppingConnector == null || (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingConnector.name)) == null || !strTrimToNonEmpty.equalsIgnoreCase(getMerchantName(shoppingResultProduct))) {
            return null;
        }
        return shoppingConnector;
    }

    public static final String getMerchantName(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.retailerName);
        if (strTrimToNonEmpty != null) {
            return strTrimToNonEmpty;
        }
        ShoppingConnector shoppingConnector = shoppingResultProduct.connector;
        return ProductDetailsPresentationKt.trimToNonEmpty(shoppingConnector != null ? shoppingConnector.name : null);
    }

    public static final boolean getOffersAddToCart(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        return shoppingResultProduct.primaryAction == ShoppingPrimaryAction.ADD_TO_CART && shoppingResultProduct.type == ShoppingProductType.BROWSER;
    }

    public static final String getProductDetailsConnectorId(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        ShoppingConnector shoppingConnector = shoppingResultProduct.connector;
        if (shoppingConnector == null || !shoppingConnector.capabilities.productDetails || shoppingResultProduct.provider == null || shoppingResultProduct.type == ShoppingProductType.UNKNOWN) {
            return null;
        }
        return shoppingConnector.id;
    }

    public static final String getResolvedProductId(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String str = shoppingResultProduct.productId;
        if (str != null) {
            return str;
        }
        String str2 = shoppingResultProduct.url;
        return str2 == null ? shoppingResultProduct.name : str2;
    }

    public static final ShoppingSaveTarget saveTarget(ShoppingResultProduct shoppingResultProduct, ShoppingProductSource shoppingProductSource, String str) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        if (shoppingResultProduct.type == ShoppingProductType.MARKETPLACE) {
            return null;
        }
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingProductSource != null ? shoppingProductSource.widgetId : null);
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.productId);
        String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.citationId);
        if (strTrimToNonEmpty != null && strTrimToNonEmpty2 != null) {
            return new ShoppingSaveTarget.WidgetProduct(strTrimToNonEmpty, strTrimToNonEmpty2);
        }
        if (strTrimToNonEmpty3 == null) {
            return null;
        }
        if (strTrimToNonEmpty != null) {
            return new ShoppingSaveTarget.WidgetCitation(strTrimToNonEmpty, strTrimToNonEmpty3);
        }
        String strTrimToNonEmpty4 = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty4 != null) {
            return new ShoppingSaveTarget.Citation(strTrimToNonEmpty4, strTrimToNonEmpty3);
        }
        return null;
    }

    public static final String shoppingReplyPresentationEventId(String str) {
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }

    public static final ShoppingProductSubtitle subtitle(ShoppingResultProduct shoppingResultProduct, ShoppingResultsAttribution shoppingResultsAttribution) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.brand);
        String merchantName = getMerchantName(shoppingResultProduct);
        if (merchantName == null || (shoppingResultsAttribution != null && namesMerchantOf(shoppingResultsAttribution, shoppingResultProduct))) {
            merchantName = null;
        }
        if (strTrimToNonEmpty == null || strTrimToNonEmpty.equalsIgnoreCase(merchantName)) {
            strTrimToNonEmpty = null;
        }
        if (merchantName == null && strTrimToNonEmpty == null) {
            return null;
        }
        return new ShoppingProductSubtitle(merchantName, strTrimToNonEmpty, subtitleConnector(shoppingResultProduct, merchantName));
    }

    public static final ProductDetailsPresentation toProductDetailsPresentation(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        String str = shoppingResultProduct.salePrice;
        String str2 = shoppingResultProduct.price;
        String resolvedProductId = getResolvedProductId(shoppingResultProduct);
        String merchantName = getMerchantName(shoppingResultProduct);
        ShoppingConnector merchantConnector = getMerchantConnector(shoppingResultProduct);
        PdpHeader pdpHeader = new PdpHeader(merchantName, merchantConnector != null ? merchantConnector.iconUrl : null, ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.brand), AnonymousClass002.A1X(getMerchantConnector(shoppingResultProduct)));
        String str3 = shoppingResultProduct.name;
        String str4 = shoppingResultProduct.url;
        String str5 = str;
        if (str == null) {
            str5 = str2;
        }
        PdpPrice pdpPrice = str5 != null ? new PdpPrice(str5, "") : null;
        PdpPrice pdpPrice2 = (str == null || str2 == null) ? null : new PdpPrice(str2, "");
        String str6 = shoppingResultProduct.imageUrl;
        PdpProductInfo pdpProductInfo = new PdpProductInfo(str3, null, str4, null, pdpPrice, pdpPrice2, null, AbstractC0885AGm.A0z(str6 != null ? new PdpImage(str6) : null));
        C0881AGi c0881AGi = C0881AGi.A00;
        ShoppingProductType shoppingProductType = shoppingResultProduct.type;
        boolean canOfferBuyNow = getCanOfferBuyNow(shoppingResultProduct);
        ShoppingPrimaryAction shoppingPrimaryAction = shoppingResultProduct.primaryAction;
        ShoppingSecondaryAction shoppingSecondaryAction = shoppingResultProduct.secondaryAction;
        A3q a3q = A3q.A00;
        C9jH c9jH = C9jH.A00;
        return new ProductDetailsPresentation(resolvedProductId, pdpHeader, pdpProductInfo, null, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, shoppingProductType, canOfferBuyNow, shoppingPrimaryAction, shoppingSecondaryAction, null, c0881AGi, c0881AGi, null, null, null, null, null, null, null, c0881AGi, a3q, c9jH, false, c9jH, a3q, null);
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

    public static final boolean namesMerchantOf(ShoppingResultsAttribution shoppingResultsAttribution, ShoppingResultProduct shoppingResultProduct) {
        String str;
        if (ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.retailerName) == null) {
            ShoppingConnector shoppingConnector = shoppingResultProduct.connector;
            if (shoppingConnector != null && (str = shoppingConnector.id) != null && str.equalsIgnoreCase(shoppingResultsAttribution.provider)) {
                return true;
            }
        } else if (shoppingResultsAttribution.subtitle != null) {
            return true;
        }
        return false;
    }

    public static final ShoppingProductType toShoppingProductType(String str) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            int iHashCode = strA0u.hashCode();
            if (iHashCode != 150940456) {
                if (iHashCode != 300911179) {
                    if (iHashCode == 555704345 && strA0u.equals("catalog")) {
                        return ShoppingProductType.CATALOG;
                    }
                } else if (strA0u.equals("marketplace")) {
                    return ShoppingProductType.MARKETPLACE;
                }
            } else if (strA0u.equals("browser")) {
                return ShoppingProductType.BROWSER;
            }
        }
        return ShoppingProductType.UNKNOWN;
    }

    public static final ShoppingConnector subtitleConnector(ShoppingResultProduct shoppingResultProduct, String str) {
        ShoppingConnector merchantConnector = getMerchantConnector(shoppingResultProduct);
        if (merchantConnector == null || str == null) {
            return null;
        }
        return merchantConnector;
    }

    public static final ShoppingPrimaryAction toShoppingPrimaryAction(String str) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty != null) {
            return AnonymousClass001.A0u(strTrimToNonEmpty).equals("add_to_cart") ? ShoppingPrimaryAction.ADD_TO_CART : ShoppingPrimaryAction.UNSUPPORTED;
        }
        return null;
    }
}
