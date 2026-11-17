package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.C0981AMm;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$5$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ C0981AMm<String, String> $numericByQuestion;
    public final /* synthetic */ HatchSurveyQuestion $question;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$numericByQuestion.put(this.$question.questionId, HatchSurveySheetKt.sanitizeDecimal(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$5$2$1(C0981AMm<String, String> c0981AMm, HatchSurveyQuestion hatchSurveyQuestion) {
        super(1);
        this.$numericByQuestion = c0981AMm;
        this.$question = hatchSurveyQuestion;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
