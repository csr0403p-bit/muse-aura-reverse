package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSurveyOption extends C06G {
    public static final int $stable = 0;
    public final String label;
    public final int value;

    public HatchSurveyOption(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.value = i;
        this.label = str;
    }

    public final HatchSurveyOption copy(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new HatchSurveyOption(i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSurveyOption) {
                HatchSurveyOption hatchSurveyOption = (HatchSurveyOption) obj;
                if (this.value != hatchSurveyOption.value || !C7384Etj.areEqual(this.label, hatchSurveyOption.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSurveyOption copy$default(HatchSurveyOption hatchSurveyOption, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hatchSurveyOption.value;
        }
        if ((i2 & 2) != 0) {
            str = hatchSurveyOption.label;
        }
        C7384Etj.A0Y(str, 1);
        return new HatchSurveyOption(i, str);
    }

    public final int component1() {
        return this.value;
    }

    public final String component2() {
        return this.label;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.label, this.value * 31);
    }

    public String toString() {
        return super.toString();
    }
}
