package com.facebook.aura.conversation.offline;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class HatchOfflineMessageEntity extends C06G {
    public final byte[] json;
    public final String role;
    public final long seq;
    public final String serverMessageId;
    public final String sessionId;
    public final long timestamp;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchOfflineMessageEntity) {
                HatchOfflineMessageEntity hatchOfflineMessageEntity = (HatchOfflineMessageEntity) obj;
                if (!C7384Etj.areEqual(this.vmId, hatchOfflineMessageEntity.vmId) || !C7384Etj.areEqual(this.sessionId, hatchOfflineMessageEntity.sessionId) || this.seq != hatchOfflineMessageEntity.seq || this.timestamp != hatchOfflineMessageEntity.timestamp || !C7384Etj.areEqual(this.serverMessageId, hatchOfflineMessageEntity.serverMessageId) || !C7384Etj.areEqual(this.role, hatchOfflineMessageEntity.role) || !C7384Etj.areEqual(this.json, hatchOfflineMessageEntity.json)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchOfflineMessageEntity copy$default(HatchOfflineMessageEntity hatchOfflineMessageEntity, String str, String str2, long j, long j2, String str3, String str4, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchOfflineMessageEntity.vmId;
        }
        if ((i & 2) != 0) {
            str2 = hatchOfflineMessageEntity.sessionId;
        }
        if ((i & 4) != 0) {
            j = hatchOfflineMessageEntity.seq;
        }
        if ((i & 8) != 0) {
            j2 = hatchOfflineMessageEntity.timestamp;
        }
        if ((i & 16) != 0) {
            str3 = hatchOfflineMessageEntity.serverMessageId;
        }
        if ((i & 32) != 0) {
            str4 = hatchOfflineMessageEntity.role;
        }
        if ((i & 64) != 0) {
            bArr = hatchOfflineMessageEntity.json;
        }
        return hatchOfflineMessageEntity.copy(str, str2, j, j2, str3, str4, bArr);
    }

    public final String component1() {
        return this.vmId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final long component3() {
        return this.seq;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final String component5() {
        return this.serverMessageId;
    }

    public final String component6() {
        return this.role;
    }

    public final byte[] component7() {
        return this.json;
    }

    public final byte[] getJson() {
        return this.json;
    }

    public final String getRole() {
        return this.role;
    }

    public final long getSeq() {
        return this.seq;
    }

    public final String getServerMessageId() {
        return this.serverMessageId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.role, (AnonymousClass006.A06(this.timestamp, AnonymousClass006.A06(this.seq, AnonymousClass005.A0I(this.sessionId, AnonymousClass001.A0G(this.vmId)))) + AnonymousClass006.A0G(this.serverMessageId)) * 31) + Arrays.hashCode(this.json);
    }

    public HatchOfflineMessageEntity(String str, String str2, long j, long j2, String str3, String str4, byte[] bArr) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0z(str4, bArr);
        this.vmId = str;
        this.sessionId = str2;
        this.seq = j;
        this.timestamp = j2;
        this.serverMessageId = str3;
        this.role = str4;
        this.json = bArr;
    }

    public final HatchOfflineMessageEntity copy(String str, String str2, long j, long j2, String str3, String str4, byte[] bArr) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0z(str4, bArr);
        return new HatchOfflineMessageEntity(str, str2, j, j2, str3, str4, bArr);
    }

    public String toString() {
        return super.toString();
    }
}
