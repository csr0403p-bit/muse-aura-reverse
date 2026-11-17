package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionShareResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String message_id;
    public final String reason;
    public final String status;

    public final class Companion {
        public final C9hr<ConnectionShareResultJson> serializer() {
            return ConnectionShareResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectionShareResultJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
        this.message_id = str2;
        this.reason = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionShareResultJson connectionShareResultJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(connectionShareResultJson.status)) {
            c9j5.AAV(connectionShareResultJson.status, c9iZ, 0);
        }
        if (zAfR || connectionShareResultJson.message_id != null) {
            c9j5.AAP(connectionShareResultJson.message_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || connectionShareResultJson.reason != null) {
            c9j5.AAP(connectionShareResultJson.reason, C07779iq.A01, c9iZ, 2);
        }
    }

    public final ConnectionShareResultJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new ConnectionShareResultJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionShareResultJson) {
                ConnectionShareResultJson connectionShareResultJson = (ConnectionShareResultJson) obj;
                if (!C7384Etj.areEqual(this.status, connectionShareResultJson.status) || !C7384Etj.areEqual(this.message_id, connectionShareResultJson.message_id) || !C7384Etj.areEqual(this.reason, connectionShareResultJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionShareResultJson copy$default(ConnectionShareResultJson connectionShareResultJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionShareResultJson.status;
        }
        if ((i & 2) != 0) {
            str2 = connectionShareResultJson.message_id;
        }
        if ((i & 4) != 0) {
            str3 = connectionShareResultJson.reason;
        }
        return connectionShareResultJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.message_id;
    }

    public final String component3() {
        return this.reason;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.status) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass005.A0H(this.reason);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionShareResultJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.status = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str2;
        }
        if ((i & 4) == 0) {
            this.reason = null;
        } else {
            this.reason = str3;
        }
    }

    public /* synthetic */ ConnectionShareResultJson(String str, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ConnectionShareResultJson() {
        this("", null, null);
    }
}
