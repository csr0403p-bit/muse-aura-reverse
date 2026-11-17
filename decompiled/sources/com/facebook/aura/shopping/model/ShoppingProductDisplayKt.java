package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class ShoppingProductDisplayKt {
    public static final ShoppingCouponPriceKey catalogCouponPriceKey(ShoppingResultProduct shoppingResultProduct) {
        String strTrimToNonEmpty;
        C7384Etj.A0Y(shoppingResultProduct, 0);
        if (shoppingResultProduct.type == ShoppingProductType.CATALOG && shoppingResultProduct.provider == null && (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.productId)) != null) {
            return new ShoppingCouponPriceKey(strTrimToNonEmpty, ProductDetailsPresentationKt.trimToNonEmpty(shoppingResultProduct.priceCurrency));
        }
        return null;
    }

    public static final String formatMinorUnits(long j, String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 1);
        try {
            objA0s = Integer.valueOf(Currency.getInstance(str).getDefaultFractionDigits());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = 2;
        }
        int iA0F = AnonymousClass001.A0F(objA0s);
        if (iA0F < 0) {
            iA0F = 0;
        }
        String plainString = new BigDecimal(j).movePointLeft(iA0F).toPlainString();
        C7384Etj.A0U(plainString);
        return plainString;
    }

    public static final String validCurrencyCode(String str) {
        String strA0l;
        Object objA0s;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            if (strA0l.length() != 3 || !strA0l.equals(strA0l.toUpperCase(Locale.ROOT))) {
                strA0l = null;
            }
            if (strA0l != null) {
                try {
                    objA0s = Currency.getInstance(strA0l);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                if (objA0s != null) {
                    return strA0l;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ ShoppingDisplayPrices shoppingDisplayPrices$default(ShoppingResultProduct shoppingResultProduct, PdpCouponPrice pdpCouponPrice, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = C60Q.A0w();
        }
        return shoppingDisplayPrices(shoppingResultProduct, pdpCouponPrice, locale);
    }

    public static /* synthetic */ ShoppingResultProductUiModel toUiModel$default(ShoppingResultProduct shoppingResultProduct, PdpCouponPrice pdpCouponPrice, ShoppingResultsAttribution shoppingResultsAttribution, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = C60Q.A0w();
        }
        return toUiModel(shoppingResultProduct, pdpCouponPrice, shoppingResultsAttribution, locale);
    }

    public static final ShoppingDisplayPrices shoppingDisplayPrices(ShoppingResultProduct shoppingResultProduct, PdpCouponPrice pdpCouponPrice, Locale locale) {
        String price;
        String price2;
        AnonymousClass003.A0v(shoppingResultProduct, locale);
        if (pdpCouponPrice != null) {
            price = ProductDetailsPresentationKt.formatPrice(pdpCouponPrice.price, locale);
            price2 = ProductDetailsPresentationKt.formatPrice(pdpCouponPrice.originalPrice, locale);
        } else {
            String str = shoppingResultProduct.salePrice;
            price = str;
            if (str == null) {
                price = shoppingResultProduct.price;
            }
            price2 = shoppingResultProduct.price;
            if (price2 == null || str == null || price2.equals(str)) {
                price2 = null;
            }
        }
        return new ShoppingDisplayPrices(price, price2);
    }

    public static final ShoppingResultProductUiModel toUiModel(ShoppingResultProduct shoppingResultProduct, PdpCouponPrice pdpCouponPrice, ShoppingResultsAttribution shoppingResultsAttribution, Locale locale) {
        AnonymousClass003.A0w(shoppingResultProduct, locale);
        return new ShoppingResultProductUiModel(shoppingResultProduct, shoppingDisplayPrices(shoppingResultProduct, pdpCouponPrice, locale), ShoppingResultsPresentationKt.subtitle(shoppingResultProduct, shoppingResultsAttribution));
    }
}
