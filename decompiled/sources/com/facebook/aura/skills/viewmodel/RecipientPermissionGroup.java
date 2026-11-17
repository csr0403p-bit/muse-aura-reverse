package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.skills.repo.RecipientPermission;

/* loaded from: classes2.dex */
public final class RecipientPermissionGroup extends C06G {
    public final String actionKey;
    public final String label;
    public final AHD<RecipientPermission> permissions;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionGroup) {
                RecipientPermissionGroup recipientPermissionGroup = (RecipientPermissionGroup) obj;
                if (!C7384Etj.areEqual(this.actionKey, recipientPermissionGroup.actionKey) || !C7384Etj.areEqual(this.label, recipientPermissionGroup.label) || !C7384Etj.areEqual(this.permissions, recipientPermissionGroup.permissions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecipientPermissionGroup copy$default(RecipientPermissionGroup recipientPermissionGroup, String str, String str2, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipientPermissionGroup.actionKey;
        }
        if ((i & 2) != 0) {
            str2 = recipientPermissionGroup.label;
        }
        if ((i & 4) != 0) {
            ahd = recipientPermissionGroup.permissions;
        }
        return recipientPermissionGroup.copy(str, str2, ahd);
    }

    public final String component1() {
        return this.actionKey;
    }

    public final String component2() {
        return this.label;
    }

    public final AHD<RecipientPermission> component3() {
        return this.permissions;
    }

    public final String getActionKey() {
        return this.actionKey;
    }

    public final String getLabel() {
        return this.label;
    }

    public final AHD<RecipientPermission> getPermissions() {
        return this.permissions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.permissions, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.actionKey)));
    }

    public RecipientPermissionGroup(String str, String str2, AHD<RecipientPermission> ahd) {
        AnonymousClass005.A0x(str, str2, ahd);
        this.actionKey = str;
        this.label = str2;
        this.permissions = ahd;
    }

    public final RecipientPermissionGroup copy(String str, String str2, AHD<RecipientPermission> ahd) {
        AnonymousClass005.A0x(str, str2, ahd);
        return new RecipientPermissionGroup(str, str2, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
