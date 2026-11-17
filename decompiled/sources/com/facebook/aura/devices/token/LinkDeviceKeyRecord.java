package com.facebook.aura.devices.token;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class LinkDeviceKeyRecord extends C06G {
    public final String deviceFamily;
    public final String keyId;
    public final String label;
    public final Long lastSeenAtMs;
    public final String nodeId;
    public final String role;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkDeviceKeyRecord) {
                LinkDeviceKeyRecord linkDeviceKeyRecord = (LinkDeviceKeyRecord) obj;
                if (!C7384Etj.areEqual(this.keyId, linkDeviceKeyRecord.keyId) || !C7384Etj.areEqual(this.role, linkDeviceKeyRecord.role) || !C7384Etj.areEqual(this.label, linkDeviceKeyRecord.label) || !C7384Etj.areEqual(this.nodeId, linkDeviceKeyRecord.nodeId) || !C7384Etj.areEqual(this.deviceFamily, linkDeviceKeyRecord.deviceFamily) || !C7384Etj.areEqual(this.lastSeenAtMs, linkDeviceKeyRecord.lastSeenAtMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkDeviceKeyRecord copy$default(LinkDeviceKeyRecord linkDeviceKeyRecord, String str, String str2, String str3, String str4, String str5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkDeviceKeyRecord.keyId;
        }
        if ((i & 2) != 0) {
            str2 = linkDeviceKeyRecord.role;
        }
        if ((i & 4) != 0) {
            str3 = linkDeviceKeyRecord.label;
        }
        if ((i & 8) != 0) {
            str4 = linkDeviceKeyRecord.nodeId;
        }
        if ((i & 16) != 0) {
            str5 = linkDeviceKeyRecord.deviceFamily;
        }
        if ((i & 32) != 0) {
            l = linkDeviceKeyRecord.lastSeenAtMs;
        }
        return linkDeviceKeyRecord.copy(str, str2, str3, str4, str5, l);
    }

    public final String component1() {
        return this.keyId;
    }

    public final String component2() {
        return this.role;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.nodeId;
    }

    public final String component5() {
        return this.deviceFamily;
    }

    public final Long component6() {
        return this.lastSeenAtMs;
    }

    public final String getDeviceFamily() {
        return this.deviceFamily;
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Long getLastSeenAtMs() {
        return this.lastSeenAtMs;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.deviceFamily, AnonymousClass005.A0I(this.nodeId, AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.keyId))))) + AnonymousClass006.A0D(this.lastSeenAtMs);
    }

    public LinkDeviceKeyRecord(String str, String str2, String str3, String str4, String str5, Long l) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.keyId = str;
        this.role = str2;
        this.label = str3;
        this.nodeId = str4;
        this.deviceFamily = str5;
        this.lastSeenAtMs = l;
    }

    public final LinkDeviceKeyRecord copy(String str, String str2, String str3, String str4, String str5, Long l) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new LinkDeviceKeyRecord(str, str2, str3, str4, str5, l);
    }

    public String toString() {
        return super.toString();
    }
}
