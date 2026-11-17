package com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator;

import X.BrF;
import X.C7384Etj;
import X.DFW;
import X.DLT;
import X.DLe;
import com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterfaceTestHelper;

/* loaded from: classes5.dex */
public final class AuraAnalyticsDecoratorInterface {
    public final IAuraAnalyticsDecoratorInterface mDelegate;

    public class AuraAnalyticsDecorator {
        public static Builder newBuilder() {
            return new BuilderImpl("AuraAnalyticsDecorator");
        }
    }

    public interface Builder {
        AuraAnalyticsDecoratorInterface build();

        Builder setCustomLogger(BrF brF);
    }

    public class BuilderImpl implements Builder {
        public BrF mCustomLogger;
        public final String mRegistryName;

        @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface.Builder
        public AuraAnalyticsDecoratorInterface build() {
            return AuraAnalyticsDecoratorInterface.create(this.mRegistryName, this.mCustomLogger);
        }

        public BuilderImpl(String str) {
            this.mRegistryName = str;
        }

        @Override // com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface.Builder
        public Builder setCustomLogger(BrF brF) {
            this.mCustomLogger = brF;
            return this;
        }
    }

    @Deprecated
    public static AuraAnalyticsDecoratorInterface create(String str) {
        return create(str, null);
    }

    public static Builder newBuilder(String str) {
        return new BuilderImpl(str);
    }

    public void decorateTimeSpentAppStateEvent(DFW dfw) {
        this.mDelegate.decorateTimeSpentAppStateEvent(dfw);
    }

    public void decorateTimeSpentInteractionEvent(DLT dlt) {
        this.mDelegate.decorateTimeSpentInteractionEvent(dlt);
    }

    public void decorateTimeSpentNavigationEvent(DFW dfw) {
        this.mDelegate.decorateTimeSpentNavigationEvent(dfw);
    }

    public void onTimeSpentAppBackgrounded() {
        this.mDelegate.onTimeSpentAppBackgrounded();
    }

    public void onTimeSpentAppForegrounded() {
        this.mDelegate.onTimeSpentAppForegrounded();
    }

    public void onTimeSpentBitArray(long j, int[] iArr, int i) {
        this.mDelegate.onTimeSpentBitArray(j, iArr, i);
    }

    public void onTimeSpentNavigation() {
        this.mDelegate.onTimeSpentNavigation();
    }

    public AuraAnalyticsDecoratorInterface(IAuraAnalyticsDecoratorInterface iAuraAnalyticsDecoratorInterface) {
        this.mDelegate = iAuraAnalyticsDecoratorInterface;
    }

    public static AuraAnalyticsDecoratorInterface create(String str, BrF brF) {
        IAuraAnalyticsDecoratorInterface dLe = AuraAnalyticsDecoratorInterfaceTestHelper.sOneTimeUseDelegateForTesting;
        AuraAnalyticsDecoratorInterfaceTestHelper.sOneTimeUseDelegateForTesting = null;
        AuraAnalyticsDecoratorInterfaceTestHelper.DelegateFactory delegateFactory = AuraAnalyticsDecoratorInterfaceTestHelper.sOneTimeUseDelegateFactoryForTesting;
        AuraAnalyticsDecoratorInterfaceTestHelper.sOneTimeUseDelegateFactoryForTesting = null;
        if (dLe == null) {
            if (delegateFactory != null) {
                dLe = delegateFactory.create(str, brF);
            } else {
                C7384Etj.A0Y(str, 1);
                dLe = new DLe(brF, str);
            }
        }
        return new AuraAnalyticsDecoratorInterface(dLe);
    }
}
