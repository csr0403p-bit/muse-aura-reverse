package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class ConnectionsShareSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String itemId;
    public final String kind;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectionsShareSheetKey> serializer() {
            return ConnectionsShareSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(ConnectionsShareSheetKey connectionsShareSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(connectionsShareSheetKey.kind, c9iZ, 0);
        c9j5.AAV(connectionsShareSheetKey.itemId, c9iZ, 1);
        c9j5.AAV(connectionsShareSheetKey.title, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsShareSheetKey) {
                ConnectionsShareSheetKey connectionsShareSheetKey = (ConnectionsShareSheetKey) obj;
                if (!C7384Etj.areEqual(this.kind, connectionsShareSheetKey.kind) || !C7384Etj.areEqual(this.itemId, connectionsShareSheetKey.itemId) || !C7384Etj.areEqual(this.title, connectionsShareSheetKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionsShareSheetKey copy$default(ConnectionsShareSheetKey connectionsShareSheetKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionsShareSheetKey.kind;
        }
        if ((i & 2) != 0) {
            str2 = connectionsShareSheetKey.itemId;
        }
        if ((i & 4) != 0) {
            str3 = connectionsShareSheetKey.title;
        }
        return connectionsShareSheetKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.itemId;
    }

    public final String component3() {
        return this.title;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass005.A0I(this.itemId, AnonymousClass001.A0G(this.kind)));
    }

    public ConnectionsShareSheetKey(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.kind = str;
        this.itemId = str2;
        this.title = str3;
    }

    public final ConnectionsShareSheetKey copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ConnectionsShareSheetKey(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionsShareSheetKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ConnectionsShareSheetKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.kind = str;
        this.itemId = str2;
        this.title = str3;
    }
}
