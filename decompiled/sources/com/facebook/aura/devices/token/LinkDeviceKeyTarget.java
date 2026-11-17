package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyTarget extends C06G {
    public final String gatewayUrl;
    public final String hatcheryVmId;
    public final String vmId;
    public final LinkDeviceVmKind vmKind;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyTarget) {
                LinkDeviceKeyTarget linkDeviceKeyTarget = (LinkDeviceKeyTarget) obj;
                if (!C7384Etj.areEqual(this.vmId, linkDeviceKeyTarget.vmId) || this.vmKind != linkDeviceKeyTarget.vmKind || !C7384Etj.areEqual(this.hatcheryVmId, linkDeviceKeyTarget.hatcheryVmId) || !C7384Etj.areEqual(this.gatewayUrl, linkDeviceKeyTarget.gatewayUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyTarget copy$default(LinkDeviceKeyTarget linkDeviceKeyTarget, String str, LinkDeviceVmKind linkDeviceVmKind, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyTarget.vmId;
        }
        if ((i & 2) != 0) {
            linkDeviceVmKind = linkDeviceKeyTarget.vmKind;
        }
        if ((i & 4) != 0) {
            str2 = linkDeviceKeyTarget.hatcheryVmId;
        }
        if ((i & 8) != 0) {
            str3 = linkDeviceKeyTarget.gatewayUrl;
        }
        return linkDeviceKeyTarget.copy(str, linkDeviceVmKind, str2, str3);
    }

    public final String component1() {
        return this.vmId;
    }

    public final LinkDeviceVmKind component2() {
        return this.vmKind;
    }

    public final String component3() {
        return this.hatcheryVmId;
    }

    public final String component4() {
        return this.gatewayUrl;
    }

    public final String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public final String getHatcheryVmId() {
        return this.hatcheryVmId;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public final LinkDeviceVmKind getVmKind() {
        return this.vmKind;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.gatewayUrl, AnonymousClass005.A0I(this.hatcheryVmId, AnonymousClass005.A0F(this.vmKind, AnonymousClass001.A0G(this.vmId))));
    }

    public LinkDeviceKeyTarget(String str, LinkDeviceVmKind linkDeviceVmKind, String str2, String str3) {
        AnonymousClass005.A14(str, linkDeviceVmKind, str2, str3);
        this.vmId = str;
        this.vmKind = linkDeviceVmKind;
        this.hatcheryVmId = str2;
        this.gatewayUrl = str3;
    }

    public final LinkDeviceKeyTarget copy(String str, LinkDeviceVmKind linkDeviceVmKind, String str2, String str3) {
        AnonymousClass005.A14(str, linkDeviceVmKind, str2, str3);
        return new LinkDeviceKeyTarget(str, linkDeviceVmKind, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
