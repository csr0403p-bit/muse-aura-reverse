package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* loaded from: classes.dex */
public abstract class HatchGatewayConnectionState {
    public static final int $stable = 8;

    /* loaded from: classes5.dex */
    public final class Connected extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public static final Connected INSTANCE = new Connected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connected);
        }

        public String toString() {
            return "Connected";
        }

        public int hashCode() {
            return 1045919024;
        }
    }

    /* loaded from: classes5.dex */
    public final class Connecting extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public static final Connecting INSTANCE = new Connecting();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connecting);
        }

        public String toString() {
            return "Connecting";
        }

        public int hashCode() {
            return -1936244367;
        }
    }

    /* loaded from: classes3.dex */
    public final class Disconnected extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public final Reason reason;

        public final Disconnected copy(Reason reason) {
            C7384Etj.A0Y(reason, 0);
            return new Disconnected(reason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Disconnected) && this.reason == ((Disconnected) obj).reason);
        }

        public /* synthetic */ Disconnected(Reason reason, int i, C06H c06h) {
            this((i & 1) != 0 ? Reason.NONE : reason);
        }

        public static /* synthetic */ Disconnected copy$default(Disconnected disconnected, Reason reason, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = disconnected.reason;
            }
            C7384Etj.A0Y(reason, 0);
            return new Disconnected(reason);
        }

        public final Reason component1() {
            return this.reason;
        }

        public final Reason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public Disconnected(Reason reason) {
            C7384Etj.A0Y(reason, 0);
            this.reason = reason;
        }

        public Disconnected() {
            this(Reason.NONE);
        }
    }

    /* loaded from: classes2.dex */
    public final class Error extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public final String message;
        public final boolean retriesExhausted;

        public Error(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.message = str;
            this.retriesExhausted = z;
        }

        public final Error copy(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new Error(str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (!C7384Etj.areEqual(this.message, error.message) || this.retriesExhausted != error.retriesExhausted) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                z = error.retriesExhausted;
            }
            C7384Etj.A0Y(str, 0);
            return new Error(str, z);
        }

        public final String component1() {
            return this.message;
        }

        public final boolean component2() {
            return this.retriesExhausted;
        }

        public final String getMessage() {
            return this.message;
        }

        public final boolean getRetriesExhausted() {
            return this.retriesExhausted;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass001.A0G(this.message), this.retriesExhausted);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Error(String str, boolean z, int i, C06H c06h) {
            this(str, AnonymousClass001.A1Q(i, z));
        }
    }

    /* loaded from: classes5.dex */
    public final class Paused extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public static final Paused INSTANCE = new Paused();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Paused);
        }

        public String toString() {
            return "Paused";
        }

        public int hashCode() {
            return 1463263335;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Reason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Reason[] $VALUES;
        public static final Reason NONE;
        public static final Reason OFFLINE;

        static {
            Reason reason = new Reason(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
            NONE = reason;
            Reason reason2 = new Reason("OFFLINE", 1);
            OFFLINE = reason2;
            Reason[] reasonArr = {reason, reason2};
            $VALUES = reasonArr;
            $ENTRIES = new F3w(reasonArr);
        }

        public static Ey9<Reason> getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        public Reason(String str, int i) {
        }
    }

    /* loaded from: classes5.dex */
    public final class Reconnecting extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public final int attempt;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Reconnecting) && this.attempt == ((Reconnecting) obj).attempt);
        }

        public static /* synthetic */ Reconnecting copy$default(Reconnecting reconnecting, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = reconnecting.attempt;
            }
            return new Reconnecting(i);
        }

        public final int component1() {
            return this.attempt;
        }

        public final Reconnecting copy(int i) {
            return new Reconnecting(i);
        }

        public final int getAttempt() {
            return this.attempt;
        }

        public int hashCode() {
            return this.attempt;
        }

        public Reconnecting(int i) {
            this.attempt = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes5.dex */
    public final class Resetting extends HatchGatewayConnectionState {
        public static final int $stable = 0;
        public static final Resetting INSTANCE = new Resetting();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Resetting);
        }

        public String toString() {
            return "Resetting";
        }

        public int hashCode() {
            return -645090588;
        }
    }

    public /* synthetic */ HatchGatewayConnectionState(C06H c06h) {
    }

    public HatchGatewayConnectionState() {
    }
}
