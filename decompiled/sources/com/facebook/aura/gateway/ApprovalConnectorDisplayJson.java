package com.facebook.aura.gateway;

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
/* loaded from: classes2.dex */
public final class ApprovalConnectorDisplayJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String icon_url;
    public final String id;
    public final String name;

    public final class Companion {
        public final C9hr<ApprovalConnectorDisplayJson> serializer() {
            return ApprovalConnectorDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalConnectorDisplayJson approvalConnectorDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalConnectorDisplayJson.id != null) {
            c9j5.AAP(approvalConnectorDisplayJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || approvalConnectorDisplayJson.name != null) {
            c9j5.AAP(approvalConnectorDisplayJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || approvalConnectorDisplayJson.display_name != null) {
            c9j5.AAP(approvalConnectorDisplayJson.display_name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || approvalConnectorDisplayJson.icon_url != null) {
            c9j5.AAP(approvalConnectorDisplayJson.icon_url, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalConnectorDisplayJson) {
                ApprovalConnectorDisplayJson approvalConnectorDisplayJson = (ApprovalConnectorDisplayJson) obj;
                if (!C7384Etj.areEqual(this.id, approvalConnectorDisplayJson.id) || !C7384Etj.areEqual(this.name, approvalConnectorDisplayJson.name) || !C7384Etj.areEqual(this.display_name, approvalConnectorDisplayJson.display_name) || !C7384Etj.areEqual(this.icon_url, approvalConnectorDisplayJson.icon_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalConnectorDisplayJson copy$default(ApprovalConnectorDisplayJson approvalConnectorDisplayJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalConnectorDisplayJson.id;
        }
        if ((i & 2) != 0) {
            str2 = approvalConnectorDisplayJson.name;
        }
        if ((i & 4) != 0) {
            str3 = approvalConnectorDisplayJson.display_name;
        }
        if ((i & 8) != 0) {
            str4 = approvalConnectorDisplayJson.icon_url;
        }
        return new ApprovalConnectorDisplayJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.display_name;
    }

    public final String component4() {
        return this.icon_url;
    }

    public final ApprovalConnectorDisplayJson copy(String str, String str2, String str3, String str4) {
        return new ApprovalConnectorDisplayJson(str, str2, str3, str4);
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass005.A0H(this.icon_url);
    }

    public ApprovalConnectorDisplayJson(String str, String str2, String str3, String str4) {
        this.id = str;
        this.name = str2;
        this.display_name = str3;
        this.icon_url = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalConnectorDisplayJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str3;
        }
        if ((i & 8) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str4;
        }
    }

    public /* synthetic */ ApprovalConnectorDisplayJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public ApprovalConnectorDisplayJson() {
        this(null, null, null, null);
    }
}
