package com.facebook.aura.analytics.plugins.implementations.analyticsdecorator;

import X.AnonymousClass003;
import X.BV5;
import X.C06H;
import X.C7384Etj;
import X.DFW;
import X.DLT;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* loaded from: classes5.dex */
public final class AuraAnalyticsDecoratorImplementation {
    public static final Companion Companion = new Companion();
    public static final String TIME_SPENT_APP_UID = "app_uid";
    public static final String TIME_SPENT_IS_CVM = "is_cvm";
    public static final String TIME_SPENT_PARAM_APP_IN_BACKGROUND = "app_in_background";
    public static final String TIME_SPENT_VM_HOSTNAME = "vm_hostname";
    public static final String TIME_SPENT_VM_ID = "vm_id";

    public final void decorateTimeSpentAppStateEvent(DFW dfw) {
        C7384Etj.A0Y(dfw, 0);
        decorate(EventBuilderDecorator.INSTANCE, dfw);
    }

    public final void decorateTimeSpentInteractionEvent(DLT dlt) {
        C7384Etj.A0Y(dlt, 0);
        decorate(TimeSpentLoggerEventDecorator.INSTANCE, dlt);
    }

    public final void decorateTimeSpentNavigationEvent(DFW dfw) {
        C7384Etj.A0Y(dfw, 0);
        decorate(EventBuilderDecorator.INSTANCE, dfw);
    }

    public final void onTimeSpentBitArray(long j, int[] iArr, int i) {
        C7384Etj.A0Y(iArr, 1);
        HatchClientCvmEventLogger.INSTANCE.logTimeSpentBitArray(j, iArr, i);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public abstract class Decorator<T> {
        public abstract void decorate(T t, String str, Boolean bool);

        public abstract void decorate(T t, String str, String str2);

        public /* synthetic */ Decorator(C06H c06h) {
        }

        public Decorator() {
        }
    }

    public final class EventBuilderDecorator extends Decorator<DFW> {
        public static final EventBuilderDecorator INSTANCE = new EventBuilderDecorator();

        @Override // com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation.Decorator
        public void decorate(DFW dfw, String str, Boolean bool) {
            AnonymousClass003.A0u(dfw, str);
            if (bool != null) {
                dfw.A07(bool, str);
            }
        }

        @Override // com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation.Decorator
        public void decorate(DFW dfw, String str, String str2) {
            AnonymousClass003.A0u(dfw, str);
            if (str2 != null) {
                dfw.A09(str, str2);
            }
        }
    }

    public final class TimeSpentLoggerEventDecorator extends Decorator<DLT> {
        public static final TimeSpentLoggerEventDecorator INSTANCE = new TimeSpentLoggerEventDecorator();

        @Override // com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation.Decorator
        public void decorate(DLT dlt, String str, Boolean bool) {
            AnonymousClass003.A0u(dlt, str);
            if (bool != null) {
                dlt.addParameter(str, bool.booleanValue());
            }
        }

        @Override // com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation.Decorator
        public void decorate(DLT dlt, String str, String str2) {
            AnonymousClass003.A0u(dlt, str);
            if (str2 != null) {
                dlt.addParameter(str, str2);
            }
        }
    }

    private final <T> void decorate(Decorator<T> decorator, T t) {
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        decorator.decorate((Decorator<T>) t, TIME_SPENT_APP_UID, BV5.A0k());
        decorator.decorate((Decorator<T>) t, TIME_SPENT_PARAM_APP_IN_BACKGROUND, isAppInBackground());
        decorator.decorate((Decorator<T>) t, "vm_id", attributionSnapshot.vmId);
        decorator.decorate((Decorator<T>) t, TIME_SPENT_VM_HOSTNAME, attributionSnapshot.vmHostname);
        decorator.decorate((Decorator<T>) t, TIME_SPENT_IS_CVM, attributionSnapshot.isCvm);
    }

    private final String isAppInBackground() {
        return String.valueOf(!AuraAppLifecycleManager.INSTANCE.isAppInForeground());
    }

    public final void onTimeSpentAppBackgrounded() {
        HatchClientCvmEventLogger.INSTANCE.logTimeSpentBackground();
    }

    public final void onTimeSpentAppForegrounded() {
        HatchClientCvmEventLogger.INSTANCE.logTimeSpentForeground();
    }

    public final void onTimeSpentNavigation() {
        HatchClientCvmEventLogger.INSTANCE.logTimeSpentNavigation();
    }

    private final String getAppUid() {
        return BV5.A0k();
    }
}
