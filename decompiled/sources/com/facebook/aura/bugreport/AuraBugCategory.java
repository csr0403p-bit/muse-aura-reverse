package com.facebook.aura.bugreport;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraBugCategory extends C06G {
    public static final int $stable = 0;
    public final int iconRes;
    public final String id;
    public final int titleRes;

    public AuraBugCategory(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.titleRes = i;
        this.iconRes = i2;
    }

    public final AuraBugCategory copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new AuraBugCategory(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBugCategory) {
                AuraBugCategory auraBugCategory = (AuraBugCategory) obj;
                if (!C7384Etj.areEqual(this.id, auraBugCategory.id) || this.titleRes != auraBugCategory.titleRes || this.iconRes != auraBugCategory.iconRes) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraBugCategory copy$default(AuraBugCategory auraBugCategory, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = auraBugCategory.id;
        }
        if ((i3 & 2) != 0) {
            i = auraBugCategory.titleRes;
        }
        if ((i3 & 4) != 0) {
            i2 = auraBugCategory.iconRes;
        }
        return auraBugCategory.copy(str, i, i2);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.titleRes;
    }

    public final int component3() {
        return this.iconRes;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getId() {
        return this.id;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.id) + this.titleRes) * 31) + this.iconRes;
    }

    public String toString() {
        return super.toString();
    }
}
