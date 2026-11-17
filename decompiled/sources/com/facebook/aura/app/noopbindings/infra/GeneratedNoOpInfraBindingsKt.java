package com.facebook.aura.app.noopbindings.infra;

import X.C8ee;
import X.DFX;
import X.DGY;
import X.F60;
import X.InterfaceC10378HOe;
import X.InterfaceC10379HOf;
import X.InterfaceC3472COx;
import X.InterfaceC5259DeO;
import com.facebook.aura.app.noopbindings.infra.NoOpInfraBindingsKt;
import com.facebook.aura.qpl.AuraQplNameProvider;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes6.dex */
public class GeneratedNoOpInfraBindingsKt {
    public static final C8ee _UL__ULSEP_com_facebook_analytics_structuredlogger_base_Logger_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return new NoOpInfraBindingsKt.AnonymousClass1();
    }

    public static final C8ee _UL__ULSEP_com_facebook_analytics_structuredlogger_base_Logger_ULSEP_com_facebook_analytics2_logger_annotations_SessionScopedLogger_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return new NoOpInfraBindingsKt.C109231();
    }

    public static final NoOpInfraBindingsKt.C109221 _UL__ULSEP_com_facebook_mobileconfig_errorreporter_intf_MobileConfigErrorReporter_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return new NoOpInfraBindingsKt.C109221();
    }

    public static final DFX _UL__ULSEP_com_facebook_analytics2_logger_Analytics2Logger_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return NoOpInfraBindingsKt.provideAnalytics2Logger();
    }

    public static final DFX _UL__ULSEP_com_facebook_analytics2_logger_Analytics2Logger_ULSEP_com_facebook_analytics2_logger_annotations_SessionScopedA2Logger_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        return NoOpInfraBindingsKt.provideSessionScopedAnalytics2Logger();
    }

    public static final InterfaceC10379HOf _UL__ULSEP_com_facebook_analytics_logger_AnalyticsConfig_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideAnalyticsConfig();
        throw F60.createAndThrow();
    }

    public static final InterfaceC10378HOe _UL__ULSEP_com_facebook_analytics_logger_AnalyticsLogger_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideAnalyticsLogger();
        throw F60.createAndThrow();
    }

    public static final FbSharedPreferences _UL__ULSEP_com_facebook_prefs_shared_FbSharedPreferences_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideFbSharedPreferences();
        throw F60.createAndThrow();
    }

    public static final DGY _UL__ULSEP_com_facebook_quicklog_BackgroundExecution_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideBackgroundExecution();
        throw F60.createAndThrow();
    }

    public static final InterfaceC3472COx _UL__ULSEP_com_facebook_quicklog_DebugAndTestConfig_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideDebugAndTestConfig();
        throw F60.createAndThrow();
    }

    public static final LightweightQuickPerformanceLogger _UL__ULSEP_com_facebook_quicklog_LightweightQuickPerformanceLogger_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideLightweightQuickPerformanceLogger();
        throw F60.createAndThrow();
    }

    public static final AuraQplNameProvider _UL__ULSEP_com_facebook_quicklog_QuicklogNameProvider_ULSEP_FACTORY_METHOD(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        NoOpInfraBindingsKt.provideQuicklogNameProvider();
        throw F60.createAndThrow();
    }
}
