package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchPostalValidationRule extends C06G {
    public final String errorMessage;
    public final HatchPostalRuleType type;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPostalValidationRule) {
                HatchPostalValidationRule hatchPostalValidationRule = (HatchPostalValidationRule) obj;
                if (this.type != hatchPostalValidationRule.type || !C7384Etj.areEqual(this.value, hatchPostalValidationRule.value) || !C7384Etj.areEqual(this.errorMessage, hatchPostalValidationRule.errorMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPostalValidationRule copy$default(HatchPostalValidationRule hatchPostalValidationRule, HatchPostalRuleType hatchPostalRuleType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchPostalRuleType = hatchPostalValidationRule.type;
        }
        if ((i & 2) != 0) {
            str = hatchPostalValidationRule.value;
        }
        if ((i & 4) != 0) {
            str2 = hatchPostalValidationRule.errorMessage;
        }
        return hatchPostalValidationRule.copy(hatchPostalRuleType, str, str2);
    }

    public final HatchPostalRuleType component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final HatchPostalRuleType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.errorMessage, (AnonymousClass005.A0E(this.type) + AnonymousClass006.A0G(this.value)) * 31);
    }

    public HatchPostalValidationRule(HatchPostalRuleType hatchPostalRuleType, String str, String str2) {
        AnonymousClass003.A0v(hatchPostalRuleType, str2);
        this.type = hatchPostalRuleType;
        this.value = str;
        this.errorMessage = str2;
    }

    public final HatchPostalValidationRule copy(HatchPostalRuleType hatchPostalRuleType, String str, String str2) {
        AnonymousClass003.A0v(hatchPostalRuleType, str2);
        return new HatchPostalValidationRule(hatchPostalRuleType, str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
