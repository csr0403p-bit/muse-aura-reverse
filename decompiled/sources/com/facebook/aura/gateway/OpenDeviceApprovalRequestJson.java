package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class OpenDeviceApprovalRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action_description;
    public final ApprovalIntentContextJson approval_intent_context;
    public final String delivery_mode;
    public final String device_id;
    public final String display_name;
    public final String reason;
    public final String request_origin;
    public final DeviceApprovalTargetJson target;

    public final class Companion {
        public final C9hr<OpenDeviceApprovalRequestJson> serializer() {
            return OpenDeviceApprovalRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(OpenDeviceApprovalRequestJson openDeviceApprovalRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(openDeviceApprovalRequestJson.device_id, c9iZ, 0);
        c9j5.AAQ(openDeviceApprovalRequestJson.target, DeviceApprovalTargetJson$$serializer.INSTANCE, c9iZ, 1);
        c9j5.AAV(openDeviceApprovalRequestJson.reason, c9iZ, 2);
        c9j5.AAV(openDeviceApprovalRequestJson.request_origin, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || openDeviceApprovalRequestJson.delivery_mode != null) {
            c9j5.AAP(openDeviceApprovalRequestJson.delivery_mode, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || openDeviceApprovalRequestJson.display_name != null) {
            c9j5.AAP(openDeviceApprovalRequestJson.display_name, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || openDeviceApprovalRequestJson.action_description != null) {
            c9j5.AAP(openDeviceApprovalRequestJson.action_description, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || openDeviceApprovalRequestJson.approval_intent_context != null) {
            c9j5.AAP(openDeviceApprovalRequestJson.approval_intent_context, ApprovalIntentContextJson$$serializer.INSTANCE, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpenDeviceApprovalRequestJson) {
                OpenDeviceApprovalRequestJson openDeviceApprovalRequestJson = (OpenDeviceApprovalRequestJson) obj;
                if (!C7384Etj.areEqual(this.device_id, openDeviceApprovalRequestJson.device_id) || !C7384Etj.areEqual(this.target, openDeviceApprovalRequestJson.target) || !C7384Etj.areEqual(this.reason, openDeviceApprovalRequestJson.reason) || !C7384Etj.areEqual(this.request_origin, openDeviceApprovalRequestJson.request_origin) || !C7384Etj.areEqual(this.delivery_mode, openDeviceApprovalRequestJson.delivery_mode) || !C7384Etj.areEqual(this.display_name, openDeviceApprovalRequestJson.display_name) || !C7384Etj.areEqual(this.action_description, openDeviceApprovalRequestJson.action_description) || !C7384Etj.areEqual(this.approval_intent_context, openDeviceApprovalRequestJson.approval_intent_context)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OpenDeviceApprovalRequestJson(int i, String str, DeviceApprovalTargetJson deviceApprovalTargetJson, String str2, String str3, String str4, String str5, String str6, ApprovalIntentContextJson approvalIntentContextJson, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(OpenDeviceApprovalRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.device_id = str;
        this.target = deviceApprovalTargetJson;
        this.reason = str2;
        this.request_origin = str3;
        if ((i & 16) == 0) {
            this.delivery_mode = null;
        } else {
            this.delivery_mode = str4;
        }
        if ((i & 32) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str5;
        }
        if ((i & 64) == 0) {
            this.action_description = null;
        } else {
            this.action_description = str6;
        }
        if ((i & 128) == 0) {
            this.approval_intent_context = null;
        } else {
            this.approval_intent_context = approvalIntentContextJson;
        }
    }

    public static /* synthetic */ OpenDeviceApprovalRequestJson copy$default(OpenDeviceApprovalRequestJson openDeviceApprovalRequestJson, String str, DeviceApprovalTargetJson deviceApprovalTargetJson, String str2, String str3, String str4, String str5, String str6, ApprovalIntentContextJson approvalIntentContextJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openDeviceApprovalRequestJson.device_id;
        }
        if ((i & 2) != 0) {
            deviceApprovalTargetJson = openDeviceApprovalRequestJson.target;
        }
        if ((i & 4) != 0) {
            str2 = openDeviceApprovalRequestJson.reason;
        }
        if ((i & 8) != 0) {
            str3 = openDeviceApprovalRequestJson.request_origin;
        }
        if ((i & 16) != 0) {
            str4 = openDeviceApprovalRequestJson.delivery_mode;
        }
        if ((i & 32) != 0) {
            str5 = openDeviceApprovalRequestJson.display_name;
        }
        if ((i & 64) != 0) {
            str6 = openDeviceApprovalRequestJson.action_description;
        }
        if ((i & 128) != 0) {
            approvalIntentContextJson = openDeviceApprovalRequestJson.approval_intent_context;
        }
        return openDeviceApprovalRequestJson.copy(str, deviceApprovalTargetJson, str2, str3, str4, str5, str6, approvalIntentContextJson);
    }

    public final String component1() {
        return this.device_id;
    }

    public final DeviceApprovalTargetJson component2() {
        return this.target;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.request_origin;
    }

    public final String component5() {
        return this.delivery_mode;
    }

    public final String component6() {
        return this.display_name;
    }

    public final String component7() {
        return this.action_description;
    }

    public final ApprovalIntentContextJson component8() {
        return this.approval_intent_context;
    }

    public final String getAction_description() {
        return this.action_description;
    }

    public final ApprovalIntentContextJson getApproval_intent_context() {
        return this.approval_intent_context;
    }

    public final String getDelivery_mode() {
        return this.delivery_mode;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRequest_origin() {
        return this.request_origin;
    }

    public final DeviceApprovalTargetJson getTarget() {
        return this.target;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.request_origin, AnonymousClass005.A0I(this.reason, AnonymousClass005.A0F(this.target, AnonymousClass001.A0G(this.device_id)))) + AnonymousClass006.A0G(this.delivery_mode)) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass006.A0G(this.action_description)) * 31) + C3cH.A02(this.approval_intent_context);
    }

    public final OpenDeviceApprovalRequestJson copy(String str, DeviceApprovalTargetJson deviceApprovalTargetJson, String str2, String str3, String str4, String str5, String str6, ApprovalIntentContextJson approvalIntentContextJson) {
        AnonymousClass005.A14(str, deviceApprovalTargetJson, str2, str3);
        return new OpenDeviceApprovalRequestJson(str, deviceApprovalTargetJson, str2, str3, str4, str5, str6, approvalIntentContextJson);
    }

    public String toString() {
        return super.toString();
    }

    public OpenDeviceApprovalRequestJson(String str, DeviceApprovalTargetJson deviceApprovalTargetJson, String str2, String str3, String str4, String str5, String str6, ApprovalIntentContextJson approvalIntentContextJson) {
        AnonymousClass005.A14(str, deviceApprovalTargetJson, str2, str3);
        this.device_id = str;
        this.target = deviceApprovalTargetJson;
        this.reason = str2;
        this.request_origin = str3;
        this.delivery_mode = str4;
        this.display_name = str5;
        this.action_description = str6;
        this.approval_intent_context = approvalIntentContextJson;
    }

    public /* synthetic */ OpenDeviceApprovalRequestJson(String str, DeviceApprovalTargetJson deviceApprovalTargetJson, String str2, String str3, String str4, String str5, String str6, ApprovalIntentContextJson approvalIntentContextJson, int i, C06H c06h) {
        this(str, deviceApprovalTargetJson, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : approvalIntentContextJson);
    }
}
