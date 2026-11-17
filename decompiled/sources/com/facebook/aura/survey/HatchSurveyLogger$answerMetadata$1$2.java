package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchSurveyLogger$answerMetadata$1$2 extends AbstractC7559F3s implements G0U<HatchSurveyAnswer, CharSequence> {
    public final /* synthetic */ Map<String, String> $kindByQuestionId;

    @Override // X.G0U
    public final CharSequence invoke(HatchSurveyAnswer hatchSurveyAnswer) {
        C7384Etj.A0Y(hatchSurveyAnswer, 0);
        String strA0p = C60O.A0p(hatchSurveyAnswer.questionId, this.$kindByQuestionId);
        return strA0p == null ? "" : strA0p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveyLogger$answerMetadata$1$2(Map<String, String> map) {
        super(1);
        this.$kindByQuestionId = map;
    }
}
