package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionsAddPermissionSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String connectionId;
    public final String name;

    public final class Companion {
        public final C9hr<ConnectionsAddPermissionSheetKey> serializer() {
            return ConnectionsAddPermissionSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(connectionsAddPermissionSheetKey.connectionId, c9iZ, 0);
        c9j5.AAV(connectionsAddPermissionSheetKey.name, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsAddPermissionSheetKey) {
                ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey = (ConnectionsAddPermissionSheetKey) obj;
                if (!C7384Etj.areEqual(this.connectionId, connectionsAddPermissionSheetKey.connectionId) || !C7384Etj.areEqual(this.name, connectionsAddPermissionSheetKey.name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionsAddPermissionSheetKey copy$default(ConnectionsAddPermissionSheetKey connectionsAddPermissionSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionsAddPermissionSheetKey.connectionId;
        }
        if ((i & 2) != 0) {
            str2 = connectionsAddPermissionSheetKey.name;
        }
        AnonymousClass003.A0u(str, str2);
        return new ConnectionsAddPermissionSheetKey(str, str2);
    }

    public final String component1() {
        return this.connectionId;
    }

    public final String component2() {
        return this.name;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.name, AnonymousClass001.A0G(this.connectionId));
    }

    public ConnectionsAddPermissionSheetKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.connectionId = str;
        this.name = str2;
    }

    public final ConnectionsAddPermissionSheetKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ConnectionsAddPermissionSheetKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionsAddPermissionSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ConnectionsAddPermissionSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connectionId = str;
        this.name = str2;
    }
}
