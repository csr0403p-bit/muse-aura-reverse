package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyRegistration extends C06G {
    public final String deviceFamily;
    public final String label;
    public final String nodeId;
    public final LinkDeviceKeyRole role;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyRegistration) {
                LinkDeviceKeyRegistration linkDeviceKeyRegistration = (LinkDeviceKeyRegistration) obj;
                if (this.role != linkDeviceKeyRegistration.role || !C7384Etj.areEqual(this.nodeId, linkDeviceKeyRegistration.nodeId) || !C7384Etj.areEqual(this.label, linkDeviceKeyRegistration.label) || !C7384Etj.areEqual(this.deviceFamily, linkDeviceKeyRegistration.deviceFamily)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyRegistration copy$default(LinkDeviceKeyRegistration linkDeviceKeyRegistration, LinkDeviceKeyRole linkDeviceKeyRole, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            linkDeviceKeyRole = linkDeviceKeyRegistration.role;
        }
        if ((i & 2) != 0) {
            str = linkDeviceKeyRegistration.nodeId;
        }
        if ((i & 4) != 0) {
            str2 = linkDeviceKeyRegistration.label;
        }
        if ((i & 8) != 0) {
            str3 = linkDeviceKeyRegistration.deviceFamily;
        }
        return linkDeviceKeyRegistration.copy(linkDeviceKeyRole, str, str2, str3);
    }

    public final LinkDeviceKeyRole component1() {
        return this.role;
    }

    public final String component2() {
        return this.nodeId;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.deviceFamily;
    }

    public final String getDeviceFamily() {
        return this.deviceFamily;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final LinkDeviceKeyRole getRole() {
        return this.role;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.deviceFamily, AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.nodeId, AnonymousClass005.A0E(this.role))));
    }

    public LinkDeviceKeyRegistration(LinkDeviceKeyRole linkDeviceKeyRole, String str, String str2, String str3) {
        AnonymousClass005.A14(linkDeviceKeyRole, str, str2, str3);
        this.role = linkDeviceKeyRole;
        this.nodeId = str;
        this.label = str2;
        this.deviceFamily = str3;
    }

    public final LinkDeviceKeyRegistration copy(LinkDeviceKeyRole linkDeviceKeyRole, String str, String str2, String str3) {
        AnonymousClass005.A14(linkDeviceKeyRole, str, str2, str3);
        return new LinkDeviceKeyRegistration(linkDeviceKeyRole, str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
