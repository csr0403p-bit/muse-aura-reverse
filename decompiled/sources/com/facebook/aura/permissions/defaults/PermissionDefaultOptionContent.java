package com.facebook.aura.permissions.defaults;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PermissionDefaultOptionContent extends C06G {
    public final String description;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultOptionContent) {
                PermissionDefaultOptionContent permissionDefaultOptionContent = (PermissionDefaultOptionContent) obj;
                if (!C7384Etj.areEqual(this.title, permissionDefaultOptionContent.title) || !C7384Etj.areEqual(this.description, permissionDefaultOptionContent.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionDefaultOptionContent copy$default(PermissionDefaultOptionContent permissionDefaultOptionContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionDefaultOptionContent.title;
        }
        if ((i & 2) != 0) {
            str2 = permissionDefaultOptionContent.description;
        }
        AnonymousClass003.A0u(str, str2);
        return new PermissionDefaultOptionContent(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.description, AnonymousClass001.A0G(this.title));
    }

    public PermissionDefaultOptionContent(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.description = str2;
    }

    public final PermissionDefaultOptionContent copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PermissionDefaultOptionContent(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
