package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class PermissionDetailScreenKey extends C06G implements AuraFullScreenNavKey {
    public final PermissionDestination destination;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, PermissionDetailScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PermissionDetailScreenKey> serializer() {
            return PermissionDetailScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PermissionDetailScreenKey copy(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        return new PermissionDetailScreenKey(permissionDestination);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PermissionDetailScreenKey) && this.destination == ((PermissionDetailScreenKey) obj).destination);
    }

    public /* synthetic */ PermissionDetailScreenKey(int i, PermissionDestination permissionDestination, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PermissionDetailScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.destination = permissionDestination;
    }

    public static /* synthetic */ PermissionDetailScreenKey copy$default(PermissionDetailScreenKey permissionDetailScreenKey, PermissionDestination permissionDestination, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDestination = permissionDetailScreenKey.destination;
        }
        C7384Etj.A0Y(permissionDestination, 0);
        return new PermissionDetailScreenKey(permissionDestination);
    }

    public final PermissionDestination component1() {
        return this.destination;
    }

    public final PermissionDestination getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return this.destination.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public PermissionDetailScreenKey(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        this.destination = permissionDestination;
    }
}
