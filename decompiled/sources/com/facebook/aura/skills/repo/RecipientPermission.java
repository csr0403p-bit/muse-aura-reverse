package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class RecipientPermission extends C06G {
    public final String actionKey;
    public final String actionLabel;
    public final String caption;
    public final String kind;
    public final String mode;
    public final String modeLabel;
    public final String permissionId;
    public final boolean revocable;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermission) {
                RecipientPermission recipientPermission = (RecipientPermission) obj;
                if (!C7384Etj.areEqual(this.permissionId, recipientPermission.permissionId) || !C7384Etj.areEqual(this.kind, recipientPermission.kind) || !C7384Etj.areEqual(this.actionKey, recipientPermission.actionKey) || !C7384Etj.areEqual(this.actionLabel, recipientPermission.actionLabel) || !C7384Etj.areEqual(this.title, recipientPermission.title) || !C7384Etj.areEqual(this.caption, recipientPermission.caption) || !C7384Etj.areEqual(this.mode, recipientPermission.mode) || !C7384Etj.areEqual(this.modeLabel, recipientPermission.modeLabel) || this.revocable != recipientPermission.revocable) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecipientPermission copy$default(RecipientPermission recipientPermission, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipientPermission.permissionId;
        }
        if ((i & 2) != 0) {
            str2 = recipientPermission.kind;
        }
        if ((i & 4) != 0) {
            str3 = recipientPermission.actionKey;
        }
        if ((i & 8) != 0) {
            str4 = recipientPermission.actionLabel;
        }
        if ((i & 16) != 0) {
            str5 = recipientPermission.title;
        }
        if ((i & 32) != 0) {
            str6 = recipientPermission.caption;
        }
        if ((i & 64) != 0) {
            str7 = recipientPermission.mode;
        }
        if ((i & 128) != 0) {
            str8 = recipientPermission.modeLabel;
        }
        if ((i & 256) != 0) {
            z = recipientPermission.revocable;
        }
        return recipientPermission.copy(str, str2, str3, str4, str5, str6, str7, str8, z);
    }

    public final String component1() {
        return this.permissionId;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.actionKey;
    }

    public final String component4() {
        return this.actionLabel;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.caption;
    }

    public final String component7() {
        return this.mode;
    }

    public final String component8() {
        return this.modeLabel;
    }

    public final boolean component9() {
        return this.revocable;
    }

    public final String getActionKey() {
        return this.actionKey;
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getModeLabel() {
        return this.modeLabel;
    }

    public final String getPermissionId() {
        return this.permissionId;
    }

    public final boolean getRevocable() {
        return this.revocable;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00((((((AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.actionLabel, AnonymousClass005.A0I(this.actionKey, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.permissionId))))) + AnonymousClass006.A0G(this.caption)) * 31) + AnonymousClass006.A0G(this.mode)) * 31) + AnonymousClass005.A0H(this.modeLabel)) * 31, this.revocable);
    }

    public RecipientPermission(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.permissionId = str;
        this.kind = str2;
        this.actionKey = str3;
        this.actionLabel = str4;
        this.title = str5;
        this.caption = str6;
        this.mode = str7;
        this.modeLabel = str8;
        this.revocable = z;
    }

    public final RecipientPermission copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new RecipientPermission(str, str2, str3, str4, str5, str6, str7, str8, z);
    }

    public String toString() {
        return super.toString();
    }
}
