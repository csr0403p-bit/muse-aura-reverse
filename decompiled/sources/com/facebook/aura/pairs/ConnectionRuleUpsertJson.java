package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionRuleUpsertJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String description;
    public final long expected_revision;
    public final String rule_id;
    public final String summary;
    public final String title;

    public final class Companion {
        public final C9hr<ConnectionRuleUpsertJson> serializer() {
            return ConnectionRuleUpsertJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionRuleUpsertJson connectionRuleUpsertJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(connectionRuleUpsertJson.rule_id, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, connectionRuleUpsertJson.expected_revision);
        c9j5.AAV(connectionRuleUpsertJson.description, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || connectionRuleUpsertJson.title != null) {
            c9j5.AAP(connectionRuleUpsertJson.title, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || connectionRuleUpsertJson.summary != null) {
            c9j5.AAP(connectionRuleUpsertJson.summary, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionRuleUpsertJson) {
                ConnectionRuleUpsertJson connectionRuleUpsertJson = (ConnectionRuleUpsertJson) obj;
                if (!C7384Etj.areEqual(this.rule_id, connectionRuleUpsertJson.rule_id) || this.expected_revision != connectionRuleUpsertJson.expected_revision || !C7384Etj.areEqual(this.description, connectionRuleUpsertJson.description) || !C7384Etj.areEqual(this.title, connectionRuleUpsertJson.title) || !C7384Etj.areEqual(this.summary, connectionRuleUpsertJson.summary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionRuleUpsertJson copy$default(ConnectionRuleUpsertJson connectionRuleUpsertJson, String str, long j, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionRuleUpsertJson.rule_id;
        }
        if ((i & 2) != 0) {
            j = connectionRuleUpsertJson.expected_revision;
        }
        if ((i & 4) != 0) {
            str2 = connectionRuleUpsertJson.description;
        }
        if ((i & 8) != 0) {
            str3 = connectionRuleUpsertJson.title;
        }
        if ((i & 16) != 0) {
            str4 = connectionRuleUpsertJson.summary;
        }
        return connectionRuleUpsertJson.copy(str, j, str2, str3, str4);
    }

    public final String component1() {
        return this.rule_id;
    }

    public final long component2() {
        return this.expected_revision;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.summary;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getExpected_revision() {
        return this.expected_revision;
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
        return ((AnonymousClass005.A0I(this.description, C60R.A00(this.expected_revision, AnonymousClass001.A0G(this.rule_id))) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass005.A0H(this.summary);
    }

    public ConnectionRuleUpsertJson(String str, long j, String str2, String str3, String str4) {
        AnonymousClass003.A0v(str, str2);
        this.rule_id = str;
        this.expected_revision = j;
        this.description = str2;
        this.title = str3;
        this.summary = str4;
    }

    public final ConnectionRuleUpsertJson copy(String str, long j, String str2, String str3, String str4) {
        AnonymousClass003.A0v(str, str2);
        return new ConnectionRuleUpsertJson(str, j, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionRuleUpsertJson(String str, long j, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, j, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ ConnectionRuleUpsertJson(int i, String str, long j, String str2, String str3, String str4, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ConnectionRuleUpsertJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.rule_id = str;
        this.expected_revision = j;
        this.description = str2;
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.summary = null;
        } else {
            this.summary = str4;
        }
    }
}
