package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionParticipantJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String kind;
    public final String muse_id;
    public final String participant_id;

    public final class Companion {
        public final C9hr<ConnectionParticipantJson> serializer() {
            return ConnectionParticipantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionParticipantJson connectionParticipantJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectionParticipantJson.participant_id)) {
            c9j5.AAV(connectionParticipantJson.participant_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectionParticipantJson.display_name)) {
            c9j5.AAV(connectionParticipantJson.display_name, c9iZ, 1);
        }
        if (zAfR || !"".equals(connectionParticipantJson.kind)) {
            c9j5.AAV(connectionParticipantJson.kind, c9iZ, 2);
        }
        if (zAfR || connectionParticipantJson.muse_id != null) {
            c9j5.AAP(connectionParticipantJson.muse_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionParticipantJson) {
                ConnectionParticipantJson connectionParticipantJson = (ConnectionParticipantJson) obj;
                if (!C7384Etj.areEqual(this.participant_id, connectionParticipantJson.participant_id) || !C7384Etj.areEqual(this.display_name, connectionParticipantJson.display_name) || !C7384Etj.areEqual(this.kind, connectionParticipantJson.kind) || !C7384Etj.areEqual(this.muse_id, connectionParticipantJson.muse_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionParticipantJson copy$default(ConnectionParticipantJson connectionParticipantJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionParticipantJson.participant_id;
        }
        if ((i & 2) != 0) {
            str2 = connectionParticipantJson.display_name;
        }
        if ((i & 4) != 0) {
            str3 = connectionParticipantJson.kind;
        }
        if ((i & 8) != 0) {
            str4 = connectionParticipantJson.muse_id;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new ConnectionParticipantJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.participant_id;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.kind;
    }

    public final String component4() {
        return this.muse_id;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getParticipant_id() {
        return this.participant_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.kind, AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.participant_id))) + AnonymousClass006.A0G(this.muse_id);
    }

    public /* synthetic */ ConnectionParticipantJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.participant_id = "";
        } else {
            this.participant_id = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.kind = "";
        } else {
            this.kind = str3;
        }
        if ((i & 8) == 0) {
            this.muse_id = null;
        } else {
            this.muse_id = str4;
        }
    }

    public final ConnectionParticipantJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ConnectionParticipantJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionParticipantJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.participant_id = str;
        this.display_name = str2;
        this.kind = str3;
        this.muse_id = str4;
    }

    public /* synthetic */ ConnectionParticipantJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, AnonymousClass006.A0u(i, str4));
    }

    public ConnectionParticipantJson() {
        this("", "", "", null);
    }
}
