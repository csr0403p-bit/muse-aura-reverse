package com.facebook.aura.iap;

import X.AbstractC3358CGz;
import X.AbstractC9683Gdn;
import X.AnonymousClass001;
import X.BV4;
import X.BWT;
import X.C06H;
import X.C31u;
import X.C3350CFz;
import X.C3cG;
import X.C5235Ddt;
import X.C5322DgG;
import X.C7384Etj;
import X.C7516Eyi;
import X.C78U;
import X.C8ee;
import X.CH0;
import X.F0C;
import X.HjL;
import X.Ho8;
import X.HsR;
import X.InterfaceC5107DYf;
import X.InterfaceC5234Dds;
import X.InterfaceC7359EnW;
import X.InterfaceC7549F2g;
import X.InterfaceC9729Gei;
import android.content.Context;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.aura.iap.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.sandbox.AuraSandbox;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchIapUserSession extends AbstractC9683Gdn implements InterfaceC7549F2g {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(HatchIapUserSession.class, "paymentTenantKilled", "getPaymentTenantKilled()Z"), C3cG.A0y(HatchIapUserSession.class, "configuredUseIacOverIap", "getConfiguredUseIacOverIap()Z")};
    public static final Companion Companion = new Companion();
    public final C78U billingScope;
    public final C31u configuredUseIacOverIap$delegate;
    public final Context context;
    public final C31u paymentTenantKilled$delegate;
    public final HsR qplLogger;
    public final AbstractC3358CGz session;
    public final InterfaceC5234Dds transientErrorClassifier;
    public final F0C useIacOverIap$delegate;

    /* loaded from: classes6.dex */
    public final class Companion {
        public final HatchIapUserSession getScoped(Context context) {
            C7384Etj.A0Y(context, 0);
            AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
            if (currentUserSession != null) {
                return (HatchIapUserSession) currentUserSession.A03(HatchIapUserSession.class, new HatchIapUserSession$Companion$getScoped$1$1(context, currentUserSession));
            }
            return null;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getConfiguredUseIacOverIap() {
        return C31u.A01(this, this.configuredUseIacOverIap$delegate, $$delegatedProperties, 1);
    }

    private final boolean getPaymentTenantKilled() {
        return C31u.A01(this, this.paymentTenantKilled$delegate, $$delegatedProperties, 0);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        reportSessionEnd(Ho8.LOGOUT);
    }

    @Override // X.AbstractC9683Gdn, X.Hon
    public String getActorID() {
        return ((CH0) this.session).A01;
    }

    public C78U getBillingScope() {
        return this.billingScope;
    }

    public Context getContext() {
        return this.context;
    }

    public InterfaceC5107DYf getGraphQLQueryExecutor() {
        return AuraGraphQLService.INSTANCE.iapInstance();
    }

    @Override // X.Hon
    public HatchIapCacheProvider getIapCacheProvider() {
        return new HatchIapCacheProvider(AuraUserPrefs.INSTANCE.get(((CH0) this.session).A01, AuraUserPrefStore.IN_APP_PURCHASES));
    }

    public InterfaceC9729Gei getIapConfig() {
        return new HatchIapConfig();
    }

    public HsR getQplLogger() {
        return this.qplLogger;
    }

    public InterfaceC5234Dds getTransientErrorClassifier() {
        return this.transientErrorClassifier;
    }

    public final boolean getUseIacOverIap() {
        return AnonymousClass001.A1X(this.useIacOverIap$delegate.getValue());
    }

    public HatchIapUserSession(Context context, AbstractC3358CGz abstractC3358CGz) {
        this.context = context;
        this.session = abstractC3358CGz;
        this.qplLogger = new HjL();
        this.billingScope = new C78U(C7516Eyi.A00);
        this.transientErrorClassifier = new C5235Ddt();
        this.paymentTenantKilled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.payment_tenant_ks);
        this.configuredUseIacOverIap$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.dcp_iap_android.use_iac_over_iap);
        this.useIacOverIap$delegate = C5322DgG.A01((Function0) new HatchIapUserSession$useIacOverIap$2(this));
    }

    @Override // X.AbstractC9683Gdn
    public boolean getIacKilled() {
        return !getUseIacOverIap();
    }

    @Override // X.Hon
    public C8ee<?> getLogger() {
        return new C3350CFz(BV4.A0C());
    }

    @Override // X.AbstractC9683Gdn, X.Hon
    public BWT getPaymentTenantOverrideUrl() {
        if (getPaymentTenantKilled() || AuraSandbox.INSTANCE.isGraphqlSandboxEnabled()) {
            return null;
        }
        return BWT.A02;
    }

    public /* synthetic */ HatchIapUserSession(Context context, AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(context, abstractC3358CGz);
    }
}
