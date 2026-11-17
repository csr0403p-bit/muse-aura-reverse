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
public final class ConnectionsShareStatusSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String messageId;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectionsShareStatusSheetKey> serializer() {
            return ConnectionsShareStatusSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(connectionsShareStatusSheetKey.messageId, c9iZ, 0);
        c9j5.AAV(connectionsShareStatusSheetKey.title, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsShareStatusSheetKey) {
                ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey = (ConnectionsShareStatusSheetKey) obj;
                if (!C7384Etj.areEqual(this.messageId, connectionsShareStatusSheetKey.messageId) || !C7384Etj.areEqual(this.title, connectionsShareStatusSheetKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionsShareStatusSheetKey copy$default(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionsShareStatusSheetKey.messageId;
        }
        if ((i & 2) != 0) {
            str2 = connectionsShareStatusSheetKey.title;
        }
        AnonymousClass003.A0u(str, str2);
        return new ConnectionsShareStatusSheetKey(str, str2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.title;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass001.A0G(this.messageId));
    }

    public ConnectionsShareStatusSheetKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.messageId = str;
        this.title = str2;
    }

    public final ConnectionsShareStatusSheetKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ConnectionsShareStatusSheetKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionsShareStatusSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ConnectionsShareStatusSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.messageId = str;
        this.title = str2;
    }
}
