package com.facebook.aura.gateway.connection;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* loaded from: classes6.dex */
public interface ConnectionPhase {

    /* loaded from: classes5.dex */
    public final class Connected implements ConnectionPhase {
        public static final Connected INSTANCE = new Connected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connected);
        }

        public String toString() {
            return "Connected";
        }

        public int hashCode() {
            return 1590227906;
        }
    }

    /* loaded from: classes5.dex */
    public final class Connecting implements ConnectionPhase {
        public static final Connecting INSTANCE = new Connecting();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connecting);
        }

        public String toString() {
            return "Connecting";
        }

        public int hashCode() {
            return 2052429087;
        }
    }

    public final class Failed extends C06G implements ConnectionPhase {
        public final FailureCause cause;
        public final String message;
        public final boolean retriesExhausted;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.message, failed.message) || this.retriesExhausted != failed.retriesExhausted || this.cause != failed.cause) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, boolean z, FailureCause failureCause, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            if ((i & 2) != 0) {
                z = failed.retriesExhausted;
            }
            if ((i & 4) != 0) {
                failureCause = failed.cause;
            }
            return failed.copy(str, z, failureCause);
        }

        public final String component1() {
            return this.message;
        }

        public final boolean component2() {
            return this.retriesExhausted;
        }

        public final FailureCause component3() {
            return this.cause;
        }

        public final FailureCause getCause() {
            return this.cause;
        }

        public final String getMessage() {
            return this.message;
        }

        public final boolean getRetriesExhausted() {
            return this.retriesExhausted;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.cause, C0KA.A01(AnonymousClass001.A0G(this.message), this.retriesExhausted));
        }

        public Failed(String str, boolean z, FailureCause failureCause) {
            AnonymousClass003.A0v(str, failureCause);
            this.message = str;
            this.retriesExhausted = z;
            this.cause = failureCause;
        }

        public final Failed copy(String str, boolean z, FailureCause failureCause) {
            AnonymousClass003.A0v(str, failureCause);
            return new Failed(str, z, failureCause);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureCause {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureCause[] $VALUES;
        public static final FailureCause AUTH_EXHAUSTED;
        public static final FailureCause CVM_ENROLLMENT_REQUIRED;
        public static final FailureCause CVM_KEY_REQUIRED;
        public static final FailureCause CVM_VERIFICATION_FAILED;
        public static final FailureCause RECONNECT_EXHAUSTED;
        public static final FailureCause TRANSPORT;

        static {
            FailureCause failureCause = new FailureCause("TRANSPORT", 0);
            TRANSPORT = failureCause;
            FailureCause failureCause2 = new FailureCause("RECONNECT_EXHAUSTED", 1);
            RECONNECT_EXHAUSTED = failureCause2;
            FailureCause failureCause3 = new FailureCause("AUTH_EXHAUSTED", 2);
            AUTH_EXHAUSTED = failureCause3;
            FailureCause failureCause4 = new FailureCause("CVM_KEY_REQUIRED", 3);
            CVM_KEY_REQUIRED = failureCause4;
            FailureCause failureCause5 = new FailureCause("CVM_ENROLLMENT_REQUIRED", 4);
            CVM_ENROLLMENT_REQUIRED = failureCause5;
            FailureCause failureCause6 = new FailureCause("CVM_VERIFICATION_FAILED", 5);
            CVM_VERIFICATION_FAILED = failureCause6;
            FailureCause[] failureCauseArr = {failureCause, failureCause2, failureCause3, failureCause4, failureCause5, failureCause6};
            $VALUES = failureCauseArr;
            $ENTRIES = C3cG.A0w(failureCauseArr);
        }

        public static Ey9<FailureCause> getEntries() {
            return $ENTRIES;
        }

        public static FailureCause valueOf(String str) {
            return (FailureCause) Enum.valueOf(FailureCause.class, str);
        }

        public static FailureCause[] values() {
            return (FailureCause[]) $VALUES.clone();
        }

        public FailureCause(String str, int i) {
        }
    }

    public final class Idle implements ConnectionPhase {
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -682561669;
        }
    }

    /* loaded from: classes5.dex */
    public final class Offline implements ConnectionPhase {
        public static final Offline INSTANCE = new Offline();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Offline);
        }

        public String toString() {
            return "Offline";
        }

        public int hashCode() {
            return -737416996;
        }
    }

    /* loaded from: classes5.dex */
    public final class Paused implements ConnectionPhase {
        public static final Paused INSTANCE = new Paused();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Paused);
        }

        public String toString() {
            return "Paused";
        }

        public int hashCode() {
            return 1386150677;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ReconnectActivity {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ReconnectActivity[] $VALUES;
        public static final ReconnectActivity ACTIVE;
        public static final ReconnectActivity AWAITING_RETRY;
        public static final ReconnectActivity PARKED;

        static {
            ReconnectActivity reconnectActivity = new ReconnectActivity("ACTIVE", 0);
            ACTIVE = reconnectActivity;
            ReconnectActivity reconnectActivity2 = new ReconnectActivity("AWAITING_RETRY", 1);
            AWAITING_RETRY = reconnectActivity2;
            ReconnectActivity reconnectActivity3 = new ReconnectActivity("PARKED", 2);
            PARKED = reconnectActivity3;
            ReconnectActivity[] reconnectActivityArr = {reconnectActivity, reconnectActivity2, reconnectActivity3};
            $VALUES = reconnectActivityArr;
            $ENTRIES = C3cG.A0w(reconnectActivityArr);
        }

        public static Ey9<ReconnectActivity> getEntries() {
            return $ENTRIES;
        }

        public static ReconnectActivity valueOf(String str) {
            return (ReconnectActivity) Enum.valueOf(ReconnectActivity.class, str);
        }

        public static ReconnectActivity[] values() {
            return (ReconnectActivity[]) $VALUES.clone();
        }

        public ReconnectActivity(String str, int i) {
        }
    }

    public final class Reconnecting extends C06G implements ConnectionPhase {
        public final ReconnectActivity activity;
        public final int attempt;

        public Reconnecting(int i, ReconnectActivity reconnectActivity) {
            C7384Etj.A0Y(reconnectActivity, 1);
            this.attempt = i;
            this.activity = reconnectActivity;
        }

        public final Reconnecting copy(int i, ReconnectActivity reconnectActivity) {
            C7384Etj.A0Y(reconnectActivity, 1);
            return new Reconnecting(i, reconnectActivity);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Reconnecting) {
                    Reconnecting reconnecting = (Reconnecting) obj;
                    if (this.attempt != reconnecting.attempt || this.activity != reconnecting.activity) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Reconnecting copy$default(Reconnecting reconnecting, int i, ReconnectActivity reconnectActivity, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = reconnecting.attempt;
            }
            if ((i2 & 2) != 0) {
                reconnectActivity = reconnecting.activity;
            }
            C7384Etj.A0Y(reconnectActivity, 1);
            return new Reconnecting(i, reconnectActivity);
        }

        public final int component1() {
            return this.attempt;
        }

        public final ReconnectActivity component2() {
            return this.activity;
        }

        public final ReconnectActivity getActivity() {
            return this.activity;
        }

        public final int getAttempt() {
            return this.attempt;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.activity, this.attempt * 31);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Reconnecting(int i, ReconnectActivity reconnectActivity, int i2, C06H c06h) {
            this(i, (i2 & 2) != 0 ? ReconnectActivity.ACTIVE : reconnectActivity);
        }
    }

    /* loaded from: classes5.dex */
    public final class Resetting implements ConnectionPhase {
        public static final Resetting INSTANCE = new Resetting();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Resetting);
        }

        public String toString() {
            return "Resetting";
        }

        public int hashCode() {
            return -100781706;
        }
    }

    public final class StorageRecoveryConnected implements ConnectionPhase {
        public static final StorageRecoveryConnected INSTANCE = new StorageRecoveryConnected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StorageRecoveryConnected);
        }

        public String toString() {
            return "StorageRecoveryConnected";
        }

        public int hashCode() {
            return 1155367904;
        }
    }
}
