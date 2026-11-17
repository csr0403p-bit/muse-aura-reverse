package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSurveyAnswer extends C06G {
    public static final int $stable = 0;
    public final String questionId;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSurveyAnswer) {
                HatchSurveyAnswer hatchSurveyAnswer = (HatchSurveyAnswer) obj;
                if (!C7384Etj.areEqual(this.questionId, hatchSurveyAnswer.questionId) || !C7384Etj.areEqual(this.value, hatchSurveyAnswer.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSurveyAnswer copy$default(HatchSurveyAnswer hatchSurveyAnswer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSurveyAnswer.questionId;
        }
        if ((i & 2) != 0) {
            str2 = hatchSurveyAnswer.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchSurveyAnswer(str, str2);
    }

    public final String component1() {
        return this.questionId;
    }

    public final String component2() {
        return this.value;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.questionId));
    }

    public HatchSurveyAnswer(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.questionId = str;
        this.value = str2;
    }

    public final HatchSurveyAnswer copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchSurveyAnswer(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
