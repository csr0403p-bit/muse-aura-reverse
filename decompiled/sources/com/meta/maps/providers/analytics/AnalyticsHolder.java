package com.meta.maps.providers.analytics;

import X.AnonymousClass005;
import X.C06H;
import X.C4JM;
import X.C7384Etj;
import android.os.Build;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.meta.maps.core.Analytics;
import com.meta.maps.core.AnalyticsImpl;
import com.meta.maps.core.DeviceInfo;
import com.meta.maps.core.DeviceOS;
import com.meta.maps.core.Providing;

/* loaded from: classes4.dex */
public final class AnalyticsHolder implements Providing {
    public static final Companion Companion = new Companion();
    public final AnalyticsImpl analytics;
    public final HybridData hybridData;
    public final XAnalyticsHolder xAnalyticsHolder;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final DeviceInfo getDeviceInfo() {
            DeviceOS deviceOS = DeviceOS.ANDROID_OS;
            String str = Build.BRAND;
            C7384Etj.A0V(str);
            String str2 = Build.MODEL;
            C7384Etj.A0V(str2);
            String str3 = Build.DEVICE;
            C7384Etj.A0V(str3);
            String str4 = Build.VERSION.RELEASE;
            C7384Etj.A0V(str4);
            String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
            String str5 = Build.HARDWARE;
            C7384Etj.A0V(str5);
            String str6 = Build.BOARD;
            C7384Etj.A0V(str6);
            return new DeviceInfo(deviceOS, str, str2, str3, str4, strValueOf, isPhysicalDevice(str5, str6));
        }

        private final String getVersion() {
            return "16.0.0.11.159";
        }

        private final boolean isPhysicalDevice(String str, String str2) {
            return ("ranchu".equals(str) || AnonymousClass005.A1a(str, "cutf") || AnonymousClass005.A1a(str2, "goldfish") || str2.startsWith("cutf")) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTelemetryPath() {
            String absolutePath = C4JM.A00().getCacheDir().getAbsolutePath();
            C7384Etj.A0U(absolutePath);
            return absolutePath;
        }

        private final HybridData initHybrid(long j, XAnalyticsHolder xAnalyticsHolder) {
            return AnalyticsHolder.initHybrid(j, xAnalyticsHolder);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public static final /* synthetic */ String access$getVersion(Companion companion) {
            return "16.0.0.11.159";
        }

        public Companion() {
        }
    }

    public static final native HybridData initHybrid(long j, XAnalyticsHolder xAnalyticsHolder);

    public final AnalyticsImpl getNativeImpl() {
        return this.analytics;
    }

    public AnalyticsHolder(XAnalyticsHolder xAnalyticsHolder) {
        this.xAnalyticsHolder = xAnalyticsHolder;
        Companion companion = Companion;
        Analytics analyticsCreate = AnalyticsProvider.create(companion.getTelemetryPath());
        C7384Etj.A0Z(analyticsCreate, "null cannot be cast to non-null type com.meta.maps.core.AnalyticsImpl");
        AnalyticsImpl analyticsImpl = (AnalyticsImpl) analyticsCreate;
        this.analytics = analyticsImpl;
        this.hybridData = initHybrid(analyticsImpl.nativeHandle, xAnalyticsHolder);
        analyticsImpl.setVersion("16.0.0.11.159");
        analyticsImpl.setDeviceInfo(companion.getDeviceInfo());
    }
}
