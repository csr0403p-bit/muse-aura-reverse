package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionResourceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String binding_id;
    public final String host_muse;
    public final String kind;
    public final String reference;
    public final String resource_id;
    public final long shared_at_ms;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectionResourceJson> serializer() {
            return ConnectionResourceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionResourceJson connectionResourceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectionResourceJson.binding_id)) {
            c9j5.AAV(connectionResourceJson.binding_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectionResourceJson.kind)) {
            c9j5.AAV(connectionResourceJson.kind, c9iZ, 1);
        }
        if (zAfR || !"".equals(connectionResourceJson.resource_id)) {
            c9j5.AAV(connectionResourceJson.resource_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(connectionResourceJson.reference)) {
            c9j5.AAV(connectionResourceJson.reference, c9iZ, 3);
        }
        if (zAfR || !"".equals(connectionResourceJson.title)) {
            c9j5.AAV(connectionResourceJson.title, c9iZ, 4);
        }
        if (zAfR || !"".equals(connectionResourceJson.host_muse)) {
            c9j5.AAV(connectionResourceJson.host_muse, c9iZ, 5);
        }
        if (zAfR || connectionResourceJson.shared_at_ms != 0) {
            c9j5.AAN(c9iZ, 6, connectionResourceJson.shared_at_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionResourceJson) {
                ConnectionResourceJson connectionResourceJson = (ConnectionResourceJson) obj;
                if (!C7384Etj.areEqual(this.binding_id, connectionResourceJson.binding_id) || !C7384Etj.areEqual(this.kind, connectionResourceJson.kind) || !C7384Etj.areEqual(this.resource_id, connectionResourceJson.resource_id) || !C7384Etj.areEqual(this.reference, connectionResourceJson.reference) || !C7384Etj.areEqual(this.title, connectionResourceJson.title) || !C7384Etj.areEqual(this.host_muse, connectionResourceJson.host_muse) || this.shared_at_ms != connectionResourceJson.shared_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionResourceJson copy$default(ConnectionResourceJson connectionResourceJson, String str, String str2, String str3, String str4, String str5, String str6, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionResourceJson.binding_id;
        }
        if ((i & 2) != 0) {
            str2 = connectionResourceJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = connectionResourceJson.resource_id;
        }
        if ((i & 8) != 0) {
            str4 = connectionResourceJson.reference;
        }
        if ((i & 16) != 0) {
            str5 = connectionResourceJson.title;
        }
        if ((i & 32) != 0) {
            str6 = connectionResourceJson.host_muse;
        }
        if ((i & 64) != 0) {
            j = connectionResourceJson.shared_at_ms;
        }
        return connectionResourceJson.copy(str, str2, str3, str4, str5, str6, j);
    }

    public final String component1() {
        return this.binding_id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.resource_id;
    }

    public final String component4() {
        return this.reference;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.host_muse;
    }

    public final long component7() {
        return this.shared_at_ms;
    }

    public final String getBinding_id() {
        return this.binding_id;
    }

    public final String getHost_muse() {
        return this.host_muse;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getResource_id() {
        return this.resource_id;
    }

    public final long getShared_at_ms() {
        return this.shared_at_ms;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.shared_at_ms, AnonymousClass005.A0I(this.host_muse, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.reference, AnonymousClass005.A0I(this.resource_id, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.binding_id)))))));
    }

    public /* synthetic */ ConnectionResourceJson(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.binding_id = "";
        } else {
            this.binding_id = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.resource_id = "";
        } else {
            this.resource_id = str3;
        }
        if ((i & 8) == 0) {
            this.reference = "";
        } else {
            this.reference = str4;
        }
        if ((i & 16) == 0) {
            this.title = "";
        } else {
            this.title = str5;
        }
        if ((i & 32) == 0) {
            this.host_muse = "";
        } else {
            this.host_muse = str6;
        }
        if ((i & 64) == 0) {
            this.shared_at_ms = 0L;
        } else {
            this.shared_at_ms = j;
        }
    }

    public final ConnectionResourceJson copy(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        return new ConnectionResourceJson(str, str2, str3, str4, str5, str6, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionResourceJson(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0L : j);
    }

    public ConnectionResourceJson(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        this.binding_id = str;
        this.kind = str2;
        this.resource_id = str3;
        this.reference = str4;
        this.title = str5;
        this.host_muse = str6;
        this.shared_at_ms = j;
    }

    public ConnectionResourceJson() {
        this("", "", "", "", "", "", 0L);
    }
}
