package com.facebook.aura.sharesheet;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.navigation.key.ShareType;

/* loaded from: classes.dex */
public final class HatchShareLogContext extends C06G {
    public static final int $stable = 0;
    public final boolean isAvatarDance;
    public final String messageId;
    public final ShareType shareType;
    public final String threadId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchShareLogContext) {
                HatchShareLogContext hatchShareLogContext = (HatchShareLogContext) obj;
                if (this.shareType != hatchShareLogContext.shareType || !C7384Etj.areEqual(this.messageId, hatchShareLogContext.messageId) || !C7384Etj.areEqual(this.threadId, hatchShareLogContext.threadId) || this.isAvatarDance != hatchShareLogContext.isAvatarDance) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchShareLogContext copy$default(HatchShareLogContext hatchShareLogContext, ShareType shareType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            shareType = hatchShareLogContext.shareType;
        }
        if ((i & 2) != 0) {
            str = hatchShareLogContext.messageId;
        }
        if ((i & 4) != 0) {
            str2 = hatchShareLogContext.threadId;
        }
        if ((i & 8) != 0) {
            z = hatchShareLogContext.isAvatarDance;
        }
        return new HatchShareLogContext(shareType, str, str2, z);
    }

    public final ShareType component1() {
        return this.shareType;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.threadId;
    }

    public final boolean component4() {
        return this.isAvatarDance;
    }

    public final HatchShareLogContext copy(ShareType shareType, String str, String str2, boolean z) {
        return new HatchShareLogContext(shareType, str, str2, z);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final ShareType getShareType() {
        return this.shareType;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return C0KA.A00(((((AnonymousClass006.A0D(this.shareType) * 31) + AnonymousClass006.A0G(this.messageId)) * 31) + AnonymousClass005.A0H(this.threadId)) * 31, this.isAvatarDance);
    }

    public final boolean isAvatarDance() {
        return this.isAvatarDance;
    }

    public HatchShareLogContext(ShareType shareType, String str, String str2, boolean z) {
        this.shareType = shareType;
        this.messageId = str;
        this.threadId = str2;
        this.isAvatarDance = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchShareLogContext(ShareType shareType, String str, String str2, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : shareType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, AnonymousClass005.A1P(i, z));
    }

    public HatchShareLogContext() {
        this(null, null, null, false);
    }
}
