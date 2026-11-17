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
public final class ConnectionsSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final ConnectionsSheetSubject subject;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConnectionsSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConnectionsSheetKey> serializer() {
            return ConnectionsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConnectionsSheetKey copy(ConnectionsSheetSubject connectionsSheetSubject) {
        C7384Etj.A0Y(connectionsSheetSubject, 0);
        return new ConnectionsSheetKey(connectionsSheetSubject);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectionsSheetKey) && C7384Etj.areEqual(this.subject, ((ConnectionsSheetKey) obj).subject));
    }

    public /* synthetic */ ConnectionsSheetKey(int i, ConnectionsSheetSubject connectionsSheetSubject, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConnectionsSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.subject = connectionsSheetSubject;
    }

    public static /* synthetic */ ConnectionsSheetKey copy$default(ConnectionsSheetKey connectionsSheetKey, ConnectionsSheetSubject connectionsSheetSubject, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionsSheetSubject = connectionsSheetKey.subject;
        }
        C7384Etj.A0Y(connectionsSheetSubject, 0);
        return new ConnectionsSheetKey(connectionsSheetSubject);
    }

    public final ConnectionsSheetSubject component1() {
        return this.subject;
    }

    public final ConnectionsSheetSubject getSubject() {
        return this.subject;
    }

    public int hashCode() {
        return this.subject.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionsSheetKey(ConnectionsSheetSubject connectionsSheetSubject) {
        C7384Etj.A0Y(connectionsSheetSubject, 0);
        this.subject = connectionsSheetSubject;
    }
}
