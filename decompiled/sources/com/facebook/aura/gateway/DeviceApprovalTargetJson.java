package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
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
public final class DeviceApprovalTargetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String command;
    public final String kind;

    public final class Companion {
        public final C9hr<DeviceApprovalTargetJson> serializer() {
            return DeviceApprovalTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeviceApprovalTargetJson deviceApprovalTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(deviceApprovalTargetJson.kind, c9iZ, 0);
        c9j5.AAV(deviceApprovalTargetJson.command, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceApprovalTargetJson) {
                DeviceApprovalTargetJson deviceApprovalTargetJson = (DeviceApprovalTargetJson) obj;
                if (!C7384Etj.areEqual(this.kind, deviceApprovalTargetJson.kind) || !C7384Etj.areEqual(this.command, deviceApprovalTargetJson.command)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeviceApprovalTargetJson copy$default(DeviceApprovalTargetJson deviceApprovalTargetJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceApprovalTargetJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = deviceApprovalTargetJson.command;
        }
        AnonymousClass003.A0u(str, str2);
        return new DeviceApprovalTargetJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.command;
    }

    public final String getCommand() {
        return this.command;
    }

    public final String getKind() {
        return this.kind;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.command, AnonymousClass001.A0G(this.kind));
    }

    public DeviceApprovalTargetJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.command = str2;
    }

    public final DeviceApprovalTargetJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DeviceApprovalTargetJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeviceApprovalTargetJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DeviceApprovalTargetJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.kind = str;
        this.command = str2;
    }
}
