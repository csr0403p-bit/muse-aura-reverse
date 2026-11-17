package com.facebook.aura.login.nativeflow;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes2.dex */
public final class NativeLoginUiState extends C06G {
    public static final int $stable = 8;
    public final String accountOptions;
    public final AHD<NativeLoginAccountUiModel> accountSelectionAccounts;
    public final boolean accountSelectionMuseLink;
    public final AHD<NativeLoginAccountUiModel> accounts;
    public final String birthday;
    public final NativeLoginBirthdayError birthdayError;
    public final HatchCheckpointChallenge checkpoint;
    public final NativeLoginCheckpointAction checkpointPrimaryAction;
    public final boolean checkpointWebViewVisible;
    public final boolean collectsSignupBirthday;
    public final boolean collectsSignupName;
    public final boolean collectsSignupPassword;
    public final HatchTosDisclosure completionClause;
    public final HatchTosDisclosure completionTos;
    public final String destination;
    public final AHD<NativeLoginAccountUiModel> disclosedAccounts;
    public final HatchTosDisclosure entryTos;
    public final NativeLoginErrorDialogContent errorDialog;
    public final NativeLoginFieldError fieldError;
    public final String identifier;
    public final NativeLoginIdentifierError identifierError;
    public final boolean isEmailDestination;
    public final boolean isLoading;
    public final boolean isPasswordLoginAvailable;
    public final boolean isRemovingProfile;
    public final boolean isTwoFactorPhoneFallback;
    public final AHD<Boolean> itemizedConsentAccepted;
    public final boolean itemizedConsentAllAccepted;
    public final boolean itemizedConsentConfirmEnabled;
    public final NativeLoginItemizedConsentTarget itemizedConsentTarget;
    public final HatchLandingPresentation landingPresentation;
    public final NativeLoginLinkingDisclosureUiState linkingDisclosure;
    public final boolean mayHaveGoogleAccount;
    public final AHD<NativeLoginAccountUiModel> neutralCollapsedAccounts;
    public final NtpUpsellUiState ntpUpsell;
    public final AHD<NtpUpsellChoiceRowUiState> ntpUpsellChoice;
    public final HatchLandingPresentation ntpUpsellChoiceLandingPresentation;
    public final HatchTosDisclosure ntpUpsellChoiceTos;
    public final String otp;
    public final HatchAuthFlow otpFlow;
    public final boolean otpShowsLoginCopy;
    public final String password;
    public final HatchPasswordCopy passwordCopy;
    public final HatchReactivationChallenge reactivation;
    public final Boolean rememberDeviceValue;
    public final AHD<NativeLoginAccountUiModel> removableAccounts;
    public final boolean requiresSignupConsent;
    public final NativeLoginResolveState resolveState;
    public final String selectedAccountId;
    public final String selectedAccountSelectionId;
    public final CountryDialCode selectedCountry;
    public final AHD<NativeLoginAccountUiModel> shownAccounts;
    public final String signupFirstName;
    public final String signupLastName;
    public final String signupPassword;
    public final String twoFactorCode;
    public final Integer twoFactorCodeLength;
    public final HatchTwoFactorMethod twoFactorMethod;
    public final AHD<HatchTwoFactorMethod> twoFactorMethods;
    public final HatchTwoFactorSourceApp twoFactorSourceApp;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginUiState) {
                NativeLoginUiState nativeLoginUiState = (NativeLoginUiState) obj;
                if (!C7384Etj.areEqual(this.accounts, nativeLoginUiState.accounts) || !C7384Etj.areEqual(this.disclosedAccounts, nativeLoginUiState.disclosedAccounts) || !C7384Etj.areEqual(this.removableAccounts, nativeLoginUiState.removableAccounts) || !C7384Etj.areEqual(this.accountOptions, nativeLoginUiState.accountOptions) || !C7384Etj.areEqual(this.selectedAccountId, nativeLoginUiState.selectedAccountId) || !C7384Etj.areEqual(this.accountSelectionAccounts, nativeLoginUiState.accountSelectionAccounts) || this.accountSelectionMuseLink != nativeLoginUiState.accountSelectionMuseLink || !C7384Etj.areEqual(this.selectedAccountSelectionId, nativeLoginUiState.selectedAccountSelectionId) || !C7384Etj.areEqual(this.identifier, nativeLoginUiState.identifier) || !C7384Etj.areEqual(this.destination, nativeLoginUiState.destination) || this.isEmailDestination != nativeLoginUiState.isEmailDestination || !C7384Etj.areEqual(this.otp, nativeLoginUiState.otp) || this.isPasswordLoginAvailable != nativeLoginUiState.isPasswordLoginAvailable || this.otpFlow != nativeLoginUiState.otpFlow || this.otpShowsLoginCopy != nativeLoginUiState.otpShowsLoginCopy || !C7384Etj.areEqual(this.rememberDeviceValue, nativeLoginUiState.rememberDeviceValue) || !C7384Etj.areEqual(this.password, nativeLoginUiState.password) || this.isTwoFactorPhoneFallback != nativeLoginUiState.isTwoFactorPhoneFallback || !C7384Etj.areEqual(this.passwordCopy, nativeLoginUiState.passwordCopy) || !C7384Etj.areEqual(this.twoFactorCode, nativeLoginUiState.twoFactorCode) || !C7384Etj.areEqual(this.twoFactorMethods, nativeLoginUiState.twoFactorMethods) || this.twoFactorSourceApp != nativeLoginUiState.twoFactorSourceApp || !C7384Etj.areEqual(this.twoFactorMethod, nativeLoginUiState.twoFactorMethod) || !C7384Etj.areEqual(this.twoFactorCodeLength, nativeLoginUiState.twoFactorCodeLength) || !C7384Etj.areEqual(this.checkpoint, nativeLoginUiState.checkpoint) || !C7384Etj.areEqual(this.reactivation, nativeLoginUiState.reactivation) || this.checkpointWebViewVisible != nativeLoginUiState.checkpointWebViewVisible || this.checkpointPrimaryAction != nativeLoginUiState.checkpointPrimaryAction || !C7384Etj.areEqual(this.ntpUpsell, nativeLoginUiState.ntpUpsell) || !C7384Etj.areEqual(this.ntpUpsellChoice, nativeLoginUiState.ntpUpsellChoice) || !C7384Etj.areEqual(this.ntpUpsellChoiceTos, nativeLoginUiState.ntpUpsellChoiceTos) || this.ntpUpsellChoiceLandingPresentation != nativeLoginUiState.ntpUpsellChoiceLandingPresentation || !C7384Etj.areEqual(this.linkingDisclosure, nativeLoginUiState.linkingDisclosure) || !C7384Etj.areEqual(this.itemizedConsentAccepted, nativeLoginUiState.itemizedConsentAccepted) || this.itemizedConsentAllAccepted != nativeLoginUiState.itemizedConsentAllAccepted || this.itemizedConsentConfirmEnabled != nativeLoginUiState.itemizedConsentConfirmEnabled || !C7384Etj.areEqual(this.itemizedConsentTarget, nativeLoginUiState.itemizedConsentTarget) || !C7384Etj.areEqual(this.birthday, nativeLoginUiState.birthday) || this.birthdayError != nativeLoginUiState.birthdayError || !C7384Etj.areEqual(this.signupPassword, nativeLoginUiState.signupPassword) || this.collectsSignupPassword != nativeLoginUiState.collectsSignupPassword || !C7384Etj.areEqual(this.signupFirstName, nativeLoginUiState.signupFirstName) || !C7384Etj.areEqual(this.signupLastName, nativeLoginUiState.signupLastName) || this.collectsSignupName != nativeLoginUiState.collectsSignupName || this.collectsSignupBirthday != nativeLoginUiState.collectsSignupBirthday || this.requiresSignupConsent != nativeLoginUiState.requiresSignupConsent || this.isLoading != nativeLoginUiState.isLoading || this.isRemovingProfile != nativeLoginUiState.isRemovingProfile || !C7384Etj.areEqual(this.errorDialog, nativeLoginUiState.errorDialog) || !C7384Etj.areEqual(this.fieldError, nativeLoginUiState.fieldError) || this.identifierError != nativeLoginUiState.identifierError || this.resolveState != nativeLoginUiState.resolveState || !C7384Etj.areEqual(this.selectedCountry, nativeLoginUiState.selectedCountry) || !C7384Etj.areEqual(this.entryTos, nativeLoginUiState.entryTos) || this.landingPresentation != nativeLoginUiState.landingPresentation || !C7384Etj.areEqual(this.completionTos, nativeLoginUiState.completionTos) || !C7384Etj.areEqual(this.completionClause, nativeLoginUiState.completionClause) || this.mayHaveGoogleAccount != nativeLoginUiState.mayHaveGoogleAccount) {
                }
            }
            return false;
        }
        return true;
    }

    public final AHD<NativeLoginAccountUiModel> component1() {
        return this.accounts;
    }

    public final String component10() {
        return this.destination;
    }

    public final boolean component11() {
        return this.isEmailDestination;
    }

    public final String component12() {
        return this.otp;
    }

    public final boolean component13() {
        return this.isPasswordLoginAvailable;
    }

    public final HatchAuthFlow component14() {
        return this.otpFlow;
    }

    public final boolean component15() {
        return this.otpShowsLoginCopy;
    }

    public final Boolean component16() {
        return this.rememberDeviceValue;
    }

    public final String component17() {
        return this.password;
    }

    public final boolean component18() {
        return this.isTwoFactorPhoneFallback;
    }

    public final HatchPasswordCopy component19() {
        return this.passwordCopy;
    }

    public final AHD<NativeLoginAccountUiModel> component2() {
        return this.disclosedAccounts;
    }

    public final String component20() {
        return this.twoFactorCode;
    }

    public final AHD<HatchTwoFactorMethod> component21() {
        return this.twoFactorMethods;
    }

    public final HatchTwoFactorSourceApp component22() {
        return this.twoFactorSourceApp;
    }

    public final HatchTwoFactorMethod component23() {
        return this.twoFactorMethod;
    }

    public final Integer component24() {
        return this.twoFactorCodeLength;
    }

    public final HatchCheckpointChallenge component25() {
        return this.checkpoint;
    }

    public final HatchReactivationChallenge component26() {
        return this.reactivation;
    }

    public final boolean component27() {
        return this.checkpointWebViewVisible;
    }

    public final NativeLoginCheckpointAction component28() {
        return this.checkpointPrimaryAction;
    }

    public final NtpUpsellUiState component29() {
        return this.ntpUpsell;
    }

    public final AHD<NativeLoginAccountUiModel> component3() {
        return this.removableAccounts;
    }

    public final AHD<NtpUpsellChoiceRowUiState> component30() {
        return this.ntpUpsellChoice;
    }

    public final HatchTosDisclosure component31() {
        return this.ntpUpsellChoiceTos;
    }

    public final HatchLandingPresentation component32() {
        return this.ntpUpsellChoiceLandingPresentation;
    }

    public final NativeLoginLinkingDisclosureUiState component33() {
        return this.linkingDisclosure;
    }

    public final AHD<Boolean> component34() {
        return this.itemizedConsentAccepted;
    }

    public final boolean component35() {
        return this.itemizedConsentAllAccepted;
    }

    public final boolean component36() {
        return this.itemizedConsentConfirmEnabled;
    }

    public final NativeLoginItemizedConsentTarget component37() {
        return this.itemizedConsentTarget;
    }

    public final String component38() {
        return this.birthday;
    }

    public final NativeLoginBirthdayError component39() {
        return this.birthdayError;
    }

    public final String component4() {
        return this.accountOptions;
    }

    public final String component40() {
        return this.signupPassword;
    }

    public final boolean component41() {
        return this.collectsSignupPassword;
    }

    public final String component42() {
        return this.signupFirstName;
    }

    public final String component43() {
        return this.signupLastName;
    }

    public final boolean component44() {
        return this.collectsSignupName;
    }

    public final boolean component45() {
        return this.collectsSignupBirthday;
    }

    public final boolean component46() {
        return this.requiresSignupConsent;
    }

    public final boolean component47() {
        return this.isLoading;
    }

    public final boolean component48() {
        return this.isRemovingProfile;
    }

    public final NativeLoginErrorDialogContent component49() {
        return this.errorDialog;
    }

    public final String component5() {
        return this.selectedAccountId;
    }

    public final NativeLoginFieldError component50() {
        return this.fieldError;
    }

    public final NativeLoginIdentifierError component51() {
        return this.identifierError;
    }

    public final NativeLoginResolveState component52() {
        return this.resolveState;
    }

    public final CountryDialCode component53() {
        return this.selectedCountry;
    }

    public final HatchTosDisclosure component54() {
        return this.entryTos;
    }

    public final HatchLandingPresentation component55() {
        return this.landingPresentation;
    }

    public final HatchTosDisclosure component56() {
        return this.completionTos;
    }

    public final HatchTosDisclosure component57() {
        return this.completionClause;
    }

    public final boolean component58() {
        return this.mayHaveGoogleAccount;
    }

    public final AHD<NativeLoginAccountUiModel> component6() {
        return this.accountSelectionAccounts;
    }

    public final boolean component7() {
        return this.accountSelectionMuseLink;
    }

    public final String component8() {
        return this.selectedAccountSelectionId;
    }

    public final String component9() {
        return this.identifier;
    }

    public final String getAccountOptions() {
        return this.accountOptions;
    }

    public final AHD<NativeLoginAccountUiModel> getAccountSelectionAccounts() {
        return this.accountSelectionAccounts;
    }

    public final boolean getAccountSelectionMuseLink() {
        return this.accountSelectionMuseLink;
    }

    public final boolean getAccountSelectionSingleCard() {
        return this.accountSelectionMuseLink && this.accountSelectionAccounts.size() == 1;
    }

    public final AHD<NativeLoginAccountUiModel> getAccounts() {
        return this.accounts;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final NativeLoginBirthdayError getBirthdayError() {
        return this.birthdayError;
    }

    public final HatchCheckpointChallenge getCheckpoint() {
        return this.checkpoint;
    }

    public final NativeLoginCheckpointAction getCheckpointPrimaryAction() {
        return this.checkpointPrimaryAction;
    }

    public final boolean getCheckpointWebViewVisible() {
        return this.checkpointWebViewVisible;
    }

    public final boolean getCollectsSignupBirthday() {
        return this.collectsSignupBirthday;
    }

    public final boolean getCollectsSignupName() {
        return this.collectsSignupName;
    }

    public final boolean getCollectsSignupPassword() {
        return this.collectsSignupPassword;
    }

    public final HatchTosDisclosure getCompletionClause() {
        return this.completionClause;
    }

    public final HatchTosDisclosure getCompletionTos() {
        return this.completionTos;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final AHD<NativeLoginAccountUiModel> getDisclosedAccounts() {
        return this.disclosedAccounts;
    }

    public final HatchTosDisclosure getEntryTos() {
        return this.entryTos;
    }

    public final NativeLoginErrorDialogContent getErrorDialog() {
        return this.errorDialog;
    }

    public final NativeLoginFieldError getFieldError() {
        return this.fieldError;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final NativeLoginIdentifierError getIdentifierError() {
        return this.identifierError;
    }

    public final AHD<Boolean> getItemizedConsentAccepted() {
        return this.itemizedConsentAccepted;
    }

    public final boolean getItemizedConsentAllAccepted() {
        return this.itemizedConsentAllAccepted;
    }

    public final boolean getItemizedConsentConfirmEnabled() {
        return this.itemizedConsentConfirmEnabled;
    }

    public final NativeLoginItemizedConsentTarget getItemizedConsentTarget() {
        return this.itemizedConsentTarget;
    }

    public final HatchLandingPresentation getLandingPresentation() {
        return this.landingPresentation;
    }

    public final NativeLoginLinkingDisclosureUiState getLinkingDisclosure() {
        return this.linkingDisclosure;
    }

    public final boolean getMayHaveGoogleAccount() {
        return this.mayHaveGoogleAccount;
    }

    public final AHD<NativeLoginAccountUiModel> getNeutralCollapsedAccounts() {
        return this.neutralCollapsedAccounts;
    }

    public final NtpUpsellUiState getNtpUpsell() {
        return this.ntpUpsell;
    }

    public final AHD<NtpUpsellChoiceRowUiState> getNtpUpsellChoice() {
        return this.ntpUpsellChoice;
    }

    public final HatchLandingPresentation getNtpUpsellChoiceLandingPresentation() {
        return this.ntpUpsellChoiceLandingPresentation;
    }

    public final HatchTosDisclosure getNtpUpsellChoiceTos() {
        return this.ntpUpsellChoiceTos;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final HatchAuthFlow getOtpFlow() {
        return this.otpFlow;
    }

    public final boolean getOtpShowsLoginCopy() {
        return this.otpShowsLoginCopy;
    }

    public final String getPassword() {
        return this.password;
    }

    public final HatchPasswordCopy getPasswordCopy() {
        return this.passwordCopy;
    }

    public final NativeLoginPasswordSubtitle getPasswordSubtitle() {
        return NativeLoginModelsKt.passwordSubtitleFor(this.passwordCopy, this.isTwoFactorPhoneFallback);
    }

    public final HatchReactivationChallenge getReactivation() {
        return this.reactivation;
    }

    public final Boolean getRememberDeviceValue() {
        return this.rememberDeviceValue;
    }

    public final AHD<NativeLoginAccountUiModel> getRemovableAccounts() {
        return this.removableAccounts;
    }

    public final boolean getRequiresSignupConsent() {
        return this.requiresSignupConsent;
    }

    public final NativeLoginResolveState getResolveState() {
        return this.resolveState;
    }

    public final String getSelectedAccountId() {
        return this.selectedAccountId;
    }

    public final String getSelectedAccountSelectionId() {
        return this.selectedAccountSelectionId;
    }

    public final CountryDialCode getSelectedCountry() {
        return this.selectedCountry;
    }

    public final AHD<NativeLoginAccountUiModel> getShownAccounts() {
        return this.shownAccounts;
    }

    public final String getSignupFirstName() {
        return this.signupFirstName;
    }

    public final String getSignupLastName() {
        return this.signupLastName;
    }

    public final String getSignupPassword() {
        return this.signupPassword;
    }

    public final String getTwoFactorCode() {
        return this.twoFactorCode;
    }

    public final Integer getTwoFactorCodeLength() {
        return this.twoFactorCodeLength;
    }

    public final HatchTwoFactorMethod getTwoFactorMethod() {
        return this.twoFactorMethod;
    }

    public final AHD<HatchTwoFactorMethod> getTwoFactorMethods() {
        return this.twoFactorMethods;
    }

    public final HatchTwoFactorSourceApp getTwoFactorSourceApp() {
        return this.twoFactorSourceApp;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0F(this.landingPresentation, (AnonymousClass005.A0F(this.selectedCountry, AnonymousClass005.A0F(this.resolveState, (((((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.signupLastName, AnonymousClass005.A0I(this.signupFirstName, C0KA.A01(AnonymousClass005.A0I(this.signupPassword, (AnonymousClass005.A0I(this.birthday, (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.itemizedConsentAccepted, (AnonymousClass005.A0F(this.ntpUpsellChoiceLandingPresentation, (((((AnonymousClass005.A0F(this.checkpointPrimaryAction, C0KA.A01((((((((((AnonymousClass005.A0F(this.twoFactorMethods, AnonymousClass005.A0I(this.twoFactorCode, (C0KA.A01(AnonymousClass005.A0I(this.password, (C0KA.A01((C0KA.A01(AnonymousClass005.A0I(this.otp, C0KA.A01(AnonymousClass005.A0I(this.destination, AnonymousClass005.A0I(this.identifier, (C0KA.A01(AnonymousClass005.A0F(this.accountSelectionAccounts, (AnonymousClass005.A0I(this.accountOptions, AnonymousClass005.A0F(this.removableAccounts, AnonymousClass005.A0F(this.disclosedAccounts, AnonymousClass005.A0E(this.accounts)))) + AnonymousClass006.A0G(this.selectedAccountId)) * 31), this.accountSelectionMuseLink) + AnonymousClass006.A0G(this.selectedAccountSelectionId)) * 31)), this.isEmailDestination)), this.isPasswordLoginAvailable) + AnonymousClass006.A0D(this.otpFlow)) * 31, this.otpShowsLoginCopy) + AnonymousClass006.A0D(this.rememberDeviceValue)) * 31), this.isTwoFactorPhoneFallback) + AnonymousClass006.A0D(this.passwordCopy)) * 31)) + AnonymousClass006.A0D(this.twoFactorSourceApp)) * 31) + AnonymousClass006.A0D(this.twoFactorMethod)) * 31) + AnonymousClass006.A0D(this.twoFactorCodeLength)) * 31) + AnonymousClass006.A0D(this.checkpoint)) * 31) + AnonymousClass006.A0D(this.reactivation)) * 31, this.checkpointWebViewVisible)) + AnonymousClass006.A0D(this.ntpUpsell)) * 31) + AnonymousClass006.A0D(this.ntpUpsellChoice)) * 31) + AnonymousClass006.A0D(this.ntpUpsellChoiceTos)) * 31) + AnonymousClass006.A0D(this.linkingDisclosure)) * 31), this.itemizedConsentAllAccepted), this.itemizedConsentConfirmEnabled) + AnonymousClass006.A0D(this.itemizedConsentTarget)) * 31) + AnonymousClass006.A0D(this.birthdayError)) * 31), this.collectsSignupPassword))), this.collectsSignupName), this.collectsSignupBirthday), this.requiresSignupConsent), this.isLoading), this.isRemovingProfile) + AnonymousClass006.A0D(this.errorDialog)) * 31) + AnonymousClass006.A0D(this.fieldError)) * 31) + AnonymousClass006.A0D(this.identifierError)) * 31)) + AnonymousClass006.A0D(this.entryTos)) * 31) + AnonymousClass006.A0D(this.completionTos)) * 31) + C3cH.A02(this.completionClause)) * 31, this.mayHaveGoogleAccount);
    }

    public final boolean isEmailDestination() {
        return this.isEmailDestination;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPasswordLoginAvailable() {
        return this.isPasswordLoginAvailable;
    }

    public final boolean isRemovingProfile() {
        return this.isRemovingProfile;
    }

    public final boolean isTwoFactorPhoneFallback() {
        return this.isTwoFactorPhoneFallback;
    }

    public String toString() {
        return super.toString();
    }

    public NativeLoginUiState(AHD<NativeLoginAccountUiModel> ahd, AHD<NativeLoginAccountUiModel> ahd2, AHD<NativeLoginAccountUiModel> ahd3, String str, String str2, AHD<NativeLoginAccountUiModel> ahd4, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, HatchAuthFlow hatchAuthFlow, boolean z4, Boolean bool, String str7, boolean z5, HatchPasswordCopy hatchPasswordCopy, String str8, AHD<HatchTwoFactorMethod> ahd5, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchTwoFactorMethod hatchTwoFactorMethod, Integer num, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z6, NativeLoginCheckpointAction nativeLoginCheckpointAction, NtpUpsellUiState ntpUpsellUiState, AHD<NtpUpsellChoiceRowUiState> ahd6, HatchTosDisclosure hatchTosDisclosure, HatchLandingPresentation hatchLandingPresentation, NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, AHD<Boolean> ahd7, boolean z7, boolean z8, NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget, String str9, NativeLoginBirthdayError nativeLoginBirthdayError, String str10, boolean z9, String str11, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, NativeLoginFieldError nativeLoginFieldError, NativeLoginIdentifierError nativeLoginIdentifierError, NativeLoginResolveState nativeLoginResolveState, CountryDialCode countryDialCode, HatchTosDisclosure hatchTosDisclosure2, HatchLandingPresentation hatchLandingPresentation2, HatchTosDisclosure hatchTosDisclosure3, HatchTosDisclosure hatchTosDisclosure4, boolean z15) {
        AHD<NativeLoginAccountUiModel> ahdA07;
        AHD<NativeLoginAccountUiModel> ahd8 = ahd;
        boolean zA1Z = AnonymousClass005.A1Z(ahd8, ahd2, ahd3);
        AnonymousClass002.A1D(str, 3, ahd4);
        C7384Etj.A0Y(str4, 8);
        AnonymousClass002.A1G(str5, 9, str6);
        C7384Etj.A0Y(str7, 16);
        C7384Etj.A0Y(str8, 19);
        C7384Etj.A0Y(ahd5, 20);
        C7384Etj.A0Y(nativeLoginCheckpointAction, 27);
        C7384Etj.A0Y(hatchLandingPresentation, 31);
        C7384Etj.A0Y(ahd7, 33);
        C7384Etj.A0Y(str9, 37);
        C3cH.A19(str10, str11, str12, 39);
        C7384Etj.A0Y(nativeLoginResolveState, 51);
        C7384Etj.A0Y(countryDialCode, 52);
        C7384Etj.A0Y(hatchLandingPresentation2, 54);
        this.accounts = ahd8;
        this.disclosedAccounts = ahd2;
        this.removableAccounts = ahd3;
        this.accountOptions = str;
        this.selectedAccountId = str2;
        this.accountSelectionAccounts = ahd4;
        this.accountSelectionMuseLink = z;
        this.selectedAccountSelectionId = str3;
        this.identifier = str4;
        this.destination = str5;
        this.isEmailDestination = z2;
        this.otp = str6;
        this.isPasswordLoginAvailable = z3;
        this.otpFlow = hatchAuthFlow;
        this.otpShowsLoginCopy = z4;
        this.rememberDeviceValue = bool;
        this.password = str7;
        this.isTwoFactorPhoneFallback = z5;
        this.passwordCopy = hatchPasswordCopy;
        this.twoFactorCode = str8;
        this.twoFactorMethods = ahd5;
        this.twoFactorSourceApp = hatchTwoFactorSourceApp;
        this.twoFactorMethod = hatchTwoFactorMethod;
        this.twoFactorCodeLength = num;
        this.checkpoint = hatchCheckpointChallenge;
        this.reactivation = hatchReactivationChallenge;
        this.checkpointWebViewVisible = z6;
        this.checkpointPrimaryAction = nativeLoginCheckpointAction;
        this.ntpUpsell = ntpUpsellUiState;
        this.ntpUpsellChoice = ahd6;
        this.ntpUpsellChoiceTos = hatchTosDisclosure;
        this.ntpUpsellChoiceLandingPresentation = hatchLandingPresentation;
        this.linkingDisclosure = nativeLoginLinkingDisclosureUiState;
        this.itemizedConsentAccepted = ahd7;
        this.itemizedConsentAllAccepted = z7;
        this.itemizedConsentConfirmEnabled = z8;
        this.itemizedConsentTarget = nativeLoginItemizedConsentTarget;
        this.birthday = str9;
        this.birthdayError = nativeLoginBirthdayError;
        this.signupPassword = str10;
        this.collectsSignupPassword = z9;
        this.signupFirstName = str11;
        this.signupLastName = str12;
        this.collectsSignupName = z10;
        this.collectsSignupBirthday = z11;
        this.requiresSignupConsent = z12;
        this.isLoading = z13;
        this.isRemovingProfile = z14;
        this.errorDialog = nativeLoginErrorDialogContent;
        this.fieldError = nativeLoginFieldError;
        this.identifierError = nativeLoginIdentifierError;
        this.resolveState = nativeLoginResolveState;
        this.selectedCountry = countryDialCode;
        this.entryTos = hatchTosDisclosure2;
        this.landingPresentation = hatchLandingPresentation2;
        this.completionTos = hatchTosDisclosure3;
        this.completionClause = hatchTosDisclosure4;
        this.mayHaveGoogleAccount = z15;
        if (nativeLoginResolveState == NativeLoginResolveState.RESOLVED && hatchLandingPresentation2 == HatchLandingPresentation.NEUTRAL && ahd8.size() >= 3) {
            ahdA07 = AGI.A07(AbstractC0878AGe.A0Z(ahd8, zA1Z ? 1 : 0));
        } else {
            ahdA07 = AHI.A01;
        }
        this.neutralCollapsedAccounts = ahdA07;
        this.shownAccounts = ahdA07.isEmpty() ? ahd8 : AGI.A07(AbstractC0878AGe.A0a(ahd8, zA1Z ? 1 : 0));
    }

    public final NativeLoginUiState copy(AHD<NativeLoginAccountUiModel> ahd, AHD<NativeLoginAccountUiModel> ahd2, AHD<NativeLoginAccountUiModel> ahd3, String str, String str2, AHD<NativeLoginAccountUiModel> ahd4, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, HatchAuthFlow hatchAuthFlow, boolean z4, Boolean bool, String str7, boolean z5, HatchPasswordCopy hatchPasswordCopy, String str8, AHD<HatchTwoFactorMethod> ahd5, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchTwoFactorMethod hatchTwoFactorMethod, Integer num, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z6, NativeLoginCheckpointAction nativeLoginCheckpointAction, NtpUpsellUiState ntpUpsellUiState, AHD<NtpUpsellChoiceRowUiState> ahd6, HatchTosDisclosure hatchTosDisclosure, HatchLandingPresentation hatchLandingPresentation, NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, AHD<Boolean> ahd7, boolean z7, boolean z8, NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget, String str9, NativeLoginBirthdayError nativeLoginBirthdayError, String str10, boolean z9, String str11, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, NativeLoginFieldError nativeLoginFieldError, NativeLoginIdentifierError nativeLoginIdentifierError, NativeLoginResolveState nativeLoginResolveState, CountryDialCode countryDialCode, HatchTosDisclosure hatchTosDisclosure2, HatchLandingPresentation hatchLandingPresentation2, HatchTosDisclosure hatchTosDisclosure3, HatchTosDisclosure hatchTosDisclosure4, boolean z15) {
        AnonymousClass005.A14(ahd, ahd2, ahd3, str);
        C7384Etj.A0Y(ahd4, 5);
        C7384Etj.A0Y(str4, 8);
        AnonymousClass002.A1G(str5, 9, str6);
        C7384Etj.A0Y(str7, 16);
        C7384Etj.A0Y(str8, 19);
        C7384Etj.A0Y(ahd5, 20);
        C7384Etj.A0Y(nativeLoginCheckpointAction, 27);
        C7384Etj.A0Y(hatchLandingPresentation, 31);
        C7384Etj.A0Y(ahd7, 33);
        C7384Etj.A0Y(str9, 37);
        C3cH.A19(str10, str11, str12, 39);
        C7384Etj.A0Y(nativeLoginResolveState, 51);
        C7384Etj.A0Y(countryDialCode, 52);
        C7384Etj.A0Y(hatchLandingPresentation2, 54);
        return new NativeLoginUiState(ahd, ahd2, ahd3, str, str2, ahd4, z, str3, str4, str5, z2, str6, z3, hatchAuthFlow, z4, bool, str7, z5, hatchPasswordCopy, str8, ahd5, hatchTwoFactorSourceApp, hatchTwoFactorMethod, num, hatchCheckpointChallenge, hatchReactivationChallenge, z6, nativeLoginCheckpointAction, ntpUpsellUiState, ahd6, hatchTosDisclosure, hatchLandingPresentation, nativeLoginLinkingDisclosureUiState, ahd7, z7, z8, nativeLoginItemizedConsentTarget, str9, nativeLoginBirthdayError, str10, z9, str11, str12, z10, z11, z12, z13, z14, nativeLoginErrorDialogContent, nativeLoginFieldError, nativeLoginIdentifierError, nativeLoginResolveState, countryDialCode, hatchTosDisclosure2, hatchLandingPresentation2, hatchTosDisclosure3, hatchTosDisclosure4, z15);
    }

    public static /* synthetic */ NativeLoginUiState copy$default(NativeLoginUiState nativeLoginUiState, AHD ahd, AHD ahd2, AHD ahd3, String str, String str2, AHD ahd4, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, HatchAuthFlow hatchAuthFlow, boolean z4, Boolean bool, String str7, boolean z5, HatchPasswordCopy hatchPasswordCopy, String str8, AHD ahd5, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchTwoFactorMethod hatchTwoFactorMethod, Integer num, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z6, NativeLoginCheckpointAction nativeLoginCheckpointAction, NtpUpsellUiState ntpUpsellUiState, AHD ahd6, HatchTosDisclosure hatchTosDisclosure, HatchLandingPresentation hatchLandingPresentation, NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, AHD ahd7, boolean z7, boolean z8, NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget, String str9, NativeLoginBirthdayError nativeLoginBirthdayError, String str10, boolean z9, String str11, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, NativeLoginFieldError nativeLoginFieldError, NativeLoginIdentifierError nativeLoginIdentifierError, NativeLoginResolveState nativeLoginResolveState, CountryDialCode countryDialCode, HatchTosDisclosure hatchTosDisclosure2, HatchLandingPresentation hatchLandingPresentation2, HatchTosDisclosure hatchTosDisclosure3, HatchTosDisclosure hatchTosDisclosure4, boolean z15, int i, int i2, Object obj) {
        AHD ahd8 = ahd;
        AHD ahd9 = ahd2;
        AHD ahd10 = ahd3;
        String str13 = str;
        String str14 = str2;
        AHD ahd11 = ahd4;
        boolean z16 = z;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        boolean z17 = z2;
        String str18 = str6;
        boolean z18 = z3;
        HatchAuthFlow hatchAuthFlow2 = hatchAuthFlow;
        boolean z19 = z4;
        Integer num2 = num;
        HatchCheckpointChallenge hatchCheckpointChallenge2 = hatchCheckpointChallenge;
        HatchReactivationChallenge hatchReactivationChallenge2 = hatchReactivationChallenge;
        boolean z20 = z6;
        NativeLoginCheckpointAction nativeLoginCheckpointAction2 = nativeLoginCheckpointAction;
        boolean z21 = z7;
        boolean z22 = z8;
        String str19 = str9;
        NativeLoginBirthdayError nativeLoginBirthdayError2 = nativeLoginBirthdayError;
        String str20 = str10;
        boolean z23 = z9;
        String str21 = str11;
        boolean z24 = z11;
        boolean z25 = z12;
        boolean z26 = z13;
        boolean z27 = z14;
        CountryDialCode countryDialCode2 = countryDialCode;
        HatchTosDisclosure hatchTosDisclosure5 = hatchTosDisclosure2;
        HatchLandingPresentation hatchLandingPresentation3 = hatchLandingPresentation2;
        HatchTosDisclosure hatchTosDisclosure6 = hatchTosDisclosure3;
        HatchTosDisclosure hatchTosDisclosure7 = hatchTosDisclosure4;
        Boolean bool2 = bool;
        String str22 = str7;
        boolean z28 = z5;
        HatchPasswordCopy hatchPasswordCopy2 = hatchPasswordCopy;
        String str23 = str8;
        AHD ahd12 = ahd5;
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp2 = hatchTwoFactorSourceApp;
        HatchTwoFactorMethod hatchTwoFactorMethod2 = hatchTwoFactorMethod;
        NtpUpsellUiState ntpUpsellUiState2 = ntpUpsellUiState;
        AHD ahd13 = ahd6;
        HatchTosDisclosure hatchTosDisclosure8 = hatchTosDisclosure;
        HatchLandingPresentation hatchLandingPresentation4 = hatchLandingPresentation;
        NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState2 = nativeLoginLinkingDisclosureUiState;
        AHD ahd14 = ahd7;
        NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget2 = nativeLoginItemizedConsentTarget;
        String str24 = str12;
        boolean z29 = z10;
        NativeLoginErrorDialogContent nativeLoginErrorDialogContent2 = nativeLoginErrorDialogContent;
        NativeLoginFieldError nativeLoginFieldError2 = nativeLoginFieldError;
        NativeLoginIdentifierError nativeLoginIdentifierError2 = nativeLoginIdentifierError;
        NativeLoginResolveState nativeLoginResolveState2 = nativeLoginResolveState;
        boolean z30 = z15;
        if ((i & 1) != 0) {
            ahd8 = nativeLoginUiState.accounts;
        }
        if ((i & 2) != 0) {
            ahd9 = nativeLoginUiState.disclosedAccounts;
        }
        if ((i & 4) != 0) {
            ahd10 = nativeLoginUiState.removableAccounts;
        }
        if ((i & 8) != 0) {
            str13 = nativeLoginUiState.accountOptions;
        }
        if ((i & 16) != 0) {
            str14 = nativeLoginUiState.selectedAccountId;
        }
        if ((i & 32) != 0) {
            ahd11 = nativeLoginUiState.accountSelectionAccounts;
        }
        if ((i & 64) != 0) {
            z16 = nativeLoginUiState.accountSelectionMuseLink;
        }
        if ((i & 128) != 0) {
            str15 = nativeLoginUiState.selectedAccountSelectionId;
        }
        if ((i & 256) != 0) {
            str16 = nativeLoginUiState.identifier;
        }
        if ((i & 512) != 0) {
            str17 = nativeLoginUiState.destination;
        }
        if ((i & 1024) != 0) {
            z17 = nativeLoginUiState.isEmailDestination;
        }
        if ((i & 2048) != 0) {
            str18 = nativeLoginUiState.otp;
        }
        if ((i & 4096) != 0) {
            z18 = nativeLoginUiState.isPasswordLoginAvailable;
        }
        if ((i & 8192) != 0) {
            hatchAuthFlow2 = nativeLoginUiState.otpFlow;
        }
        if ((i & 16384) != 0) {
            z19 = nativeLoginUiState.otpShowsLoginCopy;
        }
        if ((i & 32768) != 0) {
            bool2 = nativeLoginUiState.rememberDeviceValue;
        }
        if ((i & 65536) != 0) {
            str22 = nativeLoginUiState.password;
        }
        if ((i & 131072) != 0) {
            z28 = nativeLoginUiState.isTwoFactorPhoneFallback;
        }
        if ((i & 262144) != 0) {
            hatchPasswordCopy2 = nativeLoginUiState.passwordCopy;
        }
        if ((i & 524288) != 0) {
            str23 = nativeLoginUiState.twoFactorCode;
        }
        if ((i & 1048576) != 0) {
            ahd12 = nativeLoginUiState.twoFactorMethods;
        }
        if ((i & 2097152) != 0) {
            hatchTwoFactorSourceApp2 = nativeLoginUiState.twoFactorSourceApp;
        }
        if ((i & 4194304) != 0) {
            hatchTwoFactorMethod2 = nativeLoginUiState.twoFactorMethod;
        }
        if ((i & 8388608) != 0) {
            num2 = nativeLoginUiState.twoFactorCodeLength;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            hatchCheckpointChallenge2 = nativeLoginUiState.checkpoint;
        }
        if ((i & 33554432) != 0) {
            hatchReactivationChallenge2 = nativeLoginUiState.reactivation;
        }
        if ((i & 67108864) != 0) {
            z20 = nativeLoginUiState.checkpointWebViewVisible;
        }
        if ((i & 134217728) != 0) {
            nativeLoginCheckpointAction2 = nativeLoginUiState.checkpointPrimaryAction;
        }
        if ((i & 268435456) != 0) {
            ntpUpsellUiState2 = nativeLoginUiState.ntpUpsell;
        }
        if ((i & 536870912) != 0) {
            ahd13 = nativeLoginUiState.ntpUpsellChoice;
        }
        if ((i & 1073741824) != 0) {
            hatchTosDisclosure8 = nativeLoginUiState.ntpUpsellChoiceTos;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            hatchLandingPresentation4 = nativeLoginUiState.ntpUpsellChoiceLandingPresentation;
        }
        if ((i2 & 1) != 0) {
            nativeLoginLinkingDisclosureUiState2 = nativeLoginUiState.linkingDisclosure;
        }
        if ((i2 & 2) != 0) {
            ahd14 = nativeLoginUiState.itemizedConsentAccepted;
        }
        if ((i2 & 4) != 0) {
            z21 = nativeLoginUiState.itemizedConsentAllAccepted;
        }
        if ((i2 & 8) != 0) {
            z22 = nativeLoginUiState.itemizedConsentConfirmEnabled;
        }
        if ((i2 & 16) != 0) {
            nativeLoginItemizedConsentTarget2 = nativeLoginUiState.itemizedConsentTarget;
        }
        if ((i2 & 32) != 0) {
            str19 = nativeLoginUiState.birthday;
        }
        if ((i2 & 64) != 0) {
            nativeLoginBirthdayError2 = nativeLoginUiState.birthdayError;
        }
        if ((i2 & 128) != 0) {
            str20 = nativeLoginUiState.signupPassword;
        }
        if ((i2 & 256) != 0) {
            z23 = nativeLoginUiState.collectsSignupPassword;
        }
        if ((i2 & 512) != 0) {
            str21 = nativeLoginUiState.signupFirstName;
        }
        if ((i2 & 1024) != 0) {
            str24 = nativeLoginUiState.signupLastName;
        }
        if ((i2 & 2048) != 0) {
            z29 = nativeLoginUiState.collectsSignupName;
        }
        if ((i2 & 4096) != 0) {
            z24 = nativeLoginUiState.collectsSignupBirthday;
        }
        if ((i2 & 8192) != 0) {
            z25 = nativeLoginUiState.requiresSignupConsent;
        }
        if ((i2 & 16384) != 0) {
            z26 = nativeLoginUiState.isLoading;
        }
        if ((i2 & 32768) != 0) {
            z27 = nativeLoginUiState.isRemovingProfile;
        }
        if ((i2 & 65536) != 0) {
            nativeLoginErrorDialogContent2 = nativeLoginUiState.errorDialog;
        }
        if ((i2 & 131072) != 0) {
            nativeLoginFieldError2 = nativeLoginUiState.fieldError;
        }
        if ((i2 & 262144) != 0) {
            nativeLoginIdentifierError2 = nativeLoginUiState.identifierError;
        }
        if ((i2 & 524288) != 0) {
            nativeLoginResolveState2 = nativeLoginUiState.resolveState;
        }
        if ((i2 & 1048576) != 0) {
            countryDialCode2 = nativeLoginUiState.selectedCountry;
        }
        if ((i2 & 2097152) != 0) {
            hatchTosDisclosure5 = nativeLoginUiState.entryTos;
        }
        if ((i2 & 4194304) != 0) {
            hatchLandingPresentation3 = nativeLoginUiState.landingPresentation;
        }
        if ((i2 & 8388608) != 0) {
            hatchTosDisclosure6 = nativeLoginUiState.completionTos;
        }
        if ((i2 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            hatchTosDisclosure7 = nativeLoginUiState.completionClause;
        }
        if ((i2 & 33554432) != 0) {
            z30 = nativeLoginUiState.mayHaveGoogleAccount;
        }
        return nativeLoginUiState.copy(ahd8, ahd9, ahd10, str13, str14, ahd11, z16, str15, str16, str17, z17, str18, z18, hatchAuthFlow2, z19, bool2, str22, z28, hatchPasswordCopy2, str23, ahd12, hatchTwoFactorSourceApp2, hatchTwoFactorMethod2, num2, hatchCheckpointChallenge2, hatchReactivationChallenge2, z20, nativeLoginCheckpointAction2, ntpUpsellUiState2, ahd13, hatchTosDisclosure8, hatchLandingPresentation4, nativeLoginLinkingDisclosureUiState2, ahd14, z21, z22, nativeLoginItemizedConsentTarget2, str19, nativeLoginBirthdayError2, str20, z23, str21, str24, z29, z24, z25, z26, z27, nativeLoginErrorDialogContent2, nativeLoginFieldError2, nativeLoginIdentifierError2, nativeLoginResolveState2, countryDialCode2, hatchTosDisclosure5, hatchLandingPresentation3, hatchTosDisclosure6, hatchTosDisclosure7, z30);
    }

    public /* synthetic */ NativeLoginUiState(AHD ahd, AHD ahd2, AHD ahd3, String str, String str2, AHD ahd4, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, HatchAuthFlow hatchAuthFlow, boolean z4, Boolean bool, String str7, boolean z5, HatchPasswordCopy hatchPasswordCopy, String str8, AHD ahd5, HatchTwoFactorSourceApp hatchTwoFactorSourceApp, HatchTwoFactorMethod hatchTwoFactorMethod, Integer num, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z6, NativeLoginCheckpointAction nativeLoginCheckpointAction, NtpUpsellUiState ntpUpsellUiState, AHD ahd6, HatchTosDisclosure hatchTosDisclosure, HatchLandingPresentation hatchLandingPresentation, NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, AHD ahd7, boolean z7, boolean z8, NativeLoginItemizedConsentTarget nativeLoginItemizedConsentTarget, String str9, NativeLoginBirthdayError nativeLoginBirthdayError, String str10, boolean z9, String str11, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, NativeLoginErrorDialogContent nativeLoginErrorDialogContent, NativeLoginFieldError nativeLoginFieldError, NativeLoginIdentifierError nativeLoginIdentifierError, NativeLoginResolveState nativeLoginResolveState, CountryDialCode countryDialCode, HatchTosDisclosure hatchTosDisclosure2, HatchLandingPresentation hatchLandingPresentation2, HatchTosDisclosure hatchTosDisclosure3, HatchTosDisclosure hatchTosDisclosure4, boolean z15, int i, int i2, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, (i & 4) != 0 ? AHI.A01 : ahd3, (i & 8) != 0 ? "" : str, C3cG.A0e(str2, i & 16), (i & 32) != 0 ? AHI.A01 : ahd4, C3cH.A1M(i, z), C3cG.A0e(str3, i & 128), (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, C3cG.A1K(i & 1024, z2), (i & 2048) != 0 ? "" : str6, C3cG.A1K(i & 4096, z3), (i & 8192) != 0 ? null : hatchAuthFlow, C3cG.A1K(i & 16384, z4), (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? "" : str7, C3cH.A1L(i, 131072, z5), (i & 262144) != 0 ? null : hatchPasswordCopy, (i & 524288) != 0 ? "" : str8, (i & 1048576) != 0 ? AHI.A01 : ahd5, (i & 2097152) != 0 ? null : hatchTwoFactorSourceApp, (i & 4194304) != 0 ? null : hatchTwoFactorMethod, (i & 8388608) != 0 ? null : num, (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : hatchCheckpointChallenge, (i & 33554432) != 0 ? null : hatchReactivationChallenge, C3cH.A1L(i, 67108864, z6), (i & 134217728) != 0 ? NativeLoginCheckpointAction.CONTINUE : nativeLoginCheckpointAction, (i & 268435456) != 0 ? null : ntpUpsellUiState, (i & 536870912) != 0 ? null : ahd6, (i & 1073741824) != 0 ? null : hatchTosDisclosure, (i & Integer.MIN_VALUE) != 0 ? HatchLandingPresentation.STANDARD : hatchLandingPresentation, (i2 & 1) != 0 ? null : nativeLoginLinkingDisclosureUiState, (i2 & 2) != 0 ? AHI.A01 : ahd7, C3cG.A1K(i2 & 4, z7), C3cG.A1K(i2 & 8, z8), (i2 & 16) != 0 ? null : nativeLoginItemizedConsentTarget, (i2 & 32) != 0 ? "" : str9, (i2 & 64) != 0 ? null : nativeLoginBirthdayError, (i2 & 128) != 0 ? "" : str10, (i2 & 256) != 0 ? true : z9, (i2 & 512) != 0 ? "" : str11, (i2 & 1024) == 0 ? str12 : "", C3cG.A1K(i2 & 2048, z10), (i2 & 4096) != 0 ? true : z11, (i2 & 8192) == 0 ? z12 : true, C3cG.A1K(i2 & 16384, z13), C3cH.A1L(i2, 32768, z14), (i2 & 65536) != 0 ? null : nativeLoginErrorDialogContent, (i2 & 131072) != 0 ? null : nativeLoginFieldError, (i2 & 262144) != 0 ? null : nativeLoginIdentifierError, (i2 & 524288) != 0 ? NativeLoginResolveState.RESOLVING : nativeLoginResolveState, (i2 & 1048576) != 0 ? CountryDialCodesKt.DEFAULT_COUNTRY_DIAL_CODE : countryDialCode, (i2 & 2097152) != 0 ? null : hatchTosDisclosure2, (i2 & 4194304) != 0 ? HatchLandingPresentation.STANDARD : hatchLandingPresentation2, (i2 & 8388608) != 0 ? null : hatchTosDisclosure3, (i2 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : hatchTosDisclosure4, C3cH.A1L(i2, 33554432, z15));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeLoginUiState() {
        AHI ahi = AHI.A01;
        NativeLoginCheckpointAction nativeLoginCheckpointAction = NativeLoginCheckpointAction.CONTINUE;
        HatchLandingPresentation hatchLandingPresentation = HatchLandingPresentation.STANDARD;
        this(ahi, ahi, ahi, "", null, ahi, false, null, "", "", false, "", false, null, false, null, "", false, null, "", ahi, null, null, null, null, null, false, nativeLoginCheckpointAction, null, null, null, hatchLandingPresentation, null, ahi, false, false, null, "", null, "", true, "", "", false, true, true, false, false, null, null, null, NativeLoginResolveState.RESOLVING, CountryDialCodesKt.DEFAULT_COUNTRY_DIAL_CODE, null, hatchLandingPresentation, null, null, false);
    }
}
