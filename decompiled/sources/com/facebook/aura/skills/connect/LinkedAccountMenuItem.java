package com.facebook.aura.skills.connect;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class LinkedAccountMenuItem extends C06G {
    public static final int $stable = 0;
    public final String accountId;
    public final String name;
    public final boolean selected;

    public LinkedAccountMenuItem(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.accountId = str;
        this.name = str2;
        this.selected = z;
    }

    public final LinkedAccountMenuItem copy(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new LinkedAccountMenuItem(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkedAccountMenuItem) {
                LinkedAccountMenuItem linkedAccountMenuItem = (LinkedAccountMenuItem) obj;
                if (!C7384Etj.areEqual(this.accountId, linkedAccountMenuItem.accountId) || !C7384Etj.areEqual(this.name, linkedAccountMenuItem.name) || this.selected != linkedAccountMenuItem.selected) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkedAccountMenuItem copy$default(LinkedAccountMenuItem linkedAccountMenuItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkedAccountMenuItem.accountId;
        }
        if ((i & 2) != 0) {
            str2 = linkedAccountMenuItem.name;
        }
        if ((i & 4) != 0) {
            z = linkedAccountMenuItem.selected;
        }
        return linkedAccountMenuItem.copy(str, str2, z);
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.accountId) + AnonymousClass006.A0G(this.name)) * 31, this.selected);
    }

    public String toString() {
        return super.toString();
    }
}
