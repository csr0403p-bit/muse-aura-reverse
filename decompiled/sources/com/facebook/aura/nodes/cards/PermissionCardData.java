package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class PermissionCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String highlight;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionCardData) {
                PermissionCardData permissionCardData = (PermissionCardData) obj;
                if (!C7384Etj.areEqual(this.label, permissionCardData.label) || !C7384Etj.areEqual(this.highlight, permissionCardData.highlight)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionCardData copy$default(PermissionCardData permissionCardData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionCardData.label;
        }
        if ((i & 2) != 0) {
            str2 = permissionCardData.highlight;
        }
        AnonymousClass003.A0u(str, str2);
        return new PermissionCardData(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.highlight;
    }

    public final String getHighlight() {
        return this.highlight;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.highlight, AnonymousClass001.A0G(this.label));
    }

    public PermissionCardData(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.highlight = str2;
    }

    public final PermissionCardData copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new PermissionCardData(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
