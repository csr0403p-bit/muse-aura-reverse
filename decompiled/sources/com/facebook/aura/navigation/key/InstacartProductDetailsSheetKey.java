package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductSource$$serializer;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKey extends C06G implements AuraBottomSheetNavKey, ProductDetailsNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ShoppingAddToCartTarget addToCartTarget;
    public final String brand;
    public final String cardProductId;
    public final ShoppingFormat entryFormat;
    public final String hostMessageId;
    public final boolean isPartnerMerchant;
    public final String merchantLogoUrl;
    public final String merchantName;
    public final String productId;
    public final ShoppingProductType productType;
    public final String productUrl;
    public final ShoppingSecondaryAction secondaryAction;
    public final String sessionId;
    public final ShoppingProductSource source;
    public final String widgetId;

    public final class Companion {
        public final C9hr<InstacartProductDetailsSheetKey> serializer() {
            return InstacartProductDetailsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, InstacartProductDetailsSheetKey$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, InstacartProductDetailsSheetKey$Companion$$childSerializers$2.INSTANCE), null, AbstractC5321DgF.A02(num, InstacartProductDetailsSheetKey$Companion$$childSerializers$3.INSTANCE), null, null, null};
    }

    public InstacartProductDetailsSheetKey(String str, String str2, String str3, String str4, String str5, String str6, boolean z, ShoppingProductType shoppingProductType, String str7, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str8, String str9, ShoppingProductSource shoppingProductSource) {
        C60O.A1M(str, 0, shoppingProductType);
        this.productId = str;
        this.sessionId = str2;
        this.hostMessageId = str3;
        this.brand = str4;
        this.merchantName = str5;
        this.merchantLogoUrl = str6;
        this.isPartnerMerchant = z;
        this.productType = shoppingProductType;
        this.productUrl = str7;
        this.addToCartTarget = shoppingAddToCartTarget;
        this.secondaryAction = shoppingSecondaryAction;
        this.entryFormat = shoppingFormat;
        this.widgetId = str8;
        this.cardProductId = str9;
        this.source = shoppingProductSource;
    }

    public final InstacartProductDetailsSheetKey copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, ShoppingProductType shoppingProductType, String str7, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str8, String str9, ShoppingProductSource shoppingProductSource) {
        C60O.A1M(str, 0, shoppingProductType);
        return new InstacartProductDetailsSheetKey(str, str2, str3, str4, str5, str6, z, shoppingProductType, str7, shoppingAddToCartTarget, shoppingSecondaryAction, shoppingFormat, str8, str9, shoppingProductSource);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstacartProductDetailsSheetKey) {
                InstacartProductDetailsSheetKey instacartProductDetailsSheetKey = (InstacartProductDetailsSheetKey) obj;
                if (!C7384Etj.areEqual(this.productId, instacartProductDetailsSheetKey.productId) || !C7384Etj.areEqual(this.sessionId, instacartProductDetailsSheetKey.sessionId) || !C7384Etj.areEqual(this.hostMessageId, instacartProductDetailsSheetKey.hostMessageId) || !C7384Etj.areEqual(this.brand, instacartProductDetailsSheetKey.brand) || !C7384Etj.areEqual(this.merchantName, instacartProductDetailsSheetKey.merchantName) || !C7384Etj.areEqual(this.merchantLogoUrl, instacartProductDetailsSheetKey.merchantLogoUrl) || this.isPartnerMerchant != instacartProductDetailsSheetKey.isPartnerMerchant || this.productType != instacartProductDetailsSheetKey.productType || !C7384Etj.areEqual(this.productUrl, instacartProductDetailsSheetKey.productUrl) || !C7384Etj.areEqual(this.addToCartTarget, instacartProductDetailsSheetKey.addToCartTarget) || !C7384Etj.areEqual(this.secondaryAction, instacartProductDetailsSheetKey.secondaryAction) || this.entryFormat != instacartProductDetailsSheetKey.entryFormat || !C7384Etj.areEqual(this.widgetId, instacartProductDetailsSheetKey.widgetId) || !C7384Etj.areEqual(this.cardProductId, instacartProductDetailsSheetKey.cardProductId) || !C7384Etj.areEqual(this.source, instacartProductDetailsSheetKey.source)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InstacartProductDetailsSheetKey copy$default(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, String str, String str2, String str3, String str4, String str5, String str6, boolean z, ShoppingProductType shoppingProductType, String str7, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str8, String str9, ShoppingProductSource shoppingProductSource, int i, Object obj) {
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        boolean z2 = z;
        ShoppingProductType shoppingProductType2 = shoppingProductType;
        String str14 = str7;
        ShoppingAddToCartTarget shoppingAddToCartTarget2 = shoppingAddToCartTarget;
        ShoppingSecondaryAction shoppingSecondaryAction2 = shoppingSecondaryAction;
        ShoppingFormat shoppingFormat2 = shoppingFormat;
        String str15 = str8;
        String str16 = str9;
        ShoppingProductSource shoppingProductSource2 = shoppingProductSource;
        if ((i & 1) != 0) {
            str = instacartProductDetailsSheetKey.productId;
        }
        if ((i & 2) != 0) {
            str2 = instacartProductDetailsSheetKey.sessionId;
        }
        if ((i & 4) != 0) {
            str10 = instacartProductDetailsSheetKey.hostMessageId;
        }
        if ((i & 8) != 0) {
            str11 = instacartProductDetailsSheetKey.brand;
        }
        if ((i & 16) != 0) {
            str12 = instacartProductDetailsSheetKey.merchantName;
        }
        if ((i & 32) != 0) {
            str13 = instacartProductDetailsSheetKey.merchantLogoUrl;
        }
        if ((i & 64) != 0) {
            z2 = instacartProductDetailsSheetKey.isPartnerMerchant;
        }
        if ((i & 128) != 0) {
            shoppingProductType2 = instacartProductDetailsSheetKey.productType;
        }
        if ((i & 256) != 0) {
            str14 = instacartProductDetailsSheetKey.productUrl;
        }
        if ((i & 512) != 0) {
            shoppingAddToCartTarget2 = instacartProductDetailsSheetKey.addToCartTarget;
        }
        if ((i & 1024) != 0) {
            shoppingSecondaryAction2 = instacartProductDetailsSheetKey.secondaryAction;
        }
        if ((i & 2048) != 0) {
            shoppingFormat2 = instacartProductDetailsSheetKey.entryFormat;
        }
        if ((i & 4096) != 0) {
            str15 = instacartProductDetailsSheetKey.widgetId;
        }
        if ((i & 8192) != 0) {
            str16 = instacartProductDetailsSheetKey.cardProductId;
        }
        if ((i & 16384) != 0) {
            shoppingProductSource2 = instacartProductDetailsSheetKey.source;
        }
        return instacartProductDetailsSheetKey.copy(str, str2, str10, str11, str12, str13, z2, shoppingProductType2, str14, shoppingAddToCartTarget2, shoppingSecondaryAction2, shoppingFormat2, str15, str16, shoppingProductSource2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(instacartProductDetailsSheetKey.getProductId(), c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(instacartProductDetailsSheetKey.getSessionId(), c07779iq, c9iZ, 1);
        c9j5.AAP(instacartProductDetailsSheetKey.getHostMessageId(), c07779iq, c9iZ, 2);
        c9j5.AAP(instacartProductDetailsSheetKey.brand, c07779iq, c9iZ, 3);
        c9j5.AAP(instacartProductDetailsSheetKey.merchantName, c07779iq, c9iZ, 4);
        c9j5.AAP(instacartProductDetailsSheetKey.merchantLogoUrl, c07779iq, c9iZ, 5);
        c9j5.AA7(c9iZ, 6, instacartProductDetailsSheetKey.isPartnerMerchant);
        c9j5.AAQ(instacartProductDetailsSheetKey.productType, C3cH.A15(f0cArr, 7), c9iZ, 7);
        c9j5.AAP(instacartProductDetailsSheetKey.productUrl, c07779iq, c9iZ, 8);
        c9j5.AAP(instacartProductDetailsSheetKey.addToCartTarget, C3cH.A15(f0cArr, 9), c9iZ, 9);
        c9j5.AAP(instacartProductDetailsSheetKey.secondaryAction, ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 10);
        c9j5.AAP(instacartProductDetailsSheetKey.entryFormat, C3cH.A15(f0cArr, 11), c9iZ, 11);
        c9j5.AAP(instacartProductDetailsSheetKey.widgetId, c07779iq, c9iZ, 12);
        c9j5.AAP(instacartProductDetailsSheetKey.cardProductId, c07779iq, c9iZ, 13);
        c9j5.AAP(instacartProductDetailsSheetKey.getSource(), ShoppingProductSource$$serializer.INSTANCE, c9iZ, 14);
    }

    public final String component1() {
        return this.productId;
    }

    public final ShoppingAddToCartTarget component10() {
        return this.addToCartTarget;
    }

    public final ShoppingSecondaryAction component11() {
        return this.secondaryAction;
    }

    public final ShoppingFormat component12() {
        return this.entryFormat;
    }

    public final String component13() {
        return this.widgetId;
    }

    public final String component14() {
        return this.cardProductId;
    }

    public final ShoppingProductSource component15() {
        return this.source;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.hostMessageId;
    }

    public final String component4() {
        return this.brand;
    }

    public final String component5() {
        return this.merchantName;
    }

    public final String component6() {
        return this.merchantLogoUrl;
    }

    public final boolean component7() {
        return this.isPartnerMerchant;
    }

    public final ShoppingProductType component8() {
        return this.productType;
    }

    public final String component9() {
        return this.productUrl;
    }

    public final ShoppingAddToCartTarget getAddToCartTarget() {
        return this.addToCartTarget;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCardProductId() {
        return this.cardProductId;
    }

    public final ShoppingFormat getEntryFormat() {
        return this.entryFormat;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public String getProductId() {
        return this.productId;
    }

    public final ShoppingProductType getProductType() {
        return this.productType;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public final ShoppingSecondaryAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public ShoppingProductSource getSource() {
        return this.source;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass005.A0F(this.productType, C0KA.A01((((((((((AnonymousClass001.A0G(this.productId) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.hostMessageId)) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + AnonymousClass006.A0G(this.merchantName)) * 31) + AnonymousClass006.A0G(this.merchantLogoUrl)) * 31, this.isPartnerMerchant)) + AnonymousClass006.A0G(this.productUrl)) * 31) + AnonymousClass006.A0D(this.addToCartTarget)) * 31) + AnonymousClass006.A0D(this.secondaryAction)) * 31) + AnonymousClass006.A0D(this.entryFormat)) * 31) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0G(this.cardProductId)) * 31) + C3cH.A02(this.source);
    }

    public final boolean isPartnerMerchant() {
        return this.isPartnerMerchant;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InstacartProductDetailsSheetKey(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, ShoppingProductType shoppingProductType, String str7, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str8, String str9, ShoppingProductSource shoppingProductSource, C2hx c2hx) {
        if (32767 != (i & 32767)) {
            C9iI.A00(InstacartProductDetailsSheetKey$$serializer.descriptor, i, 32767);
            throw F60.createAndThrow();
        }
        this.productId = str;
        this.sessionId = str2;
        this.hostMessageId = str3;
        this.brand = str4;
        this.merchantName = str5;
        this.merchantLogoUrl = str6;
        this.isPartnerMerchant = z;
        this.productType = shoppingProductType;
        this.productUrl = str7;
        this.addToCartTarget = shoppingAddToCartTarget;
        this.secondaryAction = shoppingSecondaryAction;
        this.entryFormat = shoppingFormat;
        this.widgetId = str8;
        this.cardProductId = str9;
        this.source = shoppingProductSource;
    }
}
