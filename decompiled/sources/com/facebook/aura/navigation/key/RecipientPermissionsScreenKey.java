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
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RecipientPermissionsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String connectorId;
    public final String connectorName;

    public final class Companion {
        public final C9hr<RecipientPermissionsScreenKey> serializer() {
            return RecipientPermissionsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(RecipientPermissionsScreenKey recipientPermissionsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(recipientPermissionsScreenKey.connectorId, c9iZ, 0);
        c9j5.AAV(recipientPermissionsScreenKey.connectorName, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionsScreenKey) {
                RecipientPermissionsScreenKey recipientPermissionsScreenKey = (RecipientPermissionsScreenKey) obj;
                if (!C7384Etj.areEqual(this.connectorId, recipientPermissionsScreenKey.connectorId) || !C7384Etj.areEqual(this.connectorName, recipientPermissionsScreenKey.connectorName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecipientPermissionsScreenKey copy$default(RecipientPermissionsScreenKey recipientPermissionsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipientPermissionsScreenKey.connectorId;
        }
        if ((i & 2) != 0) {
            str2 = recipientPermissionsScreenKey.connectorName;
        }
        AnonymousClass003.A0u(str, str2);
        return new RecipientPermissionsScreenKey(str, str2);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final String component2() {
        return this.connectorName;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getConnectorName() {
        return this.connectorName;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.connectorName, AnonymousClass001.A0G(this.connectorId));
    }

    public RecipientPermissionsScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.connectorId = str;
        this.connectorName = str2;
    }

    public final RecipientPermissionsScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RecipientPermissionsScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientPermissionsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(RecipientPermissionsScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connectorId = str;
        this.connectorName = str2;
    }
}
