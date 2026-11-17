package com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator;

import X.BV5;
import X.BrF;
import X.C3cG;

/* loaded from: classes5.dex */
public final class AuraAnalyticsDecoratorInterfaceTestHelper {
    public static DelegateFactory sOneTimeUseDelegateFactoryForTesting;
    public static IAuraAnalyticsDecoratorInterface sOneTimeUseDelegateForTesting;

    public interface DelegateFactory {
        IAuraAnalyticsDecoratorInterface create(String str, BrF brF);
    }

    public static void checkTestRunner(String str) throws ClassNotFoundException {
        if (System.getProperty("buck.testrunner_classes") != null || System.getProperty("java.class.path").contains("testrunner_classes") || System.getProperty("java.class.path").contains("test_config_properties.jar")) {
            return;
        }
        try {
            Class.forName("com.facebook.testing.uitest.runner.UITestRunner");
        } catch (ClassNotFoundException unused) {
            throw BV5.A0h(str, " can only be used in tests!");
        }
    }

    public static DelegateFactory getDelegateFactoryForTesting() {
        DelegateFactory delegateFactory = sOneTimeUseDelegateFactoryForTesting;
        sOneTimeUseDelegateFactoryForTesting = null;
        return delegateFactory;
    }

    public static IAuraAnalyticsDecoratorInterface getDelegateForTesting() {
        IAuraAnalyticsDecoratorInterface iAuraAnalyticsDecoratorInterface = sOneTimeUseDelegateForTesting;
        sOneTimeUseDelegateForTesting = null;
        return iAuraAnalyticsDecoratorInterface;
    }

    public static void setDelegateFactoryForTesting(DelegateFactory delegateFactory) throws ClassNotFoundException {
        if (sOneTimeUseDelegateForTesting != null) {
            throw C3cG.A0Q("Already set a delegate in AuraAnalyticsDecoratorInterfaceTestHelper. Delegate and DelegateFactory are not allowed to be configured at the same time.");
        }
        checkTestRunner("AuraAnalyticsDecoratorInterfaceTestHelper.setDelegateFactoryForTesting()");
        sOneTimeUseDelegateFactoryForTesting = delegateFactory;
    }

    public static void setDelegateForTesting(IAuraAnalyticsDecoratorInterface iAuraAnalyticsDecoratorInterface) throws ClassNotFoundException {
        if (sOneTimeUseDelegateFactoryForTesting != null) {
            throw C3cG.A0Q("Already set a delegateFactory in AuraAnalyticsDecoratorInterfaceTestHelper. Delegate and DelegateFactory are not allowed to be configured at the same time.");
        }
        checkTestRunner("AuraAnalyticsDecoratorInterfaceTestHelper.setDelegateForTesting()");
        sOneTimeUseDelegateForTesting = iAuraAnalyticsDecoratorInterface;
    }
}
