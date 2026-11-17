package com.facebook.aura.wearablebroadcast;

import X.AbstractC10403HbK;
import X.AnonymousClass002;
import X.C3cG;
import X.C4JM;
import X.C60P;
import X.C7381Etf;
import X.C7384Etj;
import X.C7BY;
import X.C7mB;
import X.C7mC;
import X.C7mU;
import X.CFK;
import X.Ey9;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class MetaAiAppBroadcastSender {
    public static final String ACTION_HATCH_WEARABLE_TTS = "com.facebook.wearable.assistant.ipc.HATCH_WEARABLE_TTS";
    public static final String EXTRA_BODY = "body";
    public static final String EXTRA_CLIENT_INTERACTION_ID = "client_interaction_id";
    public static final String EXTRA_REQUEST_ID = "request_id";
    public static final String EXTRA_REQUEST_ORIGIN = "request_origin";
    public static final String EXTRA_TITLE = "title";
    public static final MetaAiAppBroadcastSender INSTANCE = new MetaAiAppBroadcastSender();
    public static final String IPC_DOMAIN = "IPC_REQUEST";
    public static final String META_AI_APP_PACKAGE_DEBUG = "com.facebook.stella_debug";
    public static final String META_AI_APP_PACKAGE_PROD = "com.facebook.stella";
    public static final String RECEIVER_CLASS = "com.facebook.wearable.companion.wearableshatch.broadcast.HatchTtsBroadcastReceiver";
    public static final String TAG = "MetaAiAppBroadcastSender";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InstallState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ InstallState[] $VALUES;
        public static final InstallState ABSENT;
        public static final InstallState INSTALLED;
        public static final InstallState UNKNOWN;

        static {
            InstallState installState = new InstallState("INSTALLED", 0);
            INSTALLED = installState;
            InstallState installState2 = new InstallState("ABSENT", 1);
            ABSENT = installState2;
            InstallState installState3 = new InstallState("UNKNOWN", 2);
            UNKNOWN = installState3;
            InstallState[] installStateArr = {installState, installState2, installState3};
            $VALUES = installStateArr;
            $ENTRIES = C3cG.A0w(installStateArr);
        }

        public static Ey9<InstallState> getEntries() {
            return $ENTRIES;
        }

        public static InstallState valueOf(String str) {
            return (InstallState) Enum.valueOf(InstallState.class, str);
        }

        public static InstallState[] values() {
            return (InstallState[]) $VALUES.clone();
        }

        public InstallState(String str, int i) {
        }
    }

    public interface Result {

        public final class Failed implements Result {
            public final Throwable cause;

            public Failed(Throwable th) {
                C7384Etj.A0Y(th, 0);
                this.cause = th;
            }

            public final Throwable getCause() {
                return this.cause;
            }
        }

        public final class NotInstalled implements Result {
            public static final NotInstalled INSTANCE = new NotInstalled();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NotInstalled);
            }

            public String toString() {
                return "NotInstalled";
            }

            public int hashCode() {
                return 799091938;
            }
        }

        public final class Sent implements Result {
            public static final Sent INSTANCE = new Sent();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Sent);
            }

            public String toString() {
                return "Sent";
            }

            public int hashCode() {
                return -213385837;
            }
        }

        public final class Untrusted implements Result {
            public static final Untrusted INSTANCE = new Untrusted();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Untrusted);
            }

            public String toString() {
                return "Untrusted";
            }

            public int hashCode() {
                return -971215069;
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstallState.values().length];
            try {
                AnonymousClass002.A13(InstallState.INSTALLED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(InstallState.ABSENT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(InstallState.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String getTargetPackage() {
        return "com.facebook.stella";
    }

    private final C7381Etf getTrustedApp() {
        C7mC c7mC = AbstractC10403HbK.A2S;
        HashMap map = new HashMap();
        map.put(c7mC, "com.facebook.stella");
        return C7mB.A01(map);
    }

    private final InstallState targetInstallState(PackageManager packageManager) throws PackageManager.NameNotFoundException {
        try {
            packageManager.getPackageInfo("com.facebook.stella", 0);
            return InstallState.INSTALLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return InstallState.ABSENT;
        } catch (RuntimeException unused2) {
            return InstallState.UNKNOWN;
        }
    }

    public final Result send(String str, String str2, String str3, String str4, String str5) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        AnonymousClass002.A1B(str3, 2, str4);
        Application applicationA00 = C4JM.A00();
        Intent intentA03 = C60P.A03(ACTION_HATCH_WEARABLE_TTS);
        intentA03.setComponent(new ComponentName("com.facebook.stella", RECEIVER_CLASS));
        intentA03.putExtra("title", str);
        intentA03.putExtra(EXTRA_BODY, str2);
        intentA03.putExtra(EXTRA_REQUEST_ORIGIN, str3);
        intentA03.putExtra("request_id", str4);
        if (str5 != null && !C7BY.A0j(str5)) {
            intentA03.putExtra("client_interaction_id", str5);
        }
        try {
            C7mU c7mUA00 = C7mU.A00();
            C7mC c7mC = AbstractC10403HbK.A2S;
            HashMap map = new HashMap();
            map.put(c7mC, "com.facebook.stella");
            if (c7mUA00.A07(C7mB.A01(map)).A06(IPC_DOMAIN).A08(applicationA00, intentA03)) {
                return Result.Sent.INSTANCE;
            }
            PackageManager packageManager = applicationA00.getPackageManager();
            C7384Etj.A0U(packageManager);
            int iOrdinal = targetInstallState(packageManager).ordinal();
            if (iOrdinal == 0) {
                return Result.Untrusted.INSTANCE;
            }
            if (iOrdinal == 1) {
                return Result.NotInstalled.INSTANCE;
            }
            if (iOrdinal == 2) {
                return new Result.Failed(C3cG.A0Q("package lookup failed"));
            }
            throw C3cG.A0q();
        } catch (Exception e) {
            CFK.A0D(TAG, "broadcast to the Meta AI app threw id=%s", e, str4);
            return new Result.Failed(e);
        }
    }
}
