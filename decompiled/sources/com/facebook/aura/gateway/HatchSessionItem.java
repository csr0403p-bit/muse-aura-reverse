package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.model.HatchMessageChannel;

/* loaded from: classes.dex */
public final class HatchSessionItem extends C06G {
    public static final int $stable = 0;
    public final String accountUsername;
    public final boolean canSendMessages;
    public final HatchMessageChannel channel;
    public final long createdAt;
    public final boolean isExternalChannel;
    public final boolean isPinned;
    public final boolean isPrimary;
    public final boolean isThread;
    public final String rawChannel;
    public final String sessionId;
    public final String snippet;
    public final String status;
    public final String title;
    public final int unreadCount;
    public final long updatedAt;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSessionItem) {
                HatchSessionItem hatchSessionItem = (HatchSessionItem) obj;
                if (!C7384Etj.areEqual(this.sessionId, hatchSessionItem.sessionId) || this.createdAt != hatchSessionItem.createdAt || this.updatedAt != hatchSessionItem.updatedAt || !C7384Etj.areEqual(this.status, hatchSessionItem.status) || !C7384Etj.areEqual(this.snippet, hatchSessionItem.snippet) || this.isThread != hatchSessionItem.isThread || !C7384Etj.areEqual(this.title, hatchSessionItem.title) || this.unreadCount != hatchSessionItem.unreadCount || this.isPinned != hatchSessionItem.isPinned || this.isPrimary != hatchSessionItem.isPrimary || !C7384Etj.areEqual(this.rawChannel, hatchSessionItem.rawChannel) || !C7384Etj.areEqual(this.accountUsername, hatchSessionItem.accountUsername) || this.canSendMessages != hatchSessionItem.canSendMessages) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchSessionItem(String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, String str5, String str6, boolean z4, int i2, C06H c06h) {
        this(str, j, j2, str2, str3, z, str4, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? null : str5, (i2 & 2048) != 0 ? null : str6, (i2 & 4096) != 0 ? true : z4);
    }

    public static /* synthetic */ HatchSessionItem copy$default(HatchSessionItem hatchSessionItem, String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, String str5, String str6, boolean z4, int i2, Object obj) {
        String str7 = str;
        long j3 = j;
        long j4 = j2;
        String str8 = str2;
        String str9 = str3;
        boolean z5 = z;
        String str10 = str4;
        int i3 = i;
        boolean z6 = z2;
        boolean z7 = z3;
        String str11 = str5;
        String str12 = str6;
        boolean z8 = z4;
        if ((i2 & 1) != 0) {
            str7 = hatchSessionItem.sessionId;
        }
        if ((i2 & 2) != 0) {
            j3 = hatchSessionItem.createdAt;
        }
        if ((i2 & 4) != 0) {
            j4 = hatchSessionItem.updatedAt;
        }
        if ((i2 & 8) != 0) {
            str8 = hatchSessionItem.status;
        }
        if ((i2 & 16) != 0) {
            str9 = hatchSessionItem.snippet;
        }
        if ((i2 & 32) != 0) {
            z5 = hatchSessionItem.isThread;
        }
        if ((i2 & 64) != 0) {
            str10 = hatchSessionItem.title;
        }
        if ((i2 & 128) != 0) {
            i3 = hatchSessionItem.unreadCount;
        }
        if ((i2 & 256) != 0) {
            z6 = hatchSessionItem.isPinned;
        }
        if ((i2 & 512) != 0) {
            z7 = hatchSessionItem.isPrimary;
        }
        if ((i2 & 1024) != 0) {
            str11 = hatchSessionItem.rawChannel;
        }
        if ((i2 & 2048) != 0) {
            str12 = hatchSessionItem.accountUsername;
        }
        if ((i2 & 4096) != 0) {
            z8 = hatchSessionItem.canSendMessages;
        }
        AnonymousClass003.A0w(str7, str8);
        boolean z9 = z5;
        String str13 = str9;
        return new HatchSessionItem(str7, j3, j4, str8, str13, z9, str10, i3, z6, z7, str11, str12, z8);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final boolean component10() {
        return this.isPrimary;
    }

    public final String component11() {
        return this.rawChannel;
    }

    public final String component12() {
        return this.accountUsername;
    }

    public final boolean component13() {
        return this.canSendMessages;
    }

    public final long component2() {
        return this.createdAt;
    }

    public final long component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.snippet;
    }

    public final boolean component6() {
        return this.isThread;
    }

    public final String component7() {
        return this.title;
    }

    public final int component8() {
        return this.unreadCount;
    }

    public final boolean component9() {
        return this.isPinned;
    }

    public final String getAccountUsername() {
        return this.accountUsername;
    }

    public final boolean getAppearsInThreadList() {
        return this.isThread && !"peer".equals(this.rawChannel);
    }

    public final boolean getCanSendMessages() {
        return this.canSendMessages;
    }

    public final HatchMessageChannel getChannel() {
        return this.channel;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getRawChannel() {
        return this.rawChannel;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSnippet() {
        return this.snippet;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01(C0KA.A01((((C0KA.A01((AnonymousClass005.A0I(this.status, AnonymousClass006.A06(this.updatedAt, AnonymousClass006.A06(this.createdAt, AnonymousClass001.A0G(this.sessionId)))) + AnonymousClass006.A0G(this.snippet)) * 31, this.isThread) + AnonymousClass006.A0G(this.title)) * 31) + this.unreadCount) * 31, this.isPinned), this.isPrimary) + AnonymousClass006.A0G(this.rawChannel)) * 31) + AnonymousClass005.A0H(this.accountUsername)) * 31, this.canSendMessages);
    }

    public final boolean isExternalChannel() {
        return this.isExternalChannel;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final boolean isThread() {
        return this.isThread;
    }

    public final HatchSessionItem copy(String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, String str5, String str6, boolean z4) {
        AnonymousClass003.A0w(str, str2);
        return new HatchSessionItem(str, j, j2, str2, str3, z, str4, i, z2, z3, str5, str6, z4);
    }

    public String toString() {
        return super.toString();
    }

    public HatchSessionItem(String str, long j, long j2, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, String str5, String str6, boolean z4) {
        AnonymousClass003.A0w(str, str2);
        this.sessionId = str;
        this.createdAt = j;
        this.updatedAt = j2;
        this.status = str2;
        this.snippet = str3;
        this.isThread = z;
        this.title = str4;
        this.unreadCount = i;
        this.isPinned = z2;
        this.isPrimary = z3;
        this.rawChannel = str5;
        this.accountUsername = str6;
        this.canSendMessages = z4;
        HatchMessageChannel.Companion companion = HatchMessageChannel.Companion;
        this.channel = companion.fromSessionChannel(str5);
        this.isExternalChannel = companion.isExternalSessionChannel(str5);
    }
}
