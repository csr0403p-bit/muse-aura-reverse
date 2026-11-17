package com.facebook.aura.pairs;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsShareStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsShareStatus[] $VALUES;
    public static final ConnectionsShareStatus AWAITING_MUSE;
    public static final ConnectionsShareStatus AWAITING_USER;
    public static final ConnectionsShareStatus CANCELLED;
    public static final Companion Companion;
    public static final ConnectionsShareStatus DELIVERED;
    public static final ConnectionsShareStatus DENIED;
    public static final ConnectionsShareStatus FAILED;
    public static final ConnectionsShareStatus NOT_SENT;
    public static final ConnectionsShareStatus QUEUED;
    public static final ConnectionsShareStatus REFUSED;
    public static final ConnectionsShareStatus REVIEWING;
    public static final ConnectionsShareStatus SENDING;
    public static final ConnectionsShareStatus UNCERTAIN;
    public final boolean isFinal;
    public final String wire;

    static {
        ConnectionsShareStatus connectionsShareStatus = new ConnectionsShareStatus("SENDING", 0, null, false);
        SENDING = connectionsShareStatus;
        ConnectionsShareStatus connectionsShareStatus2 = new ConnectionsShareStatus("REVIEWING", 1, "reviewing", false);
        REVIEWING = connectionsShareStatus2;
        ConnectionsShareStatus connectionsShareStatus3 = new ConnectionsShareStatus("QUEUED", 2, "queued", false);
        QUEUED = connectionsShareStatus3;
        ConnectionsShareStatus connectionsShareStatus4 = new ConnectionsShareStatus("AWAITING_MUSE", 3, "awaiting_muse", false);
        AWAITING_MUSE = connectionsShareStatus4;
        ConnectionsShareStatus connectionsShareStatus5 = new ConnectionsShareStatus("AWAITING_USER", 4, "awaiting_user", false);
        AWAITING_USER = connectionsShareStatus5;
        ConnectionsShareStatus connectionsShareStatus6 = new ConnectionsShareStatus("DELIVERED", 5, "delivered", true);
        DELIVERED = connectionsShareStatus6;
        ConnectionsShareStatus connectionsShareStatus7 = new ConnectionsShareStatus("UNCERTAIN", 6, "uncertain", false);
        UNCERTAIN = connectionsShareStatus7;
        ConnectionsShareStatus connectionsShareStatus8 = new ConnectionsShareStatus("DENIED", 7, "denied", true);
        DENIED = connectionsShareStatus8;
        ConnectionsShareStatus connectionsShareStatus9 = new ConnectionsShareStatus("CANCELLED", 8, "cancelled", true);
        CANCELLED = connectionsShareStatus9;
        ConnectionsShareStatus connectionsShareStatus10 = new ConnectionsShareStatus("NOT_SENT", 9, "not_sent", true);
        NOT_SENT = connectionsShareStatus10;
        ConnectionsShareStatus connectionsShareStatus11 = new ConnectionsShareStatus("REFUSED", 10, null, true);
        REFUSED = connectionsShareStatus11;
        ConnectionsShareStatus connectionsShareStatus12 = new ConnectionsShareStatus(CvmMigrationStatusJson.STAGE_FAILED, 11, null, true);
        FAILED = connectionsShareStatus12;
        ConnectionsShareStatus[] connectionsShareStatusArr = {connectionsShareStatus, connectionsShareStatus2, connectionsShareStatus3, connectionsShareStatus4, connectionsShareStatus5, connectionsShareStatus6, connectionsShareStatus7, connectionsShareStatus8, connectionsShareStatus9, connectionsShareStatus10, connectionsShareStatus11, connectionsShareStatus12};
        $VALUES = connectionsShareStatusArr;
        $ENTRIES = C3cG.A0w(connectionsShareStatusArr);
        Companion = new Companion();
    }

    public static Ey9<ConnectionsShareStatus> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsShareStatus valueOf(String str) {
        return (ConnectionsShareStatus) Enum.valueOf(ConnectionsShareStatus.class, str);
    }

    public static ConnectionsShareStatus[] values() {
        return (ConnectionsShareStatus[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    public final class Companion {
        public final ConnectionsShareStatus fromWire(String str) {
            ConnectionsShareStatus connectionsShareStatus = null;
            if (str == null) {
                return null;
            }
            Iterator<ConnectionsShareStatus> it = ConnectionsShareStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ConnectionsShareStatus next = it.next();
                if (str.equals(next.getWire())) {
                    connectionsShareStatus = next;
                    break;
                }
            }
            return connectionsShareStatus;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectionsShareStatus(String str, int i, String str2, boolean z) {
        this.wire = str2;
        this.isFinal = z;
    }
}
