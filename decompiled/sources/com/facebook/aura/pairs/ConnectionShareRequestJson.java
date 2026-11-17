package com.facebook.aura.pairs;

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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionShareRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String item_id;
    public final String kind;
    public final String operation_id;

    public final class Companion {
        public final C9hr<ConnectionShareRequestJson> serializer() {
            return ConnectionShareRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionShareRequestJson connectionShareRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(connectionShareRequestJson.operation_id, c9iZ, 0);
        c9j5.AAV(connectionShareRequestJson.kind, c9iZ, 1);
        c9j5.AAV(connectionShareRequestJson.item_id, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionShareRequestJson) {
                ConnectionShareRequestJson connectionShareRequestJson = (ConnectionShareRequestJson) obj;
                if (!C7384Etj.areEqual(this.operation_id, connectionShareRequestJson.operation_id) || !C7384Etj.areEqual(this.kind, connectionShareRequestJson.kind) || !C7384Etj.areEqual(this.item_id, connectionShareRequestJson.item_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionShareRequestJson copy$default(ConnectionShareRequestJson connectionShareRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionShareRequestJson.operation_id;
        }
        if ((i & 2) != 0) {
            str2 = connectionShareRequestJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = connectionShareRequestJson.item_id;
        }
        return connectionShareRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.operation_id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.item_id;
    }

    public final String getItem_id() {
        return this.item_id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getOperation_id() {
        return this.operation_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.item_id, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.operation_id)));
    }

    public ConnectionShareRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.operation_id = str;
        this.kind = str2;
        this.item_id = str3;
    }

    public final ConnectionShareRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ConnectionShareRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionShareRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ConnectionShareRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.operation_id = str;
        this.kind = str2;
        this.item_id = str3;
    }
}
