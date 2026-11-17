package com.facebook.aura.settings;

import X.AbstractC7608F5v;
import X.BV5;
import X.C31u;
import X.C3cG;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.settings.MC;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.utils.navigation.SecureUriKt;

/* loaded from: classes6.dex */
public final class AuraExternalUriRegistry {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties;
    public static final int $stable = 0;
    public static final AuraExternalUriRegistry INSTANCE;
    public static final C31u aiGuideLearnMoreUri$delegate;
    public static final C31u aiGuideLearnMoreUrl$delegate;
    public static final C31u birthdayInfoUri$delegate;
    public static final C31u birthdayInfoUrl$delegate;
    public static final SecureUri confidentialVmLearnMoreUri;
    public static final C31u downloadInformationUri$delegate;
    public static final C31u downloadInformationUrl$delegate;
    public static final C31u forgotPasswordUri$delegate;
    public static final C31u forgotPasswordUrl$delegate;
    public static final C31u helpCenterUri$delegate;
    public static final C31u helpCenterUrl$delegate;
    public static final C31u metaAiTermsOfServiceUri$delegate;
    public static final C31u metaAiTermsOfServiceUrl$delegate;
    public static final C31u mptSupplementalTermsUri$delegate;
    public static final C31u mptSupplementalTermsUrl$delegate;
    public static final C31u museSupplementalPrivacyPolicyUri$delegate;
    public static final C31u museSupplementalPrivacyPolicyUrl$delegate;
    public static final C31u preloadsTosLearnMoreUri$delegate;
    public static final C31u preloadsTosLearnMoreUrl$delegate;
    public static final C31u privacyPolicyUri$delegate;
    public static final C31u privacyPolicyUrl$delegate;
    public static final C31u resetHatchLearnMoreUri$delegate;
    public static final C31u resetHatchLearnMoreUrl$delegate;
    public static final C31u smsNotificationsUri$delegate;
    public static final C31u smsNotificationsUrl$delegate;
    public static final C31u supplementalPrivacyPolicyUri$delegate;
    public static final C31u supplementalPrivacyPolicyUrl$delegate;
    public static final C31u supplementalTermsOfServiceUri$delegate;
    public static final C31u supplementalTermsOfServiceUrl$delegate;
    public static final C31u termsOfServiceUri$delegate;
    public static final C31u termsOfServiceUrl$delegate;

