package com.facebook.aura.survey;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0981AMm;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$isAnswered$1$1 extends AbstractC7559F3s implements G0U<HatchSurveyQuestion, Boolean> {
    public final /* synthetic */ C0981AMm<String, String> $freeTextByQuestion;
    public final /* synthetic */ C0981AMm<String, String> $numericByQuestion;
    public final /* synthetic */ C0981AMm<String, Integer> $selectedByQuestion;

    @Override // X.G0U
    public final Boolean invoke(HatchSurveyQuestion hatchSurveyQuestion) {
        C7384Etj.A0Y(hatchSurveyQuestion, 0);
        int iOrdinal = hatchSurveyQuestion.getPresentation().ordinal();
        boolean zContainsKey = true;
        if (iOrdinal == 0) {
            zContainsKey = this.$selectedByQuestion.containsKey(hatchSurveyQuestion.questionId);
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                String str = this.$freeTextByQuestion.get(hatchSurveyQuestion.questionId);
                if (str == null || C7BY.A0j(str)) {
                }
            } else if (iOrdinal != 3 && iOrdinal != 4) {
                throw C3cG.A0q();
            }
            zContainsKey = false;
        } else {
            String str2 = this.$numericByQuestion.get(hatchSurveyQuestion.questionId);
            if (str2 == null || str2.length() <= 0) {
                zContainsKey = false;
            }
        }
        return Boolean.valueOf(zContainsKey);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSurveyPresentation.values().length];
            try {
                AnonymousClass002.A13(HatchSurveyPresentation.SINGLE_SELECT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSurveyPresentation.NUMERIC, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSurveyPresentation.FREE_TEXT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchSurveyPresentation.DISPLAY_ONLY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchSurveyPresentation.UNSUPPORTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$isAnswered$1$1(C0981AMm<String, Integer> c0981AMm, C0981AMm<String, String> c0981AMm2, C0981AMm<String, String> c0981AMm3) {
        super(1);
        this.$selectedByQuestion = c0981AMm;
        this.$numericByQuestion = c0981AMm2;
        this.$freeTextByQuestion = c0981AMm3;
    }
}
