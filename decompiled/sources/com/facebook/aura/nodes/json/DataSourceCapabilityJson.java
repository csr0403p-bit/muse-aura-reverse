package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DataSourceCapabilityJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final boolean emits_proactively;
    public final boolean is_permission_granted;
    public final boolean supports_backfill;

    public final class Companion {
        public final C9hr<DataSourceCapabilityJson> serializer() {
            return DataSourceCapabilityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(DataSourceCapabilityJson dataSourceCapabilityJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || dataSourceCapabilityJson.description != null) {
            c9j5.AAP(dataSourceCapabilityJson.description, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || dataSourceCapabilityJson.emits_proactively) {
            c9j5.AA7(c9iZ, 1, dataSourceCapabilityJson.emits_proactively);
        }
        if (zAfR || dataSourceCapabilityJson.supports_backfill) {
            c9j5.AA7(c9iZ, 2, dataSourceCapabilityJson.supports_backfill);
        }
        if (zAfR || dataSourceCapabilityJson.is_permission_granted) {
            c9j5.AA7(c9iZ, 3, dataSourceCapabilityJson.is_permission_granted);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DataSourceCapabilityJson) {
                DataSourceCapabilityJson dataSourceCapabilityJson = (DataSourceCapabilityJson) obj;
                if (!C7384Etj.areEqual(this.description, dataSourceCapabilityJson.description) || this.emits_proactively != dataSourceCapabilityJson.emits_proactively || this.supports_backfill != dataSourceCapabilityJson.supports_backfill || this.is_permission_granted != dataSourceCapabilityJson.is_permission_granted) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DataSourceCapabilityJson copy$default(DataSourceCapabilityJson dataSourceCapabilityJson, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataSourceCapabilityJson.description;
        }
        if ((i & 2) != 0) {
            z = dataSourceCapabilityJson.emits_proactively;
        }
        if ((i & 4) != 0) {
            z2 = dataSourceCapabilityJson.supports_backfill;
        }
        if ((i & 8) != 0) {
            z3 = dataSourceCapabilityJson.is_permission_granted;
        }
        return new DataSourceCapabilityJson(str, z, z2, z3);
    }

    public final String component1() {
        return this.description;
    }

    public final boolean component2() {
        return this.emits_proactively;
    }

    public final boolean component3() {
        return this.supports_backfill;
    }

    public final boolean component4() {
        return this.is_permission_granted;
    }

    public final DataSourceCapabilityJson copy(String str, boolean z, boolean z2, boolean z3) {
        return new DataSourceCapabilityJson(str, z, z2, z3);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEmits_proactively() {
        return this.emits_proactively;
    }

    public final boolean getSupports_backfill() {
        return this.supports_backfill;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass006.A0G(this.description) * 31, this.emits_proactively), this.supports_backfill), this.is_permission_granted);
    }

    public final boolean is_permission_granted() {
        return this.is_permission_granted;
    }

    public DataSourceCapabilityJson(String str, boolean z, boolean z2, boolean z3) {
        this.description = str;
        this.emits_proactively = z;
        this.supports_backfill = z2;
        this.is_permission_granted = z3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DataSourceCapabilityJson(int i, String str, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        this.description = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.emits_proactively = false;
        } else {
            this.emits_proactively = z;
        }
        if ((i & 4) == 0) {
            this.supports_backfill = false;
        } else {
            this.supports_backfill = z2;
        }
        if ((i & 8) == 0) {
            this.is_permission_granted = false;
        } else {
            this.is_permission_granted = z3;
        }
    }

    public /* synthetic */ DataSourceCapabilityJson(String str, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), AnonymousClass005.A1P(i, z3));
    }

    public DataSourceCapabilityJson() {
        this(null, false, false, false);
    }
}
