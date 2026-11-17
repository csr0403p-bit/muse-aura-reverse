package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchReactionLanding extends C06G {
    public final String emoji;
    public final String messageId;

    public HatchReactionLanding(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.messageId = str;
        this.emoji = str2;
    }

    public final HatchReactionLanding copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchReactionLanding(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchReactionLanding) {
                HatchReactionLanding hatchReactionLanding = (HatchReactionLanding) obj;
                if (!C7384Etj.areEqual(this.messageId, hatchReactionLanding.messageId) || !C7384Etj.areEqual(this.emoji, hatchReactionLanding.emoji)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchReactionLanding copy$default(HatchReactionLanding hatchReactionLanding, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchReactionLanding.messageId;
        }
        if ((i & 2) != 0) {
            str2 = hatchReactionLanding.emoji;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchReactionLanding(str, str2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.emoji;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.messageId) + AnonymousClass006.A0G(this.emoji);
    }

    public String toString() {
        return super.toString();
    }
}
