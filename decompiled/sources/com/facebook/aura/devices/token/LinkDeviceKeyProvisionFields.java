package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyProvisionFields extends C06G {
    public final String deviceKey;
    public final String deviceKeyId;
    public final String vmId;
    public final String vmKind;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyProvisionFields) {
                LinkDeviceKeyProvisionFields linkDeviceKeyProvisionFields = (LinkDeviceKeyProvisionFields) obj;
                if (!C7384Etj.areEqual(this.deviceKey, linkDeviceKeyProvisionFields.deviceKey) || !C7384Etj.areEqual(this.deviceKeyId, linkDeviceKeyProvisionFields.deviceKeyId) || !C7384Etj.areEqual(this.vmId, linkDeviceKeyProvisionFields.vmId) || !C7384Etj.areEqual(this.vmKind, linkDeviceKeyProvisionFields.vmKind)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyProvisionFields copy$default(LinkDeviceKeyProvisionFields linkDeviceKeyProvisionFields, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyProvisionFields.deviceKey;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyProvisionFields.deviceKeyId;
        }
        if ((i & 4) != 0) {
            str3 = linkDeviceKeyProvisionFields.vmId;
        }
        if ((i & 8) != 0) {
            str4 = linkDeviceKeyProvisionFields.vmKind;
        }
        return linkDeviceKeyProvisionFields.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.deviceKey;
    }

    public final String component2() {
        return this.deviceKeyId;
    }

    public final String component3() {
        return this.vmId;
    }

    public final String component4() {
        return this.vmKind;
    }

    public final String getDeviceKey() {
        return this.deviceKey;
    }

    public final String getDeviceKeyId() {
        return this.deviceKeyId;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public final String getVmKind() {
        return this.vmKind;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.vmKind, AnonymousClass005.A0I(this.vmId, AnonymousClass005.A0I(this.deviceKeyId, AnonymousClass001.A0G(this.deviceKey))));
    }

    public LinkDeviceKeyProvisionFields(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.deviceKey = str;
        this.deviceKeyId = str2;
        this.vmId = str3;
        this.vmKind = str4;
    }

    public final LinkDeviceKeyProvisionFields copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new LinkDeviceKeyProvisionFields(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }
}
