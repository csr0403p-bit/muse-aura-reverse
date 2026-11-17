package com.facebook.aura.ccv.nativeflow.ui;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig;
import com.facebook.aura.ccv.nativeflow.HatchCcvError;
import com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSStepUp;
import com.facebook.aura.payments.cardvalidation.HatchCardNetwork;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes3.dex */
public final class HatchCcvUiState extends C06G {
    public static final int $stable = 8;
    public final AHD<HatchCardNetwork> acceptedNetworks;
    public final String billingCountry;
    public final HatchCardNetwork brand;
    public final String cardNumber;
    public final HatchCardFieldError cardNumberError;
    public final String chargeAmount;
    public final String chargeCurrency;
    public final HatchCcvCheckoutPhase checkoutPhase;
    public final AHD<HatchCcvCountryConfig> countries;
    public final String expiry;
    public final HatchCardFieldError expiryError;
    public final boolean isCountrySelectable;
    public final boolean isSubmitEnabled;
    public final boolean isSubmitting;
    public final AHD<HatchLinkableAccountType> linkableAccountTypes;
    public final HatchCcvPostalFieldConfig postalField;
    public final String screenSubtitle;
    public final String screenTitle;
    public final String securityCode;
    public final HatchCardFieldError securityCodeError;
    public final HatchCcvError submitError;
    public final String submitServerMessage;
    public final String submitServerTitle;
    public final AHD<String> supportedCardTypes;
    public final HatchThreeDSStepUp threeDSChallenge;
    public final String zip;
    public final HatchCardFieldError zipError;
    public final String zipServerError;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCcvUiState) {
                HatchCcvUiState hatchCcvUiState = (HatchCcvUiState) obj;
                if (!C7384Etj.areEqual(this.cardNumber, hatchCcvUiState.cardNumber) || !C7384Etj.areEqual(this.expiry, hatchCcvUiState.expiry) || !C7384Etj.areEqual(this.securityCode, hatchCcvUiState.securityCode) || !C7384Etj.areEqual(this.zip, hatchCcvUiState.zip) || this.brand != hatchCcvUiState.brand || !C7384Etj.areEqual(this.supportedCardTypes, hatchCcvUiState.supportedCardTypes) || !C7384Etj.areEqual(this.acceptedNetworks, hatchCcvUiState.acceptedNetworks) || this.cardNumberError != hatchCcvUiState.cardNumberError || this.expiryError != hatchCcvUiState.expiryError || this.securityCodeError != hatchCcvUiState.securityCodeError || this.zipError != hatchCcvUiState.zipError || !C7384Etj.areEqual(this.zipServerError, hatchCcvUiState.zipServerError) || !C7384Etj.areEqual(this.screenTitle, hatchCcvUiState.screenTitle) || !C7384Etj.areEqual(this.screenSubtitle, hatchCcvUiState.screenSubtitle) || !C7384Etj.areEqual(this.chargeAmount, hatchCcvUiState.chargeAmount) || !C7384Etj.areEqual(this.chargeCurrency, hatchCcvUiState.chargeCurrency) || !C7384Etj.areEqual(this.billingCountry, hatchCcvUiState.billingCountry) || !C7384Etj.areEqual(this.countries, hatchCcvUiState.countries) || this.isCountrySelectable != hatchCcvUiState.isCountrySelectable || !C7384Etj.areEqual(this.postalField, hatchCcvUiState.postalField) || this.isSubmitEnabled != hatchCcvUiState.isSubmitEnabled || this.isSubmitting != hatchCcvUiState.isSubmitting || this.checkoutPhase != hatchCcvUiState.checkoutPhase || this.submitError != hatchCcvUiState.submitError || !C7384Etj.areEqual(this.submitServerTitle, hatchCcvUiState.submitServerTitle) || !C7384Etj.areEqual(this.submitServerMessage, hatchCcvUiState.submitServerMessage) || !C7384Etj.areEqual(this.linkableAccountTypes, hatchCcvUiState.linkableAccountTypes) || !C7384Etj.areEqual(this.threeDSChallenge, hatchCcvUiState.threeDSChallenge)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.cardNumber;
    }

    public final HatchCardFieldError component10() {
        return this.securityCodeError;
    }

    public final HatchCardFieldError component11() {
        return this.zipError;
    }

    public final String component12() {
        return this.zipServerError;
    }

    public final String component13() {
        return this.screenTitle;
    }

    public final String component14() {
        return this.screenSubtitle;
    }

    public final String component15() {
        return this.chargeAmount;
    }

    public final String component16() {
        return this.chargeCurrency;
    }

    public final String component17() {
        return this.billingCountry;
    }

    public final AHD<HatchCcvCountryConfig> component18() {
        return this.countries;
    }

    public final boolean component19() {
        return this.isCountrySelectable;
    }

    public final String component2() {
        return this.expiry;
    }

    public final HatchCcvPostalFieldConfig component20() {
        return this.postalField;
    }

    public final boolean component21() {
        return this.isSubmitEnabled;
    }

    public final boolean component22() {
        return this.isSubmitting;
    }

    public final HatchCcvCheckoutPhase component23() {
        return this.checkoutPhase;
    }

    public final HatchCcvError component24() {
        return this.submitError;
    }

    public final String component25() {
        return this.submitServerTitle;
    }

    public final String component26() {
        return this.submitServerMessage;
    }

    public final AHD<HatchLinkableAccountType> component27() {
        return this.linkableAccountTypes;
    }

    public final HatchThreeDSStepUp component28() {
        return this.threeDSChallenge;
    }

    public final String component3() {
        return this.securityCode;
    }

    public final String component4() {
        return this.zip;
    }

    public final HatchCardNetwork component5() {
        return this.brand;
    }

    public final AHD<String> component6() {
        return this.supportedCardTypes;
    }

    public final AHD<HatchCardNetwork> component7() {
        return this.acceptedNetworks;
    }

    public final HatchCardFieldError component8() {
        return this.cardNumberError;
    }

    public final HatchCardFieldError component9() {
        return this.expiryError;
    }

    public final AHD<HatchCardNetwork> getAcceptedNetworks() {
        return this.acceptedNetworks;
    }

    public final String getBillingCountry() {
        return this.billingCountry;
    }

    public final HatchCardNetwork getBrand() {
        return this.brand;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final HatchCardFieldError getCardNumberError() {
        return this.cardNumberError;
    }

    public final String getChargeAmount() {
        return this.chargeAmount;
    }

    public final String getChargeCurrency() {
        return this.chargeCurrency;
    }

    public final HatchCcvCheckoutPhase getCheckoutPhase() {
        return this.checkoutPhase;
    }

    public final AHD<HatchCcvCountryConfig> getCountries() {
        return this.countries;
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final HatchCardFieldError getExpiryError() {
        return this.expiryError;
    }

    public final AHD<HatchLinkableAccountType> getLinkableAccountTypes() {
        return this.linkableAccountTypes;
    }

    public final HatchCcvPostalFieldConfig getPostalField() {
        return this.postalField;
    }

    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public final String getSecurityCode() {
        return this.securityCode;
    }

    public final HatchCardFieldError getSecurityCodeError() {
        return this.securityCodeError;
    }

    public final HatchCcvError getSubmitError() {
        return this.submitError;
    }

    public final String getSubmitServerMessage() {
        return this.submitServerMessage;
    }

    public final String getSubmitServerTitle() {
        return this.submitServerTitle;
    }

    public final AHD<String> getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    public final HatchThreeDSStepUp getThreeDSChallenge() {
        return this.threeDSChallenge;
    }

    public final String getZip() {
        return this.zip;
    }

    public final HatchCardFieldError getZipError() {
        return this.zipError;
    }

    public final String getZipServerError() {
        return this.zipServerError;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.linkableAccountTypes, (((((AnonymousClass005.A0F(this.checkoutPhase, C0KA.A01(C0KA.A01((C0KA.A01(AnonymousClass005.A0F(this.countries, AnonymousClass005.A0I(this.billingCountry, AnonymousClass005.A0I(this.chargeCurrency, AnonymousClass005.A0I(this.chargeAmount, (((((((((((((AnonymousClass005.A0F(this.acceptedNetworks, AnonymousClass005.A0F(this.supportedCardTypes, AnonymousClass005.A0F(this.brand, AnonymousClass005.A0I(this.zip, AnonymousClass005.A0I(this.securityCode, AnonymousClass005.A0I(this.expiry, AnonymousClass001.A0G(this.cardNumber))))))) + AnonymousClass006.A0D(this.cardNumberError)) * 31) + AnonymousClass006.A0D(this.expiryError)) * 31) + AnonymousClass006.A0D(this.securityCodeError)) * 31) + AnonymousClass006.A0D(this.zipError)) * 31) + AnonymousClass006.A0G(this.zipServerError)) * 31) + AnonymousClass006.A0G(this.screenTitle)) * 31) + AnonymousClass006.A0G(this.screenSubtitle)) * 31)))), this.isCountrySelectable) + AnonymousClass006.A0D(this.postalField)) * 31, this.isSubmitEnabled), this.isSubmitting)) + AnonymousClass006.A0D(this.submitError)) * 31) + AnonymousClass006.A0G(this.submitServerTitle)) * 31) + AnonymousClass006.A0G(this.submitServerMessage)) * 31) + C3cH.A02(this.threeDSChallenge);
    }

    public final boolean isCountrySelectable() {
        return this.isCountrySelectable;
    }

    public final boolean isSubmitEnabled() {
        return this.isSubmitEnabled;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final HatchCcvUiState copy(String str, String str2, String str3, String str4, HatchCardNetwork hatchCardNetwork, AHD<String> ahd, AHD<? extends HatchCardNetwork> ahd2, HatchCardFieldError hatchCardFieldError, HatchCardFieldError hatchCardFieldError2, HatchCardFieldError hatchCardFieldError3, HatchCardFieldError hatchCardFieldError4, String str5, String str6, String str7, String str8, String str9, String str10, AHD<HatchCcvCountryConfig> ahd3, boolean z, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, boolean z2, boolean z3, HatchCcvCheckoutPhase hatchCcvCheckoutPhase, HatchCcvError hatchCcvError, String str11, String str12, AHD<? extends HatchLinkableAccountType> ahd4, HatchThreeDSStepUp hatchThreeDSStepUp) {
        AnonymousClass005.A17(str, str2, str3, str4, hatchCardNetwork);
        AnonymousClass003.A0z(ahd, ahd2);
        C60Q.A1F(str8, 14, str9);
        C3cI.A1I(str10, 16, ahd3);
        C7384Etj.A0Y(hatchCcvCheckoutPhase, 22);
        C7384Etj.A0Y(ahd4, 26);
        return new HatchCcvUiState(str, str2, str3, str4, hatchCardNetwork, ahd, ahd2, hatchCardFieldError, hatchCardFieldError2, hatchCardFieldError3, hatchCardFieldError4, str5, str6, str7, str8, str9, str10, ahd3, z, hatchCcvPostalFieldConfig, z2, z3, hatchCcvCheckoutPhase, hatchCcvError, str11, str12, ahd4, hatchThreeDSStepUp);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvUiState(String str, String str2, String str3, String str4, HatchCardNetwork hatchCardNetwork, AHD<String> ahd, AHD<? extends HatchCardNetwork> ahd2, HatchCardFieldError hatchCardFieldError, HatchCardFieldError hatchCardFieldError2, HatchCardFieldError hatchCardFieldError3, HatchCardFieldError hatchCardFieldError4, String str5, String str6, String str7, String str8, String str9, String str10, AHD<HatchCcvCountryConfig> ahd3, boolean z, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, boolean z2, boolean z3, HatchCcvCheckoutPhase hatchCcvCheckoutPhase, HatchCcvError hatchCcvError, String str11, String str12, AHD<? extends HatchLinkableAccountType> ahd4, HatchThreeDSStepUp hatchThreeDSStepUp) {
        AnonymousClass005.A17(str, str2, str3, str4, hatchCardNetwork);
        AnonymousClass003.A0z(ahd, ahd2);
        C60Q.A1F(str8, 14, str9);
        C3cI.A1I(str10, 16, ahd3);
        C7384Etj.A0Y(hatchCcvCheckoutPhase, 22);
        C7384Etj.A0Y(ahd4, 26);
        this.cardNumber = str;
        this.expiry = str2;
        this.securityCode = str3;
        this.zip = str4;
        this.brand = hatchCardNetwork;
        this.supportedCardTypes = ahd;
        this.acceptedNetworks = ahd2;
        this.cardNumberError = hatchCardFieldError;
        this.expiryError = hatchCardFieldError2;
        this.securityCodeError = hatchCardFieldError3;
        this.zipError = hatchCardFieldError4;
        this.zipServerError = str5;
        this.screenTitle = str6;
        this.screenSubtitle = str7;
        this.chargeAmount = str8;
        this.chargeCurrency = str9;
        this.billingCountry = str10;
        this.countries = ahd3;
        this.isCountrySelectable = z;
        this.postalField = hatchCcvPostalFieldConfig;
        this.isSubmitEnabled = z2;
        this.isSubmitting = z3;
        this.checkoutPhase = hatchCcvCheckoutPhase;
        this.submitError = hatchCcvError;
        this.submitServerTitle = str11;
        this.submitServerMessage = str12;
        this.linkableAccountTypes = ahd4;
        this.threeDSChallenge = hatchThreeDSStepUp;
    }

    public static /* synthetic */ HatchCcvUiState copy$default(HatchCcvUiState hatchCcvUiState, String str, String str2, String str3, String str4, HatchCardNetwork hatchCardNetwork, AHD ahd, AHD ahd2, HatchCardFieldError hatchCardFieldError, HatchCardFieldError hatchCardFieldError2, HatchCardFieldError hatchCardFieldError3, HatchCardFieldError hatchCardFieldError4, String str5, String str6, String str7, String str8, String str9, String str10, AHD ahd3, boolean z, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, boolean z2, boolean z3, HatchCcvCheckoutPhase hatchCcvCheckoutPhase, HatchCcvError hatchCcvError, String str11, String str12, AHD ahd4, HatchThreeDSStepUp hatchThreeDSStepUp, int i, Object obj) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        HatchCardNetwork hatchCardNetwork2 = hatchCardNetwork;
        AHD ahd5 = ahd;
        AHD ahd6 = ahd2;
        HatchCardFieldError hatchCardFieldError5 = hatchCardFieldError;
        HatchCardFieldError hatchCardFieldError6 = hatchCardFieldError2;
        HatchCardFieldError hatchCardFieldError7 = hatchCardFieldError3;
        HatchCardFieldError hatchCardFieldError8 = hatchCardFieldError4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        HatchCcvError hatchCcvError2 = hatchCcvError;
        String str22 = str11;
        String str23 = str12;
        AHD ahd7 = ahd4;
        String str24 = str10;
        AHD ahd8 = ahd3;
        HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig2 = hatchCcvPostalFieldConfig;
        HatchCcvCheckoutPhase hatchCcvCheckoutPhase2 = hatchCcvCheckoutPhase;
        HatchThreeDSStepUp hatchThreeDSStepUp2 = hatchThreeDSStepUp;
        if ((i & 1) != 0) {
            str13 = hatchCcvUiState.cardNumber;
        }
        if ((i & 2) != 0) {
            str14 = hatchCcvUiState.expiry;
        }
        if ((i & 4) != 0) {
            str15 = hatchCcvUiState.securityCode;
        }
        if ((i & 8) != 0) {
            str16 = hatchCcvUiState.zip;
        }
        if ((i & 16) != 0) {
            hatchCardNetwork2 = hatchCcvUiState.brand;
        }
        if ((i & 32) != 0) {
            ahd5 = hatchCcvUiState.supportedCardTypes;
        }
        if ((i & 64) != 0) {
            ahd6 = hatchCcvUiState.acceptedNetworks;
        }
        if ((i & 128) != 0) {
            hatchCardFieldError5 = hatchCcvUiState.cardNumberError;
        }
        if ((i & 256) != 0) {
            hatchCardFieldError6 = hatchCcvUiState.expiryError;
        }
        if ((i & 512) != 0) {
            hatchCardFieldError7 = hatchCcvUiState.securityCodeError;
        }
        if ((i & 1024) != 0) {
            hatchCardFieldError8 = hatchCcvUiState.zipError;
        }
        if ((i & 2048) != 0) {
            str17 = hatchCcvUiState.zipServerError;
        }
        if ((i & 4096) != 0) {
            str18 = hatchCcvUiState.screenTitle;
        }
        if ((i & 8192) != 0) {
            str19 = hatchCcvUiState.screenSubtitle;
        }
        if ((i & 16384) != 0) {
            str20 = hatchCcvUiState.chargeAmount;
        }
        if ((i & 32768) != 0) {
            str21 = hatchCcvUiState.chargeCurrency;
        }
        if ((i & 65536) != 0) {
            str24 = hatchCcvUiState.billingCountry;
        }
        if ((i & 131072) != 0) {
            ahd8 = hatchCcvUiState.countries;
        }
        if ((i & 262144) != 0) {
            z4 = hatchCcvUiState.isCountrySelectable;
        }
        if ((i & 524288) != 0) {
            hatchCcvPostalFieldConfig2 = hatchCcvUiState.postalField;
        }
        if ((i & 1048576) != 0) {
            z5 = hatchCcvUiState.isSubmitEnabled;
        }
        if ((i & 2097152) != 0) {
            z6 = hatchCcvUiState.isSubmitting;
        }
        if ((i & 4194304) != 0) {
            hatchCcvCheckoutPhase2 = hatchCcvUiState.checkoutPhase;
        }
        if ((i & 8388608) != 0) {
            hatchCcvError2 = hatchCcvUiState.submitError;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str22 = hatchCcvUiState.submitServerTitle;
        }
        if ((i & 33554432) != 0) {
            str23 = hatchCcvUiState.submitServerMessage;
        }
        if ((i & 67108864) != 0) {
            ahd7 = hatchCcvUiState.linkableAccountTypes;
        }
        if ((i & 134217728) != 0) {
            hatchThreeDSStepUp2 = hatchCcvUiState.threeDSChallenge;
        }
        return hatchCcvUiState.copy(str13, str14, str15, str16, hatchCardNetwork2, ahd5, ahd6, hatchCardFieldError5, hatchCardFieldError6, hatchCardFieldError7, hatchCardFieldError8, str17, str18, str19, str20, str21, str24, ahd8, z4, hatchCcvPostalFieldConfig2, z5, z6, hatchCcvCheckoutPhase2, hatchCcvError2, str22, str23, ahd7, hatchThreeDSStepUp2);
    }

    public /* synthetic */ HatchCcvUiState(String str, String str2, String str3, String str4, HatchCardNetwork hatchCardNetwork, AHD ahd, AHD ahd2, HatchCardFieldError hatchCardFieldError, HatchCardFieldError hatchCardFieldError2, HatchCardFieldError hatchCardFieldError3, HatchCardFieldError hatchCardFieldError4, String str5, String str6, String str7, String str8, String str9, String str10, AHD ahd3, boolean z, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, boolean z2, boolean z3, HatchCcvCheckoutPhase hatchCcvCheckoutPhase, HatchCcvError hatchCcvError, String str11, String str12, AHD ahd4, HatchThreeDSStepUp hatchThreeDSStepUp, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? HatchCardNetwork.UNKNOWN : hatchCardNetwork, (i & 32) != 0 ? AHI.A01 : ahd, (i & 64) != 0 ? AHI.A01 : ahd2, (i & 128) != 0 ? null : hatchCardFieldError, (i & 256) != 0 ? null : hatchCardFieldError2, (i & 512) != 0 ? null : hatchCardFieldError3, (i & 1024) != 0 ? null : hatchCardFieldError4, C3cG.A0e(str5, i & 2048), C3cG.A0e(str6, i & 4096), C3cG.A0e(str7, i & 8192), (i & 16384) != 0 ? "1.00" : str8, (i & 32768) != 0 ? "USD" : str9, (i & 65536) != 0 ? "US" : str10, (i & 131072) != 0 ? AHI.A01 : ahd3, C3cG.A1K(i & 262144, z), (i & 524288) != 0 ? null : hatchCcvPostalFieldConfig, C3cH.A1L(i, 1048576, z2), (i & 2097152) == 0 ? z3 : false, (i & 4194304) != 0 ? HatchCcvCheckoutPhase.LOADING : hatchCcvCheckoutPhase, (i & 8388608) != 0 ? null : hatchCcvError, C3cI.A0V(i, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, str11), C3cI.A0V(i, 33554432, str12), (i & 67108864) != 0 ? AHI.A01 : ahd4, (i & 134217728) != 0 ? null : hatchThreeDSStepUp);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvUiState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 268435455, 0 == true ? 1 : 0);
    }
}
