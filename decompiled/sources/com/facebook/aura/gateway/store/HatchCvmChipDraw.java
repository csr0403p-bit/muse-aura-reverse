package com.facebook.aura.gateway.store;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchCvmChipDraw extends C06G {
    public final List<String> chipIds;
    public final int drawnCount;
    public final boolean isOverBudget;
    public final int spentCount;

    public HatchCvmChipDraw(List<String> list, int i, int i2, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.chipIds = list;
        this.drawnCount = i;
        this.spentCount = i2;
        this.isOverBudget = z;
    }

    public final HatchCvmChipDraw copy(List<String> list, int i, int i2, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new HatchCvmChipDraw(list, i, i2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCvmChipDraw) {
                HatchCvmChipDraw hatchCvmChipDraw = (HatchCvmChipDraw) obj;
                if (!C7384Etj.areEqual(this.chipIds, hatchCvmChipDraw.chipIds) || this.drawnCount != hatchCvmChipDraw.drawnCount || this.spentCount != hatchCvmChipDraw.spentCount || this.isOverBudget != hatchCvmChipDraw.isOverBudget) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCvmChipDraw copy$default(HatchCvmChipDraw hatchCvmChipDraw, List list, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = hatchCvmChipDraw.chipIds;
        }
        if ((i3 & 2) != 0) {
            i = hatchCvmChipDraw.drawnCount;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchCvmChipDraw.spentCount;
        }
        if ((i3 & 8) != 0) {
            z = hatchCvmChipDraw.isOverBudget;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchCvmChipDraw(list, i, i2, z);
    }

    public final List<String> component1() {
        return this.chipIds;
    }

    public final int component2() {
        return this.drawnCount;
    }

    public final int component3() {
        return this.spentCount;
    }

    public final boolean component4() {
        return this.isOverBudget;
    }

    public final List<String> getChipIds() {
        return this.chipIds;
    }

    public final int getDrawnCount() {
        return this.drawnCount;
    }

    public final int getSpentCount() {
        return this.spentCount;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0E(this.chipIds) + this.drawnCount) * 31) + this.spentCount) * 31, this.isOverBudget);
    }

    public final boolean isOverBudget() {
        return this.isOverBudget;
    }

    public String toString() {
        return super.toString();
    }
}
