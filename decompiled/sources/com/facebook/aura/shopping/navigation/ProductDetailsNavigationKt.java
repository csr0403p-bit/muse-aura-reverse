package com.facebook.aura.shopping.navigation;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.navigation.MC;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ProductDetailsNavigationKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(ProductDetailsNavigationKt.class, "isProductDetailsEnabled", "isProductDetailsEnabled()Z", 1);
    public static final C31u isProductDetailsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shopping_result_pdp);

    /* renamed from: com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt$isProductDetailsFromLightbox$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            ShoppingFormat shoppingFormat;
            C7384Etj.A0Y(auraNavKey, 0);
            if (!(auraNavKey instanceof ShoppingProductDetailsPageKey)) {
                if (auraNavKey instanceof InstacartProductDetailsSheetKey) {
                    shoppingFormat = ((InstacartProductDetailsSheetKey) auraNavKey).entryFormat;
                }
                return Boolean.valueOf(z);
            }
            shoppingFormat = ((ShoppingProductDetailsPageKey) auraNavKey).entryFormat;
            boolean z = shoppingFormat == ShoppingFormat.LIGHTBOX;
            return Boolean.valueOf(z);
        }
    }

    public static final boolean isProductDetailsFromLightbox(AuraNavigator auraNavigator) {
        C7384Etj.A0Y(auraNavigator, 0);
        return auraNavigator.isInBackStack(AnonymousClass1.INSTANCE);
    }

    public static final void navigateToProductDetails(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, ShoppingResultProduct shoppingResultProduct, String str, String str2, ShoppingFormat shoppingFormat, String str3, ShoppingProductSource shoppingProductSource, String str4, List<ShoppingResultProduct> list, String str5) {
        boolean zA1Z = AnonymousClass005.A1Z(auraNavigator, abstractC3358CGz, shoppingResultProduct);
        int iOrdinal = ProductDetailsStyleKt.productDetailsStyle(shoppingResultProduct).ordinal();
        if (iOrdinal == 0) {
            ShoppingProductDetailsNavigationKt.navigateToShoppingProductDetails(auraNavigator, abstractC3358CGz, shoppingResultProduct, str, str2, shoppingFormat, str3, shoppingProductSource, str4, list, str5);
        } else {
            if (iOrdinal != zA1Z) {
                throw C3cG.A0q();
            }
            InstacartProductDetailsNavigationKt.navigateToInstacartProductDetails(auraNavigator, abstractC3358CGz, shoppingResultProduct, str, str2, shoppingFormat, str3, shoppingProductSource);
        }
    }

    public static final void popLightboxUnder(AuraNavigator auraNavigator, boolean z) {
        C7384Etj.A0Y(auraNavigator, 0);
        if (z) {
            while (auraNavigator.currentKey(true) instanceof ContentViewerScreenKey) {
                auraNavigator.popLast(1);
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductDetailsStyle.values().length];
            try {
                AnonymousClass002.A13(ProductDetailsStyle.SHOPPING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ProductDetailsStyle.INSTACART, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isProductDetailsEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isProductDetailsEnabled$delegate, $$delegatedProperties));
    }

    public static /* synthetic */ void navigateToProductDetails$default(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, ShoppingResultProduct shoppingResultProduct, String str, String str2, ShoppingFormat shoppingFormat, String str3, ShoppingProductSource shoppingProductSource, String str4, List list, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            shoppingFormat = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            shoppingProductSource = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            list = null;
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        navigateToProductDetails(auraNavigator, abstractC3358CGz, shoppingResultProduct, str, str2, shoppingFormat, str3, shoppingProductSource, str4, list, str5);
    }
}
