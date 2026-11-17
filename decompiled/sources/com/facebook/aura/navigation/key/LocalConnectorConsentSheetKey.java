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
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class LocalConnectorConsentSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final PermissionDestination destination;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, LocalConnectorConsentSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<LocalConnectorConsentSheetKey> serializer() {
            return LocalConnectorConsentSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final LocalConnectorConsentSheetKey copy(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        return new LocalConnectorConsentSheetKey(permissionDestination);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LocalConnectorConsentSheetKey) && this.destination == ((LocalConnectorConsentSheetKey) obj).destination);
    }

    public /* synthetic */ LocalConnectorConsentSheetKey(int i, PermissionDestination permissionDestination, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LocalConnectorConsentSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.destination = permissionDestination;
    }

    public static /* synthetic */ LocalConnectorConsentSheetKey copy$default(LocalConnectorConsentSheetKey localConnectorConsentSheetKey, PermissionDestination permissionDestination, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDestination = localConnectorConsentSheetKey.destination;
        }
        C7384Etj.A0Y(permissionDestination, 0);
        return new LocalConnectorConsentSheetKey(permissionDestination);
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

    public LocalConnectorConsentSheetKey(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        this.destination = permissionDestination;
    }
}
