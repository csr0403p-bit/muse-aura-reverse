package com.facebook.aura.perf;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class HatchQplLogger {
    public static final HatchQplLogger INSTANCE = new HatchQplLogger();
    public static volatile boolean isTabSwitchActive;

    public final void markerAnnotate(int i, String str, int i2, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        C60O.A0g().markerAnnotate(i, str2.hashCode(), str, i2);
    }

    public final void markerEnd(int i, short s, String str) {
        C7384Etj.A0Y(str, 2);
        C60O.A0g().markerEnd(i, str.hashCode(), s);
    }

    public final void markerStart(int i, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        int iHashCode = str.hashCode();
        C60O.A0g().markerStart(i, iHashCode, z);
        annotateVmAttribution(i, iHashCode);
    }

    private final void annotateVmAttribution(int i, int i2) {
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        String str = attributionSnapshot.vmId;
        if (str != null) {
            C60O.A0g().markerAnnotate(i, i2, "vm_id", str);
        }
        String str2 = attributionSnapshot.vmHostname;
        if (str2 != null) {
            C60O.A0g().markerAnnotate(i, i2, AuraAnalyticsDecoratorImplementation.TIME_SPENT_VM_HOSTNAME, str2);
        }
        Boolean bool = attributionSnapshot.isCvm;
        if (bool != null) {
            C60O.A0g().markerAnnotate(i, i2, AuraAnalyticsDecoratorImplementation.TIME_SPENT_IS_CVM, bool.booleanValue());
        }
    }

    public static /* synthetic */ void markerAnnotate$default(HatchQplLogger hatchQplLogger, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        hatchQplLogger.markerAnnotate(i, str, i2, i3);
    }

    public static /* synthetic */ void markerEnd$default(HatchQplLogger hatchQplLogger, int i, short s, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        hatchQplLogger.markerEnd(i, s, i2);
    }

    public static /* synthetic */ void markerPoint$default(HatchQplLogger hatchQplLogger, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        hatchQplLogger.markerPoint(i, str, i2);
    }

    public final boolean isTabSwitchActive() {
        return isTabSwitchActive;
    }

    public final void setTabSwitchActive(boolean z) {
        isTabSwitchActive = z;
    }

    private final QuickPerformanceLogger getQpl() {
        return C60O.A0g();
    }

    public static /* synthetic */ void markerStart$default(HatchQplLogger hatchQplLogger, int i, int i2, boolean z, int i3, Object obj) {
        int iA01 = C3cG.A01(i3, i2);
        if ((i3 & 4) != 0) {
            z = true;
        }
        hatchQplLogger.markerStart(i, iA01, z);
    }

    public final long captureRetroactiveTimestamp() {
        return System.nanoTime();
    }

    public final long currentMonotonicTimestampMs() {
        return SystemClock.elapsedRealtime();
    }

    public final boolean isMarkerOn(int i, String str) {
        return C60P.A1G(str).isMarkerOn(i, str.hashCode());
    }

    public final EventBuilder markEvent(int i, String str) {
        EventBuilder eventBuilderMarkEventBuilder = C60P.A1G(str).markEventBuilder(i, str);
        HatchVmLoggingContext.Attribution attributionSnapshot = HatchVmLoggingContext.INSTANCE.snapshot();
        String str2 = attributionSnapshot.vmId;
        if (str2 != null) {
            eventBuilderMarkEventBuilder.annotate("vm_id", str2);
        }
        String str3 = attributionSnapshot.vmHostname;
        if (str3 != null) {
            eventBuilderMarkEventBuilder.annotate(AuraAnalyticsDecoratorImplementation.TIME_SPENT_VM_HOSTNAME, str3);
        }
        Boolean bool = attributionSnapshot.isCvm;
        if (bool != null) {
            eventBuilderMarkEventBuilder.annotate(AuraAnalyticsDecoratorImplementation.TIME_SPENT_IS_CVM, bool.booleanValue());
        }
        C7384Etj.A0X(eventBuilderMarkEventBuilder);
        return eventBuilderMarkEventBuilder;
    }

    public final void markerPoint(int i, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        C60O.A0g().markerPoint(i, str2.hashCode(), str);
    }

    public static /* synthetic */ void markerAnnotate$default(HatchQplLogger hatchQplLogger, int i, String str, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        hatchQplLogger.markerAnnotate(i, str, z, i2);
    }

    public static /* synthetic */ void markerPoint$default(HatchQplLogger hatchQplLogger, int i, String str, int i2, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        hatchQplLogger.markerPoint(i, str, i2, j);
    }

    public static /* synthetic */ void markerStart$default(HatchQplLogger hatchQplLogger, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        hatchQplLogger.markerStart(i, str, z);
    }

    public final boolean isMarkerOn(int i, int i2) {
        return C60O.A0g().isMarkerOn(i, i2);
    }

    public final void markerAnnotate(int i, String str, String str2, String str3) {
        AnonymousClass005.A11(str, str2, str3, 1);
        C60O.A0g().markerAnnotate(i, str3.hashCode(), str, str2);
    }

    public final void markerEnd(int i, short s, int i2) {
        C60O.A0g().markerEnd(i, i2, s);
    }

    public final void markerPoint(int i, String str, String str2, long j) {
        AnonymousClass003.A0x(str, str2);
        C60O.A0g().markerPoint(i, str2.hashCode(), str, j, TimeUnit.NANOSECONDS);
    }

    public final void markerStart(int i, int i2, boolean z) {
        C60O.A0g().markerStart(i, i2, z);
        annotateVmAttribution(i, i2);
    }

    public static /* synthetic */ void markerAnnotate$default(HatchQplLogger hatchQplLogger, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        hatchQplLogger.markerAnnotate(i, str, str2, i2);
    }

    public final void markerAnnotate(int i, String str, boolean z, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        C60O.A0g().markerAnnotate(i, str2.hashCode(), str, z);
    }

    public final void markerPoint(int i, String str, int i2, long j) {
        C60P.A1G(str).markerPoint(i, i2, str, j, TimeUnit.NANOSECONDS);
    }

    public final void markerAnnotate(int i, String str, String str2, int i2) {
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(str2, 2);
        AuraQuickPerformanceLogger.INSTANCE.getInstance().markerAnnotate(i, i2, str, str2);
    }

    public final void markerPoint(int i, String str, int i2) {
        C60P.A1G(str).markerPoint(i, i2, str);
    }

    public final void markerAnnotate(int i, String str, boolean z, int i2) {
        C7384Etj.A0Y(str, 1);
        AuraQuickPerformanceLogger.INSTANCE.getInstance().markerAnnotate(i, i2, str, z);
    }

    public final void markerAnnotate(int i, String str, int i2, int i3) {
        C60P.A1G(str).markerAnnotate(i, i3, str, i2);
    }
}
