package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class TaskWebsitePermission extends C06G {
    public final String caption;
    public final String iconUrl;
    public final String id;
    public final String kind;
    public final boolean revocable;
    public final String title;

    public static /* synthetic */ TaskWebsitePermission copy$default(TaskWebsitePermission taskWebsitePermission, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str6 = taskWebsitePermission.id;
        }
        if ((i & 2) != 0) {
            str7 = taskWebsitePermission.kind;
        }
        if ((i & 4) != 0) {
            str8 = taskWebsitePermission.title;
        }
        if ((i & 8) != 0) {
            str9 = taskWebsitePermission.caption;
        }
        if ((i & 16) != 0) {
            str10 = taskWebsitePermission.iconUrl;
        }
        if ((i & 32) != 0) {
            z2 = taskWebsitePermission.revocable;
        }
        AnonymousClass005.A0x(str6, str7, str8);
        return new TaskWebsitePermission(str6, str7, str8, str9, str10, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskWebsitePermission) {
                TaskWebsitePermission taskWebsitePermission = (TaskWebsitePermission) obj;
                if (!C7384Etj.areEqual(this.id, taskWebsitePermission.id) || !C7384Etj.areEqual(this.kind, taskWebsitePermission.kind) || !C7384Etj.areEqual(this.title, taskWebsitePermission.title) || !C7384Etj.areEqual(this.caption, taskWebsitePermission.caption) || !C7384Etj.areEqual(this.iconUrl, taskWebsitePermission.iconUrl) || this.revocable != taskWebsitePermission.revocable) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.caption;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final boolean component6() {
        return this.revocable;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final boolean getRevocable() {
        return this.revocable;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.caption)) * 31) + AnonymousClass005.A0H(this.iconUrl)) * 31, this.revocable);
    }

    public TaskWebsitePermission(String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.kind = str2;
        this.title = str3;
        this.caption = str4;
        this.iconUrl = str5;
        this.revocable = z;
    }

    public final TaskWebsitePermission copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new TaskWebsitePermission(str, str2, str3, str4, str5, z);
    }

    public String toString() {
        return super.toString();
    }
}
