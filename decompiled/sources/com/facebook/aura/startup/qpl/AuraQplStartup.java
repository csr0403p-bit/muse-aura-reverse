package com.facebook.aura.startup.qpl;

import X.BV5;
import X.C60O;
import X.C7384Etj;
import android.app.Application;
import com.facebook.aura.analytics.impl.QplConfigInstance;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.startup.AuraStartupMetricsRecorder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: classes5.dex */
public final class AuraQplStartup {
    public static final AuraQplStartup INSTANCE = new AuraQplStartup();

    public final void init(Application application) {
        C7384Etj.A0Y(application, 0);
        ((QplConfigInstance) BV5.A0Z(65549)).init(application);
        QuickPerformanceLogger quickPerformanceLoggerA0g = C60O.A0g();
        UserFlowJNIProvider.setUserFlowLogger((UserFlowLogger) BV5.A0Z(65546));
        HatchStartupQpl.startupQpl.onQplReady(quickPerformanceLoggerA0g);
        AuraStartupMetricsRecorder.isQplReady.open();
    }
}
