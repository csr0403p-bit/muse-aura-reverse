package com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider;

import X.BrF;
import X.C7384Etj;
import X.DFX;
import X.DLc;
import com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.AuraAnalyticsProviderInterfaceTestHelper;

/* loaded from: classes5.dex */
public final class AuraAnalyticsProviderInterface {
    public final IAuraAnalyticsProviderInterface mDelegate;

    public class All {
        public static Builder newBuilder() {
            return new BuilderImpl("All");
        }
    }

    public interface Builder {
        AuraAnalyticsProviderInterface build();

        Builder setCustomLogger(BrF brF);
    }

    public class BuilderImpl implements Builder {
        public BrF mCustomLogger;
        public final String mRegistryName;

        @Override // com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.AuraAnalyticsProviderInterface.Builder
        public AuraAnalyticsProviderInterface build() {
            return AuraAnalyticsProviderInterface.create(this.mRegistryName, this.mCustomLogger);
        }

        public BuilderImpl(String str) {
            this.mRegistryName = str;
        }

        @Override // com.facebook.aura.analytics.plugins.interfaces.auraanalyticsprovider.AuraAnalyticsProviderInterface.Builder
        public Builder setCustomLogger(BrF brF) {
            this.mCustomLogger = brF;
            return this;
        }
    }

    @Deprecated
    public static AuraAnalyticsProviderInterface create(String str) {
        return create(str, null);
    }

    public static Builder newBuilder(String str) {
        return new BuilderImpl(str);
    }

    public DFX getAppAnalyticsLogger() {
        return this.mDelegate.getAppAnalyticsLogger();
    }

    public DFX getDeviceAnalyticsLogger() {
        return this.mDelegate.getDeviceAnalyticsLogger();
    }

    public void notifyUserConsentChanged() {
        this.mDelegate.notifyUserConsentChanged();
    }

    public AuraAnalyticsProviderInterface(IAuraAnalyticsProviderInterface iAuraAnalyticsProviderInterface) {
        this.mDelegate = iAuraAnalyticsProviderInterface;
    }

    public static AuraAnalyticsProviderInterface create(String str, BrF brF) {
        IAuraAnalyticsProviderInterface dLc = AuraAnalyticsProviderInterfaceTestHelper.sOneTimeUseDelegateForTesting;
        AuraAnalyticsProviderInterfaceTestHelper.sOneTimeUseDelegateForTesting = null;
        AuraAnalyticsProviderInterfaceTestHelper.DelegateFactory delegateFactory = AuraAnalyticsProviderInterfaceTestHelper.sOneTimeUseDelegateFactoryForTesting;
        AuraAnalyticsProviderInterfaceTestHelper.sOneTimeUseDelegateFactoryForTesting = null;
        if (dLc == null) {
            if (delegateFactory != null) {
                dLc = delegateFactory.create(str, brF);
            } else {
                C7384Etj.A0Y(str, 1);
                dLc = new DLc(brF, str);
            }
        }
        return new AuraAnalyticsProviderInterface(dLc);
    }
}
