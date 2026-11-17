package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraFadesInRootChromeOnDismissNavKey;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingPrimaryAction;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductSource$$serializer;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKey extends C06G implements AuraFadesInRootChromeOnDismissNavKey, AuraFullScreenNavKey, ProductDetailsNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ShoppingAddToCartTarget addToCartTarget;
    public final String brand;
    public final boolean canOfferBuyNow;
    public final String cardProductId;
    public final String collectionId;
    public final ShoppingFormat entryFormat;
    public final String hostMessageId;
    public final String hydrationConnectorId;
    public final String hydrationProductId;
    public final boolean isPartnerMerchant;
    public final String leadingHeroImageUrl;
    public final String merchantLogoUrl;
    public final String merchantName;
    public final String priceCurrency;
    public final ShoppingPrimaryAction primaryAction;
    public final String productId;
    public final ShoppingProductType productType;
    public final String productUrl;
    public final ShoppingSaveTarget saveTarget;
    public final ShoppingSecondaryAction secondaryAction;
    public final String sessionId;
    public final String sharedElementKey;
    public final ShoppingProductSource source;
    public final String widgetId;

    public final class Companion {
        public final C9hr<ShoppingProductDetailsPageKey> serializer() {
            return ShoppingProductDetailsPageKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(num, ShoppingProductDetailsPageKey$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null, AbstractC5321DgF.A02(num, ShoppingProductDetailsPageKey$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ShoppingProductDetailsPageKey$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, ShoppingProductDetailsPageKey$Companion$$childSerializers$4.INSTANCE), null, AbstractC5321DgF.A02(num, ShoppingProductDetailsPageKey$Companion$$childSerializers$5.INSTANCE), null, null, null, null, null, null};
    }

    public ShoppingProductDetailsPageKey(String str, String str2, String str3, String str4, String str5, boolean z, ShoppingProductType shoppingProductType, boolean z2, String str6, String str7, String str8, String str9, String str10, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSaveTarget shoppingSaveTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str11, String str12, ShoppingProductSource shoppingProductSource, String str13, String str14, String str15) {
        AnonymousClass002.A1E(str, 0, shoppingProductType);
        this.productId = str;
        this.sessionId = str2;
        this.brand = str3;
        this.merchantName = str4;
        this.merchantLogoUrl = str5;
        this.isPartnerMerchant = z;
        this.productType = shoppingProductType;
        this.canOfferBuyNow = z2;
        this.productUrl = str6;
        this.hydrationProductId = str7;
        this.hydrationConnectorId = str8;
        this.priceCurrency = str9;
        this.hostMessageId = str10;
        this.primaryAction = shoppingPrimaryAction;
        this.addToCartTarget = shoppingAddToCartTarget;
        this.saveTarget = shoppingSaveTarget;
        this.secondaryAction = shoppingSecondaryAction;
        this.entryFormat = shoppingFormat;
        this.widgetId = str11;
        this.cardProductId = str12;
        this.source = shoppingProductSource;
        this.sharedElementKey = str13;
        this.collectionId = str14;
        this.leadingHeroImageUrl = str15;
    }

    public final ShoppingProductDetailsPageKey copy(String str, String str2, String str3, String str4, String str5, boolean z, ShoppingProductType shoppingProductType, boolean z2, String str6, String str7, String str8, String str9, String str10, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSaveTarget shoppingSaveTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str11, String str12, ShoppingProductSource shoppingProductSource, String str13, String str14, String str15) {
        AnonymousClass002.A1E(str, 0, shoppingProductType);
        return new ShoppingProductDetailsPageKey(str, str2, str3, str4, str5, z, shoppingProductType, z2, str6, str7, str8, str9, str10, shoppingPrimaryAction, shoppingAddToCartTarget, shoppingSaveTarget, shoppingSecondaryAction, shoppingFormat, str11, str12, shoppingProductSource, str13, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsPageKey) {
                ShoppingProductDetailsPageKey shoppingProductDetailsPageKey = (ShoppingProductDetailsPageKey) obj;
                if (!C7384Etj.areEqual(this.productId, shoppingProductDetailsPageKey.productId) || !C7384Etj.areEqual(this.sessionId, shoppingProductDetailsPageKey.sessionId) || !C7384Etj.areEqual(this.brand, shoppingProductDetailsPageKey.brand) || !C7384Etj.areEqual(this.merchantName, shoppingProductDetailsPageKey.merchantName) || !C7384Etj.areEqual(this.merchantLogoUrl, shoppingProductDetailsPageKey.merchantLogoUrl) || this.isPartnerMerchant != shoppingProductDetailsPageKey.isPartnerMerchant || this.productType != shoppingProductDetailsPageKey.productType || this.canOfferBuyNow != shoppingProductDetailsPageKey.canOfferBuyNow || !C7384Etj.areEqual(this.productUrl, shoppingProductDetailsPageKey.productUrl) || !C7384Etj.areEqual(this.hydrationProductId, shoppingProductDetailsPageKey.hydrationProductId) || !C7384Etj.areEqual(this.hydrationConnectorId, shoppingProductDetailsPageKey.hydrationConnectorId) || !C7384Etj.areEqual(this.priceCurrency, shoppingProductDetailsPageKey.priceCurrency) || !C7384Etj.areEqual(this.hostMessageId, shoppingProductDetailsPageKey.hostMessageId) || this.primaryAction != shoppingProductDetailsPageKey.primaryAction || !C7384Etj.areEqual(this.addToCartTarget, shoppingProductDetailsPageKey.addToCartTarget) || !C7384Etj.areEqual(this.saveTarget, shoppingProductDetailsPageKey.saveTarget) || !C7384Etj.areEqual(this.secondaryAction, shoppingProductDetailsPageKey.secondaryAction) || this.entryFormat != shoppingProductDetailsPageKey.entryFormat || !C7384Etj.areEqual(this.widgetId, shoppingProductDetailsPageKey.widgetId) || !C7384Etj.areEqual(this.cardProductId, shoppingProductDetailsPageKey.cardProductId) || !C7384Etj.areEqual(this.source, shoppingProductDetailsPageKey.source) || !C7384Etj.areEqual(this.sharedElementKey, shoppingProductDetailsPageKey.sharedElementKey) || !C7384Etj.areEqual(this.collectionId, shoppingProductDetailsPageKey.collectionId) || !C7384Etj.areEqual(this.leadingHeroImageUrl, shoppingProductDetailsPageKey.leadingHeroImageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingProductDetailsPageKey copy$default(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, String str, String str2, String str3, String str4, String str5, boolean z, ShoppingProductType shoppingProductType, boolean z2, String str6, String str7, String str8, String str9, String str10, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSaveTarget shoppingSaveTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str11, String str12, ShoppingProductSource shoppingProductSource, String str13, String str14, String str15, int i, Object obj) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        boolean z3 = z;
        ShoppingProductType shoppingProductType2 = shoppingProductType;
        boolean z4 = z2;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str10;
        ShoppingPrimaryAction shoppingPrimaryAction2 = shoppingPrimaryAction;
        ShoppingAddToCartTarget shoppingAddToCartTarget2 = shoppingAddToCartTarget;
        ShoppingSaveTarget shoppingSaveTarget2 = shoppingSaveTarget;
        String str26 = str12;
        ShoppingProductSource shoppingProductSource2 = shoppingProductSource;
        String str27 = str13;
        String str28 = str14;
        ShoppingSecondaryAction shoppingSecondaryAction2 = shoppingSecondaryAction;
        ShoppingFormat shoppingFormat2 = shoppingFormat;
        String str29 = str11;
        String str30 = str15;
        if ((i & 1) != 0) {
            str16 = shoppingProductDetailsPageKey.productId;
        }
        if ((i & 2) != 0) {
            str17 = shoppingProductDetailsPageKey.sessionId;
        }
        if ((i & 4) != 0) {
            str18 = shoppingProductDetailsPageKey.brand;
        }
        if ((i & 8) != 0) {
            str19 = shoppingProductDetailsPageKey.merchantName;
        }
        if ((i & 16) != 0) {
            str20 = shoppingProductDetailsPageKey.merchantLogoUrl;
        }
        if ((i & 32) != 0) {
            z3 = shoppingProductDetailsPageKey.isPartnerMerchant;
        }
        if ((i & 64) != 0) {
            shoppingProductType2 = shoppingProductDetailsPageKey.productType;
        }
        if ((i & 128) != 0) {
            z4 = shoppingProductDetailsPageKey.canOfferBuyNow;
        }
        if ((i & 256) != 0) {
            str21 = shoppingProductDetailsPageKey.productUrl;
        }
        if ((i & 512) != 0) {
            str22 = shoppingProductDetailsPageKey.hydrationProductId;
        }
        if ((i & 1024) != 0) {
            str23 = shoppingProductDetailsPageKey.hydrationConnectorId;
        }
        if ((i & 2048) != 0) {
            str24 = shoppingProductDetailsPageKey.priceCurrency;
        }
        if ((i & 4096) != 0) {
            str25 = shoppingProductDetailsPageKey.hostMessageId;
        }
        if ((i & 8192) != 0) {
            shoppingPrimaryAction2 = shoppingProductDetailsPageKey.primaryAction;
        }
        if ((i & 16384) != 0) {
            shoppingAddToCartTarget2 = shoppingProductDetailsPageKey.addToCartTarget;
        }
        if ((i & 32768) != 0) {
            shoppingSaveTarget2 = shoppingProductDetailsPageKey.saveTarget;
        }
        if ((i & 65536) != 0) {
            shoppingSecondaryAction2 = shoppingProductDetailsPageKey.secondaryAction;
        }
        if ((i & 131072) != 0) {
            shoppingFormat2 = shoppingProductDetailsPageKey.entryFormat;
        }
        if ((i & 262144) != 0) {
            str29 = shoppingProductDetailsPageKey.widgetId;
        }
        if ((i & 524288) != 0) {
            str26 = shoppingProductDetailsPageKey.cardProductId;
        }
        if ((i & 1048576) != 0) {
            shoppingProductSource2 = shoppingProductDetailsPageKey.source;
        }
        if ((i & 2097152) != 0) {
            str27 = shoppingProductDetailsPageKey.sharedElementKey;
        }
        if ((i & 4194304) != 0) {
            str28 = shoppingProductDetailsPageKey.collectionId;
        }
        if ((i & 8388608) != 0) {
            str30 = shoppingProductDetailsPageKey.leadingHeroImageUrl;
        }
        String str31 = str24;
        String str32 = str25;
        return shoppingProductDetailsPageKey.copy(str16, str17, str18, str19, str20, z3, shoppingProductType2, z4, str21, str22, str23, str31, str32, shoppingPrimaryAction2, shoppingAddToCartTarget2, shoppingSaveTarget2, shoppingSecondaryAction2, shoppingFormat2, str29, str26, shoppingProductSource2, str27, str28, str30);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(shoppingProductDetailsPageKey.getProductId(), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingProductDetailsPageKey.getSessionId() != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.getSessionId(), C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shoppingProductDetailsPageKey.brand != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.brand, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shoppingProductDetailsPageKey.merchantName != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.merchantName, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shoppingProductDetailsPageKey.merchantLogoUrl != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.merchantLogoUrl, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shoppingProductDetailsPageKey.isPartnerMerchant) {
            c9j5.AA7(c9iZ, 5, shoppingProductDetailsPageKey.isPartnerMerchant);
        }
        if (zAfR || shoppingProductDetailsPageKey.productType != ShoppingProductType.UNKNOWN) {
            c9j5.AAQ(shoppingProductDetailsPageKey.productType, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || shoppingProductDetailsPageKey.canOfferBuyNow) {
            c9j5.AA7(c9iZ, 7, shoppingProductDetailsPageKey.canOfferBuyNow);
        }
        if (zAfR || shoppingProductDetailsPageKey.productUrl != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.productUrl, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || shoppingProductDetailsPageKey.hydrationProductId != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.hydrationProductId, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || shoppingProductDetailsPageKey.hydrationConnectorId != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.hydrationConnectorId, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || shoppingProductDetailsPageKey.priceCurrency != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.priceCurrency, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || shoppingProductDetailsPageKey.getHostMessageId() != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.getHostMessageId(), C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || shoppingProductDetailsPageKey.primaryAction != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.primaryAction, C3cH.A15(f0cArr, 13), c9iZ, 13);
        }
        if (zAfR || shoppingProductDetailsPageKey.addToCartTarget != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.addToCartTarget, C3cH.A15(f0cArr, 14), c9iZ, 14);
        }
        if (zAfR || shoppingProductDetailsPageKey.saveTarget != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.saveTarget, C3cH.A15(f0cArr, 15), c9iZ, 15);
        }
        if (zAfR || shoppingProductDetailsPageKey.secondaryAction != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.secondaryAction, ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 16);
        }
        c9j5.AAP(shoppingProductDetailsPageKey.entryFormat, C3cH.A15(f0cArr, 17), c9iZ, 17);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(shoppingProductDetailsPageKey.widgetId, c07779iq, c9iZ, 18);
        c9j5.AAP(shoppingProductDetailsPageKey.cardProductId, c07779iq, c9iZ, 19);
        if (zAfR || shoppingProductDetailsPageKey.getSource() != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.getSource(), ShoppingProductSource$$serializer.INSTANCE, c9iZ, 20);
        }
        if (zAfR || shoppingProductDetailsPageKey.sharedElementKey != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.sharedElementKey, c07779iq, c9iZ, 21);
        }
        if (zAfR || shoppingProductDetailsPageKey.collectionId != null) {
            c9j5.AAP(shoppingProductDetailsPageKey.collectionId, c07779iq, c9iZ, 22);
        }
        c9j5.AAP(shoppingProductDetailsPageKey.leadingHeroImageUrl, c07779iq, c9iZ, 23);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component10() {
        return this.hydrationProductId;
    }

    public final String component11() {
        return this.hydrationConnectorId;
    }

    public final String component12() {
        return this.priceCurrency;
    }

    public final String component13() {
        return this.hostMessageId;
    }

    public final ShoppingPrimaryAction component14() {
        return this.primaryAction;
    }

    public final ShoppingAddToCartTarget component15() {
        return this.addToCartTarget;
    }

    public final ShoppingSaveTarget component16() {
        return this.saveTarget;
    }

    public final ShoppingSecondaryAction component17() {
        return this.secondaryAction;
    }

    public final ShoppingFormat component18() {
        return this.entryFormat;
    }

    public final String component19() {
        return this.widgetId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component20() {
        return this.cardProductId;
    }

    public final ShoppingProductSource component21() {
        return this.source;
    }

    public final String component22() {
        return this.sharedElementKey;
    }

    public final String component23() {
        return this.collectionId;
    }

    public final String component24() {
        return this.leadingHeroImageUrl;
    }

    public final String component3() {
        return this.brand;
    }

    public final String component4() {
        return this.merchantName;
    }

    public final String component5() {
        return this.merchantLogoUrl;
    }

    public final boolean component6() {
        return this.isPartnerMerchant;
    }

    public final ShoppingProductType component7() {
        return this.productType;
    }

    public final boolean component8() {
        return this.canOfferBuyNow;
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

    public final boolean getCanOfferBuyNow() {
        return this.canOfferBuyNow;
    }

    public final String getCardProductId() {
        return this.cardProductId;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final ShoppingFormat getEntryFormat() {
        return this.entryFormat;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getHydrationConnectorId() {
        return this.hydrationConnectorId;
    }

    public final String getHydrationProductId() {
        return this.hydrationProductId;
    }

    public final String getLeadingHeroImageUrl() {
        return this.leadingHeroImageUrl;
    }

    public final String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final ShoppingPrimaryAction getPrimaryAction() {
        return this.primaryAction;
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

    public final ShoppingSaveTarget getSaveTarget() {
        return this.saveTarget;
    }

    public final ShoppingSecondaryAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public String getSessionId() {
        return this.sessionId;
    }

    public final String getSharedElementKey() {
        return this.sharedElementKey;
    }

    @Override // com.facebook.aura.navigation.key.ProductDetailsNavKey
    public ShoppingProductSource getSource() {
        return this.source;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((C0KA.A01(AnonymousClass005.A0F(this.productType, C0KA.A01((((((((AnonymousClass001.A0G(this.productId) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + AnonymousClass006.A0G(this.merchantName)) * 31) + AnonymousClass006.A0G(this.merchantLogoUrl)) * 31, this.isPartnerMerchant)), this.canOfferBuyNow) + AnonymousClass006.A0G(this.productUrl)) * 31) + AnonymousClass006.A0G(this.hydrationProductId)) * 31) + AnonymousClass006.A0G(this.hydrationConnectorId)) * 31) + AnonymousClass006.A0G(this.priceCurrency)) * 31) + AnonymousClass006.A0G(this.hostMessageId)) * 31) + AnonymousClass006.A0D(this.primaryAction)) * 31) + AnonymousClass006.A0D(this.addToCartTarget)) * 31) + AnonymousClass006.A0D(this.saveTarget)) * 31) + AnonymousClass006.A0D(this.secondaryAction)) * 31) + AnonymousClass006.A0D(this.entryFormat)) * 31) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0G(this.cardProductId)) * 31) + AnonymousClass006.A0D(this.source)) * 31) + AnonymousClass006.A0G(this.sharedElementKey)) * 31) + AnonymousClass006.A0G(this.collectionId)) * 31) + AnonymousClass005.A0H(this.leadingHeroImageUrl);
    }

    public final boolean isPartnerMerchant() {
        return this.isPartnerMerchant;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingProductDetailsPageKey(int i, String str, String str2, String str3, String str4, String str5, boolean z, ShoppingProductType shoppingProductType, boolean z2, String str6, String str7, String str8, String str9, String str10, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSaveTarget shoppingSaveTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str11, String str12, ShoppingProductSource shoppingProductSource, String str13, String str14, String str15, C2hx c2hx) {
        if (9306113 != (i & 9306113)) {
            C9iI.A00(ShoppingProductDetailsPageKey$$serializer.descriptor, i, 9306113);
            throw F60.createAndThrow();
        }
        this.productId = str;
        if ((i & 2) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str2;
        }
        if ((i & 4) == 0) {
            this.brand = null;
        } else {
            this.brand = str3;
        }
        if ((i & 8) == 0) {
            this.merchantName = null;
        } else {
            this.merchantName = str4;
        }
        if ((i & 16) == 0) {
            this.merchantLogoUrl = null;
        } else {
            this.merchantLogoUrl = str5;
        }
        if ((i & 32) == 0) {
            this.isPartnerMerchant = false;
        } else {
            this.isPartnerMerchant = z;
        }
        if ((i & 64) == 0) {
            this.productType = ShoppingProductType.UNKNOWN;
        } else {
            this.productType = shoppingProductType;
        }
        if ((i & 128) == 0) {
            this.canOfferBuyNow = false;
        } else {
            this.canOfferBuyNow = z2;
        }
        if ((i & 256) == 0) {
            this.productUrl = null;
        } else {
            this.productUrl = str6;
        }
        if ((i & 512) == 0) {
            this.hydrationProductId = null;
        } else {
            this.hydrationProductId = str7;
        }
        if ((i & 1024) == 0) {
            this.hydrationConnectorId = null;
        } else {
            this.hydrationConnectorId = str8;
        }
        if ((i & 2048) == 0) {
            this.priceCurrency = null;
        } else {
            this.priceCurrency = str9;
        }
        if ((i & 4096) == 0) {
            this.hostMessageId = null;
        } else {
            this.hostMessageId = str10;
        }
        if ((i & 8192) == 0) {
            this.primaryAction = null;
        } else {
            this.primaryAction = shoppingPrimaryAction;
        }
        if ((i & 16384) == 0) {
            this.addToCartTarget = null;
        } else {
            this.addToCartTarget = shoppingAddToCartTarget;
        }
        if ((32768 & i) == 0) {
            this.saveTarget = null;
        } else {
            this.saveTarget = shoppingSaveTarget;
        }
        if ((65536 & i) == 0) {
            this.secondaryAction = null;
        } else {
            this.secondaryAction = shoppingSecondaryAction;
        }
        this.entryFormat = shoppingFormat;
        this.widgetId = str11;
        this.cardProductId = str12;
        if ((1048576 & i) == 0) {
            this.source = null;
        } else {
            this.source = shoppingProductSource;
        }
        if ((2097152 & i) == 0) {
            this.sharedElementKey = null;
        } else {
            this.sharedElementKey = str13;
        }
        if ((i & 4194304) == 0) {
            this.collectionId = null;
        } else {
            this.collectionId = str14;
        }
        this.leadingHeroImageUrl = str15;
    }

    public /* synthetic */ ShoppingProductDetailsPageKey(String str, String str2, String str3, String str4, String str5, boolean z, ShoppingProductType shoppingProductType, boolean z2, String str6, String str7, String str8, String str9, String str10, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingAddToCartTarget shoppingAddToCartTarget, ShoppingSaveTarget shoppingSaveTarget, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str11, String str12, ShoppingProductSource shoppingProductSource, String str13, String str14, String str15, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, AnonymousClass002.A1R(i, z), (i & 64) != 0 ? ShoppingProductType.UNKNOWN : shoppingProductType, C3cH.A1N(i, z2), (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : shoppingPrimaryAction, (i & 16384) != 0 ? null : shoppingAddToCartTarget, (32768 & i) != 0 ? null : shoppingSaveTarget, (65536 & i) != 0 ? null : shoppingSecondaryAction, shoppingFormat, str11, str12, (1048576 & i) != 0 ? null : shoppingProductSource, (2097152 & i) != 0 ? null : str13, (i & 4194304) != 0 ? null : str14, str15);
    }
}
