package com.facebook.aura.iap;

import X.C31u;
import X.C3cG;
import X.C5238De1;
import X.C7384Etj;
import X.C9724Gec;
import X.CRP;
import X.InterfaceC5239De2;
import X.InterfaceC7359EnW;
import X.InterfaceC9729Gei;
import com.facebook.aura.iap.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes5.dex */
public final class HatchIapConfig implements InterfaceC9729Gei {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(HatchIapConfig.class, "countryBlocklisted", "getCountryBlocklisted()Z"), C3cG.A0y(HatchIapConfig.class, "lifecycleOpenEnabled", "getLifecycleOpenEnabled()Z"), C3cG.A0y(HatchIapConfig.class, "lifecycleCloseEnabled", "getLifecycleCloseEnabled()Z"), C3cG.A0y(HatchIapConfig.class, "serverAckDirectiveEnabled", "getServerAckDirectiveEnabled()Z"), C3cG.A0y(HatchIapConfig.class, "inBandQuoteErrorsSupported", "getInBandQuoteErrorsSupported()Z"), C3cG.A0y(HatchIapConfig.class, "strictGoogleOfferSelectionEnabled", "getStrictGoogleOfferSelectionEnabled()Z")};
    public final String uplAppName = "HATCH";
    public final C31u countryBlocklisted$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.stella_payments_in_app_purchases.android_iap_paid_apps_country_blacklist);
    public final C31u lifecycleOpenEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.enable_session_lifecycle_open);
    public final C31u lifecycleCloseEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.enable_session_lifecycle_close);
    public final C31u serverAckDirectiveEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.enable_server_ack_directive);
    public final C31u inBandQuoteErrorsSupported$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.supports_in_band_quote_errors);
    public final C31u strictGoogleOfferSelectionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.enable_strict_google_offer_selection);

    @Override // X.InterfaceC9729Gei
    public /* bridge */ boolean shouldConsumePurchaseError(C9724Gec c9724Gec) {
        C7384Etj.A0Y(c9724Gec, 1);
        return c9724Gec.A02 == 2603087;
    }

    private final boolean getCountryBlocklisted() {
        return C31u.A01(this, this.countryBlocklisted$delegate, $$delegatedProperties, 0);
    }

    private final boolean getInBandQuoteErrorsSupported() {
        return C31u.A01(this, this.inBandQuoteErrorsSupported$delegate, $$delegatedProperties, 4);
    }

    private final boolean getLifecycleCloseEnabled() {
        return C31u.A01(this, this.lifecycleCloseEnabled$delegate, $$delegatedProperties, 2);
    }

    private final boolean getLifecycleOpenEnabled() {
        return C31u.A01(this, this.lifecycleOpenEnabled$delegate, $$delegatedProperties, 1);
    }

    private final boolean getServerAckDirectiveEnabled() {
        return C31u.A01(this, this.serverAckDirectiveEnabled$delegate, $$delegatedProperties, 3);
    }

    private final boolean getStrictGoogleOfferSelectionEnabled() {
        return C31u.A01(this, this.strictGoogleOfferSelectionEnabled$delegate, $$delegatedProperties, 5);
    }

    public /* bridge */ boolean blockUnsupportedSdk() {
        return false;
    }

    public /* bridge */ long emptyPurchaseGraceMs() {
        return 8000L;
    }

    public /* bridge */ boolean enableAllFunnelStepCallbacks() {
        return false;
    }

    public /* bridge */ boolean enableDeterministicCountryCode() {
        return false;
    }

    public /* bridge */ boolean enableNetworkRetry() {
        return false;
    }

    public /* bridge */ boolean enableNonTerminalEmptyPurchase() {
        return false;
    }

    public /* bridge */ boolean enableOdysseyPipeline() {
        return false;
    }

    public /* bridge */ boolean enableSessionLifecycleTeardown() {
        return false;
    }

    public /* bridge */ boolean fixProductFetchFailureLogging() {
        return false;
    }

    public C5238De1 getGraphQLErrorCodeResolver() {
        return new C5238De1();
    }

    public String getUplAppName() {
        return this.uplAppName;
    }

    public /* bridge */ boolean gracePeriodMessageExperimentMV4B() {
        return false;
    }

    public /* bridge */ boolean gracePeriodMessageExperimentMV4C() {
        return false;
    }

    public /* bridge */ boolean hasPlayStoreEnabled() {
        return true;
    }

    public /* bridge */ boolean paymentTenantKillSwitch() {
        return true;
    }

    public /* bridge */ boolean pblRequestTimeoutEnabled() {
        return false;
    }

    public /* bridge */ boolean prewarmOnAppStart() {
        return false;
    }

    public /* bridge */ InterfaceC5239De2 serverAttributedAsyncFulfillment() {
        return null;
    }

    public /* bridge */ CRP serverAttributedGateState() {
        return null;
    }

    public /* bridge */ boolean shouldPassPurchaseHistoryToInUseSku() {
        return true;
    }

    public /* bridge */ boolean shouldSendObfuscatedAccountId() {
        return true;
    }

    public /* bridge */ boolean shouldUseServerXGradeResponseWhenCacheMiss() {
        return false;
    }

    public /* bridge */ boolean useLaunchBillingFlowResult() {
        return false;
    }

    @Override // X.InterfaceC9729Gei
    public boolean enableServerAckDirective() {
        return getServerAckDirectiveEnabled();
    }

    @Override // X.InterfaceC9729Gei
    public boolean enableSessionLifecycleClose() {
        return getLifecycleCloseEnabled();
    }

    @Override // X.InterfaceC9729Gei
    public boolean enableSessionLifecycleOpen() {
        return getLifecycleOpenEnabled();
    }

    @Override // X.InterfaceC9729Gei
    public boolean enableStrictGoogleOfferSelection() {
        return getStrictGoogleOfferSelectionEnabled();
    }

    @Override // X.InterfaceC9729Gei
    public boolean isBlocklistedCountry(String str) {
        return getCountryBlocklisted();
    }

    public /* bridge */ long paymentFlowTimeoutMs() {
        return 300000L;
    }

    @Override // X.InterfaceC9729Gei
    public boolean supportsInBandQuoteErrors() {
        return getInBandQuoteErrorsSupported();
    }
}
