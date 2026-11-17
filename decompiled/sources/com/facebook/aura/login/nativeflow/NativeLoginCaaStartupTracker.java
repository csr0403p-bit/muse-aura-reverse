package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes5.dex */
public final class NativeLoginCaaStartupTracker {
    public static final int $stable = 8;
    public boolean ended;
    public final int instanceKey;
    public final QuickPerformanceLogger qpl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public final class Landing {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Landing[] $VALUES;
        public static final Landing AYMH;
        public static final Landing LOGIN_FORM;
        public static final Landing NTP;
        public final String value;

        static {
            Landing landing = new Landing("AYMH", 0, "AYMH_PAGE");
            AYMH = landing;
            Landing landing2 = new Landing("LOGIN_FORM", 1, "LOGIN_FORM");
            LOGIN_FORM = landing2;
            Landing landing3 = new Landing("NTP", 2, "RL_NTP_LANDING");
            NTP = landing3;
            Landing[] landingArr = {landing, landing2, landing3};
            $VALUES = landingArr;
            $ENTRIES = C3cG.A0w(landingArr);
        }

        public static Ey9<Landing> getEntries() {
            return $ENTRIES;
        }

        public static Landing valueOf(String str) {
            return (Landing) Enum.valueOf(Landing.class, str);
        }

        public static Landing[] values() {
            return (Landing[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Landing(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final synchronized void abandon() {
        if (!this.ended) {
            this.ended = true;
            this.qpl.markerAnnotate(896612552, this.instanceKey, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, "native_login_abandoned");
            this.qpl.markerEnd(896612552, this.instanceKey, (short) 3);
        }
    }

    public final synchronized void success(Landing landing) {
        C7384Etj.A0Y(landing, 0);
        if (!this.ended) {
            this.ended = true;
            this.qpl.markerAnnotate(896612552, this.instanceKey, "landing_page", landing.getValue());
            this.qpl.markerEnd(896612552, this.instanceKey, (short) 2);
        }
    }

    public NativeLoginCaaStartupTracker() {
        QuickPerformanceLogger quickPerformanceLoggerA0g = C60O.A0g();
        this.qpl = quickPerformanceLoggerA0g;
        int iIdentityHashCode = System.identityHashCode(this);
        this.instanceKey = iIdentityHashCode;
        quickPerformanceLoggerA0g.markerStart(896612552, iIdentityHashCode, false);
        quickPerformanceLoggerA0g.markerAnnotate(896612552, iIdentityHashCode, "is_native", 1);
    }
}
