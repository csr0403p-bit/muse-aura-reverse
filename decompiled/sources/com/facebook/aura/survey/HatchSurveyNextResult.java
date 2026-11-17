package com.facebook.aura.survey;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSurveyNextResult extends C06G {
    public static final int $stable = 0;
    public final boolean done;
    public final HatchSurveyPage page;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSurveyNextResult) {
                HatchSurveyNextResult hatchSurveyNextResult = (HatchSurveyNextResult) obj;
                if (this.done != hatchSurveyNextResult.done || !C7384Etj.areEqual(this.page, hatchSurveyNextResult.page)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSurveyNextResult copy$default(HatchSurveyNextResult hatchSurveyNextResult, boolean z, HatchSurveyPage hatchSurveyPage, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchSurveyNextResult.done;
        }
        if ((i & 2) != 0) {
            hatchSurveyPage = hatchSurveyNextResult.page;
        }
        return new HatchSurveyNextResult(z, hatchSurveyPage);
    }

    public final boolean component1() {
        return this.done;
    }

    public final HatchSurveyPage component2() {
        return this.page;
    }

    public final HatchSurveyNextResult copy(boolean z, HatchSurveyPage hatchSurveyPage) {
        return new HatchSurveyNextResult(z, hatchSurveyPage);
    }

    public final boolean getDone() {
        return this.done;
    }

    public final HatchSurveyPage getPage() {
        return this.page;
    }

    public int hashCode() {
        return C0KA.A02(this.done) + AnonymousClass006.A0D(this.page);
    }

    public HatchSurveyNextResult(boolean z, HatchSurveyPage hatchSurveyPage) {
        this.done = z;
        this.page = hatchSurveyPage;
    }

    public String toString() {
        return super.toString();
    }
}
