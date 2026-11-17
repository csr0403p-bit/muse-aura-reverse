package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchGatewayChatMessage extends C06G {
    public static final int $stable = 0;
    public final String content;
    public final String id;
    public final String replyToMessageId;
    public final HatchGatewayChatRole role;
    public final long timestamp;

    public HatchGatewayChatMessage(String str, String str2, HatchGatewayChatRole hatchGatewayChatRole, String str3, long j) {
        AnonymousClass005.A11(str, hatchGatewayChatRole, str3, 0);
        this.id = str;
        this.replyToMessageId = str2;
        this.role = hatchGatewayChatRole;
        this.content = str3;
        this.timestamp = j;
    }

    public final HatchGatewayChatMessage copy(String str, String str2, HatchGatewayChatRole hatchGatewayChatRole, String str3, long j) {
        AnonymousClass005.A11(str, hatchGatewayChatRole, str3, 0);
        return new HatchGatewayChatMessage(str, str2, hatchGatewayChatRole, str3, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchGatewayChatMessage) {
                HatchGatewayChatMessage hatchGatewayChatMessage = (HatchGatewayChatMessage) obj;
                if (!C7384Etj.areEqual(this.id, hatchGatewayChatMessage.id) || !C7384Etj.areEqual(this.replyToMessageId, hatchGatewayChatMessage.replyToMessageId) || this.role != hatchGatewayChatMessage.role || !C7384Etj.areEqual(this.content, hatchGatewayChatMessage.content) || this.timestamp != hatchGatewayChatMessage.timestamp) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchGatewayChatMessage copy$default(HatchGatewayChatMessage hatchGatewayChatMessage, String str, String str2, HatchGatewayChatRole hatchGatewayChatRole, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchGatewayChatMessage.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchGatewayChatMessage.replyToMessageId;
        }
        if ((i & 4) != 0) {
            hatchGatewayChatRole = hatchGatewayChatMessage.role;
        }
        if ((i & 8) != 0) {
            str3 = hatchGatewayChatMessage.content;
        }
        if ((i & 16) != 0) {
            j = hatchGatewayChatMessage.timestamp;
        }
        return hatchGatewayChatMessage.copy(str, str2, hatchGatewayChatRole, str3, j);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.replyToMessageId;
    }

    public final HatchGatewayChatRole component3() {
        return this.role;
    }

    public final String component4() {
        return this.content;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReplyToMessageId() {
        return this.replyToMessageId;
    }

    public final HatchGatewayChatRole getRole() {
        return this.role;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.timestamp, AnonymousClass005.A0I(this.content, AnonymousClass005.A0F(this.role, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.replyToMessageId)) * 31)));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchGatewayChatMessage(String str, String str2, HatchGatewayChatRole hatchGatewayChatRole, String str3, long j, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), hatchGatewayChatRole, str3, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }
}
