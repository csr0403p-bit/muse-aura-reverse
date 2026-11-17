package com.facebook.aura.hooks.lifecycle;

import X.AbstractC3136BzG;
import X.AbstractC5245DeA;
import X.AnonymousClass801;
import X.BV5;
import X.C3429CMx;
import X.C7384Etj;
import X.CFK;
import android.os.Trace;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchOsNotificationSettingLogger;
import com.facebook.aura.analytics.impl.MetaAnalyticsHooks;
import com.facebook.aura.analytics.impl.MetaAnalyticsInstance;
import com.facebook.aura.analytics.timespent.AppStateAnalyticsFactory;
import com.facebook.aura.analytics.timespent.TimeSpentAnalytics;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class AuraLifecycleHooks {
    public final void onAppBackgroundedOnUiThreadLongDelay() {
        AbstractC3136BzG.A00("AuraLifecycleHooks.onAppBackgroundedOnUiThreadLongDelay");
        try {
            ((TimeSpentAnalytics) BV5.A0Z(65558)).recordAppBackgrounded();
            AppStateAnalyticsFactory.instance.recordAppBackgrounded();
            ((MetaAnalyticsHooks) BV5.A0Z(65551)).onBackground();
        } finally {
            Trace.endSection();
        }
    }

    public final void onAppBackgroundedOnUiThreadShortDelay() {
        AbstractC3136BzG.A00("AuraLifecycleHooks.onAppBackgroundedOnUiThreadShortDelay");
        try {
            AuraAppLifecycleManager.INSTANCE.markAppInBackground();
            AppStateAnalyticsFactory.instance.recordAppBackgroundedImmediate();
            HatchClientCvmEventLogger.INSTANCE.onAppBackgrounded();
            Set setA03 = AbstractC5245DeA.A03(2);
            C7384Etj.A0U(setA03);
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) BV5.A0Z(65544);
            quickPerformanceLogger.endAllMarkers((short) 630, true);
            quickPerformanceLogger.markEvent(46333953, "afterEndAllMarkers", 7);
            Iterator it = setA03.iterator();
            while (it.hasNext()) {
                ((UserFlowLogger) ((C3429CMx) it.next()).A00.A00.AMN()).onAppBackgrounded();
            }
            int[] iArr = {0, 1, 2, 3};
            int i = 0;
            do {
                try {
                    AnonymousClass801.A0V(iArr[i]);
                } catch (Exception e) {
                    CFK.A08(AuraLifecycleHooksKt.TAG, "App backgrounded listener failed", e);
                }
                i++;
            } while (i < 4);
            ((MetaAnalyticsInstance) BV5.A0Z(65550)).triggerUploadNow();
        } finally {
            Trace.endSection();
        }
    }

    public final void onAppForegroundedOnBackgroundThread() {
        AuraAppLifecycleManager.INSTANCE.markAppInForegroundOnWorkerThread();
    }

    public final void onAppForegroundedOnUiThread() {
        AbstractC3136BzG.A00("AuraLifecycleHooks.onAppForegroundedOnUiThread");
        try {
            AuraAppLifecycleManager.INSTANCE.markAppInForegroundImmediate();
            ((TimeSpentAnalytics) BV5.A0Z(65558)).recordAppForegrounded();
            AppStateAnalyticsFactory.instance.recordAppForegrounded();
            HatchClientCvmEventLogger.INSTANCE.logClientOpen();
            ((MetaAnalyticsHooks) BV5.A0Z(65551)).onForeground();
            HatchOsNotificationSettingLogger.INSTANCE.logForegroundSnapshotDetectingChange();
        } finally {
            Trace.endSection();
        }
    }
}
