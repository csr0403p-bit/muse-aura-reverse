package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchSurveyLogger$answerMetadata$1$3 extends AbstractC7559F3s implements G0U<HatchSurveyAnswer, CharSequence> {
    public static final HatchSurveyLogger$answerMetadata$1$3 INSTANCE = new HatchSurveyLogger$answerMetadata$1$3();

    public HatchSurveyLogger$answerMetadata$1$3() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(HatchSurveyAnswer hatchSurveyAnswer) {
        HatchSurveyAnswer hatchSurveyAnswer2 = hatchSurveyAnswer;
        C7384Etj.A0Y(hatchSurveyAnswer2, 0);
        return hatchSurveyAnswer2.value;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(HatchSurveyAnswer hatchSurveyAnswer) {
        C7384Etj.A0Y(hatchSurveyAnswer, 0);
        return hatchSurveyAnswer.value;
    }
}
