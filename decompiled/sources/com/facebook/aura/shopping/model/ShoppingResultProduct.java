package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingResultProduct extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String brand;
    public final String citationId;
    public final ShoppingConnector connector;
    public final String highlightedAttribute;
    public final String imageUrl;
    public final boolean isAgenticCheckoutCompletionEnabled;
    public final boolean isAgenticCheckoutCreationEnabled;
    public final boolean isImageAvailable;
    public final boolean isUnavailable;
    public final String name;
    public final String price;
    public final String priceCurrency;
    public final ShoppingPrimaryAction primaryAction;
    public final String productId;
    public final String provider;
    public final String retailerName;
    public final String salePrice;
    public final ShoppingSecondaryAction secondaryAction;
    public final ShoppingProductType type;
    public final String url;
    public final Integer wireIndex;

    public final class Companion {
        public final C9hr<ShoppingResultProduct> serializer() {
            return ShoppingResultProduct$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ShoppingResultProduct$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ShoppingResultProduct$Companion$$childSerializers$2.INSTANCE), null, null, null};
    }

    public ShoppingResultProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShoppingProductType shoppingProductType, boolean z, boolean z2, boolean z3, String str9, Integer num, boolean z4, String str10, String str11, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingConnector shoppingConnector, String str12) {
        C60O.A1N(str2, 1, shoppingProductType);
        this.productId = str;
        this.name = str2;
        this.brand = str3;
        this.imageUrl = str4;
        this.price = str5;
        this.salePrice = str6;
        this.priceCurrency = str7;
        this.url = str8;
        this.type = shoppingProductType;
        this.isAgenticCheckoutCreationEnabled = z;
        this.isAgenticCheckoutCompletionEnabled = z2;
        this.isUnavailable = z3;
        this.citationId = str9;
        this.wireIndex = num;
        this.isImageAvailable = z4;
        this.provider = str10;
        this.retailerName = str11;
        this.primaryAction = shoppingPrimaryAction;
        this.secondaryAction = shoppingSecondaryAction;
        this.connector = shoppingConnector;
        this.highlightedAttribute = str12;
    }

    public final ShoppingResultProduct copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShoppingProductType shoppingProductType, boolean z, boolean z2, boolean z3, String str9, Integer num, boolean z4, String str10, String str11, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingConnector shoppingConnector, String str12) {
        C60O.A1N(str2, 1, shoppingProductType);
        return new ShoppingResultProduct(str, str2, str3, str4, str5, str6, str7, str8, shoppingProductType, z, z2, z3, str9, num, z4, str10, str11, shoppingPrimaryAction, shoppingSecondaryAction, shoppingConnector, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultProduct) {
                ShoppingResultProduct shoppingResultProduct = (ShoppingResultProduct) obj;
                if (!C7384Etj.areEqual(this.productId, shoppingResultProduct.productId) || !C7384Etj.areEqual(this.name, shoppingResultProduct.name) || !C7384Etj.areEqual(this.brand, shoppingResultProduct.brand) || !C7384Etj.areEqual(this.imageUrl, shoppingResultProduct.imageUrl) || !C7384Etj.areEqual(this.price, shoppingResultProduct.price) || !C7384Etj.areEqual(this.salePrice, shoppingResultProduct.salePrice) || !C7384Etj.areEqual(this.priceCurrency, shoppingResultProduct.priceCurrency) || !C7384Etj.areEqual(this.url, shoppingResultProduct.url) || this.type != shoppingResultProduct.type || this.isAgenticCheckoutCreationEnabled != shoppingResultProduct.isAgenticCheckoutCreationEnabled || this.isAgenticCheckoutCompletionEnabled != shoppingResultProduct.isAgenticCheckoutCompletionEnabled || this.isUnavailable != shoppingResultProduct.isUnavailable || !C7384Etj.areEqual(this.citationId, shoppingResultProduct.citationId) || !C7384Etj.areEqual(this.wireIndex, shoppingResultProduct.wireIndex) || this.isImageAvailable != shoppingResultProduct.isImageAvailable || !C7384Etj.areEqual(this.provider, shoppingResultProduct.provider) || !C7384Etj.areEqual(this.retailerName, shoppingResultProduct.retailerName) || this.primaryAction != shoppingResultProduct.primaryAction || !C7384Etj.areEqual(this.secondaryAction, shoppingResultProduct.secondaryAction) || !C7384Etj.areEqual(this.connector, shoppingResultProduct.connector) || !C7384Etj.areEqual(this.highlightedAttribute, shoppingResultProduct.highlightedAttribute)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingResultProduct shoppingResultProduct, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(shoppingResultProduct.productId, c07779iq, c9iZ, 0);
        c9j5.AAV(shoppingResultProduct.name, c9iZ, 1);
        c9j5.AAP(shoppingResultProduct.brand, c07779iq, c9iZ, 2);
        c9j5.AAP(shoppingResultProduct.imageUrl, c07779iq, c9iZ, 3);
        c9j5.AAP(shoppingResultProduct.price, c07779iq, c9iZ, 4);
        c9j5.AAP(shoppingResultProduct.salePrice, c07779iq, c9iZ, 5);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingResultProduct.priceCurrency != null) {
            c9j5.AAP(shoppingResultProduct.priceCurrency, c07779iq, c9iZ, 6);
        }
        c9j5.AAP(shoppingResultProduct.url, c07779iq, c9iZ, 7);
        if (zAfR || shoppingResultProduct.type != ShoppingProductType.UNKNOWN) {
            c9j5.AAQ(shoppingResultProduct.type, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || shoppingResultProduct.isAgenticCheckoutCreationEnabled) {
            c9j5.AA7(c9iZ, 9, shoppingResultProduct.isAgenticCheckoutCreationEnabled);
        }
        if (zAfR || shoppingResultProduct.isAgenticCheckoutCompletionEnabled) {
            c9j5.AA7(c9iZ, 10, shoppingResultProduct.isAgenticCheckoutCompletionEnabled);
        }
        if (zAfR || shoppingResultProduct.isUnavailable) {
            c9j5.AA7(c9iZ, 11, shoppingResultProduct.isUnavailable);
        }
        if (zAfR || shoppingResultProduct.citationId != null) {
            c9j5.AAP(shoppingResultProduct.citationId, c07779iq, c9iZ, 12);
        }
        if (zAfR || shoppingResultProduct.wireIndex != null) {
            c9j5.AAP(shoppingResultProduct.wireIndex, C07729ii.A00, c9iZ, 13);
        }
        if (zAfR || !shoppingResultProduct.isImageAvailable) {
            c9j5.AA7(c9iZ, 14, shoppingResultProduct.isImageAvailable);
        }
        if (zAfR || shoppingResultProduct.provider != null) {
            c9j5.AAP(shoppingResultProduct.provider, c07779iq, c9iZ, 15);
        }
        if (zAfR || shoppingResultProduct.retailerName != null) {
            c9j5.AAP(shoppingResultProduct.retailerName, c07779iq, c9iZ, 16);
        }
        if (zAfR || shoppingResultProduct.primaryAction != null) {
            c9j5.AAP(shoppingResultProduct.primaryAction, C3cH.A15(f0cArr, 17), c9iZ, 17);
        }
        if (zAfR || shoppingResultProduct.secondaryAction != null) {
            c9j5.AAP(shoppingResultProduct.secondaryAction, ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 18);
        }
        if (zAfR || shoppingResultProduct.connector != null) {
            c9j5.AAP(shoppingResultProduct.connector, ShoppingConnector$$serializer.INSTANCE, c9iZ, 19);
        }
        if (zAfR || shoppingResultProduct.highlightedAttribute != null) {
            c9j5.AAP(shoppingResultProduct.highlightedAttribute, c07779iq, c9iZ, 20);
        }
    }

    public final String component1() {
        return this.productId;
    }

    public final boolean component10() {
        return this.isAgenticCheckoutCreationEnabled;
    }

    public final boolean component11() {
        return this.isAgenticCheckoutCompletionEnabled;
    }

    public final boolean component12() {
        return this.isUnavailable;
    }

    public final String component13() {
        return this.citationId;
    }

    public final Integer component14() {
        return this.wireIndex;
    }

    public final boolean component15() {
        return this.isImageAvailable;
    }

    public final String component16() {
        return this.provider;
    }

    public final String component17() {
        return this.retailerName;
    }

    public final ShoppingPrimaryAction component18() {
        return this.primaryAction;
    }

    public final ShoppingSecondaryAction component19() {
        return this.secondaryAction;
    }

    public final String component2() {
        return this.name;
    }

    public final ShoppingConnector component20() {
        return this.connector;
    }

    public final String component21() {
        return this.highlightedAttribute;
    }

    public final String component3() {
        return this.brand;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.price;
    }

    public final String component6() {
        return this.salePrice;
    }

    public final String component7() {
        return this.priceCurrency;
    }

    public final String component8() {
        return this.url;
    }

    public final ShoppingProductType component9() {
        return this.type;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCitationId() {
        return this.citationId;
    }

    public final ShoppingConnector getConnector() {
        return this.connector;
    }

    public final String getHighlightedAttribute() {
        return this.highlightedAttribute;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final ShoppingPrimaryAction getPrimaryAction() {
        return this.primaryAction;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getRetailerName() {
        return this.retailerName;
    }

    public final String getSalePrice() {
        return this.salePrice;
    }

    public final ShoppingSecondaryAction getSecondaryAction() {
        return this.secondaryAction;
    }

    public final ShoppingProductType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getWireIndex() {
        return this.wireIndex;
    }

    public int hashCode() {
        return ((((((((((C0KA.A01((((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.type, (((((((((((AnonymousClass005.A0I(this.name, AnonymousClass006.A0G(this.productId) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.salePrice)) * 31) + AnonymousClass006.A0G(this.priceCurrency)) * 31) + AnonymousClass006.A0G(this.url)) * 31), this.isAgenticCheckoutCreationEnabled), this.isAgenticCheckoutCompletionEnabled), this.isUnavailable) + AnonymousClass006.A0G(this.citationId)) * 31) + AnonymousClass006.A0D(this.wireIndex)) * 31, this.isImageAvailable) + AnonymousClass006.A0G(this.provider)) * 31) + AnonymousClass006.A0G(this.retailerName)) * 31) + AnonymousClass006.A0D(this.primaryAction)) * 31) + AnonymousClass006.A0D(this.secondaryAction)) * 31) + AnonymousClass006.A0D(this.connector)) * 31) + AnonymousClass005.A0H(this.highlightedAttribute);
    }

    public final boolean isAgenticCheckoutCompletionEnabled() {
        return this.isAgenticCheckoutCompletionEnabled;
    }

    public final boolean isAgenticCheckoutCreationEnabled() {
        return this.isAgenticCheckoutCreationEnabled;
    }

    public final boolean isImageAvailable() {
        return this.isImageAvailable;
    }

    public final boolean isUnavailable() {
        return this.isUnavailable;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ShoppingResultProduct copy$default(ShoppingResultProduct shoppingResultProduct, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShoppingProductType shoppingProductType, boolean z, boolean z2, boolean z3, String str9, Integer num, boolean z4, String str10, String str11, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingConnector shoppingConnector, String str12, int i, Object obj) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        ShoppingProductType shoppingProductType2 = shoppingProductType;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        String str21 = str9;
        Integer num2 = num;
        boolean z8 = z4;
        String str22 = str10;
        String str23 = str11;
        ShoppingPrimaryAction shoppingPrimaryAction2 = shoppingPrimaryAction;
        ShoppingSecondaryAction shoppingSecondaryAction2 = shoppingSecondaryAction;
        ShoppingConnector shoppingConnector2 = shoppingConnector;
        String str24 = str12;
        if ((i & 1) != 0) {
            str13 = shoppingResultProduct.productId;
        }
        if ((i & 2) != 0) {
            str14 = shoppingResultProduct.name;
        }
        if ((i & 4) != 0) {
            str15 = shoppingResultProduct.brand;
        }
        if ((i & 8) != 0) {
            str16 = shoppingResultProduct.imageUrl;
        }
        if ((i & 16) != 0) {
            str17 = shoppingResultProduct.price;
        }
        if ((i & 32) != 0) {
            str18 = shoppingResultProduct.salePrice;
        }
        if ((i & 64) != 0) {
            str19 = shoppingResultProduct.priceCurrency;
        }
        if ((i & 128) != 0) {
            str20 = shoppingResultProduct.url;
        }
        if ((i & 256) != 0) {
            shoppingProductType2 = shoppingResultProduct.type;
        }
        if ((i & 512) != 0) {
            z5 = shoppingResultProduct.isAgenticCheckoutCreationEnabled;
        }
        if ((i & 1024) != 0) {
            z6 = shoppingResultProduct.isAgenticCheckoutCompletionEnabled;
        }
        if ((i & 2048) != 0) {
            z7 = shoppingResultProduct.isUnavailable;
        }
        if ((i & 4096) != 0) {
            str21 = shoppingResultProduct.citationId;
        }
        if ((i & 8192) != 0) {
            num2 = shoppingResultProduct.wireIndex;
        }
        if ((i & 16384) != 0) {
            z8 = shoppingResultProduct.isImageAvailable;
        }
        if ((i & 32768) != 0) {
            str22 = shoppingResultProduct.provider;
        }
        if ((i & 65536) != 0) {
            str23 = shoppingResultProduct.retailerName;
        }
        if ((i & 131072) != 0) {
            shoppingPrimaryAction2 = shoppingResultProduct.primaryAction;
        }
        if ((i & 262144) != 0) {
            shoppingSecondaryAction2 = shoppingResultProduct.secondaryAction;
        }
        if ((i & 524288) != 0) {
            shoppingConnector2 = shoppingResultProduct.connector;
        }
        if ((i & 1048576) != 0) {
            str24 = shoppingResultProduct.highlightedAttribute;
        }
        ShoppingProductType shoppingProductType3 = shoppingProductType2;
        boolean z9 = z5;
        boolean z10 = z6;
        boolean z11 = z7;
        String str25 = str21;
        return shoppingResultProduct.copy(str13, str14, str15, str16, str17, str18, str19, str20, shoppingProductType3, z9, z10, z11, str25, num2, z8, str22, str23, shoppingPrimaryAction2, shoppingSecondaryAction2, shoppingConnector2, str24);
    }

    public /* synthetic */ ShoppingResultProduct(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShoppingProductType shoppingProductType, boolean z, boolean z2, boolean z3, String str9, Integer num, boolean z4, String str10, String str11, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingConnector shoppingConnector, String str12, C2hx c2hx) {
        boolean z5 = z4;
        if (191 != (i & 191)) {
            C9iI.A00(ShoppingResultProduct$$serializer.descriptor, i, 191);
            throw F60.createAndThrow();
        }
        this.productId = str;
        this.name = str2;
        this.brand = str3;
        this.imageUrl = str4;
        this.price = str5;
        this.salePrice = str6;
        if ((i & 64) == 0) {
            this.priceCurrency = null;
        } else {
            this.priceCurrency = str7;
        }
        this.url = str8;
        if ((i & 256) == 0) {
            this.type = ShoppingProductType.UNKNOWN;
        } else {
            this.type = shoppingProductType;
        }
        if ((i & 512) == 0) {
            this.isAgenticCheckoutCreationEnabled = false;
        } else {
            this.isAgenticCheckoutCreationEnabled = z;
        }
        if ((i & 1024) == 0) {
            this.isAgenticCheckoutCompletionEnabled = false;
        } else {
            this.isAgenticCheckoutCompletionEnabled = z2;
        }
        if ((i & 2048) == 0) {
            this.isUnavailable = false;
        } else {
            this.isUnavailable = z3;
        }
        if ((i & 4096) == 0) {
            this.citationId = null;
        } else {
            this.citationId = str9;
        }
        if ((i & 8192) == 0) {
            this.wireIndex = null;
        } else {
            this.wireIndex = num;
        }
        this.isImageAvailable = (i & 16384) == 0 ? true : z5;
        if ((32768 & i) == 0) {
            this.provider = null;
        } else {
            this.provider = str10;
        }
        if ((65536 & i) == 0) {
            this.retailerName = null;
        } else {
            this.retailerName = str11;
        }
        if ((131072 & i) == 0) {
            this.primaryAction = null;
        } else {
            this.primaryAction = shoppingPrimaryAction;
        }
        if ((262144 & i) == 0) {
            this.secondaryAction = null;
        } else {
            this.secondaryAction = shoppingSecondaryAction;
        }
        if ((524288 & i) == 0) {
            this.connector = null;
        } else {
            this.connector = shoppingConnector;
        }
        if ((i & 1048576) == 0) {
            this.highlightedAttribute = null;
        } else {
            this.highlightedAttribute = str12;
        }
    }

    public /* synthetic */ ShoppingResultProduct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShoppingProductType shoppingProductType, boolean z, boolean z2, boolean z3, String str9, Integer num, boolean z4, String str10, String str11, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingConnector shoppingConnector, String str12, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, str8, (i & 256) != 0 ? ShoppingProductType.UNKNOWN : shoppingProductType, C3cG.A1K(i & 512, z), C3cG.A1K(i & 1024, z2), C3cG.A1K(i & 2048, z3), (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : num, C60Q.A1Q(i & 16384, z4), (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : shoppingPrimaryAction, (262144 & i) != 0 ? null : shoppingSecondaryAction, (524288 & i) != 0 ? null : shoppingConnector, (i & 1048576) != 0 ? null : str12);
    }
}
