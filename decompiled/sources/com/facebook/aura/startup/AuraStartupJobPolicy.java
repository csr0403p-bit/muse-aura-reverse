package com.facebook.aura.startup;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.BFI;
import X.C4JM;
import X.C7384Etj;
import X.F0C;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraStartupJobPolicy {
    public static final AuraStartupJobPolicy INSTANCE = new AuraStartupJobPolicy();
    public static final Set<AppJobKey> watchJobs = BFI.A0H(new AppJobId[]{AppJobId.FIRST_RUN_STATE, AppJobId.FRESCO, AppJobId.NETWORK_MONITOR, AppJobId.CRASH_MANAGER_LATE, AppJobId.QPL_STARTUP_COMPLETE, AppJobId.ANALYTICS_IDENTITY, AppJobId.ANALYTICS_MODE_STATE, AppJobId.FETCH_SESSIONLESS_MOBILE_CONFIGS, AppJobId.FETCH_MOBILE_CONFIGS, AppJobId.FETCH_USER_DATA, AppJobId.BACKGROUND_REFRESH_USER_DATA, AppJobId.FETCH_VMS, AppJobId.WAKE_VM, AppJobId.GATEWAY_CONNECT, AppJobId.PRIMARY_SESSION_FETCH});
    public static final F0C isWatch$delegate = AbstractC5321DgF.A03(AnonymousClass2.INSTANCE);

    public final boolean isEnabled(AppJobKey appJobKey) {
        C7384Etj.A0Y(appJobKey, 0);
        return !isWatch() || watchJobs.contains(appJobKey);
    }

    /* renamed from: com.facebook.aura.startup.AuraStartupJobPolicy$isWatch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C4JM.A00().getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
    }

    private final boolean isWatch() {
        return ((Boolean) isWatch$delegate.getValue()).booleanValue();
    }
}
