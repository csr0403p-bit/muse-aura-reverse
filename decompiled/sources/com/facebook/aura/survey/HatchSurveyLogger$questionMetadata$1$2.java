package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchSurveyLogger$questionMetadata$1$2 extends AbstractC7559F3s implements G0U<HatchSurveyQuestion, CharSequence> {
    public static final HatchSurveyLogger$questionMetadata$1$2 INSTANCE = new HatchSurveyLogger$questionMetadata$1$2();

    public HatchSurveyLogger$questionMetadata$1$2() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(HatchSurveyQuestion hatchSurveyQuestion) {
        HatchSurveyQuestion hatchSurveyQuestion2 = hatchSurveyQuestion;
        C7384Etj.A0Y(hatchSurveyQuestion2, 0);
        return hatchSurveyQuestion2.rawKind;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(HatchSurveyQuestion hatchSurveyQuestion) {
        C7384Etj.A0Y(hatchSurveyQuestion, 0);
        return hatchSurveyQuestion.rawKind;
    }
}
