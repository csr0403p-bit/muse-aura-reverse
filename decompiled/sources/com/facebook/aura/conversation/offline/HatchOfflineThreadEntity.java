package com.facebook.aura.conversation.offline;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C60Q;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class HatchOfflineThreadEntity extends C06G {
    public final byte[] accountUsername;
    public final boolean canSendMessages;
    public final String channel;
    public final long createdAt;
    public final boolean isPinned;
    public final boolean isThread;
    public final long lastOpenedAt;
    public final String sessionId;
    public final byte[] snippet;
    public final String status;
    public final byte[] title;
    public final int unreadCount;
    public final long updatedAt;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchOfflineThreadEntity) {
                HatchOfflineThreadEntity hatchOfflineThreadEntity = (HatchOfflineThreadEntity) obj;
                if (!C7384Etj.areEqual(this.vmId, hatchOfflineThreadEntity.vmId) || !C7384Etj.areEqual(this.sessionId, hatchOfflineThreadEntity.sessionId) || !C7384Etj.areEqual(this.title, hatchOfflineThreadEntity.title) || !C7384Etj.areEqual(this.snippet, hatchOfflineThreadEntity.snippet) || this.createdAt != hatchOfflineThreadEntity.createdAt || this.updatedAt != hatchOfflineThreadEntity.updatedAt || this.isThread != hatchOfflineThreadEntity.isThread || !C7384Etj.areEqual(this.status, hatchOfflineThreadEntity.status) || this.unreadCount != hatchOfflineThreadEntity.unreadCount || this.isPinned != hatchOfflineThreadEntity.isPinned || this.lastOpenedAt != hatchOfflineThreadEntity.lastOpenedAt || !C7384Etj.areEqual(this.channel, hatchOfflineThreadEntity.channel) || !C7384Etj.areEqual(this.accountUsername, hatchOfflineThreadEntity.accountUsername) || this.canSendMessages != hatchOfflineThreadEntity.canSendMessages) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchOfflineThreadEntity copy$default(HatchOfflineThreadEntity hatchOfflineThreadEntity, String str, String str2, byte[] bArr, byte[] bArr2, long j, long j2, boolean z, String str3, int i, boolean z2, long j3, String str4, byte[] bArr3, boolean z3, int i2, Object obj) {
        String str5 = str;
        String str6 = str2;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        long j4 = j;
        long j5 = j2;
        boolean z4 = z;
        String str7 = str3;
        int i3 = i;
        boolean z5 = z2;
        long j6 = j3;
        String str8 = str4;
        byte[] bArr6 = bArr3;
        boolean z6 = z3;
        if ((i2 & 1) != 0) {
            str5 = hatchOfflineThreadEntity.vmId;
        }
        if ((i2 & 2) != 0) {
            str6 = hatchOfflineThreadEntity.sessionId;
        }
        if ((i2 & 4) != 0) {
            bArr4 = hatchOfflineThreadEntity.title;
        }
        if ((i2 & 8) != 0) {
            bArr5 = hatchOfflineThreadEntity.snippet;
        }
        if ((i2 & 16) != 0) {
            j4 = hatchOfflineThreadEntity.createdAt;
        }
        if ((i2 & 32) != 0) {
            j5 = hatchOfflineThreadEntity.updatedAt;
        }
        if ((i2 & 64) != 0) {
            z4 = hatchOfflineThreadEntity.isThread;
        }
        if ((i2 & 128) != 0) {
            str7 = hatchOfflineThreadEntity.status;
        }
        if ((i2 & 256) != 0) {
            i3 = hatchOfflineThreadEntity.unreadCount;
        }
        if ((i2 & 512) != 0) {
            z5 = hatchOfflineThreadEntity.isPinned;
        }
        if ((i2 & 1024) != 0) {
            j6 = hatchOfflineThreadEntity.lastOpenedAt;
        }
        if ((i2 & 2048) != 0) {
            str8 = hatchOfflineThreadEntity.channel;
        }
        if ((i2 & 4096) != 0) {
            bArr6 = hatchOfflineThreadEntity.accountUsername;
        }
        if ((i2 & 8192) != 0) {
            z6 = hatchOfflineThreadEntity.canSendMessages;
        }
        boolean z7 = z4;
        return hatchOfflineThreadEntity.copy(str5, str6, bArr4, bArr5, j4, j5, z7, str7, i3, z5, j6, str8, bArr6, z6);
    }

    public final String component1() {
        return this.vmId;
    }

    public final boolean component10() {
        return this.isPinned;
    }

    public final long component11() {
        return this.lastOpenedAt;
    }

    public final String component12() {
        return this.channel;
    }

    public final byte[] component13() {
        return this.accountUsername;
    }

    public final boolean component14() {
        return this.canSendMessages;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final byte[] component3() {
        return this.title;
    }

    public final byte[] component4() {
        return this.snippet;
    }

    public final long component5() {
        return this.createdAt;
    }

    public final long component6() {
        return this.updatedAt;
    }

    public final boolean component7() {
        return this.isThread;
    }

    public final String component8() {
        return this.status;
    }

    public final int component9() {
        return this.unreadCount;
    }

    public final byte[] getAccountUsername() {
        return this.accountUsername;
    }

    public final boolean getCanSendMessages() {
        return this.canSendMessages;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getLastOpenedAt() {
        return this.lastOpenedAt;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final byte[] getSnippet() {
        return this.snippet;
    }

    public final String getStatus() {
        return this.status;
    }

    public final byte[] getTitle() {
        return this.title;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        int iA0I = AnonymousClass005.A0I(this.sessionId, AnonymousClass001.A0G(this.vmId));
        byte[] bArr = this.title;
        int iHashCode = (iA0I + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.snippet;
        int iA06 = (AnonymousClass006.A06(this.lastOpenedAt, C0KA.A01((AnonymousClass005.A0I(this.status, C0KA.A01(AnonymousClass006.A06(this.updatedAt, AnonymousClass006.A06(this.createdAt, (iHashCode + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31)), this.isThread)) + this.unreadCount) * 31, this.isPinned)) + AnonymousClass006.A0G(this.channel)) * 31;
        byte[] bArr3 = this.accountUsername;
        return C0KA.A00((iA06 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31, this.canSendMessages);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isThread() {
        return this.isThread;
    }

    public HatchOfflineThreadEntity(String str, String str2, byte[] bArr, byte[] bArr2, long j, long j2, boolean z, String str3, int i, boolean z2, long j3, String str4, byte[] bArr3, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 7);
        this.vmId = str;
        this.sessionId = str2;
        this.title = bArr;
        this.snippet = bArr2;
        this.createdAt = j;
        this.updatedAt = j2;
        this.isThread = z;
        this.status = str3;
        this.unreadCount = i;
        this.isPinned = z2;
        this.lastOpenedAt = j3;
        this.channel = str4;
        this.accountUsername = bArr3;
        this.canSendMessages = z3;
    }

    public final HatchOfflineThreadEntity copy(String str, String str2, byte[] bArr, byte[] bArr2, long j, long j2, boolean z, String str3, int i, boolean z2, long j3, String str4, byte[] bArr3, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str3, 7);
        return new HatchOfflineThreadEntity(str, str2, bArr, bArr2, j, j2, z, str3, i, z2, j3, str4, bArr3, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchOfflineThreadEntity(String str, String str2, byte[] bArr, byte[] bArr2, long j, long j2, boolean z, String str3, int i, boolean z2, long j3, String str4, byte[] bArr3, boolean z3, int i2, C06H c06h) {
        this(str, str2, bArr, bArr2, j, j2, z, str3, i, z2, j3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : bArr3, C60Q.A1Q(i2 & 8192, z3));
    }
}
