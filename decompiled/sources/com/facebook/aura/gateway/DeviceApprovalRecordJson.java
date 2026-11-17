package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeviceApprovalRecordJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action_description;
    public final String approval_id;
    public final String decision;
    public final String display_name;
    public final String payload_preview;
    public final String reason;
    public final Long requested_at_ms;
    public final String rich_explanation;
    public final String short_explanation;
    public final String status;

    public final class Companion {
        public final C9hr<DeviceApprovalRecordJson> serializer() {
            return DeviceApprovalRecordJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ DeviceApprovalRecordJson copy$default(DeviceApprovalRecordJson deviceApprovalRecordJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, int i, Object obj) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        Long l2 = l;
        if ((i & 1) != 0) {
            str10 = deviceApprovalRecordJson.approval_id;
        }
        if ((i & 2) != 0) {
            str11 = deviceApprovalRecordJson.status;
        }
        if ((i & 4) != 0) {
            str12 = deviceApprovalRecordJson.decision;
        }
        if ((i & 8) != 0) {
            str13 = deviceApprovalRecordJson.display_name;
        }
        if ((i & 16) != 0) {
            str14 = deviceApprovalRecordJson.action_description;
        }
        if ((i & 32) != 0) {
            str15 = deviceApprovalRecordJson.short_explanation;
        }
        if ((i & 64) != 0) {
            str16 = deviceApprovalRecordJson.rich_explanation;
        }
        if ((i & 128) != 0) {
            str17 = deviceApprovalRecordJson.reason;
        }
        if ((i & 256) != 0) {
            str18 = deviceApprovalRecordJson.payload_preview;
        }
        if ((i & 512) != 0) {
            l2 = deviceApprovalRecordJson.requested_at_ms;
        }
        return new DeviceApprovalRecordJson(str10, str11, str12, str13, str14, str15, str16, str17, str18, l2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeviceApprovalRecordJson deviceApprovalRecordJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deviceApprovalRecordJson.approval_id != null) {
            c9j5.AAP(deviceApprovalRecordJson.approval_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deviceApprovalRecordJson.status != null) {
            c9j5.AAP(deviceApprovalRecordJson.status, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || deviceApprovalRecordJson.decision != null) {
            c9j5.AAP(deviceApprovalRecordJson.decision, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || deviceApprovalRecordJson.display_name != null) {
            c9j5.AAP(deviceApprovalRecordJson.display_name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || deviceApprovalRecordJson.action_description != null) {
            c9j5.AAP(deviceApprovalRecordJson.action_description, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || deviceApprovalRecordJson.short_explanation != null) {
            c9j5.AAP(deviceApprovalRecordJson.short_explanation, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || deviceApprovalRecordJson.rich_explanation != null) {
            c9j5.AAP(deviceApprovalRecordJson.rich_explanation, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || deviceApprovalRecordJson.reason != null) {
            c9j5.AAP(deviceApprovalRecordJson.reason, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || deviceApprovalRecordJson.payload_preview != null) {
            c9j5.AAP(deviceApprovalRecordJson.payload_preview, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || deviceApprovalRecordJson.requested_at_ms != null) {
            c9j5.AAP(deviceApprovalRecordJson.requested_at_ms, C9j1.A00, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceApprovalRecordJson) {
                DeviceApprovalRecordJson deviceApprovalRecordJson = (DeviceApprovalRecordJson) obj;
                if (!C7384Etj.areEqual(this.approval_id, deviceApprovalRecordJson.approval_id) || !C7384Etj.areEqual(this.status, deviceApprovalRecordJson.status) || !C7384Etj.areEqual(this.decision, deviceApprovalRecordJson.decision) || !C7384Etj.areEqual(this.display_name, deviceApprovalRecordJson.display_name) || !C7384Etj.areEqual(this.action_description, deviceApprovalRecordJson.action_description) || !C7384Etj.areEqual(this.short_explanation, deviceApprovalRecordJson.short_explanation) || !C7384Etj.areEqual(this.rich_explanation, deviceApprovalRecordJson.rich_explanation) || !C7384Etj.areEqual(this.reason, deviceApprovalRecordJson.reason) || !C7384Etj.areEqual(this.payload_preview, deviceApprovalRecordJson.payload_preview) || !C7384Etj.areEqual(this.requested_at_ms, deviceApprovalRecordJson.requested_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.approval_id;
    }

    public final Long component10() {
        return this.requested_at_ms;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.decision;
    }

    public final String component4() {
        return this.display_name;
    }

    public final String component5() {
        return this.action_description;
    }

    public final String component6() {
        return this.short_explanation;
    }

    public final String component7() {
        return this.rich_explanation;
    }

    public final String component8() {
        return this.reason;
    }

    public final String component9() {
        return this.payload_preview;
    }

    public final DeviceApprovalRecordJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l) {
        return new DeviceApprovalRecordJson(str, str2, str3, str4, str5, str6, str7, str8, str9, l);
    }

    public final String getAction_description() {
        return this.action_description;
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getPayload_preview() {
        return this.payload_preview;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Long getRequested_at_ms() {
        return this.requested_at_ms;
    }

    public final String getRich_explanation() {
        return this.rich_explanation;
    }

    public final String getShort_explanation() {
        return this.short_explanation;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((((((((AnonymousClass006.A0G(this.approval_id) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.decision)) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass006.A0G(this.action_description)) * 31) + AnonymousClass006.A0G(this.short_explanation)) * 31) + AnonymousClass006.A0G(this.rich_explanation)) * 31) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass006.A0G(this.payload_preview)) * 31) + C3cH.A02(this.requested_at_ms);
    }

    public DeviceApprovalRecordJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l) {
        this.approval_id = str;
        this.status = str2;
        this.decision = str3;
        this.display_name = str4;
        this.action_description = str5;
        this.short_explanation = str6;
        this.rich_explanation = str7;
        this.reason = str8;
        this.payload_preview = str9;
        this.requested_at_ms = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceApprovalRecordJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : l);
    }

    public /* synthetic */ DeviceApprovalRecordJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.approval_id = null;
        } else {
            this.approval_id = str;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.decision = null;
        } else {
            this.decision = str3;
        }
        if ((i & 8) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str4;
        }
        if ((i & 16) == 0) {
            this.action_description = null;
        } else {
            this.action_description = str5;
        }
        if ((i & 32) == 0) {
            this.short_explanation = null;
        } else {
            this.short_explanation = str6;
        }
        if ((i & 64) == 0) {
            this.rich_explanation = null;
        } else {
            this.rich_explanation = str7;
        }
        if ((i & 128) == 0) {
            this.reason = null;
        } else {
            this.reason = str8;
        }
        if ((i & 256) == 0) {
            this.payload_preview = null;
        } else {
            this.payload_preview = str9;
        }
        if ((i & 512) == 0) {
            this.requested_at_ms = null;
        } else {
            this.requested_at_ms = l;
        }
    }

    public DeviceApprovalRecordJson() {
        this(null, null, null, null, null, null, null, null, null, null);
    }
}
