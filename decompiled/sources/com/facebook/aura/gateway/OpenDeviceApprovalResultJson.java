package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class OpenDeviceApprovalResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final DeviceApprovalRecordJson approval;

    public final class Companion {
        public final C9hr<OpenDeviceApprovalResultJson> serializer() {
            return OpenDeviceApprovalResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(OpenDeviceApprovalResultJson openDeviceApprovalResultJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || openDeviceApprovalResultJson.approval != null) {
            c9j5.AAP(openDeviceApprovalResultJson.approval, DeviceApprovalRecordJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenDeviceApprovalResultJson) && C7384Etj.areEqual(this.approval, ((OpenDeviceApprovalResultJson) obj).approval));
    }

    public static /* synthetic */ OpenDeviceApprovalResultJson copy$default(OpenDeviceApprovalResultJson openDeviceApprovalResultJson, DeviceApprovalRecordJson deviceApprovalRecordJson, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceApprovalRecordJson = openDeviceApprovalResultJson.approval;
        }
        return new OpenDeviceApprovalResultJson(deviceApprovalRecordJson);
    }

    public final DeviceApprovalRecordJson component1() {
        return this.approval;
    }

    public final OpenDeviceApprovalResultJson copy(DeviceApprovalRecordJson deviceApprovalRecordJson) {
        return new OpenDeviceApprovalResultJson(deviceApprovalRecordJson);
    }

    public final DeviceApprovalRecordJson getApproval() {
        return this.approval;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.approval);
    }

    public /* synthetic */ OpenDeviceApprovalResultJson(int i, DeviceApprovalRecordJson deviceApprovalRecordJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.approval = null;
        } else {
            this.approval = deviceApprovalRecordJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OpenDeviceApprovalResultJson(DeviceApprovalRecordJson deviceApprovalRecordJson) {
        this.approval = deviceApprovalRecordJson;
    }

    public /* synthetic */ OpenDeviceApprovalResultJson(DeviceApprovalRecordJson deviceApprovalRecordJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : deviceApprovalRecordJson);
    }

    public OpenDeviceApprovalResultJson() {
        this(null);
    }
}
