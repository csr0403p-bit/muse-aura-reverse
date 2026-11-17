package com.facebook.aura.survey;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSurveyStartResult extends C06G {
    public static final int $stable = 0;
    public final HatchSurveyPage page;
    public final boolean show;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSurveyStartResult) {
                HatchSurveyStartResult hatchSurveyStartResult = (HatchSurveyStartResult) obj;
                if (this.show != hatchSurveyStartResult.show || !C7384Etj.areEqual(this.page, hatchSurveyStartResult.page)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSurveyStartResult copy$default(HatchSurveyStartResult hatchSurveyStartResult, boolean z, HatchSurveyPage hatchSurveyPage, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchSurveyStartResult.show;
        }
        if ((i & 2) != 0) {
            hatchSurveyPage = hatchSurveyStartResult.page;
        }
        return new HatchSurveyStartResult(z, hatchSurveyPage);
    }

    public final boolean component1() {
        return this.show;
    }

    public final HatchSurveyPage component2() {
        return this.page;
    }

    public final HatchSurveyStartResult copy(boolean z, HatchSurveyPage hatchSurveyPage) {
        return new HatchSurveyStartResult(z, hatchSurveyPage);
    }

    public final HatchSurveyPage getPage() {
        return this.page;
    }

    public final boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        return C0KA.A02(this.show) + AnonymousClass006.A0D(this.page);
    }

    public HatchSurveyStartResult(boolean z, HatchSurveyPage hatchSurveyPage) {
        this.show = z;
        this.page = hatchSurveyPage;
    }

    public String toString() {
        return super.toString();
    }
}
