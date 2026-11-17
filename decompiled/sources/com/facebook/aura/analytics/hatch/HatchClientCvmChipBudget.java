package com.facebook.aura.analytics.hatch;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.common.HatchCvmChipPinPurpose;

/* loaded from: classes5.dex */
public final class HatchClientCvmChipBudget extends C06G {
    public static final int $stable = 0;
    public final int budgetChipsLimit;
    public final int budgetChipsSpent;
    public final HatchCvmChipPinPurpose budgetType;
    public final Integer chipsDrawnCount;
    public final Integer chipsSubmittedCount;
    public final Boolean isOverBudget;
    public final Boolean isRebid;
    public final boolean isTryAgain;
    public final Integer rememberedChipsCount;

    public HatchClientCvmChipBudget(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, int i, int i2, boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3) {
        C7384Etj.A0Y(hatchCvmChipPinPurpose, 0);
        this.budgetType = hatchCvmChipPinPurpose;
        this.budgetChipsSpent = i;
        this.budgetChipsLimit = i2;
        this.isTryAgain = z;
        this.chipsSubmittedCount = num;
        this.chipsDrawnCount = num2;
        this.isOverBudget = bool;
        this.isRebid = bool2;
        this.rememberedChipsCount = num3;
    }

    public final HatchClientCvmChipBudget copy(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, int i, int i2, boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3) {
        C7384Etj.A0Y(hatchCvmChipPinPurpose, 0);
        return new HatchClientCvmChipBudget(hatchCvmChipPinPurpose, i, i2, z, num, num2, bool, bool2, num3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchClientCvmChipBudget) {
                HatchClientCvmChipBudget hatchClientCvmChipBudget = (HatchClientCvmChipBudget) obj;
                if (this.budgetType != hatchClientCvmChipBudget.budgetType || this.budgetChipsSpent != hatchClientCvmChipBudget.budgetChipsSpent || this.budgetChipsLimit != hatchClientCvmChipBudget.budgetChipsLimit || this.isTryAgain != hatchClientCvmChipBudget.isTryAgain || !C7384Etj.areEqual(this.chipsSubmittedCount, hatchClientCvmChipBudget.chipsSubmittedCount) || !C7384Etj.areEqual(this.chipsDrawnCount, hatchClientCvmChipBudget.chipsDrawnCount) || !C7384Etj.areEqual(this.isOverBudget, hatchClientCvmChipBudget.isOverBudget) || !C7384Etj.areEqual(this.isRebid, hatchClientCvmChipBudget.isRebid) || !C7384Etj.areEqual(this.rememberedChipsCount, hatchClientCvmChipBudget.rememberedChipsCount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchClientCvmChipBudget copy$default(HatchClientCvmChipBudget hatchClientCvmChipBudget, HatchCvmChipPinPurpose hatchCvmChipPinPurpose, int i, int i2, boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            hatchCvmChipPinPurpose = hatchClientCvmChipBudget.budgetType;
        }
        if ((i3 & 2) != 0) {
            i = hatchClientCvmChipBudget.budgetChipsSpent;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchClientCvmChipBudget.budgetChipsLimit;
        }
        if ((i3 & 8) != 0) {
            z = hatchClientCvmChipBudget.isTryAgain;
        }
        if ((i3 & 16) != 0) {
            num = hatchClientCvmChipBudget.chipsSubmittedCount;
        }
        if ((i3 & 32) != 0) {
            num2 = hatchClientCvmChipBudget.chipsDrawnCount;
        }
        if ((i3 & 64) != 0) {
            bool = hatchClientCvmChipBudget.isOverBudget;
        }
        if ((i3 & 128) != 0) {
            bool2 = hatchClientCvmChipBudget.isRebid;
        }
        if ((i3 & 256) != 0) {
            num3 = hatchClientCvmChipBudget.rememberedChipsCount;
        }
        return hatchClientCvmChipBudget.copy(hatchCvmChipPinPurpose, i, i2, z, num, num2, bool, bool2, num3);
    }

    public final HatchCvmChipPinPurpose component1() {
        return this.budgetType;
    }

    public final int component2() {
        return this.budgetChipsSpent;
    }

    public final int component3() {
        return this.budgetChipsLimit;
    }

    public final boolean component4() {
        return this.isTryAgain;
    }

    public final Integer component5() {
        return this.chipsSubmittedCount;
    }

    public final Integer component6() {
        return this.chipsDrawnCount;
    }

    public final Boolean component7() {
        return this.isOverBudget;
    }

    public final Boolean component8() {
        return this.isRebid;
    }

    public final Integer component9() {
        return this.rememberedChipsCount;
    }

    public final int getBudgetChipsLimit() {
        return this.budgetChipsLimit;
    }

    public final int getBudgetChipsSpent() {
        return this.budgetChipsSpent;
    }

    public final HatchCvmChipPinPurpose getBudgetType() {
        return this.budgetType;
    }

    public final Integer getChipsDrawnCount() {
        return this.chipsDrawnCount;
    }

    public final Integer getChipsSubmittedCount() {
        return this.chipsSubmittedCount;
    }

    public final Integer getRememberedChipsCount() {
        return this.rememberedChipsCount;
    }

    public int hashCode() {
        return ((((((((C0KA.A01((((AnonymousClass005.A0E(this.budgetType) + this.budgetChipsSpent) * 31) + this.budgetChipsLimit) * 31, this.isTryAgain) + AnonymousClass006.A0D(this.chipsSubmittedCount)) * 31) + AnonymousClass006.A0D(this.chipsDrawnCount)) * 31) + AnonymousClass006.A0D(this.isOverBudget)) * 31) + AnonymousClass006.A0D(this.isRebid)) * 31) + C3cH.A02(this.rememberedChipsCount);
    }

    public final Boolean isOverBudget() {
        return this.isOverBudget;
    }

    public final Boolean isRebid() {
        return this.isRebid;
    }

    public final boolean isTryAgain() {
        return this.isTryAgain;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchClientCvmChipBudget(HatchCvmChipPinPurpose hatchCvmChipPinPurpose, int i, int i2, boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, int i3, C06H c06h) {
        this(hatchCvmChipPinPurpose, i, i2, z, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : bool2, (i3 & 256) != 0 ? null : num3);
    }
}
