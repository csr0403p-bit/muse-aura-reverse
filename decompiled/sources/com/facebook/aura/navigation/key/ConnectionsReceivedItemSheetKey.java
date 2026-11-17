package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionsReceivedItemSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String shareId;

    public final class Companion {
        public final C9hr<ConnectionsReceivedItemSheetKey> serializer() {
            return ConnectionsReceivedItemSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConnectionsReceivedItemSheetKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ConnectionsReceivedItemSheetKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectionsReceivedItemSheetKey) && C7384Etj.areEqual(this.shareId, ((ConnectionsReceivedItemSheetKey) obj).shareId));
    }

    public /* synthetic */ ConnectionsReceivedItemSheetKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConnectionsReceivedItemSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.shareId = str;
    }

    public static /* synthetic */ ConnectionsReceivedItemSheetKey copy$default(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionsReceivedItemSheetKey.shareId;
        }
        C7384Etj.A0Y(str, 0);
        return new ConnectionsReceivedItemSheetKey(str);
    }

    public final String component1() {
        return this.shareId;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public int hashCode() {
        return this.shareId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionsReceivedItemSheetKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.shareId = str;
    }
}
