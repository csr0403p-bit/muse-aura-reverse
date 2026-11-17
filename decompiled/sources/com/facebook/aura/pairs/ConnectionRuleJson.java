package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class ConnectionRuleJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String description;
    public final String rule_id;
    public final String summary;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectionRuleJson> serializer() {
            return ConnectionRuleJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionRuleJson connectionRuleJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectionRuleJson.rule_id)) {
            c9j5.AAV(connectionRuleJson.rule_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectionRuleJson.title)) {
            c9j5.AAV(connectionRuleJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(connectionRuleJson.summary)) {
            c9j5.AAV(connectionRuleJson.summary, c9iZ, 2);
        }
        if (zAfR || !"".equals(connectionRuleJson.description)) {
            c9j5.AAV(connectionRuleJson.description, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionRuleJson) {
                ConnectionRuleJson connectionRuleJson = (ConnectionRuleJson) obj;
                if (!C7384Etj.areEqual(this.rule_id, connectionRuleJson.rule_id) || !C7384Etj.areEqual(this.title, connectionRuleJson.title) || !C7384Etj.areEqual(this.summary, connectionRuleJson.summary) || !C7384Etj.areEqual(this.description, connectionRuleJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionRuleJson copy$default(ConnectionRuleJson connectionRuleJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionRuleJson.rule_id;
        }
        if ((i & 2) != 0) {
            str2 = connectionRuleJson.title;
        }
        if ((i & 4) != 0) {
            str3 = connectionRuleJson.summary;
        }
        if ((i & 8) != 0) {
            str4 = connectionRuleJson.description;
        }
        return connectionRuleJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.rule_id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getRule_id() {
        return this.rule_id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.description, AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.rule_id))));
    }

    public /* synthetic */ ConnectionRuleJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.rule_id = "";
        } else {
            this.rule_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
    }

    public final ConnectionRuleJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new ConnectionRuleJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public ConnectionRuleJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.rule_id = str;
        this.title = str2;
        this.summary = str3;
        this.description = str4;
    }

    public /* synthetic */ ConnectionRuleJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public ConnectionRuleJson() {
        this("", "", "", "");
    }
}
