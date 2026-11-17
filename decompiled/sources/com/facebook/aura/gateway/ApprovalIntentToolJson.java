package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalIntentToolJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String arguments_json;
    public final String label;
    public final String name;

    public final class Companion {
        public final C9hr<ApprovalIntentToolJson> serializer() {
            return ApprovalIntentToolJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ApprovalIntentToolJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.label = str2;
        this.arguments_json = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalIntentToolJson approvalIntentToolJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(approvalIntentToolJson.name, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalIntentToolJson.label != null) {
            c9j5.AAP(approvalIntentToolJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || approvalIntentToolJson.arguments_json != null) {
            c9j5.AAP(approvalIntentToolJson.arguments_json, C07779iq.A01, c9iZ, 2);
        }
    }

    public final ApprovalIntentToolJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new ApprovalIntentToolJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalIntentToolJson) {
                ApprovalIntentToolJson approvalIntentToolJson = (ApprovalIntentToolJson) obj;
                if (!C7384Etj.areEqual(this.name, approvalIntentToolJson.name) || !C7384Etj.areEqual(this.label, approvalIntentToolJson.label) || !C7384Etj.areEqual(this.arguments_json, approvalIntentToolJson.arguments_json)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ApprovalIntentToolJson copy$default(ApprovalIntentToolJson approvalIntentToolJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approvalIntentToolJson.name;
        }
        if ((i & 2) != 0) {
            str2 = approvalIntentToolJson.label;
        }
        if ((i & 4) != 0) {
            str3 = approvalIntentToolJson.arguments_json;
        }
        return approvalIntentToolJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.arguments_json;
    }

    public final String getArguments_json() {
        return this.arguments_json;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.name) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.arguments_json);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalIntentToolJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ApprovalIntentToolJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.arguments_json = null;
        } else {
            this.arguments_json = str3;
        }
    }

    public /* synthetic */ ApprovalIntentToolJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
