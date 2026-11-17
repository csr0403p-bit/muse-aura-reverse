package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0981AMm;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$5$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ HatchSurveyPage $page;
    public final /* synthetic */ HatchSurveyQuestion $question;
    public final /* synthetic */ C0981AMm<String, Integer> $selectedByQuestion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$5$1$1(C0981AMm<String, Integer> c0981AMm, HatchSurveyQuestion hatchSurveyQuestion, HatchSurveyPage hatchSurveyPage) {
        super(1);
        this.$selectedByQuestion = c0981AMm;
        this.$question = hatchSurveyQuestion;
        this.$page = hatchSurveyPage;
    }

    public final void invoke(int i) {
        this.$selectedByQuestion.put(this.$question.questionId, Integer.valueOf(i));
        HatchSurveyLogger.INSTANCE.logOptionClick(this.$page);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
