package com.facebook.aura.permissions.defaults;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConfidentialVmToggle extends C06G {
    public final String description;
    public final boolean isAllowed;
    public final boolean isUpdating;
    public final String key;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmToggle) {
                ConfidentialVmToggle confidentialVmToggle = (ConfidentialVmToggle) obj;
                if (!C7384Etj.areEqual(this.key, confidentialVmToggle.key) || !C7384Etj.areEqual(this.title, confidentialVmToggle.title) || !C7384Etj.areEqual(this.description, confidentialVmToggle.description) || this.isAllowed != confidentialVmToggle.isAllowed || this.isUpdating != confidentialVmToggle.isUpdating) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmToggle copy$default(ConfidentialVmToggle confidentialVmToggle, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confidentialVmToggle.key;
        }
        if ((i & 2) != 0) {
            str2 = confidentialVmToggle.title;
        }
        if ((i & 4) != 0) {
            str3 = confidentialVmToggle.description;
        }
        if ((i & 8) != 0) {
            z = confidentialVmToggle.isAllowed;
        }
        if ((i & 16) != 0) {
            z2 = confidentialVmToggle.isUpdating;
        }
        return confidentialVmToggle.copy(str, str2, str3, z, z2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.isAllowed;
    }

    public final boolean component5() {
        return this.isUpdating;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.key)) + AnonymousClass006.A0G(this.description)) * 31, this.isAllowed), this.isUpdating);
    }

    public final boolean isAllowed() {
        return this.isAllowed;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public ConfidentialVmToggle(String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        this.key = str;
        this.title = str2;
        this.description = str3;
        this.isAllowed = z;
        this.isUpdating = z2;
    }

    public final ConfidentialVmToggle copy(String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        return new ConfidentialVmToggle(str, str2, str3, z, z2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmToggle(String str, String str2, String str3, boolean z, boolean z2, int i, C06H c06h) {
        this(str, str2, str3, z, (i & 16) != 0 ? false : z2);
    }
}
