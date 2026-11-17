package com.facebook.aura.pairs;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionDetailJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion = new Companion();
    public final String chat_session_id;
    public final ConnectionDirectoryEntryJson connection;
    public final Long revision;
    public final List<JsonElement> rules;
    public final List<String> unconfirmed_rule_ids;

    public final class Companion {
        public final C9hr<ConnectionDetailJson> serializer() {
            return ConnectionDetailJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        int i = PeerImageJson.$stable;
        $stable = i | i | i | i;
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, ConnectionDetailJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, ConnectionDetailJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionDetailJson) {
                ConnectionDetailJson connectionDetailJson = (ConnectionDetailJson) obj;
                if (!C7384Etj.areEqual(this.connection, connectionDetailJson.connection) || !C7384Etj.areEqual(this.chat_session_id, connectionDetailJson.chat_session_id) || !C7384Etj.areEqual(this.rules, connectionDetailJson.rules) || !C7384Etj.areEqual(this.revision, connectionDetailJson.revision) || !C7384Etj.areEqual(this.unconfirmed_rule_ids, connectionDetailJson.unconfirmed_rule_ids)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectionDetailJson copy$default(ConnectionDetailJson connectionDetailJson, ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str, List list, Long l, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionDirectoryEntryJson = connectionDetailJson.connection;
        }
        if ((i & 2) != 0) {
            str = connectionDetailJson.chat_session_id;
        }
        if ((i & 4) != 0) {
            list = connectionDetailJson.rules;
        }
        if ((i & 8) != 0) {
            l = connectionDetailJson.revision;
        }
        if ((i & 16) != 0) {
            list2 = connectionDetailJson.unconfirmed_rule_ids;
        }
        return connectionDetailJson.copy(connectionDirectoryEntryJson, str, list, l, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionDetailJson connectionDetailJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(connectionDetailJson.connection, new ConnectionDirectoryEntryJson("", "", "", null, null, null, "", false, null, null, new ConnectionCapabilitiesJson(false, false, false, false, false, null), false, null))) {
            c9j5.AAQ(connectionDetailJson.connection, ConnectionDirectoryEntryJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || connectionDetailJson.chat_session_id != null) {
            c9j5.AAP(connectionDetailJson.chat_session_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(connectionDetailJson.rules)) {
            c9j5.AAQ(connectionDetailJson.rules, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || connectionDetailJson.revision != null) {
            c9j5.AAP(connectionDetailJson.revision, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(connectionDetailJson.unconfirmed_rule_ids)) {
            c9j5.AAQ(connectionDetailJson.unconfirmed_rule_ids, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final ConnectionDirectoryEntryJson component1() {
        return this.connection;
    }

    public final String component2() {
        return this.chat_session_id;
    }

    public final List<JsonElement> component3() {
        return this.rules;
    }

    public final Long component4() {
        return this.revision;
    }

    public final List<String> component5() {
        return this.unconfirmed_rule_ids;
    }

    public final String getChat_session_id() {
        return this.chat_session_id;
    }

    public final ConnectionDirectoryEntryJson getConnection() {
        return this.connection;
    }

    public final Long getRevision() {
        return this.revision;
    }

    public final List<JsonElement> getRules() {
        return this.rules;
    }

    public final List<String> getUnconfirmed_rule_ids() {
        return this.unconfirmed_rule_ids;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.unconfirmed_rule_ids, (AnonymousClass005.A0F(this.rules, (AnonymousClass005.A0E(this.connection) + AnonymousClass006.A0G(this.chat_session_id)) * 31) + C3cH.A02(this.revision)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionDetailJson(ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str, List<? extends JsonElement> list, Long l, List<String> list2) {
        AnonymousClass003.A0v(connectionDirectoryEntryJson, list);
        C7384Etj.A0Y(list2, 4);
        this.connection = connectionDirectoryEntryJson;
        this.chat_session_id = str;
        this.rules = list;
        this.revision = l;
        this.unconfirmed_rule_ids = list2;
    }

    public final ConnectionDetailJson copy(ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str, List<? extends JsonElement> list, Long l, List<String> list2) {
        AnonymousClass003.A0v(connectionDirectoryEntryJson, list);
        C7384Etj.A0Y(list2, 4);
        return new ConnectionDetailJson(connectionDirectoryEntryJson, str, list, l, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionDetailJson(ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str, List list, Long l, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? new ConnectionDirectoryEntryJson("", "", "", null, null, null, "", false, null, null, new ConnectionCapabilitiesJson(false, false, false, false, false, null), false, null) : connectionDirectoryEntryJson, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) == 0 ? l : null, (i & 16) != 0 ? C0881AGi.A00 : list2);
    }

    public /* synthetic */ ConnectionDetailJson(int i, ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str, List list, Long l, List list2, C2hx c2hx) {
        List list3 = list;
        List list4 = list2;
        if ((i & 1) == 0) {
            this.connection = new ConnectionDirectoryEntryJson("", "", "", null, null, null, "", false, null, null, new ConnectionCapabilitiesJson(false, false, false, false, false, null), false, null);
        } else {
            this.connection = connectionDirectoryEntryJson;
        }
        if ((i & 2) == 0) {
            this.chat_session_id = null;
        } else {
            this.chat_session_id = str;
        }
        this.rules = (i & 4) == 0 ? C0881AGi.A00 : list3;
        if ((i & 8) == 0) {
            this.revision = null;
        } else {
            this.revision = l;
        }
        this.unconfirmed_rule_ids = (i & 16) == 0 ? C0881AGi.A00 : list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionDetailJson() {
        this((ConnectionDirectoryEntryJson) null, (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 31, (C06H) (0 == true ? 1 : 0));
    }
}
