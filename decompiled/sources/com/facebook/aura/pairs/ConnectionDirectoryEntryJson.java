package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionDirectoryEntryJson extends C06G {
    public static final int $stable;
    public static final Companion Companion = new Companion();
    public final boolean active;
    public final String address;
    public final String agent_name;
    public final String audience;
    public final ConnectionCapabilitiesJson capabilities;
    public final String chat_session_id;
    public final String connection_id;
    public final ConnectionContactJson contact;
    public final String display_name;
    public final String muse_id;
    public final String provider;
    public final Long rules_revision;
    public final boolean space_only;

    public final class Companion {
        public final C9hr<ConnectionDirectoryEntryJson> serializer() {
            return ConnectionDirectoryEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectionDirectoryEntryJson() {
        this("", "", "", null, null, null, "", false, null, null, new ConnectionCapabilitiesJson(false, false, false, false, false, null), false, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionDirectoryEntryJson connectionDirectoryEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectionDirectoryEntryJson.connection_id)) {
            c9j5.AAV(connectionDirectoryEntryJson.connection_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectionDirectoryEntryJson.display_name)) {
            c9j5.AAV(connectionDirectoryEntryJson.display_name, c9iZ, 1);
        }
        if (zAfR || !"".equals(connectionDirectoryEntryJson.provider)) {
            c9j5.AAV(connectionDirectoryEntryJson.provider, c9iZ, 2);
        }
        if (zAfR || connectionDirectoryEntryJson.address != null) {
            c9j5.AAP(connectionDirectoryEntryJson.address, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || connectionDirectoryEntryJson.muse_id != null) {
            c9j5.AAP(connectionDirectoryEntryJson.muse_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || connectionDirectoryEntryJson.agent_name != null) {
            c9j5.AAP(connectionDirectoryEntryJson.agent_name, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !"".equals(connectionDirectoryEntryJson.audience)) {
            c9j5.AAV(connectionDirectoryEntryJson.audience, c9iZ, 6);
        }
        if (zAfR || connectionDirectoryEntryJson.active) {
            c9j5.AA7(c9iZ, 7, connectionDirectoryEntryJson.active);
        }
        if (zAfR || connectionDirectoryEntryJson.chat_session_id != null) {
            c9j5.AAP(connectionDirectoryEntryJson.chat_session_id, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || connectionDirectoryEntryJson.rules_revision != null) {
            c9j5.AAP(connectionDirectoryEntryJson.rules_revision, C9j1.A00, c9iZ, 9);
        }
        if (zAfR || !C7384Etj.areEqual(connectionDirectoryEntryJson.capabilities, new ConnectionCapabilitiesJson(false, false, false, false, false, null))) {
            c9j5.AAQ(connectionDirectoryEntryJson.capabilities, ConnectionCapabilitiesJson$$serializer.INSTANCE, c9iZ, 10);
        }
        if (zAfR || connectionDirectoryEntryJson.space_only) {
            c9j5.AA7(c9iZ, 11, connectionDirectoryEntryJson.space_only);
        }
        if (zAfR || connectionDirectoryEntryJson.contact != null) {
            c9j5.AAP(connectionDirectoryEntryJson.contact, ConnectionContactJson$$serializer.INSTANCE, c9iZ, 12);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionDirectoryEntryJson) {
                ConnectionDirectoryEntryJson connectionDirectoryEntryJson = (ConnectionDirectoryEntryJson) obj;
                if (!C7384Etj.areEqual(this.connection_id, connectionDirectoryEntryJson.connection_id) || !C7384Etj.areEqual(this.display_name, connectionDirectoryEntryJson.display_name) || !C7384Etj.areEqual(this.provider, connectionDirectoryEntryJson.provider) || !C7384Etj.areEqual(this.address, connectionDirectoryEntryJson.address) || !C7384Etj.areEqual(this.muse_id, connectionDirectoryEntryJson.muse_id) || !C7384Etj.areEqual(this.agent_name, connectionDirectoryEntryJson.agent_name) || !C7384Etj.areEqual(this.audience, connectionDirectoryEntryJson.audience) || this.active != connectionDirectoryEntryJson.active || !C7384Etj.areEqual(this.chat_session_id, connectionDirectoryEntryJson.chat_session_id) || !C7384Etj.areEqual(this.rules_revision, connectionDirectoryEntryJson.rules_revision) || !C7384Etj.areEqual(this.capabilities, connectionDirectoryEntryJson.capabilities) || this.space_only != connectionDirectoryEntryJson.space_only || !C7384Etj.areEqual(this.contact, connectionDirectoryEntryJson.contact)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = PeerImageJson.$stable;
        $stable = i | i | i | i;
    }

    public static /* synthetic */ ConnectionDirectoryEntryJson copy$default(ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Long l, ConnectionCapabilitiesJson connectionCapabilitiesJson, boolean z2, ConnectionContactJson connectionContactJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionDirectoryEntryJson.connection_id;
        }
        if ((i & 2) != 0) {
            str2 = connectionDirectoryEntryJson.display_name;
        }
        if ((i & 4) != 0) {
            str3 = connectionDirectoryEntryJson.provider;
        }
        if ((i & 8) != 0) {
            str4 = connectionDirectoryEntryJson.address;
        }
        if ((i & 16) != 0) {
            str5 = connectionDirectoryEntryJson.muse_id;
        }
        if ((i & 32) != 0) {
            str6 = connectionDirectoryEntryJson.agent_name;
        }
        if ((i & 64) != 0) {
            str7 = connectionDirectoryEntryJson.audience;
        }
        if ((i & 128) != 0) {
            z = connectionDirectoryEntryJson.active;
        }
        if ((i & 256) != 0) {
            str8 = connectionDirectoryEntryJson.chat_session_id;
        }
        if ((i & 512) != 0) {
            l = connectionDirectoryEntryJson.rules_revision;
        }
        if ((i & 1024) != 0) {
            connectionCapabilitiesJson = connectionDirectoryEntryJson.capabilities;
        }
        if ((i & 2048) != 0) {
            z2 = connectionDirectoryEntryJson.space_only;
        }
        if ((i & 4096) != 0) {
            connectionContactJson = connectionDirectoryEntryJson.contact;
        }
        return connectionDirectoryEntryJson.copy(str, str2, str3, str4, str5, str6, str7, z, str8, l, connectionCapabilitiesJson, z2, connectionContactJson);
    }

    public final String component1() {
        return this.connection_id;
    }

    public final Long component10() {
        return this.rules_revision;
    }

    public final ConnectionCapabilitiesJson component11() {
        return this.capabilities;
    }

    public final boolean component12() {
        return this.space_only;
    }

    public final ConnectionContactJson component13() {
        return this.contact;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.provider;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.muse_id;
    }

    public final String component6() {
        return this.agent_name;
    }

    public final String component7() {
        return this.audience;
    }

    public final boolean component8() {
        return this.active;
    }

    public final String component9() {
        return this.chat_session_id;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAgent_name() {
        return this.agent_name;
    }

    public final String getAudience() {
        return this.audience;
    }

    public final ConnectionCapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final String getChat_session_id() {
        return this.chat_session_id;
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final ConnectionContactJson getContact() {
        return this.contact;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final Long getRules_revision() {
        return this.rules_revision;
    }

    public final boolean getSpace_only() {
        return this.space_only;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.capabilities, (((C0KA.A01(AnonymousClass005.A0I(this.audience, (((((AnonymousClass005.A0I(this.provider, AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.connection_id))) + AnonymousClass006.A0G(this.address)) * 31) + AnonymousClass006.A0G(this.muse_id)) * 31) + AnonymousClass006.A0G(this.agent_name)) * 31), this.active) + AnonymousClass006.A0G(this.chat_session_id)) * 31) + AnonymousClass006.A0D(this.rules_revision)) * 31), this.space_only) + C3cH.A02(this.contact);
    }

    public final ConnectionDirectoryEntryJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Long l, ConnectionCapabilitiesJson connectionCapabilitiesJson, boolean z2, ConnectionContactJson connectionContactJson) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str7, 6);
        C7384Etj.A0Y(connectionCapabilitiesJson, 10);
        return new ConnectionDirectoryEntryJson(str, str2, str3, str4, str5, str6, str7, z, str8, l, connectionCapabilitiesJson, z2, connectionContactJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionDirectoryEntryJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Long l, ConnectionCapabilitiesJson connectionCapabilitiesJson, boolean z2, ConnectionContactJson connectionContactJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : "", C3cG.A1K(i & 128, z), (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? new ConnectionCapabilitiesJson(false, false, false, false, false, null) : connectionCapabilitiesJson, (i & 2048) == 0 ? z2 : false, (i & 4096) != 0 ? null : connectionContactJson);
    }

    public ConnectionDirectoryEntryJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Long l, ConnectionCapabilitiesJson connectionCapabilitiesJson, boolean z2, ConnectionContactJson connectionContactJson) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str7, 6);
        C7384Etj.A0Y(connectionCapabilitiesJson, 10);
        this.connection_id = str;
        this.display_name = str2;
        this.provider = str3;
        this.address = str4;
        this.muse_id = str5;
        this.agent_name = str6;
        this.audience = str7;
        this.active = z;
        this.chat_session_id = str8;
        this.rules_revision = l;
        this.capabilities = connectionCapabilitiesJson;
        this.space_only = z2;
        this.contact = connectionContactJson;
    }

    public /* synthetic */ ConnectionDirectoryEntryJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Long l, ConnectionCapabilitiesJson connectionCapabilitiesJson, boolean z2, ConnectionContactJson connectionContactJson, C2hx c2hx) {
        ConnectionCapabilitiesJson connectionCapabilitiesJson2 = connectionCapabilitiesJson;
        if ((i & 1) == 0) {
            this.connection_id = "";
        } else {
            this.connection_id = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.provider = "";
        } else {
            this.provider = str3;
        }
        if ((i & 8) == 0) {
            this.address = null;
        } else {
            this.address = str4;
        }
        if ((i & 16) == 0) {
            this.muse_id = null;
        } else {
            this.muse_id = str5;
        }
        if ((i & 32) == 0) {
            this.agent_name = null;
        } else {
            this.agent_name = str6;
        }
        if ((i & 64) == 0) {
            this.audience = "";
        } else {
            this.audience = str7;
        }
        if ((i & 128) == 0) {
            this.active = false;
        } else {
            this.active = z;
        }
        if ((i & 256) == 0) {
            this.chat_session_id = null;
        } else {
            this.chat_session_id = str8;
        }
        if ((i & 512) == 0) {
            this.rules_revision = null;
        } else {
            this.rules_revision = l;
        }
        this.capabilities = (i & 1024) == 0 ? new ConnectionCapabilitiesJson(false, false, false, false, false, null) : connectionCapabilitiesJson2;
        if ((i & 2048) == 0) {
            this.space_only = false;
        } else {
            this.space_only = z2;
        }
        if ((i & 4096) == 0) {
            this.contact = null;
        } else {
            this.contact = connectionContactJson;
        }
    }
}