    static {
        InterfaceC7359EnW<Object>[] interfaceC7359EnWArr = new InterfaceC7359EnW[30];
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(AuraExternalUriRegistry.class, "resetHatchLearnMoreUrl", "getResetHatchLearnMoreUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "downloadInformationUrl", "getDownloadInformationUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "helpCenterUrl", "getHelpCenterUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "aiGuideLearnMoreUrl", "getAiGuideLearnMoreUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "metaAiTermsOfServiceUrl", "getMetaAiTermsOfServiceUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "mptSupplementalTermsUrl", "getMptSupplementalTermsUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "termsOfServiceUrl", "getTermsOfServiceUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "supplementalTermsOfServiceUrl", "getSupplementalTermsOfServiceUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "supplementalPrivacyPolicyUrl", "getSupplementalPrivacyPolicyUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "privacyPolicyUrl", "getPrivacyPolicyUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "museSupplementalPrivacyPolicyUrl", "getMuseSupplementalPrivacyPolicyUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "birthdayInfoUrl", "getBirthdayInfoUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "forgotPasswordUrl", "getForgotPasswordUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "smsNotificationsUrl", "getSmsNotificationsUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "preloadsTosLearnMoreUrl", "getPreloadsTosLearnMoreUrl()Ljava/lang/String;"), C3cG.A0y(AuraExternalUriRegistry.class, "resetHatchLearnMoreUri", "getResetHatchLearnMoreUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "downloadInformationUri", "getDownloadInformationUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "helpCenterUri", "getHelpCenterUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "aiGuideLearnMoreUri", "getAiGuideLearnMoreUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "metaAiTermsOfServiceUri", "getMetaAiTermsOfServiceUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "mptSupplementalTermsUri", "getMptSupplementalTermsUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "termsOfServiceUri", "getTermsOfServiceUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "supplementalTermsOfServiceUri", "getSupplementalTermsOfServiceUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "supplementalPrivacyPolicyUri", "getSupplementalPrivacyPolicyUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "privacyPolicyUri", "getPrivacyPolicyUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "museSupplementalPrivacyPolicyUri", "getMuseSupplementalPrivacyPolicyUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "birthdayInfoUri", "getBirthdayInfoUri()Lcom/facebook/aura/utils/navigation/SecureUri;")}, 0, interfaceC7359EnWArr, 0, 27);
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(AuraExternalUriRegistry.class, "smsNotificationsUri", "getSmsNotificationsUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "preloadsTosLearnMoreUri", "getPreloadsTosLearnMoreUri()Lcom/facebook/aura/utils/navigation/SecureUri;"), C3cG.A0y(AuraExternalUriRegistry.class, "forgotPasswordUri", "getForgotPasswordUri()Lcom/facebook/aura/utils/navigation/SecureUri;")}, 0, interfaceC7359EnWArr, 27, 3);
        $$delegatedProperties = interfaceC7359EnWArr;
        INSTANCE = new AuraExternalUriRegistry();
        resetHatchLearnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.data_controls_learn_more_url);
        downloadInformationUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_download_information_url);
        helpCenterUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_help_center_url);
        aiGuideLearnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_gen_ai_privacy_url);
        metaAiTermsOfServiceUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_meta_ai_terms_url);
        mptSupplementalTermsUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_mpt_supplemental_terms_url);
        termsOfServiceUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_meta_terms_url);
        supplementalTermsOfServiceUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_supplemental_terms_url);
        supplementalPrivacyPolicyUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_supplemental_privacy_url);
        privacyPolicyUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_meta_privacy_url);
        museSupplementalPrivacyPolicyUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_muse_privacy_url);
        birthdayInfoUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_birthday_info_url);
        forgotPasswordUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.forgot_password_url);
        smsNotificationsUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_sms_notifications_url);
        preloadsTosLearnMoreUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_app_preloads_sessionless_mcs.legal_preloads_tos_learn_more_url);
        resetHatchLearnMoreUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$resetHatchLearnMoreUri$2.INSTANCE);
        downloadInformationUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$downloadInformationUri$2.INSTANCE);
        helpCenterUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$helpCenterUri$2.INSTANCE);
        aiGuideLearnMoreUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$aiGuideLearnMoreUri$2.INSTANCE);
        metaAiTermsOfServiceUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$metaAiTermsOfServiceUri$2.INSTANCE);
        mptSupplementalTermsUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$mptSupplementalTermsUri$2.INSTANCE);
        termsOfServiceUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$termsOfServiceUri$2.INSTANCE);
        supplementalTermsOfServiceUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$supplementalTermsOfServiceUri$2.INSTANCE);
        supplementalPrivacyPolicyUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$supplementalPrivacyPolicyUri$2.INSTANCE);
        privacyPolicyUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$privacyPolicyUri$2.INSTANCE);
        museSupplementalPrivacyPolicyUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$museSupplementalPrivacyPolicyUri$2.INSTANCE);
        birthdayInfoUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$birthdayInfoUri$2.INSTANCE);
        smsNotificationsUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$smsNotificationsUri$2.INSTANCE);
        preloadsTosLearnMoreUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$preloadsTosLearnMoreUri$2.INSTANCE);
        confidentialVmLearnMoreUri = SecureUriKt.asSecureUri(AuraExternalUriRegistryKt.CONFIDENTIAL_VM_LEARN_MORE_URL);
        forgotPasswordUri$delegate = AuraMobileConfigDelegatesKt.auraMobileConfig(AuraExternalUriRegistry$forgotPasswordUri$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAiGuideLearnMoreUrl() {
        return BV5.A0m(this, aiGuideLearnMoreUrl$delegate, $$delegatedProperties, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBirthdayInfoUrl() {
        return BV5.A0m(this, birthdayInfoUrl$delegate, $$delegatedProperties, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDownloadInformationUrl() {
        return BV5.A0m(this, downloadInformationUrl$delegate, $$delegatedProperties, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getForgotPasswordUrl() {
        return BV5.A0m(this, forgotPasswordUrl$delegate, $$delegatedProperties, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getHelpCenterUrl() {
        return BV5.A0m(this, helpCenterUrl$delegate, $$delegatedProperties, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMetaAiTermsOfServiceUrl() {
        return BV5.A0m(this, metaAiTermsOfServiceUrl$delegate, $$delegatedProperties, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMptSupplementalTermsUrl() {
        return BV5.A0m(this, mptSupplementalTermsUrl$delegate, $$delegatedProperties, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMuseSupplementalPrivacyPolicyUrl() {
        return BV5.A0m(this, museSupplementalPrivacyPolicyUrl$delegate, $$delegatedProperties, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPreloadsTosLearnMoreUrl() {
        return BV5.A0m(this, preloadsTosLearnMoreUrl$delegate, $$delegatedProperties, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPrivacyPolicyUrl() {
        return BV5.A0m(this, privacyPolicyUrl$delegate, $$delegatedProperties, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getResetHatchLearnMoreUrl() {
        return BV5.A0m(this, resetHatchLearnMoreUrl$delegate, $$delegatedProperties, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSmsNotificationsUrl() {
        return BV5.A0m(this, smsNotificationsUrl$delegate, $$delegatedProperties, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSupplementalPrivacyPolicyUrl() {
        return BV5.A0m(this, supplementalPrivacyPolicyUrl$delegate, $$delegatedProperties, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSupplementalTermsOfServiceUrl() {
        return BV5.A0m(this, supplementalTermsOfServiceUrl$delegate, $$delegatedProperties, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTermsOfServiceUrl() {
        return BV5.A0m(this, termsOfServiceUrl$delegate, $$delegatedProperties, 6);
    }

    public final SecureUri getAiGuideLearnMoreUri() {
        return AbstractC7608F5v.A0L(this, aiGuideLearnMoreUri$delegate, $$delegatedProperties, 18);
    }

    public final SecureUri getBirthdayInfoUri() {
        return AbstractC7608F5v.A0L(this, birthdayInfoUri$delegate, $$delegatedProperties, 26);
    }

    public final SecureUri getConfidentialVmLearnMoreUri() {
        return confidentialVmLearnMoreUri;
    }

    public final SecureUri getDownloadInformationUri() {
        return AbstractC7608F5v.A0L(this, downloadInformationUri$delegate, $$delegatedProperties, 16);
    }

    public final SecureUri getForgotPasswordUri() {
        return AbstractC7608F5v.A0L(this, forgotPasswordUri$delegate, $$delegatedProperties, 29);
    }

    public final SecureUri getHelpCenterUri() {
        return AbstractC7608F5v.A0L(this, helpCenterUri$delegate, $$delegatedProperties, 17);
    }

    public final SecureUri getMetaAiTermsOfServiceUri() {
        return AbstractC7608F5v.A0L(this, metaAiTermsOfServiceUri$delegate, $$delegatedProperties, 19);
    }

    public final SecureUri getMptSupplementalTermsUri() {
        return AbstractC7608F5v.A0L(this, mptSupplementalTermsUri$delegate, $$delegatedProperties, 20);
    }

    public final SecureUri getMuseSupplementalPrivacyPolicyUri() {
        return AbstractC7608F5v.A0L(this, museSupplementalPrivacyPolicyUri$delegate, $$delegatedProperties, 25);
    }

    public final SecureUri getPreloadsTosLearnMoreUri() {
        return AbstractC7608F5v.A0L(this, preloadsTosLearnMoreUri$delegate, $$delegatedProperties, 28);
    }

    public final SecureUri getPrivacyPolicyUri() {
        return AbstractC7608F5v.A0L(this, privacyPolicyUri$delegate, $$delegatedProperties, 24);
    }

    public final SecureUri getResetHatchLearnMoreUri() {
        return AbstractC7608F5v.A0L(this, resetHatchLearnMoreUri$delegate, $$delegatedProperties, 15);
    }

    public final SecureUri getSmsNotificationsUri() {
        return AbstractC7608F5v.A0L(this, smsNotificationsUri$delegate, $$delegatedProperties, 27);
    }

    public final SecureUri getSupplementalPrivacyPolicyUri() {
        return AbstractC7608F5v.A0L(this, supplementalPrivacyPolicyUri$delegate, $$delegatedProperties, 23);
    }

    public final SecureUri getSupplementalTermsOfServiceUri() {
        return AbstractC7608F5v.A0L(this, supplementalTermsOfServiceUri$delegate, $$delegatedProperties, 22);
    }

    public final SecureUri getTermsOfServiceUri() {
        return AbstractC7608F5v.A0L(this, termsOfServiceUri$delegate, $$delegatedProperties, 21);
    }
}
