package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cH;

/* loaded from: classes4.dex */
public abstract class ShoppingResultProductWireKt {
    public static final ShoppingResultProduct shoppingResultProductOf(String str, String str2, String str3, ShoppingProductType shoppingProductType, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, boolean z, boolean z2, boolean z3, boolean z4, Integer num, ShoppingConnector shoppingConnector, String str13) {
        String str14;
        ShoppingConnector shoppingConnector2 = shoppingConnector;
        AnonymousClass003.A0w(str, shoppingProductType);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str6);
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(str10);
        String strA0u = strTrimToNonEmpty2 != null ? AnonymousClass001.A0u(strTrimToNonEmpty2) : null;
        String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        String strA0l = AnonymousClass002.A0l(str);
        String strTrimToNonEmpty4 = ProductDetailsPresentationKt.trimToNonEmpty(str4);
        String strTrimToNonEmpty5 = ProductDetailsPresentationKt.trimToNonEmpty(str5);
        String strTrimToNonEmpty6 = ProductDetailsPresentationKt.trimToNonEmpty(str7);
        if (strTrimToNonEmpty6 == null || strTrimToNonEmpty6.equals(strTrimToNonEmpty)) {
            strTrimToNonEmpty6 = null;
        }
        String strTrimToNonEmpty7 = ProductDetailsPresentationKt.trimToNonEmpty(str8);
        String strTrimToNonEmpty8 = ProductDetailsPresentationKt.trimToNonEmpty(str3);
        String strTrimToNonEmpty9 = ProductDetailsPresentationKt.trimToNonEmpty(str9);
        String strTrimToNonEmpty10 = ProductDetailsPresentationKt.trimToNonEmpty(str11);
        ShoppingPrimaryAction shoppingPrimaryAction = ShoppingResultsPresentationKt.toShoppingPrimaryAction(str12);
        ShoppingSecondaryAction domain = shoppingSecondaryActionJson != null ? shoppingSecondaryActionJson.toDomain() : null;
        if (shoppingConnector == null || strA0u == null || (str14 = shoppingConnector2.id) == null || !str14.equalsIgnoreCase(strA0u)) {
            shoppingConnector2 = null;
        }
        return new ShoppingResultProduct(strTrimToNonEmpty3, strA0l, strTrimToNonEmpty4, strTrimToNonEmpty5, strTrimToNonEmpty, strTrimToNonEmpty6, strTrimToNonEmpty7, strTrimToNonEmpty8, shoppingProductType, z3, z4, z2, strTrimToNonEmpty9, num, z, strA0u, strTrimToNonEmpty10, shoppingPrimaryAction, domain, shoppingConnector2, ProductDetailsPresentationKt.trimToNonEmpty(str13));
    }

    public static /* synthetic */ ShoppingResultProduct shoppingResultProductOf$default(String str, String str2, String str3, ShoppingProductType shoppingProductType, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, boolean z, boolean z2, boolean z3, boolean z4, Integer num, ShoppingConnector shoppingConnector, String str13, int i, Object obj) {
        boolean zA1L = C3cH.A1L(i, 131072, z4);
        if ((i & 262144) != 0) {
            num = null;
        }
        if ((i & 524288) != 0) {
            shoppingConnector = null;
        }
        if ((i & 1048576) != 0) {
            str13 = null;
        }
        return shoppingResultProductOf(str, str2, str3, shoppingProductType, str4, str5, str6, str7, str8, str9, str10, str11, str12, shoppingSecondaryActionJson, z, z2, z3, zA1L, num, shoppingConnector, str13);
    }
}
